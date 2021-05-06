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

public class ModelLauncher1 extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelLauncher1() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[2];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 13
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 14

		gunModel[0].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 13
		gunModel[0].setRotationPoint(0F, -2F, -0.5F);

		gunModel[1].addBox(0F, 0F, 0F, 22, 4, 4, 0F); // Box 14
		gunModel[1].setRotationPoint(-12F, -6F, -2F);



		translateAll(0F, 2F, 0F);


		flipAll();
	}
}