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

public class ModelSentryrail extends ModelAAGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSentryrail() //Same as Filename
	{
		baseModel = new ModelRendererTurbo[10];
		baseModel[0] = new ModelRendererTurbo(this, 336, 367, textureX, textureY); // Box 0
		baseModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 1
		baseModel[2] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 3
		baseModel[3] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 4
		baseModel[4] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 5
		baseModel[5] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Shape 6
		baseModel[6] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Shape 7
		baseModel[7] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Shape 8
		baseModel[8] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Shape 9
		baseModel[9] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 10

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


		seatModel = new ModelRendererTurbo[28];
		seatModel[0] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 29
		seatModel[1] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 29
		seatModel[2] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 30
		seatModel[3] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 31
		seatModel[4] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 32
		seatModel[5] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 33
		seatModel[6] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 34
		seatModel[7] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 22
		seatModel[8] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 23
		seatModel[9] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 26
		seatModel[10] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 27
		seatModel[11] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 29
		seatModel[12] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 30
		seatModel[13] = new ModelRendererTurbo(this, 294, 335, textureX, textureY); // Shape 31
		seatModel[14] = new ModelRendererTurbo(this, 251, 340, textureX, textureY); // Shape 32
		seatModel[15] = new ModelRendererTurbo(this, 210, 339, textureX, textureY); // Shape 34
		seatModel[16] = new ModelRendererTurbo(this, 163, 341, textureX, textureY); // Shape 35
		seatModel[17] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 36
		seatModel[18] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 37
		seatModel[19] = new ModelRendererTurbo(this, 86, 334, textureX, textureY); // Shape 38
		seatModel[20] = new ModelRendererTurbo(this, 260, 311, textureX, textureY); // Shape 39
		seatModel[21] = new ModelRendererTurbo(this, 395, 344, textureX, textureY); // Shape 40
		seatModel[22] = new ModelRendererTurbo(this, 21, 328, textureX, textureY); // Shape 41
		seatModel[23] = new ModelRendererTurbo(this, 13, 269, textureX, textureY); // Shape 42
		seatModel[24] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 41
		seatModel[25] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 42
		seatModel[26] = new ModelRendererTurbo(this, 532, 42, textureX, textureY); // Box 43
		seatModel[27] = new ModelRendererTurbo(this, 147, 29, textureX, textureY); // Box 44

		seatModel[0].addBox(0F, 0F, 0F, 10, 3, 10, 0F); // Box 29
		seatModel[0].setRotationPoint(1F, -11F, -5F);

		seatModel[1].addBox(0F, 0F, 0F, 37, 2, 50, 0F); // Box 29
		seatModel[1].setRotationPoint(-17F, -8F, -25F);

		seatModel[2].addBox(0F, 0F, 0F, 30, 15, 2, 0F); // Box 30
		seatModel[2].setRotationPoint(-16F, -23F, -12F);

		seatModel[3].addBox(0F, 0F, 0F, 24, 15, 20, 0F); // Box 31
		seatModel[3].setRotationPoint(-39F, -23F, -10F);

		seatModel[4].addBox(0F, 0F, 0F, 30, 15, 2, 0F); // Box 32
		seatModel[4].setRotationPoint(-16F, -23F, 10F);

		seatModel[5].addBox(0F, 0F, 0F, 11, 13, 20, 0F); // Box 33
		seatModel[5].setRotationPoint(12F, -26F, -10F);

		seatModel[6].addBox(0F, 0F, 0F, 8, 5, 20, 0F); // Box 34
		seatModel[6].setRotationPoint(12F, -13F, -10F);

		seatModel[7].addBox(0F, 0F, 0F, 30, 20, 17, 0F); // Box 22
		seatModel[7].setRotationPoint(-16F, -28F, 12F);

		seatModel[8].addBox(0F, 0F, 0F, 30, 20, 17, 0F); // Box 23
		seatModel[8].setRotationPoint(-16F, -28F, -29F);

		seatModel[9].addBox(0F, 0F, 0F, 24, 7, 8, 0F); // Box 26
		seatModel[9].setRotationPoint(-16F, -35F, 11F);

		seatModel[10].addBox(0F, 0F, 0F, 24, 7, 8, 0F); // Box 27
		seatModel[10].setRotationPoint(-16F, -35F, -19F);

		seatModel[11].addBox(0F, 0F, 0F, 10, 12, 24, 0F); // Box 29
		seatModel[11].setRotationPoint(-21F, -35F, -12F);

		seatModel[12].addBox(0F, 0F, 0F, 29, 2, 24, 0F); // Box 30
		seatModel[12].setRotationPoint(-21F, -37F, -12F);

		seatModel[13].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(10, 0, 10, 0), new Coord2D(10, 8, 10, 8) }), 19, 10, 8, 31, 19, ModelRendererTurbo.MR_FRONT, new float[] {13 ,8 ,10}); // Shape 31
		seatModel[13].setRotationPoint(24F, -20F, 29F);

		seatModel[14].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(14, 0, 14, 0), new Coord2D(14, 4, 14, 4) }), 19, 14, 4, 33, 19, ModelRendererTurbo.MR_FRONT, new float[] {15 ,4 ,14}); // Shape 32
		seatModel[14].setRotationPoint(20F, -6F, 29F);
		seatModel[14].rotateAngleZ = -1.57079633F;

		seatModel[15].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(10, 0, 10, 0), new Coord2D(10, 8, 10, 8) }), 19, 10, 8, 31, 19, ModelRendererTurbo.MR_FRONT, new float[] {13 ,8 ,10}); // Shape 34
		seatModel[15].setRotationPoint(24F, -20F, -10F);

		seatModel[16].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(14, 0, 14, 0), new Coord2D(14, 4, 14, 4) }), 19, 14, 4, 33, 19, ModelRendererTurbo.MR_FRONT, new float[] {15 ,4 ,14}); // Shape 35
		seatModel[16].setRotationPoint(20F, -6F, -10F);
		seatModel[16].rotateAngleZ = -1.57079633F;

		seatModel[17].addBox(0F, 0F, 0F, 6, 12, 19, 0F); // Box 36
		seatModel[17].setRotationPoint(14F, -20F, 10F);

		seatModel[18].addBox(0F, 0F, 0F, 6, 12, 19, 0F); // Box 37
		seatModel[18].setRotationPoint(14F, -20F, -29F);

		seatModel[19].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(15, 0, 15, 0), new Coord2D(15, 11, 15, 11) }), 20, 15, 11, 45, 20, ModelRendererTurbo.MR_FRONT, new float[] {19 ,11 ,15}); // Shape 38
		seatModel[19].setRotationPoint(23F, -26F, 10F);

		seatModel[20].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(6, 0, 6, 0), new Coord2D(6, 7, 6, 7) }), 9, 6, 7, 23, 9, ModelRendererTurbo.MR_FRONT, new float[] {10 ,7 ,6}); // Shape 39
		seatModel[20].setRotationPoint(14F, -28F, 19F);

		seatModel[21].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(6, 0, 6, 0), new Coord2D(6, 7, 6, 7) }), 9, 6, 7, 23, 9, ModelRendererTurbo.MR_FRONT, new float[] {10 ,7 ,6}); // Shape 40
		seatModel[21].setRotationPoint(14F, -28F, -10F);

		seatModel[22].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(10, 0, 10, 0), new Coord2D(10, 7, 10, 7) }), 24, 10, 7, 30, 24, ModelRendererTurbo.MR_FRONT, new float[] {13 ,7 ,10}); // Shape 41
		seatModel[22].setRotationPoint(-16F, -28F, 29F);
		seatModel[22].rotateAngleY = 1.57079633F;

		seatModel[23].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(10, 0, 10, 0), new Coord2D(10, 7, 10, 7) }), 24, 10, 7, 30, 24, ModelRendererTurbo.MR_FRONT, new float[] {13 ,7 ,10}); // Shape 42
		seatModel[23].setRotationPoint(8F, -28F, -29F);
		seatModel[23].rotateAngleY = -1.57079633F;

		seatModel[24].addBox(0F, 0F, 0F, 10, 12, 24, 0F); // Box 41
		seatModel[24].setRotationPoint(-31F, -35F, -12F);

		seatModel[25].addBox(0F, 0F, 0F, 10, 12, 24, 0F); // Box 42
		seatModel[25].setRotationPoint(-41F, -35F, -12F);

		seatModel[26].addBox(0F, 0F, 0F, 22, 16, 12, 0F); // Box 43
		seatModel[26].setRotationPoint(-38F, -34F, -22F);

		seatModel[27].addBox(0F, 0F, 0F, 22, 16, 12, 0F); // Box 44
		seatModel[27].setRotationPoint(-38F, -34F, 10F);


		gunsightModel = new ModelRendererTurbo[7];
		gunsightModel[0] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 35
		gunsightModel[1] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 36
		gunsightModel[2] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 39
		gunsightModel[3] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 24
		gunsightModel[4] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 25
		gunsightModel[5] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 46
		gunsightModel[6] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 50

		gunsightModel[0].addBox(0F, 1F, 1F, 77, 1, 7, 0F); // Box 35
		gunsightModel[0].setRotationPoint(21F, -21F, 8F);
		gunsightModel[0].rotateAngleX = 2.61799388F;

		gunsightModel[1].addBox(0F, 2F, 8F, 77, 1, 7, 0F); // Box 36
		gunsightModel[1].setRotationPoint(21F, -21F, -16F);
		gunsightModel[1].rotateAngleX = 0.52359878F;

		gunsightModel[2].addBox(0F, 0F, 0F, 75, 3, 4, 0F); // Box 39
		gunsightModel[2].setRotationPoint(20F, -25F, -2F);

		gunsightModel[3].addBox(0F, 1F, 0F, 60, 1, 6, 0F); // Box 24
		gunsightModel[3].setRotationPoint(18F, -24F, 7F);
		gunsightModel[3].rotateAngleY = -0.08726646F;

		gunsightModel[4].addBox(0F, 1F, -6F, 60, 1, 6, 0F); // Box 25
		gunsightModel[4].setRotationPoint(18F, -24F, -7F);
		gunsightModel[4].rotateAngleY = 0.08726646F;

		gunsightModel[5].addBox(0F, 1F, 1F, 77, 1, 7, 0F); // Box 46
		gunsightModel[5].setRotationPoint(21F, -21F, -1F);
		gunsightModel[5].rotateAngleX = 0.34906585F;

		gunsightModel[6].addBox(0F, -3F, 3F, 77, 1, 7, 0F); // Box 50
		gunsightModel[6].setRotationPoint(21F, -21F, -10.7F);
		gunsightModel[6].rotateAngleX = -0.34906585F;



		barrelX = 0;
		barrelY = 0;
		barrelZ = 0;


		flipAll();
	}
}