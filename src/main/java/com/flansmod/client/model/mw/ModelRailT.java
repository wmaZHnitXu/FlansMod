//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
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

public class ModelRailT extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelRailT() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[10];
		bodyModel[0] = new ModelRendererTurbo(this, 336, 367, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Shape 6
		bodyModel[6] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Shape 7
		bodyModel[7] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Shape 8
		bodyModel[8] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Shape 9
		bodyModel[9] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 10

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


		turretModel = new ModelRendererTurbo[28];
		turretModel[0] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 29
		turretModel[1] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 29
		turretModel[2] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 30
		turretModel[3] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 31
		turretModel[4] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 32
		turretModel[5] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 33
		turretModel[6] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 34
		turretModel[7] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 22
		turretModel[8] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 23
		turretModel[9] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 26
		turretModel[10] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 27
		turretModel[11] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 29
		turretModel[12] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 30
		turretModel[13] = new ModelRendererTurbo(this, 294, 335, textureX, textureY); // Shape 31
		turretModel[14] = new ModelRendererTurbo(this, 251, 340, textureX, textureY); // Shape 32
		turretModel[15] = new ModelRendererTurbo(this, 210, 339, textureX, textureY); // Shape 34
		turretModel[16] = new ModelRendererTurbo(this, 163, 341, textureX, textureY); // Shape 35
		turretModel[17] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 36
		turretModel[18] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 37
		turretModel[19] = new ModelRendererTurbo(this, 86, 334, textureX, textureY); // Shape 38
		turretModel[20] = new ModelRendererTurbo(this, 260, 311, textureX, textureY); // Shape 39
		turretModel[21] = new ModelRendererTurbo(this, 395, 344, textureX, textureY); // Shape 40
		turretModel[22] = new ModelRendererTurbo(this, 21, 328, textureX, textureY); // Shape 41
		turretModel[23] = new ModelRendererTurbo(this, 13, 269, textureX, textureY); // Shape 42
		turretModel[24] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 41
		turretModel[25] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 42
		turretModel[26] = new ModelRendererTurbo(this, 532, 42, textureX, textureY); // Box 43
		turretModel[27] = new ModelRendererTurbo(this, 147, 29, textureX, textureY); // Box 44

		turretModel[0].addBox(0F, 0F, 0F, 10, 3, 10, 0F); // Box 29
		turretModel[0].setRotationPoint(1F, -2F, -5F);

		turretModel[1].addBox(0F, 0F, 0F, 37, 2, 50, 0F); // Box 29
		turretModel[1].setRotationPoint(-17F, 1F, -25F);

		turretModel[2].addBox(0F, 0F, 0F, 30, 15, 2, 0F); // Box 30
		turretModel[2].setRotationPoint(-16F, -14F, -12F);

		turretModel[3].addBox(0F, 0F, 0F, 24, 15, 20, 0F); // Box 31
		turretModel[3].setRotationPoint(-39F, -14F, -10F);

		turretModel[4].addBox(0F, 0F, 0F, 30, 15, 2, 0F); // Box 32
		turretModel[4].setRotationPoint(-16F, -14F, 10F);

		turretModel[5].addBox(0F, 0F, 0F, 11, 13, 20, 0F); // Box 33
		turretModel[5].setRotationPoint(12F, -17F, -10F);

		turretModel[6].addBox(0F, 0F, 0F, 8, 5, 20, 0F); // Box 34
		turretModel[6].setRotationPoint(12F, -4F, -10F);

		turretModel[7].addBox(0F, 0F, 0F, 30, 20, 17, 0F); // Box 22
		turretModel[7].setRotationPoint(-16F, -19F, 12F);

		turretModel[8].addBox(0F, 0F, 0F, 30, 20, 17, 0F); // Box 23
		turretModel[8].setRotationPoint(-16F, -19F, -29F);

		turretModel[9].addBox(0F, 0F, 0F, 24, 7, 8, 0F); // Box 26
		turretModel[9].setRotationPoint(-16F, -26F, 11F);

		turretModel[10].addBox(0F, 0F, 0F, 24, 7, 8, 0F); // Box 27
		turretModel[10].setRotationPoint(-16F, -26F, -19F);

		turretModel[11].addBox(0F, 0F, 0F, 10, 12, 24, 0F); // Box 29
		turretModel[11].setRotationPoint(-21F, -26F, -12F);

		turretModel[12].addBox(0F, 0F, 0F, 29, 2, 24, 0F); // Box 30
		turretModel[12].setRotationPoint(-21F, -28F, -12F);

		turretModel[13].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(10, 0, 10, 0), new Coord2D(10, 8, 10, 8) }), 19, 10, 8, 31, 19, ModelRendererTurbo.MR_FRONT, new float[] {13 ,8 ,10}); // Shape 31
		turretModel[13].setRotationPoint(24F, -11F, 29F);

		turretModel[14].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(14, 0, 14, 0), new Coord2D(14, 4, 14, 4) }), 19, 14, 4, 33, 19, ModelRendererTurbo.MR_FRONT, new float[] {15 ,4 ,14}); // Shape 32
		turretModel[14].setRotationPoint(20F, 3F, 29F);
		turretModel[14].rotateAngleZ = -1.57079633F;

		turretModel[15].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(10, 0, 10, 0), new Coord2D(10, 8, 10, 8) }), 19, 10, 8, 31, 19, ModelRendererTurbo.MR_FRONT, new float[] {13 ,8 ,10}); // Shape 34
		turretModel[15].setRotationPoint(24F, -11F, -10F);

		turretModel[16].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(14, 0, 14, 0), new Coord2D(14, 4, 14, 4) }), 19, 14, 4, 33, 19, ModelRendererTurbo.MR_FRONT, new float[] {15 ,4 ,14}); // Shape 35
		turretModel[16].setRotationPoint(20F, 3F, -10F);
		turretModel[16].rotateAngleZ = -1.57079633F;

		turretModel[17].addBox(0F, 0F, 0F, 6, 12, 19, 0F); // Box 36
		turretModel[17].setRotationPoint(14F, -11F, 10F);

		turretModel[18].addBox(0F, 0F, 0F, 6, 12, 19, 0F); // Box 37
		turretModel[18].setRotationPoint(14F, -11F, -29F);

		turretModel[19].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(15, 0, 15, 0), new Coord2D(15, 11, 15, 11) }), 20, 15, 11, 45, 20, ModelRendererTurbo.MR_FRONT, new float[] {19 ,11 ,15}); // Shape 38
		turretModel[19].setRotationPoint(23F, -17F, 10F);

		turretModel[20].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(6, 0, 6, 0), new Coord2D(6, 7, 6, 7) }), 9, 6, 7, 23, 9, ModelRendererTurbo.MR_FRONT, new float[] {10 ,7 ,6}); // Shape 39
		turretModel[20].setRotationPoint(14F, -19F, 19F);

		turretModel[21].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(6, 0, 6, 0), new Coord2D(6, 7, 6, 7) }), 9, 6, 7, 23, 9, ModelRendererTurbo.MR_FRONT, new float[] {10 ,7 ,6}); // Shape 40
		turretModel[21].setRotationPoint(14F, -19F, -10F);

		turretModel[22].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(10, 0, 10, 0), new Coord2D(10, 7, 10, 7) }), 24, 10, 7, 30, 24, ModelRendererTurbo.MR_FRONT, new float[] {13 ,7 ,10}); // Shape 41
		turretModel[22].setRotationPoint(-16F, -19F, 29F);
		turretModel[22].rotateAngleY = 1.57079633F;

		turretModel[23].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(10, 0, 10, 0), new Coord2D(10, 7, 10, 7) }), 24, 10, 7, 30, 24, ModelRendererTurbo.MR_FRONT, new float[] {13 ,7 ,10}); // Shape 42
		turretModel[23].setRotationPoint(8F, -19F, -29F);
		turretModel[23].rotateAngleY = -1.57079633F;

		turretModel[24].addBox(0F, 0F, 0F, 10, 12, 24, 0F); // Box 41
		turretModel[24].setRotationPoint(-31F, -26F, -12F);

		turretModel[25].addBox(0F, 0F, 0F, 10, 12, 24, 0F); // Box 42
		turretModel[25].setRotationPoint(-41F, -26F, -12F);

		turretModel[26].addBox(0F, 0F, 0F, 22, 16, 12, 0F); // Box 43
		turretModel[26].setRotationPoint(-38F, -25F, -22F);

		turretModel[27].addBox(0F, 0F, 0F, 22, 16, 12, 0F); // Box 44
		turretModel[27].setRotationPoint(-38F, -25F, 10F);


		barrelModel = new ModelRendererTurbo[7];
		barrelModel[0] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 35
		barrelModel[1] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 36
		barrelModel[2] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 37
		barrelModel[3] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 38
		barrelModel[4] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 39
		barrelModel[5] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 24
		barrelModel[6] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 25

		barrelModel[0].addBox(0F, 1F, 1F, 77, 1, 7, 0F); // Box 35
		barrelModel[0].setRotationPoint(21F, -12F, 8F);
		barrelModel[0].rotateAngleX = 2.61799388F;

		barrelModel[1].addBox(0F, 2F, 8F, 77, 1, 7, 0F); // Box 36
		barrelModel[1].setRotationPoint(21F, -12F, -16F);
		barrelModel[1].rotateAngleX = 0.52359878F;

		barrelModel[2].addBox(0F, 1F, 1F, 77, 1, 7, 0F); // Box 37
		barrelModel[2].setRotationPoint(21F, -12F, 8F);
		barrelModel[2].rotateAngleX = 3.4906585F;

		barrelModel[3].addBox(0F, 0F, 10F, 77, 1, 7, 0F); // Box 38
		barrelModel[3].setRotationPoint(21F, -17F, -16F);
		barrelModel[3].rotateAngleX = -0.34906585F;

		barrelModel[4].addBox(0F, 0F, 0F, 75, 3, 4, 0F); // Box 39
		barrelModel[4].setRotationPoint(20F, -16F, -2F);

		barrelModel[5].addBox(0F, 1F, 0F, 60, 1, 6, 0F); // Box 24
		barrelModel[5].setRotationPoint(15F, -15F, 7F);
		barrelModel[5].rotateAngleY = -0.08726646F;

		barrelModel[6].addBox(0F, 1F, -6F, 60, 1, 6, 0F); // Box 25
		barrelModel[6].setRotationPoint(15F, -15F, -7F);
		barrelModel[6].rotateAngleY = 0.08726646F;



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}