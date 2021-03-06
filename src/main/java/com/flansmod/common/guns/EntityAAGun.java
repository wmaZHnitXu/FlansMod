package com.flansmod.common.guns;

import org.lwjgl.input.Mouse;

import ic2.core.block.wiring.TileEntityChargepadBlock;
import ic2.core.block.wiring.TileEntityChargepadCESU;
import ic2.core.block.wiring.TileEntityElectricBlock;
import ic2.core.block.wiring.TileEntityElectricCESU;
import io.netty.buffer.ByteBuf;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.client.handlers.FlansModResourceHandler;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.network.PacketAAGunAngles;
import com.flansmod.common.network.PacketAAGunStatus;
import com.flansmod.common.network.PacketMGFire;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.teams.Team;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.vector.Vector3f;

public class EntityAAGun extends Entity implements IEntityAdditionalSpawnData
{
	private int sUpdateTime;
	private double sPosX;
	private double sPosY;
	private double sPosZ;
	private double sYaw;
	private double sPitch;
	private double field_9388_j;
	private double field_9387_k;
	private double field_9386_l;
	
	private int health;
	private int shootDelay;
	/**
	 * Gun angles
	 */
	public float gunYaw, gunPitch;
	/**
	 * Prev gun angles
	 */
	public float prevGunYaw, prevGunPitch;
	public float barrelRecoil[];
	public AAGunType type;
	public Entity towedByEntity;
	public ItemStack ammo; // One per barrel
	public int reloadTimer;
	public int currentBarrel; // For cycling through firing each barrel
	public boolean mouseHeld;
	public boolean wasShooting;
	public int status;
	
	//Sentry stuff
	/**
	 * Stops the sentry shooting whoever placed it or their teammates
	 */
	public EntityPlayer placer = null;
	/**
	 * For getting the placer after a reload
	 */
	public String placerName = null;

	public String placerDispName = null;
	/**
	 * The sentry's current target
	 */
	public Entity target = null;
	/**
	 * How often to check for new targets
	 */
	public static final float targetAcquireInterval = 10;
	
	public int ticksSinceUsed = 0;
	
	private float yOffset;
	
	public EntityAAGun(World world)
	{
		super(world);
		preventEntitySpawning = true;
		setSize(4.0F, 4.0F);
		yOffset = 0F;
		gunYaw = 0;
		gunPitch = 0;
		shootDelay = 0;
	}
	
	public EntityAAGun(World world, AAGunType type1, double d, double d1, double d2, EntityPlayer p)
	{
		this(world);
		placer = p;
		placerName = p.getName();
		placerDispName = p.getDisplayNameString();
		if (placer != null) {
			Double D = d;
			Double D1 = d1;
			Double D2 = d2;
			BlockPos dir = placer.getPosition().subtract(new BlockPos(D.intValue(),D1.intValue(),D2.intValue()));
			if (dir.getX() > 0) gunYaw = 180; else gunYaw = 0;
			if (dir.getZ() > 0) gunYaw = 90; else gunYaw = 270;
		}
		type = type1;
		initType();
		setPosition(d, d1, d2);
	}
	
	@Override
	public void setPosition(double d, double d1, double d2)
	{
		posX = d;
		posY = d1;
		posZ = d2;
		float f = width / 2.0F;
		float f1 = height;
		setEntityBoundingBox(new AxisAlignedBB(d - f, (d1 - yOffset), d2 - f, d + f, (d1 - yOffset) + f1, d2 + f));
	}
	
	@Override
	public void setPositionAndRotationDirect(double d, double d1, double d2, float f, float f1, int i, boolean b)
	{
		sPosX = d;
		sPosY = d1;
		sPosZ = d2;
		sYaw = f;
		sPitch = f1;
		sUpdateTime = i;
	}
	
	public void initType()
	{
		health = type.health;
		barrelRecoil = new float[type.numBarrels];
		ammo = ItemStack.EMPTY.copy();
	}
	
	@Override
	protected void entityInit()
	{
	}
	
	@Override
	public void onCollideWithPlayer(EntityPlayer par1EntityPlayer)
	{
		
	}
	
