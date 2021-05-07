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

public class ModelSentryMg extends ModelAAGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSentryMg() //Same as Filename
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


		seatModel = new ModelRendererTurbo[12];
		seatModel[0] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 12
		seatModel[1] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 13
		seatModel[2] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Shape 14
		seatModel[3] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 15
		seatModel[4] = new ModelRendererTurbo(this, 227, 178, textureX, textureY); // Shape 16
		seatModel[5] = new ModelRendererTurbo(this, 76, 171, textureX, textureY); // Shape 17
		seatModel[6] = new ModelRendererTurbo(this, 164, 129, textureX, textureY); // Shape 18
		seatModel[7] = new ModelRendererTurbo(this, 337, 122, textureX, textureY); // Shape 19
		seatModel[8] = new ModelRendererTurbo(this, 296, 182, textureX, textureY); // Box 18
		seatModel[9] = new ModelRendererTurbo(this, 115, 77, textureX, textureY); // Box 19
		seatModel[10] = new ModelRendererTurbo(this, 160, 174, textureX, textureY); // Shape 26
		seatModel[11] = new ModelRendererTurbo(this, 19, 173, textureX, textureY); // Shape 27

		seatModel[0].addBox(0F, 0F, 0F, 23, 1, 17, 0F); // Box 12
		seatModel[0].setRotationPoint(-16F, -7F, -8.5F);

		seatModel[1].addBox(0F, 0F, 0F, 26, 6, 17, 0F); // Box 13
		seatModel[1].setRotationPoint(-19F, -13F, -8.5F);

		seatModel[2].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(3, 0, 3, 0), new Coord2D(3, 6, 3, 6) }), 17, 3, 8, 16, 17, ModelRendererTurbo.MR_FRONT, new float[] {7 ,6 ,3}); // Shape 14
		seatModel[2].setRotationPoint(10F, -13F, -8.5F);
		seatModel[2].rotateAngleX = 3.14159265F;

		seatModel[3].addBox(0F, 0F, 0F, 22, 11, 17, 0F); // Box 15
		seatModel[3].setRotationPoint(-28F, -24F, -8.5F);

		seatModel[4].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(16, 0, 16, 0), new Coord2D(16, 11, 16, 11) }), 3, 16, 11, 47, 3, ModelRendererTurbo.MR_FRONT, new float[] {20 ,11 ,16}); // Shape 16
		seatModel[4].setRotationPoint(10F, -13F, 8.5F);

		seatModel[5].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(16, 0, 16, 0), new Coord2D(16, 11, 16, 11) }), 3, 16, 11, 47, 3, ModelRendererTurbo.MR_FRONT, new float[] {20 ,11 ,16}); // Shape 17
		seatModel[5].setRotationPoint(10F, -13F, -5.5F);

		seatModel[6].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(16, 0, 16, 0), new Coord2D(16, 11, 16, 11) }), 3, 16, 11, 47, 3, ModelRendererTurbo.MR_FRONT, new float[] {20 ,11 ,16}); // Shape 18
		seatModel[6].setRotationPoint(10F, -13F, 1.5F);

		seatModel[7].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(6, 0, 6, 0), new Coord2D(6, 9, 6, 9) }), 17, 6, 9, 26, 17, ModelRendererTurbo.MR_FRONT, new float[] {11 ,9 ,6}); // Shape 19
		seatModel[7].setRotationPoint(-19F, -7F, -8.5F);
		seatModel[7].rotateAngleX = 3.14159265F;
		seatModel[7].rotateAngleZ = 4.71238898F;

		seatModel[8].addBox(0F, 0F, 0F, 12, 4, 5, 0F); // Box 18
		seatModel[8].setRotationPoint(-28F, -24F, -13.5F);

		seatModel[9].addBox(0F, 0F, 0F, 18, 2, 12, 0F); // Box 19
		seatModel[9].setRotationPoint(-28F, -26F, -8.5F);

		seatModel[10].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(7, 0, 7, 0), new Coord2D(7, 5, 7, 5) }), 11, 7, 5, 21, 11, ModelRendererTurbo.MR_FRONT, new float[] {9 ,5 ,7}); // Shape 26
		seatModel[10].setRotationPoint(1F, -19F, -8.5F);
		seatModel[10].rotateAngleX = 1.57079633F;

		seatModel[11].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(7, 0, 7, 0), new Coord2D(7, 5, 7, 5) }), 11, 7, 5, 21, 11, ModelRendererTurbo.MR_FRONT, new float[] {9 ,5 ,7}); // Shape 27
		seatModel[11].setRotationPoint(-13F, -8F, -8.5F);
		seatModel[11].rotateAngleX = 1.57079633F;
		seatModel[11].rotateAngleZ = 3.14159265F;


		gunModel = new ModelRendererTurbo[4];
		gunModel[0] = new ModelRendererTurbo(this, 93, 243, textureX, textureY); // Box 20
		gunModel[1] = new ModelRendererTurbo(this, 92, 222, textureX, textureY); // Box 21
		gunModel[2] = new ModelRendererTurbo(this, 28, 219, textureX, textureY); // Box 22
		gunModel[3] = new ModelRendererTurbo(this, 219, 78, textureX, textureY); // Box 23

		gunModel[0].addBox(-7F, -20F, 2.5F, 47, 2, 2, 0F); // Box 20
		gunModel[0].setRotationPoint(0F, 0F, 0F);

		gunModel[1].addBox(-7F, -20F, -4.5F, 47, 2, 2, 0F); // Box 21
		gunModel[1].setRotationPoint(0F, 0F, 0F);

		gunModel[2].addBox(40F, -20.5F, -5F, 15, 3, 3, 0F); // Box 22
		gunModel[2].setRotationPoint(0F, 0F, 0F);

		gunModel[3].addBox(40F, -20.5F, 2F, 15, 3, 3, 0F); // Box 23
		gunModel[3].setRotationPoint(0F, 0F, 0F);



		barrelX = 0;
		barrelY = 0;
		barrelZ = 0;


		flipAll();
	}
}