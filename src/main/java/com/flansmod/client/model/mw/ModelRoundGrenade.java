package com.flansmod.client.model.mw;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelRoundGrenade extends ModelBase
{
	public ModelRendererTurbo headModel;
	public ModelRendererTurbo bodyModel;

	public ModelRoundGrenade()
	{
		bodyModel = new ModelRendererTurbo(this, 0, 0, 32, 32);
		bodyModel.addBox(-1F, -1F, -1F, 3, 3, 5, 0F); // Box 0
		headModel = new ModelRendererTurbo(this, 8, 0, 32, 32);
		headModel.addBox(0F, -0.25F, 0F, 1, 2, 1, 0F);
		bodyModel.rotateAngleX = -3.14159265F / 2F;
		headModel.rotateAngleX = -3.14159265F / 2F;
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		headModel.render(f5);
		bodyModel.render(f5);
	}
}
