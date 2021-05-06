//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Pistol1
// Model Creator: 
// Created on: 06.05.2021 - 12:26:28
// Last changed on: 06.05.2021 - 12:26:28

package com.flansmod.client.model.mw; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRifle1 extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelRifle1() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[7];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 13
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 14
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 15
		gunModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 16
		gunModel[4] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 17
		gunModel[5] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 18
		gunModel[6] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 19

		gunModel[0].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 13
		gunModel[0].setRotationPoint(0F, -2F, -0.5F);

		gunModel[1].addBox(0F, 0F, 0F, 14, 2, 2, 0F); // Box 14
		gunModel[1].setRotationPoint(-4F, -4F, -1F);

		gunModel[2].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 15
		gunModel[2].setRotationPoint(10F, -4F, -0.5F);

		gunModel[3].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 16
		gunModel[3].setRotationPoint(-2F, -4.5F, -0.5F);

		gunModel[4].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 17
		gunModel[4].setRotationPoint(-8F, -3F, -1F);

		gunModel[5].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 18
		gunModel[5].setRotationPoint(3F, -2F, -0.5F);

		gunModel[6].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 19
		gunModel[6].setRotationPoint(3F, -1F, -0.5F);
		gunModel[6].rotateAngleZ = 0.2268928F;



		translateAll(0F, 1.5F, 0F);


		flipAll();
	}
}