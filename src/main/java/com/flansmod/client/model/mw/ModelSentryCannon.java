//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: turret
// Model Creator: 
// Created on: 02.12.2020 - 16:56:28
// Last changed on: 02.12.2020 - 16:56:28

package com.flansmod.client.model.mw; //Path where the model is located

import com.flansmod.client.model.ModelAAGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSentryCannon extends ModelAAGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSentryCannon() //Same as Filename
	{
		baseModel = new ModelRendererTurbo[10];
		baseModel[0] = new ModelRendererTurbo(this, 329, 75, textureX, textureY); // Box 0
		baseModel[1] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 1
		baseModel[2] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 3
		baseModel[3] = new ModelRendererTurbo(this, 383, 167, textureX, textureY); // Box 4
		baseModel[4] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 5
		baseModel[5] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Shape 6
		baseModel[6] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Shape 7
		baseModel[7] = new ModelRendererTurbo(this, 410, 45, textureX, textureY); // Shape 8
		baseModel[8] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Shape 9
		baseModel[9] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 10

		baseModel[0].addBox(0F, 0F, 0F, 14, 3, 14, 0F); // Box 0
		baseModel[0].setRotationPoint(-7F, -2F, -7F);

		baseModel[1].addBox(0F, 0F, 0F, 12, 2, 12, 0F); // Box 1
		baseModel[1].setRotationPoint(-6F, -1F, 7F);

		baseModel[2].addBox(0F, 0F, 0F, 12, 2, 12, 0F); // Box 3
		baseModel[2].setRotationPoint(-6F, -1F, -19F);

		baseModel[3].addBox(0F, 0F, 0F, 12, 2, 12, 0F); // Box 4
		baseModel[3].setRotationPoint(7F, -1F, 6F);
		baseModel[3].rotateAngleY = -1.57079633F;

		baseModel[4].addBox(0F, 0F, 0F, 12, 2, 12, 0F); // Box 5
		baseModel[4].setRotationPoint(-19F, -1F, 6F);
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

		seatModel = new ModelRendererTurbo[10];
		seatModel[0] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 12
		seatModel[1] = new ModelRendererTurbo(this, 418, 4, textureX, textureY); // Box 13
		seatModel[2] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Shape 14
		seatModel[3] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 15
		seatModel[4] = new ModelRendererTurbo(this, 227, 178, textureX, textureY); // Shape 16
		seatModel[5] = new ModelRendererTurbo(this, 76, 171, textureX, textureY); // Shape 17
		seatModel[6] = new ModelRendererTurbo(this, 337, 122, textureX, textureY); // Shape 19
		seatModel[7] = new ModelRendererTurbo(this, 296, 182, textureX, textureY); // Box 18
		seatModel[8] = new ModelRendererTurbo(this, 115, 77, textureX, textureY); // Box 19
		seatModel[9] = new ModelRendererTurbo(this, 51, 61, textureX, textureY); // Box 26

		seatModel[0].addBox(0F, 0F, 0F, 23, 1, 17, 0F); // Box 12
		seatModel[0].setRotationPoint(-11F, -7F, -8.5F);

		seatModel[1].addBox(0F, 0F, 0F, 26, 6, 27, 0F); // Box 13
		seatModel[1].setRotationPoint(-14F, -13F, -14F);

		seatModel[2].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(3, 0, 3, 0), new Coord2D(3, 6, 3, 6) }), 27, 3, 8, 16, 27, ModelRendererTurbo.MR_FRONT, new float[] {7 ,6 ,3}); // Shape 14
		seatModel[2].setRotationPoint(15F, -13F, -14F);
		seatModel[2].rotateAngleX = 3.14159265F;

		seatModel[3].addBox(0F, 0F, 0F, 22, 11, 27, 0F); // Box 15
		seatModel[3].setRotationPoint(-23F, -24F, -14F);

		seatModel[4].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(16, 0, 16, 0), new Coord2D(16, 11, 16, 11) }), 9, 16, 11, 47, 9, ModelRendererTurbo.MR_FRONT, new float[] {20 ,11 ,16}); // Shape 16
		seatModel[4].setRotationPoint(15F, -13F, 13F);

		seatModel[5].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(16, 0, 16, 0), new Coord2D(16, 11, 16, 11) }), 9, 16, 11, 47, 9, ModelRendererTurbo.MR_FRONT, new float[] {20 ,11 ,16}); // Shape 17
		seatModel[5].setRotationPoint(15F, -13F, -5F);

		seatModel[6].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(6, 0, 6, 0), new Coord2D(6, 9, 6, 9) }), 17, 6, 9, 26, 17, ModelRendererTurbo.MR_FRONT, new float[] {11 ,9 ,6}); // Shape 19
		seatModel[6].setRotationPoint(-14F, -7F, -10F);
		seatModel[6].rotateAngleX = 3.14159265F;
		seatModel[6].rotateAngleZ = 4.71238898F;

		seatModel[7].addBox(0F, 0F, 0F, 12, 4, 5, 0F); // Box 18
		seatModel[7].setRotationPoint(-23F, -28F, -15F);

		seatModel[8].addBox(0F, 0F, 0F, 18, 2, 12, 0F); // Box 19
		seatModel[8].setRotationPoint(-23F, -26F, -10F);

		seatModel[9].addBox(0F, 0F, 0F, 5, 6, 7, 0F); // Box 26
		seatModel[9].setRotationPoint(-2F, -21F, -4F);


		barrelModel = new ModelRendererTurbo[1][1];
		barrelModel[0] = new ModelRendererTurbo[1];
		barrelModel[0][0] = new ModelRendererTurbo(this, 123, 68, textureX, textureY); // Box 27

		barrelModel[0][0].addBox(0F, 0F, 0F, 38, 4, 5, 0F); // Box 27
		barrelModel[0][0].setRotationPoint(1F, -20F, -3F);



		barrelX = -1;
		barrelY = 20;
		barrelZ = 3;


		flipAll();
	}
}