	@Override
	public void applyEntityCollision(Entity entity)
	{
		//if(entity != riddenByEntity)
		//super.applyEntityCollision(entity);
	}
	
	@Override
	public AxisAlignedBB getCollisionBox(Entity entity)
	{
		return entity.getEntityBoundingBox();
	}
	
	@Override
	public boolean canBePushed()
	{
		return false;
	}
	
	@Override
	public double getMountedYOffset()
	{
		return 0D;
	}
	
	public void setMouseHeld(boolean held)
	{
		mouseHeld = held;
	}
	
	@Override
	public boolean attackEntityFrom(DamageSource damagesource, float i)
	{
		if (world.isRemote) return false;
		if(damagesource.damageType.equals("player"))
		{
			Entity player = damagesource.getTrueSource();
			if(isRidingOrBeingRiddenBy(player))
			{
			}
			else if(isBeingRidden())
			{
				return getPassengers().get(0).attackEntityFrom(damagesource, i);
			}
			else if(TeamsManager.canBreakGuns)
			{
				if (ammo != null && !ammo.isEmpty()) {
					entityDropItem(ammo, 0.5F);
					ammo = null;
				}
				else setDead();
			}
		}
		else
		{
			//setBeenAttacked();
			health -= i;
			if(!world.isRemote && health <= 0)
				setDead();
		}
		return true;
	}
	
	public Vec3d rotate(double x, double y, double z)
	{
		double cosYaw = Math.cos(180F - gunYaw * 3.14159265F / 180F);
		double sinYaw = Math.sin(180F - gunYaw * 3.14159265F / 180F);
		double cosPitch = Math.cos(gunPitch * 3.14159265F / 180F);
		double sinPitch = Math.sin(gunPitch * 3.14159265F / 180F);
		
		double newX = x * cosYaw + (y * sinPitch + z * cosPitch) * sinYaw;
		double newY = y * cosPitch - z * sinPitch;
		double newZ = -x * sinYaw + (y * sinPitch + z * cosPitch) * cosYaw;
		
		return new Vec3d(newX, newY, newZ);
	}
	
	@Override
	public boolean canBeCollidedWith()
	{
		return !isDead;
	}
	
