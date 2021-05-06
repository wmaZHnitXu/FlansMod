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

public class ModelPistol1 extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelPistol1() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[6];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 7
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 8
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 9
		gunModel[3] = new ModelRendererTurbo(this, 40, 6, textureX, textureY); // Box 10
		gunModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 11
		gunModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 12

		gunModel[0].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 7
		gunModel[0].setRotationPoint(1F, -2F, 0F);

		gunModel[1].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 8
		gunModel[1].setRotationPoint(1F, -4F, 0F);

		gunModel[2].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 9
		gunModel[2].setRotationPoint(0F, -3F, 0F);

		gunModel[3].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 10
		gunModel[3].setRotationPoint(4F, -2F, 0F);

		gunModel[4].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 11
		gunModel[4].setRotationPoint(3F, -1F, 0F);

		gunModel[5].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 12
		gunModel[5].setRotationPoint(7F, -5F, 0F);



		translateAll(0F, 1.5F, 0F);


		flipAll();
	}
}