//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: RocketT
// Model Creator: 
// Created on: 02.12.2020 - 16:56:28
// Last changed on: 02.12.2020 - 16:56:28

package com.flansmod.client.model.mw; //Path where the model is located

import com.flansmod.client.model.ModelAAGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSentryr2 extends ModelAAGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSentryr2() //Same as Filename
	{
		baseModel = new ModelRendererTurbo[11];
		baseModel[0] = new ModelRendererTurbo(this, 138, 309, textureX, textureY); // Box 0
		baseModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 1
		baseModel[2] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 3
		baseModel[3] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 4
		baseModel[4] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 5
		baseModel[5] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Shape 6
		baseModel[6] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Shape 7
		baseModel[7] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Shape 8
		baseModel[8] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Shape 9
		baseModel[9] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 10
		baseModel[10] = new ModelRendererTurbo(this, 107, 275, textureX, textureY); // Box 29

		baseModel[0].addBox(0F, 0F, 0F, 14, 3, 14, 0F); // Box 0
		baseModel[0].setRotationPoint(-7F, -2F, -7F);

		baseModel[1].addBox(0F, 0F, 0F, 12, 2, 18, 0F); // Box 1
		baseModel[1].setRotationPoint(-6F, -1F, 7F);

		baseModel[2].addBox(0F, 0F, 0F, 12, 2, 18, 0F); // Box 3
		baseModel[2].setRotationPoint(-6F, -1F, -25F);

		baseModel[3].addBox(0F, 0F, 0F, 12, 2, 18, 0F); // Box 4
		baseModel[3].setRotationPoint(7F, -1F, 6F);
		baseModel[3].rotateAngleY = -1.57079633F;

		baseModel[4].addBox(0F, 0F, 0F, 12, 2, 18, 0F); // Box 5
		baseModel[4].setRotationPoint(-25F, -1F, 6F);
		baseModel[4].rotateAngleY = -1.57079633F;

		baseModel[5].addShape3D(10F, 0F, -9F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(10, 0, 10, 0), new Coord2D(10, 2, 10, 2) }), 18, 10, 2, 23, 18, ModelRendererTurbo.MR_FRONT, new float[] {11 ,2 ,10}); // Shape 6
		baseModel[5].setRotationPoint(5F, 1.1F, -5F);
		baseModel[5].rotateAngleY = -0.78539816F;

		baseModel[6].addShape3D(10F, 0F, -9F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(10, 0, 10, 0), new Coord2D(10, 2, 10, 2) }), 18, 10, 2, 23, 18, ModelRendererTurbo.MR_FRONT, new float[] {11 ,2 ,10}); // Shape 7
		baseModel[6].setRotationPoint(-5F, 1.1F, 5F);
		baseModel[6].rotateAngleY = -3.92699082F;

		baseModel[7].addShape3D(10F, 0F, -9F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(10, 0, 10, 0), new Coord2D(10, 2, 10, 2) }), 18, 10, 2, 23, 18, ModelRendererTurbo.MR_FRONT, new float[] {11 ,2 ,10}); // Shape 8
		baseModel[7].setRotationPoint(5F, 1.1F, 5F);
		baseModel[7].rotateAngleY = 0.78539816F;

		baseModel[8].addShape3D(10F, 0F, -9F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(10, 0, 10, 0), new Coord2D(10, 2, 10, 2) }), 18, 10, 2, 23, 18, ModelRendererTurbo.MR_FRONT, new float[] {11 ,2 ,10}); // Shape 9
		baseModel[8].setRotationPoint(-5F, 1.1F, -5F);
		baseModel[8].rotateAngleY = -2.35619449F;

		baseModel[9].addBox(0F, 0F, 0F, 12, 4, 12, 0F); // Box 10
		baseModel[9].setRotationPoint(-6F, -6F, -6F);

		baseModel[10].addBox(0F, 0F, 0F, 10, 3, 10, 0F); // Box 29
		baseModel[10].setRotationPoint(-7F, -11F, -4.5F);


		seatModel = new ModelRendererTurbo[10];
		seatModel[0] = new ModelRendererTurbo(this, 135, 97, textureX, textureY); // Box 32
		seatModel[1] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 11
		seatModel[2] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 12
		seatModel[3] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Shape 13
		seatModel[4] = new ModelRendererTurbo(this, 82, 307, textureX, textureY); // Box 18
		seatModel[5] = new ModelRendererTurbo(this, 14, 307, textureX, textureY); // Box 20
		seatModel[6] = new ModelRendererTurbo(this, 184, 270, textureX, textureY); // Box 24
		seatModel[7] = new ModelRendererTurbo(this, 7, 23, textureX, textureY); // Box 28
		seatModel[8] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Shape 29
		seatModel[9] = new ModelRendererTurbo(this, 135, 199, textureX, textureY); // Box 30

		seatModel[0].addBox(0F, 0F, 0F, 27, 2, 17, 0F); // Box 32
		seatModel[0].setRotationPoint(-19F, -8F, -8F);

		seatModel[1].addBox(0F, 0F, 0F, 27, 28, 2, 0F); // Box 11
		seatModel[1].setRotationPoint(-19F, -34F, -10F);

		seatModel[2].addBox(0F, 0F, 0F, 27, 28, 2, 0F); // Box 12
		seatModel[2].setRotationPoint(-19F, -34F, 9F);

		seatModel[3].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 14, 0, 14), new Coord2D(4, 0, 4, 0), new Coord2D(4, 14, 4, 14) }), 21, 4, 14, 33, 21, ModelRendererTurbo.MR_FRONT, new float[] {4 ,14 ,15}); // Shape 13
		seatModel[3].setRotationPoint(12F, -6F, 11F);

		seatModel[4].addBox(0F, 0F, 0F, 15, 15, 3, 0F); // Box 18
		seatModel[4].setRotationPoint(-11F, -31F, 11F);

		seatModel[5].addBox(0F, 0F, 0F, 15, 15, 1, 0F); // Box 20
		seatModel[5].setRotationPoint(-11F, -31F, 19F);

		seatModel[6].addBox(0F, 0F, 0F, 15, 15, 3, 0F); // Box 24
		seatModel[6].setRotationPoint(-11F, -31F, -13F);

		seatModel[7].addBox(0F, 0F, 0F, 3, 28, 19, 0F); // Box 28
		seatModel[7].setRotationPoint(-22F, -34F, -9F);

		seatModel[8].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 14, 0, 14), new Coord2D(4, 0, 4, 0), new Coord2D(4, 14, 4, 14) }), 21, 4, 14, 33, 21, ModelRendererTurbo.MR_FRONT, new float[] {4 ,14 ,15}); // Shape 29
		seatModel[8].setRotationPoint(12F, -34F, -10F);
		seatModel[8].rotateAngleX = 3.14159265F;

		seatModel[9].addBox(0F, 0F, 0F, 27, 2, 17, 0F); // Box 30
		seatModel[9].setRotationPoint(-19F, -34F, -8F);


		gunsightModel = new ModelRendererTurbo[2];
		gunsightModel[0] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 16
		gunsightModel[1] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 17

		gunsightModel[0].addBox(-15F, -10F, 0F, 30, 19, 13, 0F); // Box 16
		gunsightModel[0].setRotationPoint(-3F, -23F, -26F);

		gunsightModel[1].addBox(-15F, -10F, 0F, 30, 19, 13, 0F); // Box 17
		gunsightModel[1].setRotationPoint(-3F, -22F, 14F);



		barrelX = 0;
		barrelY = 0;
		barrelZ = 0;


		flipAll();
	}
}