	@Override
	public void onUpdate()
	{
		super.onUpdate();
		prevGunYaw = gunYaw;
		prevGunPitch = gunPitch;
		ticksSinceUsed++;
		if(TeamsManager.aaLife > 0 && ticksSinceUsed > TeamsManager.aaLife * 20)
		{
			//setDead();
		}
		
		if(getControllingPassenger() != null)
		{
				ticksSinceUsed = 0;
				gunYaw = getControllingPassenger().rotationYaw - 90;
				gunPitch = getControllingPassenger().rotationPitch;
		}
		
		if(gunPitch > type.bottomViewLimit)
			gunPitch = type.bottomViewLimit;
		if(gunPitch < -type.topViewLimit)
			gunPitch = -type.topViewLimit;
		
		for(int i = 0; i < type.numBarrels; i++)
			barrelRecoil[i] *= 0.9F;
		
		if(shootDelay > 0)
			shootDelay--;
		
		// Sentry stuff
		if(true)
		{
			if(target != null && target.isDead)
				target = null;
			//Find a new target if we don't currently have one
			if(target == null && ticksExisted % targetAcquireInterval == 0)
			{
				target = getValidTarget();
			}
			if(target != null && status != 1)
			{
				double dX = target.posX - posX;
				double dY = target.posY + 0.2d - (posY + type.barrelY[0] / 16);
				double dZ = target.posZ - posZ;
				
				double distanceToTarget = Math.sqrt(dX * dX + dY * dY + dZ * dZ);
				
				if(distanceToTarget > type.targetRange)
					target = null;
				else
				{
					float newYaw = 180F + (float)Math.atan2(dZ, dX) * 180F / 3.14159265F;
					float newPitch = -(float)Math.atan2(dY, Math.sqrt(dX * dX + dZ * dZ)) * 180F / 3.14159265F;
					
					float turnSpeed = 0.25F;
					gunYaw = newYaw;
					gunPitch += (newPitch - gunPitch) * turnSpeed;
				}
			}
		}
		
		// apply gravity
		
		if(!onGround && !world.isRemote)
			motionY -= 9.8D / 400D;
		// update motion
		motionX *= 0.5;
		motionZ *= 0.5;
		move(MoverType.SELF, motionX, motionY, motionZ);
		
		if(world.isRemote && getControllingPassenger() != null && getControllingPassenger() == FMLClientHandler.instance().getClient().player)
		{
			checkForShooting();
		}
		
		if(world.isRemote)
		{
			if(sUpdateTime > 0)
			{
				double d1 = posX + (sPosX - posX) / sUpdateTime;
				double d5 = posY + (sPosY - posY) / sUpdateTime;
				double d9 = posZ + (sPosZ - posZ) / sUpdateTime;
				double d12;
				for(d12 = sYaw - rotationYaw; d12 < -180D; d12 += 360D)
				{
				}
				for(; d12 >= 180D; d12 -= 360D)
				{
				}
				rotationYaw += d12 / sUpdateTime;
				rotationPitch += (sPitch - rotationPitch) / sUpdateTime;
				sUpdateTime--;
				setPosition(d1, d5, d9);
				setRotation(rotationYaw, rotationPitch);
			}
			return;
		}
		
		if(getControllingPassenger() != null && getControllingPassenger().isDead)
		{
			removePassengers();
		}
		// Decrement the reload timer and reload
		if(reloadTimer > 0)
			reloadTimer--;
			//If it is 0 or less, go ahead and reload
		else
		{
			if(ammo != null && !ammo.isEmpty() && ammo.getItemDamage() == ammo.getMaxDamage())
			{
				ammo = ItemStack.EMPTY.copy();
				// Scrap metal output? - NIET!
			}
			//ETO pOXODY DLIA TRANSPORTA, NETOOOOOOOO
			if((ammo == null || ammo.isEmpty()) && getControllingPassenger() != null && getControllingPassenger() instanceof EntityPlayer)
			{
				int slot = findAmmo(((EntityPlayer)getControllingPassenger()));
				if(slot >= 0)
				{
					ammo = ((EntityPlayer)getControllingPassenger()).inventory.getStackInSlot(slot);
					if(!((EntityPlayer)getControllingPassenger()).capabilities.isCreativeMode)
						((EntityPlayer)getControllingPassenger()).inventory.decrStackSize(slot, 1);
					reloadTimer = type.reloadTime;
					PacketPlaySound.sendSoundPacket(posX, posY, posZ, 50, dimension, type.reloadSound, true);
				}
			}
		}
		
		if(!world.isRemote && reloadTimer <= 0 && shootDelay <= 0 && status != 1)
		{
			Boolean shootPlayer = mouseHeld && getControllingPassenger() instanceof EntityPlayerMP;
			
			if (target != null || shootPlayer)
			{
				EntityPlayerMP player = shootPlayer ? (EntityPlayerMP)getControllingPassenger() : null;
				
				for(int j = 0; j < type.numBarrels; j++)
				{
					if(shootDelay <= 0 && ammo != null && !ammo.isEmpty() && (!type.fireAlternately || type.fireAlternately && currentBarrel == j))
					{
						// Fire
						if (type.shotConsumption > 0) {
							TileEntity te = world.getTileEntity(getPosition().down());
							if (te instanceof TileEntityElectricBlock && ((TileEntityElectricBlock)te).getStored() >= type.shotConsumption) {
								((TileEntityElectricBlock)te).addEnergy(-type.shotConsumption);
							} 
							else {
								status = getStatus();
								return;
							}
						}
						BulletType bullet = BulletType.getBullet(ammo.getItem());
						if(shootPlayer)
						{
							if(!player.capabilities.isCreativeMode)
								ammo.damageItem(1, player);
						} else
						{
							ammo.setItemDamage(ammo.getItemDamage() + 1);
						}
						shootDelay = type.shootDelay;
						barrelRecoil[j] = type.recoil;
						Vec3d origin = rotate(type.barrelX[currentBarrel] / 16D,
								type.barrelY[currentBarrel] / 16D,
								type.barrelZ[currentBarrel] / 16D).add(posX, posY, posZ);
						
						Double radianYaw = Math.toRadians(gunYaw + 90F);
						Double radianPitch = Math.toRadians(gunPitch);
						Vector3f shootingDirection;
						if (target == null)
							shootingDirection = new Vector3f(-Math.sin(radianYaw), -Math.sin(radianPitch), Math.cos(radianYaw)*Math.cos(radianPitch));
						else shootingDirection = new Vector3f(((target.getPositionVector().add(0,1,0)).subtract(origin)).normalize());
						FireableGun weapon = new FireableGun(type, (float)type.damage, (float)type.accuracy, (float)type.bulletspeed);
						FiredShot shot = new FiredShot(weapon, bullet, this, player);
						//TODO use Vec3d
						ShotHandler.fireGun(world, shot, bullet.numBullets, new Vector3f(origin), shootingDirection);
						PacketPlaySound.sendSoundPacket(posX, posY, posZ, 50, dimension, type.shootSound, true);
					}
				}
				currentBarrel = (currentBarrel + 1) % type.numBarrels;
			}
		}
		if(!world.isRemote)
		{
			if (target != null && ticksExisted % 20 == 0 && !TargetTrace(target)) {
				target = null;
			}
			if (ticksExisted % 20 == 0) {
				if (ammo == null || ammo.isEmpty()) {
					GetAmmoFromChests();
				}
			}
			FlansMod.getPacketHandler().sendToAllAround(new PacketAAGunAngles(this), posX, posY, posZ, 100F, dimension);
			status = getStatus();
			FlansMod.getPacketHandler().sendToAllAround(new PacketAAGunStatus(this), posX, posY, posZ, 100F, dimension);
			if (status != 1) {
				ConsumeEnergy();
			}
		}
	}

