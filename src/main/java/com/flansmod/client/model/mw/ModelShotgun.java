//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Shotgun
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

public class ModelShotgun extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelShotgun() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[4];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 5
		gunModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 6

		gunModel[0].addBox(0F, 0F, 0F, 13, 1, 2, 0F); // Box 0
		gunModel[0].setRotationPoint(-5F, -2.5F, -1F);

		gunModel[1].addBox(0F, 0F, 0F, 19, 1, 2, 0F); // Box 1
		gunModel[1].setRotationPoint(-2F, -3.5F, -1F);

		gunModel[2].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 5
		gunModel[2].setRotationPoint(-4F, -3F, -1F);

		gunModel[3].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 6
		gunModel[3].setRotationPoint(-5F, -1.5F, -1F);



		translateAll(0F, 1.5F, 0F);


		flipAll();
	}
}