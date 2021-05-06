package com.flansmod.common.network;

import com.flansmod.common.guns.EntityAAGun;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketAAGunStatus extends PacketBase {

    public int status;
    public int entityID;

    public PacketAAGunStatus (EntityAAGun entity) {
        status = entity.status;
        entityID = entity.getEntityId();
    }

    public PacketAAGunStatus () {}

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        data.writeInt(entityID);
        data.writeInt(status);
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        entityID = data.readInt();
        status = data.readInt();
        
    }

    @Override
    public void handleServerSide(EntityPlayerMP playerEntity) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void handleClientSide(EntityPlayer clientPlayer) {
        Entity entity = clientPlayer.world.getEntityByID(entityID);
		if(entity instanceof EntityAAGun)
		{
			EntityAAGun aa = (EntityAAGun)entity;
			aa.status = status;
		}
    }
    
}
