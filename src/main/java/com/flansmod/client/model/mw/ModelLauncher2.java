//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 19.05.2021 - 22:23:29
// Last changed on: 19.05.2021 - 22:23:29

package com.flansmod.client.model.mw; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelLauncher2 extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelLauncher2() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[13];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 3
		gunModel[3] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 4
		gunModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 5
		gunModel[5] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 6
		gunModel[6] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 7
		gunModel[7] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 8
		gunModel[8] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 9
		gunModel[9] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 10
		gunModel[10] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 11
		gunModel[11] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 12
		gunModel[12] = new ModelRendererTurbo(this, 51, 32, textureX, textureY); // Box 12

		gunModel[0].addBox(0F, 0F, 0F, 17, 4, 4, 0F); // Box 0
		gunModel[0].setRotationPoint(-12F, -5F, -2F);

		gunModel[1].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 2
		gunModel[1].setRotationPoint(4F, -5.5F, -2.5F);

		gunModel[2].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 3
		gunModel[2].setRotationPoint(4F, -5.5F, 1.5F);

		gunModel[3].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 4
		gunModel[3].setRotationPoint(4F, -5.5F, -1.5F);

		gunModel[4].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 5
		gunModel[4].setRotationPoint(4F, -1.5F, -1.5F);

		gunModel[5].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 6
		gunModel[5].setRotationPoint(-16F, -5.5F, -2.5F);

		gunModel[6].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 7
		gunModel[6].setRotationPoint(-16F, -5.5F, -1.5F);

		gunModel[7].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 8
		gunModel[7].setRotationPoint(-16F, -1.5F, -1.5F);

		gunModel[8].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 9
		gunModel[8].setRotationPoint(-16F, -5.5F, 1.5F);

		gunModel[9].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 10
		gunModel[9].setRotationPoint(1F, -4.5F, 1.5F);

		gunModel[10].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 11
		gunModel[10].setRotationPoint(1F, -6F, 2.5F);

		gunModel[11].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Box 12
		gunModel[11].setRotationPoint(-5F, -6.5F, -0.5F);

		gunModel[12].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 12
		gunModel[12].setRotationPoint(1F, -7F, -1.5F);



		translateAll(0F, 02F, 0F);


		flipAll();
	}
}