	public boolean GetAmmoFromChests () {
		TileEntityChest candidate = null;
		BlockPos basePos = getPosition().down();
		if (candidate == null) {TileEntity te = world.getTileEntity(basePos.east()); if (te instanceof TileEntityChest) candidate = ((TileEntityChest)te);}
		if (candidate == null) {TileEntity te = world.getTileEntity(basePos.west()); if (te instanceof TileEntityChest) candidate = ((TileEntityChest)te);}
		if (candidate == null) {TileEntity te = world.getTileEntity(basePos.south()); if (te instanceof TileEntityChest) candidate = ((TileEntityChest)te);}
		if (candidate == null) {TileEntity te = world.getTileEntity(basePos.north()); if (te instanceof TileEntityChest) candidate = ((TileEntityChest)te);}
		if (candidate != null) {
			FlansMod.log.info("nenull");
			for(int i = 0; i < candidate.getSizeInventory(); i++)
			{
				ItemStack stack = candidate.getStackInSlot(i);
				if(type.isAmmo(stack))
				{
					FlansMod.log.info("apply");
					ammo = candidate.getStackInSlot(i).copy();
					ammo.setCount(1);
					candidate.decrStackSize(i, 1);
					return true;
				} 
			}
		}
		return false;
	}

	public boolean TargetTrace (Entity e) {
		if (e == null) return false;
		Vec3d targetV =	e.getPositionVector().add(0, 1, 0);
		Vec3d origin = rotate(type.barrelX[0] / 16D,
		type.barrelY[0] / 16D,
		type.barrelZ[0] / 16D).add(posX, posY, posZ);
		Vec3d step = e.getPositionVector().subtract(origin).normalize();
		Vec3d currentPos = origin;
		while (currentPos.distanceTo(targetV) > 2) {
			currentPos = currentPos.add(step);
			if (world.getBlockState(new BlockPos((int)currentPos.x,(int)currentPos.y,(int)currentPos.z)).isNormalCube()) return false;
		}
		return true;
	}
	
	public boolean isSentry()
	{
		return type.targetMobs || type.targetPlayers;
	}
	
