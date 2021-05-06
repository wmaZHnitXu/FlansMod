package com.flansmod.common.driveables;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class jumboTile extends TileEntity {
	public double energyStored;

	@Override
	public void readFromNBT(NBTTagCompound compound)
	{
		super.readFromNBT(compound);
		this.energyStored = compound.getDouble("energy");
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound)
	{
		compound.setDouble("energy", this.energyStored);
		return super.writeToNBT(compound);
	}

	public double addEnergy(double amount)
	{
		this.energyStored += amount;
		return amount;
	}

	public double getEnergy(double maxAmount, boolean simulate)
	{
		double amount = maxAmount;
		if(this.energyStored - amount < 0)
			amount = this.energyStored;
		if(!simulate)
			this.energyStored -= amount;
		return amount;
	}

	public double getStoredEnergy()
	{
		return this.energyStored;
	}
}
