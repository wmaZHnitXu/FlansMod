//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: RocketT
// Model Creator: 
// Created on: 02.12.2020 - 16:56:28
// Last changed on: 02.12.2020 - 16:56:28

package com.flansmod.client.model.mw; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRocketT2 extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelRocketT2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[11];
		bodyModel[0] = new ModelRendererTurbo(this, 138, 309, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Shape 6
		bodyModel[6] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Shape 7
		bodyModel[7] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Shape 8
		bodyModel[8] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Shape 9
		bodyModel[9] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 107, 275, textureX, textureY); // Box 29

		bodyModel[0].addBox(0F, 0F, 0F, 14, 3, 14, 0F); // Box 0
		bodyModel[0].setRotationPoint(-7F, 7F, -7F);

		bodyModel[1].addBox(0F, 0F, 0F, 12, 2, 18, 0F); // Box 1
		bodyModel[1].setRotationPoint(-6F, 8F, 7F);

		bodyModel[2].addBox(0F, 0F, 0F, 12, 2, 18, 0F); // Box 3
		bodyModel[2].setRotationPoint(-6F, 8F, -25F);

		bodyModel[3].addBox(0F, 0F, 0F, 12, 2, 18, 0F); // Box 4
		bodyModel[3].setRotationPoint(7F, 8F, 6F);
		bodyModel[3].rotateAngleY = -1.57079633F;

		bodyModel[4].addBox(0F, 0F, 0F, 12, 2, 18, 0F); // Box 5
		bodyModel[4].setRotationPoint(-25F, 8F, 6F);
		bodyModel[4].rotateAngleY = -1.57079633F;

		bodyModel[5].addShape3D(10F, 0F, -9F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(10, 0, 10, 0), new Coord2D(10, 2, 10, 2) }), 18, 10, 2, 23, 18, ModelRendererTurbo.MR_FRONT, new float[] {11 ,2 ,10}); // Shape 6
		bodyModel[5].setRotationPoint(5F, 10.1F, -5F);
		bodyModel[5].rotateAngleY = -0.78539816F;

		bodyModel[6].addShape3D(10F, 0F, -9F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(10, 0, 10, 0), new Coord2D(10, 2, 10, 2) }), 18, 10, 2, 23, 18, ModelRendererTurbo.MR_FRONT, new float[] {11 ,2 ,10}); // Shape 7
		bodyModel[6].setRotationPoint(-5F, 10.1F, 5F);
		bodyModel[6].rotateAngleY = -3.92699082F;

		bodyModel[7].addShape3D(10F, 0F, -9F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(10, 0, 10, 0), new Coord2D(10, 2, 10, 2) }), 18, 10, 2, 23, 18, ModelRendererTurbo.MR_FRONT, new float[] {11 ,2 ,10}); // Shape 8
		bodyModel[7].setRotationPoint(5F, 10.1F, 5F);
		bodyModel[7].rotateAngleY = 0.78539816F;

		bodyModel[8].addShape3D(10F, 0F, -9F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(10, 0, 10, 0), new Coord2D(10, 2, 10, 2) }), 18, 10, 2, 23, 18, ModelRendererTurbo.MR_FRONT, new float[] {11 ,2 ,10}); // Shape 9
		bodyModel[8].setRotationPoint(-5F, 10.1F, -5F);
		bodyModel[8].rotateAngleY = -2.35619449F;

		bodyModel[9].addBox(0F, 0F, 0F, 12, 4, 12, 0F); // Box 10
		bodyModel[9].setRotationPoint(-6F, 3F, -6F);

		bodyModel[10].addBox(0F, 0F, 0F, 10, 3, 10, 0F); // Box 29
		bodyModel[10].setRotationPoint(-7F, -2F, -4.5F);


		turretModel = new ModelRendererTurbo[10];
		turretModel[0] = new ModelRendererTurbo(this, 135, 97, textureX, textureY); // Box 32
		turretModel[1] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 11
		turretModel[2] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 12
		turretModel[3] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Shape 13
		turretModel[4] = new ModelRendererTurbo(this, 82, 307, textureX, textureY); // Box 18
		turretModel[5] = new ModelRendererTurbo(this, 14, 307, textureX, textureY); // Box 20
		turretModel[6] = new ModelRendererTurbo(this, 184, 270, textureX, textureY); // Box 24
		turretModel[7] = new ModelRendererTurbo(this, 7, 23, textureX, textureY); // Box 28
		turretModel[8] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Shape 29
		turretModel[9] = new ModelRendererTurbo(this, 135, 199, textureX, textureY); // Box 30

		turretModel[0].addBox(0F, 0F, 0F, 27, 2, 17, 0F); // Box 32
		turretModel[0].setRotationPoint(-19F, 1F, -8F);

		turretModel[1].addBox(0F, 0F, 0F, 27, 28, 2, 0F); // Box 11
		turretModel[1].setRotationPoint(-19F, -25F, -10F);

		turretModel[2].addBox(0F, 0F, 0F, 27, 28, 2, 0F); // Box 12
		turretModel[2].setRotationPoint(-19F, -25F, 9F);

		turretModel[3].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 14, 0, 14), new Coord2D(4, 0, 4, 0), new Coord2D(4, 14, 4, 14) }), 21, 4, 14, 33, 21, ModelRendererTurbo.MR_FRONT, new float[] {4 ,14 ,15}); // Shape 13
		turretModel[3].setRotationPoint(12F, 3F, 11F);

		turretModel[4].addBox(0F, 0F, 0F, 15, 15, 3, 0F); // Box 18
		turretModel[4].setRotationPoint(-11F, -22F, 11F);

		turretModel[5].addBox(0F, 0F, 0F, 15, 15, 1, 0F); // Box 20
		turretModel[5].setRotationPoint(-11F, -22F, 19F);

		turretModel[6].addBox(0F, 0F, 0F, 15, 15, 3, 0F); // Box 24
		turretModel[6].setRotationPoint(-11F, -22F, -13F);

		turretModel[7].addBox(0F, 0F, 0F, 3, 28, 19, 0F); // Box 28
		turretModel[7].setRotationPoint(-22F, -25F, -9F);

		turretModel[8].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 14, 0, 14), new Coord2D(4, 0, 4, 0), new Coord2D(4, 14, 4, 14) }), 21, 4, 14, 33, 21, ModelRendererTurbo.MR_FRONT, new float[] {4 ,14 ,15}); // Shape 29
		turretModel[8].setRotationPoint(12F, -25F, -10F);
		turretModel[8].rotateAngleX = 3.14159265F;

		turretModel[9].addBox(0F, 0F, 0F, 27, 2, 17, 0F); // Box 30
		turretModel[9].setRotationPoint(-19F, -25F, -8F);


		barrelModel = new ModelRendererTurbo[2];
		barrelModel[0] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 16
		barrelModel[1] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 17

		barrelModel[0].addBox(-15F, -10F, 0F, 30, 19, 13, 0F); // Box 16
		barrelModel[0].setRotationPoint(-3F, -14F, -26F);

		barrelModel[1].addBox(-15F, -10F, 0F, 30, 19, 13, 0F); // Box 17
		barrelModel[1].setRotationPoint(-3F, -13F, 14F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}