	public Entity getValidTarget()
	{
		if(world.isRemote)
			return null;
		if(placer == null && placerName != null) {
			placer = world.getPlayerEntityByName(placerName);
		}
		
		BlockPos a = getPosition().add(type.targetRange, type.targetRange, type.targetRange);
		BlockPos b = getPosition().add(-type.targetRange, -type.targetRange, -type.targetRange);
		for(Object obj : world.getEntitiesWithinAABBExcludingEntity(this, new AxisAlignedBB(b,a)))
		{
			Entity candidateEntity = (Entity)obj;
			
			if((type.targetMobs && candidateEntity instanceof EntityMob) || (type.targetPlayers && candidateEntity instanceof EntityPlayer))
			{
				//Check that this entity is actually in range and visible
				if(candidateEntity.getDistanceSq(this) < type.targetRange * type.targetRange)
				{
					if(candidateEntity instanceof EntityPlayer)
					{
						EntityPlayer plr = (EntityPlayer)candidateEntity;
						if(candidateEntity == placer || GetTeamCodeFromString(plr.getDisplayNameString()) == GetTeamCodeFromString(placerDispName) || plr.capabilities.isCreativeMode)
							continue;
						/*if(TeamsManager.enabled && TeamsManager.getInstance().currentRound != null && placer != null)
						{
							PlayerData placerData = PlayerHandler.getPlayerData(placer, world.isRemote ? Side.CLIENT : Side.SERVER);
							PlayerData candidateData = PlayerHandler.getPlayerData((EntityPlayer)candidateEntity, world.isRemote ? Side.CLIENT : Side.SERVER);
							if(candidateData.team == Team.spectators || candidateData.team == null)
								continue;
							if(!TeamsManager.getInstance().currentRound.gametype.playerCanAttack((EntityPlayerMP)placer, placerData.team, (EntityPlayerMP)candidateEntity, candidateData.team))
								continue;
						}
						*/
					}
					if (TargetTrace(candidateEntity))
						return candidateEntity;
				}
			}
		}
		return null;
	}
	
	@SideOnly(Side.CLIENT)
	private void checkForShooting()
	{
		//Send a packet!
		if(Mouse.isButtonDown(0) && !wasShooting && !FlansMod.proxy.isScreenOpen())
		{
			FlansMod.getPacketHandler().sendToServer(new PacketMGFire(true));
			wasShooting = true;
		}
		else if(!Mouse.isButtonDown(0) && wasShooting)
		{
			FlansMod.getPacketHandler().sendToServer(new PacketMGFire(false));
			wasShooting = false;
		}
	}
	
	@Override
	public void setDead()
	{
		super.setDead();
		// Drop gun
		if(world.isRemote)
			return;
		dropItem(type.getItem(), 1);
		// Drop ammo boxes
		if (ammo != null && !ammo.isEmpty()) 
			entityDropItem(ammo, 0.5F);
	}
	
