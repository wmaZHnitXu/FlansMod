package com.flansmod.client;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHandSide;
import net.minecraft.world.World;

import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.vector.Vector3f;

public class EntityCamera extends EntityLivingBase
{
	public EntityDriveable driveable;
	public DriveableType type;
	
	public EntityCamera(World world)
	{
		super(world);
		setSize(0F, 0F);
	}
	
	public EntityCamera(World world, EntityDriveable d)
	{
		this(world);
		driveable = d;
		setPosition(d.posX, d.posY, d.posZ);
		type = driveable.getDriveableType();
	}
	
	@Override
	public void onUpdate()
	{
		prevPosX = posX;
		prevPosY = posY;
		prevPosZ = posZ;
		
		Vector3f cameraPosition = new Vector3f(-type.cameraDistance,0,0);
		cameraPosition = driveable.axes.findLocalVectorGlobally(cameraPosition);
		
		// Lerp it
		double dX = driveable.posX + cameraPosition.x - posX;
		double dY = driveable.posY + cameraPosition.y - posY;
		double dZ = driveable.posZ + cameraPosition.z - posZ;
		
		float lerpAmount = 0.5F;
		
		setPosition(posX + dX * lerpAmount, posY + 2d + dY * lerpAmount, posZ + dZ * lerpAmount);
		
		rotationYaw = driveable.axes.getYaw() - 90;
		rotationPitch = driveable.axes.getPitch();
		
		while(rotationYaw - prevRotationYaw >= 180F)
		{
			rotationYaw -= 360F;
		}
		while(rotationYaw - prevRotationYaw < -180F)
		{
			rotationYaw += 360F;
		}
	}
	
	@Override
	public Iterable<ItemStack> getArmorInventoryList()
	{
		return null;
	}
	
	@Override
	public ItemStack getItemStackFromSlot(EntityEquipmentSlot slotIn)
	{
		return ItemStack.EMPTY.copy();
	}
	
	@Override
	public void setItemStackToSlot(EntityEquipmentSlot slotIn, ItemStack stack)
	{
	
	}
	
	@Override
	public EnumHandSide getPrimaryHand()
	{
		return EnumHandSide.RIGHT;
	}
	
}