	@Override
	public void updatePassenger(Entity passenger)
	{
		double x = type.gunnerX / 16D;
		double y = type.gunnerY / 16D;
		double z = type.gunnerZ / 16D;
		
		double cosYaw = Math.cos((-gunYaw / 180D) * 3.1415926535897931D);
		double sinYaw = Math.sin((-gunYaw / 180D) * 3.1415926535897931D);
		double cosPitch = Math.cos((gunPitch / 180D) * 3.1415926535897931D);
		double sinPitch = Math.sin((gunPitch / 180D) * 3.1415926535897931D);
		
		double x2 = x * cosYaw + z * sinYaw;
		double z2 = -x * sinYaw + z * cosYaw;
		
		passenger.setPosition(posX + x2, posY + y, posZ + z2);
	}
	
	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound)
	{
		nbttagcompound.setString("Type", type.shortName);
		nbttagcompound.setInteger("Health", health);
		nbttagcompound.setFloat("RotationYaw", rotationYaw);
		nbttagcompound.setFloat("RotationPitch", rotationPitch);
		if(ammo != null)
			nbttagcompound.setTag("Ammo", ammo.writeToNBT(new NBTTagCompound()));
		if (placer != null) {
			nbttagcompound.setString("Placer", placer.getName());
		} else if (placerName != null) {
			nbttagcompound.setString("Placer", placerName);
		}
		if (placerDispName != null) {
			nbttagcompound.setString("PlacerDisp", placerDispName);
		}
	}
	
	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound)
	{
		type = AAGunType.getAAGun(nbttagcompound.getString("Type"));
		initType();
		health = nbttagcompound.getInteger("Health");
		rotationYaw = nbttagcompound.getFloat("RotationYaw");
		rotationPitch = nbttagcompound.getFloat("RotationPitch");
		ammo = new ItemStack(nbttagcompound.getCompoundTag("Ammo"));
		placerName = nbttagcompound.getString("Placer");
		placerDispName = nbttagcompound.getString("PlacerDisp");
	}
	
	@Override
	public boolean processInitialInteract(EntityPlayer entityplayer, EnumHand hand) //interact : change back when Forge updates
	{
		// Player right clicked on gun
		// Mount gun
		if(getControllingPassenger() != null && (getControllingPassenger() instanceof EntityPlayer) && getControllingPassenger() != entityplayer)
		{
			return true;
		}
		if(!world.isRemote)
		{
			if(getControllingPassenger() == entityplayer)
			{
				entityplayer.dismountRidingEntity();
				return true;
			}
			if(!isSentry())
				entityplayer.startRiding(this);

			if(ammo == null  || ammo.isEmpty())
			{
				int slot = findAmmo(entityplayer);
				if(slot >= 0)
				{
					ammo = entityplayer.inventory.getStackInSlot(slot).copy();
					ammo.setCount(1);
					if(!entityplayer.capabilities.isCreativeMode)
						entityplayer.inventory.decrStackSize(slot, 1);
					reloadTimer = type.reloadTime;
					world.playSound(posX, posY, posZ, FlansModResourceHandler.getSoundEvent(type.reloadSound), SoundCategory.PLAYERS, 1.0F, 1.0F / (rand.nextFloat() * 0.4F + 0.8F), true);
				}
			}
			entityplayer.sendMessage(new TextComponentString(ammo != null && !ammo.isEmpty() ? "Boezapas: " + (ammo.getMaxDamage() - ammo.getItemDamage()) + "/" + ammo.getMaxDamage() : "Boezapas pust"));
		}
		return true;
	}
	
	//TODO aa are accepting any ammo for any weapon
	public int findAmmo(EntityPlayer player)
	{
		for(int i = 0; i < player.inventory.getSizeInventory(); i++)
		{
			ItemStack stack = player.inventory.getStackInSlot(i);
			if(type.isAmmo(stack))
			{
				return i;
			}
		}
		return -1;
	}
	
	@Override
	public void writeSpawnData(ByteBuf data)
	{
		ByteBufUtils.writeUTF8String(data, type.shortName);
	}
	
	@Override
	public void readSpawnData(ByteBuf data)
	{
		try
		{
			type = AAGunType.getAAGun(ByteBufUtils.readUTF8String(data));
			initType();
		}
		catch(Exception e)
		{
			FlansMod.log.error("Failed to retreive AA gun type from server.");
			super.setDead();
			FlansMod.log.throwing(e);
		}
	}
	
	@Override
	public boolean canRiderInteract()
	{
		return false;
	}
	
	@Override
	public ItemStack getPickedResult(RayTraceResult target)
	{
		return new ItemStack(type.item, 1, 0);
	}

	public int getStatus () {
		TileEntity te = world.getTileEntity(getPosition().down());
		if (te == null || (te instanceof TileEntityElectricBlock && ((TileEntityElectricBlock)te).getStored() < type.consumption || ((TileEntityElectricBlock)te).getOutput() == 0)) return 1;
		if (ammo == null || ammo.isEmpty() || ((TileEntityElectricBlock)te).getStored() < type.shotConsumption) return 2;
		return 0; 
	}

	public void ConsumeEnergy () {
		TileEntity te = world.getTileEntity(getPosition().down());
		if (te == null || te instanceof TileEntityElectricBlock) {
			TileEntityElectricBlock storage = (TileEntityElectricBlock)te;
			if (storage.getStored() >= type.consumption)
			storage.addEnergy(-type.consumption);

			else status = getStatus();
		}
	}

	public int GetTeamCodeFromString (String s) {
		if (s.length() < 2) return 6;
		String symbols = s.substring(0,2);
		switch (symbols) {
			case "§9": return 0;
			case "§c": return 1;
			case "§a": return 2;
			case "§e": return 3;
			case "§f": return 4;
			case "§0": return 5;
			default: return 6;
		}
	}
}
