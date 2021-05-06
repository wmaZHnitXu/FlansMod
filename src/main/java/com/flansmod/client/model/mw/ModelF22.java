//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 26.06.2019 - 21:56:36
// Last changed on: 26.06.2019 - 21:56:36

package com.flansmod.client.model.mw; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelF22 extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelF22() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[49];
		bodyModel[0] = new ModelRendererTurbo(this, 636, 690, textureX, textureY); // Box 10
		bodyModel[1] = new ModelRendererTurbo(this, 704, 184, textureX, textureY); // Box 11
		bodyModel[2] = new ModelRendererTurbo(this, 628, 292, textureX, textureY); // Box 12
		bodyModel[3] = new ModelRendererTurbo(this, 812, 376, textureX, textureY); // Box 13
		bodyModel[4] = new ModelRendererTurbo(this, 462, 1000, textureX, textureY); // Box 22
		bodyModel[5] = new ModelRendererTurbo(this, 668, 28, textureX, textureY); // Box 29
		bodyModel[6] = new ModelRendererTurbo(this, 940, 782, textureX, textureY); // Box 33
		bodyModel[7] = new ModelRendererTurbo(this, 844, 110, textureX, textureY); // Box 34
		bodyModel[8] = new ModelRendererTurbo(this, 848, 64, textureX, textureY); // Box 41
		bodyModel[9] = new ModelRendererTurbo(this, 938, 360, textureX, textureY); // Box 42
		bodyModel[10] = new ModelRendererTurbo(this, 436, 612, textureX, textureY); // Shape 46
		bodyModel[11] = new ModelRendererTurbo(this, 434, 276, textureX, textureY); // Shape 47
		bodyModel[12] = new ModelRendererTurbo(this, 442, 114, textureX, textureY); // Shape 48
		bodyModel[13] = new ModelRendererTurbo(this, 438, 64, textureX, textureY); // Shape 49
		bodyModel[14] = new ModelRendererTurbo(this, 230, 592, textureX, textureY); // Box 51
		bodyModel[15] = new ModelRendererTurbo(this, 218, 528, textureX, textureY); // Box 52
		bodyModel[16] = new ModelRendererTurbo(this, 924, 908, textureX, textureY); // Shape 54
		bodyModel[17] = new ModelRendererTurbo(this, 234, 466, textureX, textureY); // Shape 55
		bodyModel[18] = new ModelRendererTurbo(this, 12, 862, textureX, textureY); // Shape 45
		bodyModel[19] = new ModelRendererTurbo(this, 4, 790, textureX, textureY); // Box 46
		bodyModel[20] = new ModelRendererTurbo(this, 962, 950, textureX, textureY); // Shape 47
		bodyModel[21] = new ModelRendererTurbo(this, 970, 740, textureX, textureY); // Shape 48
		bodyModel[22] = new ModelRendererTurbo(this, 822, 964, textureX, textureY); // Box 69
		bodyModel[23] = new ModelRendererTurbo(this, 876, 996, textureX, textureY); // Box 70
		bodyModel[24] = new ModelRendererTurbo(this, 942, 866, textureX, textureY); // Box 71
		bodyModel[25] = new ModelRendererTurbo(this, 958, 634, textureX, textureY); // Box 72
		bodyModel[26] = new ModelRendererTurbo(this, 946, 824, textureX, textureY); // Box 73
		bodyModel[27] = new ModelRendererTurbo(this, 958, 588, textureX, textureY); // Box 74
		bodyModel[28] = new ModelRendererTurbo(this, 974, 404, textureX, textureY); // Box 78
		bodyModel[29] = new ModelRendererTurbo(this, 948, 688, textureX, textureY); // Box 81
		bodyModel[30] = new ModelRendererTurbo(this, 962, 528, textureX, textureY); // Box 82
		bodyModel[31] = new ModelRendererTurbo(this, 948, 534, textureX, textureY); // Box 83
		bodyModel[32] = new ModelRendererTurbo(this, 960, 482, textureX, textureY); // Box 84
		bodyModel[33] = new ModelRendererTurbo(this, 952, 362, textureX, textureY); // Box 85
		bodyModel[34] = new ModelRendererTurbo(this, 960, 320, textureX, textureY); // Box 86
		bodyModel[35] = new ModelRendererTurbo(this, 950, 332, textureX, textureY); // Box 87
		bodyModel[36] = new ModelRendererTurbo(this, 958, 282, textureX, textureY); // Box 88
		bodyModel[37] = new ModelRendererTurbo(this, 952, 290, textureX, textureY); // Box 89
		bodyModel[38] = new ModelRendererTurbo(this, 964, 242, textureX, textureY); // Box 90
		bodyModel[39] = new ModelRendererTurbo(this, 962, 250, textureX, textureY); // Box 91
		bodyModel[40] = new ModelRendererTurbo(this, 970, 200, textureX, textureY); // Box 92
		bodyModel[41] = new ModelRendererTurbo(this, 592, 499, textureX, textureY); // Box 99
		bodyModel[42] = new ModelRendererTurbo(this, 480, 338, textureX, textureY); // Box 100
		bodyModel[43] = new ModelRendererTurbo(this, 480, 338, textureX, textureY); // Box 101
		bodyModel[44] = new ModelRendererTurbo(this, 506, 216, textureX, textureY); // Box 86
		bodyModel[45] = new ModelRendererTurbo(this, 410, 218, textureX, textureY); // Box 87
		bodyModel[46] = new ModelRendererTurbo(this, 592, 499, textureX, textureY); // Box 88
		bodyModel[47] = new ModelRendererTurbo(this, 979, 593, textureX, textureY); // Box 89
		bodyModel[48] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 90

		bodyModel[0].addBox(0F, 0F, 0F, 41, 17, 1, 0F); // Box 10
		bodyModel[0].setRotationPoint(-8.5F, 5.75F, 16.5F);
		bodyModel[0].rotateAngleX = -3.66519143F;
		bodyModel[0].rotateAngleY = 0.19198622F;

		bodyModel[1].addBox(0F, 0F, -1F, 41, 17, 1, 0F); // Box 11
		bodyModel[1].setRotationPoint(-8.5F, 5.75F, -16.5F);
		bodyModel[1].rotateAngleX = 3.66519143F;
		bodyModel[1].rotateAngleY = -0.19198622F;

		bodyModel[2].addBox(0F, 0F, -1F, 41, 22, 1, 0F); // Box 12
		bodyModel[2].setRotationPoint(-7.25F, -25.25F, -10.5F);
		bodyModel[2].rotateAngleX = -0.6981317F;
		bodyModel[2].rotateAngleY = -0.19198622F;

		bodyModel[3].addBox(0F, 0F, 0F, 41, 22, 1, 0F); // Box 13
		bodyModel[3].setRotationPoint(-7.25F, -25.25F, 10.5F);
		bodyModel[3].rotateAngleX = 0.6981317F;
		bodyModel[3].rotateAngleY = 0.19198622F;

		bodyModel[4].addBox(0F, 0F, 0F, 50, 6, 6, 0F); // Box 22
		bodyModel[4].setRotationPoint(0F, -35F, -39F);

		bodyModel[5].addBox(0F, 0F, 0F, 50, 6, 6, 0F); // Box 29
		bodyModel[5].setRotationPoint(0F, -35F, 33F);

		bodyModel[6].addBox(0F, 0F, 0F, 34, 26, 1, 0F); // Box 33
		bodyModel[6].setRotationPoint(28.75F, -28.25F, 15F);
		bodyModel[6].rotateAngleX = 0.71558499F;

		bodyModel[7].addBox(0F, 0F, 0F, 41, 17, 1, 0F); // Box 34
		bodyModel[7].setRotationPoint(29.5F, 5.75F, 24.25F);
		bodyModel[7].rotateAngleX = -3.66519143F;

		bodyModel[8].addBox(0F, 0F, -1F, 41, 17, 1, 0F); // Box 41
		bodyModel[8].setRotationPoint(29.5F, 5.75F, -24.25F);
		bodyModel[8].rotateAngleX = 3.66519143F;

		bodyModel[9].addBox(0F, 0F, -1F, 34, 22, 1, 0F); // Box 42
		bodyModel[9].setRotationPoint(28.75F, -25.25F, -18F);
		bodyModel[9].rotateAngleX = -0.71558499F;

		bodyModel[10].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(50, 18, 50, 18), new Coord2D(0, 18, 0, 18) }), 1, 50, 18, 122, 1, ModelRendererTurbo.MR_FRONT, new float[] {18 ,50 ,54}); // Shape 46
		bodyModel[10].setRotationPoint(70F, 6F, -25F);
		bodyModel[10].rotateAngleX = -0.50614548F;
		bodyModel[10].rotateAngleY = -2.70526034F;

		bodyModel[11].addShape3D(0F, 0F, -1F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(50, 18, 50, 18), new Coord2D(0, 17, 0, 17) }), 1, 50, 18, 122, 1, ModelRendererTurbo.MR_FRONT, new float[] {17 ,51 ,54}); // Shape 47
		bodyModel[11].setRotationPoint(70F, 6F, 25F);
		bodyModel[11].rotateAngleX = 0.50614548F;
		bodyModel[11].rotateAngleY = 2.70526034F;

		bodyModel[12].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(50, 1, 50, 1), new Coord2D(75, 26, 75, 26) }), 1, 75, 26, 167, 1, ModelRendererTurbo.MR_FRONT, new float[] {80 ,36 ,51}); // Shape 48
		bodyModel[12].setRotationPoint(74F, -9F, -32F);
		bodyModel[12].rotateAngleX = -0.82030475F;
		bodyModel[12].rotateAngleY = -2.70526034F;

		bodyModel[13].addShape3D(0F, 0F, -1F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(50, 1, 50, 1), new Coord2D(75, 26, 75, 26) }), 1, 75, 26, 167, 1, ModelRendererTurbo.MR_FRONT, new float[] {80 ,36 ,51}); // Shape 49
		bodyModel[13].setRotationPoint(74F, -9F, 32F);
		bodyModel[13].rotateAngleX = 0.82030475F;
		bodyModel[13].rotateAngleY = 2.70526034F;

		bodyModel[14].addBox(0F, 0F, 0F, 24, 3, 32, 0F); // Box 51
		bodyModel[14].setRotationPoint(-2F, -26F, -16F);
		bodyModel[14].rotateAngleZ = 0.17453293F;

		bodyModel[15].addBox(0F, 0F, 0F, 140, 4, 33, 0F); // Box 52
		bodyModel[15].setRotationPoint(21F, -30F, -16.5F);

		bodyModel[16].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(26, 0, 26, 0), new Coord2D(30, 15, 30, 15), new Coord2D(0, 15, 0, 15) }), 1, 30, 15, 84, 1, ModelRendererTurbo.MR_FRONT, new float[] {16 ,30 ,16 ,22}); // Shape 54
		bodyModel[16].setRotationPoint(-8F, -25F, -15F);
		bodyModel[16].rotateAngleX = -1.55334303F;
		bodyModel[16].rotateAngleY = -1.57079633F;

		bodyModel[17].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(36, 0, 36, 0), new Coord2D(29, 34, 29, 34), new Coord2D(6, 34, 6, 34) }), 1, 36, 34, 129, 1, ModelRendererTurbo.MR_FRONT, new float[] {35 ,23 ,35 ,36}); // Shape 55
		bodyModel[17].setRotationPoint(149F, -28F, -18F);
		bodyModel[17].rotateAngleX = 2.11184839F;
		bodyModel[17].rotateAngleY = -1.57079633F;

		bodyModel[18].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(16, 0, 16, 0), new Coord2D(32, 0, 32, 0), new Coord2D(48, 80, 48, 80), new Coord2D(0, 80, 0, 80) }), 1, 48, 80, 228, 1, ModelRendererTurbo.MR_FRONT, new float[] {82 ,48 ,82 ,16}); // Shape 45
		bodyModel[18].setRotationPoint(-47F, 7F, -24F);
		bodyModel[18].rotateAngleX = -1.55334303F;
		bodyModel[18].rotateAngleY = -1.57079633F;

		bodyModel[19].addBox(0F, 0F, 0F, 37, 1, 48, 0F); // Box 46
		bodyModel[19].setRotationPoint(33F, 4.5F, -24F);
		bodyModel[19].rotateAngleZ = -0.03490659F;

		bodyModel[20].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(5, 17, 5, 17), new Coord2D(1, 17, 1, 17) }), 1, 5, 17, 39, 1, ModelRendererTurbo.MR_FRONT, new float[] {17 ,4 ,18}); // Shape 47
		bodyModel[20].setRotationPoint(69F, 6F, -25F);
		bodyModel[20].rotateAngleX = -0.4712389F;
		bodyModel[20].rotateAngleY = -3.14159265F;

		bodyModel[21].addShape3D(0F, 0F, -1F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(5, 17, 5, 17), new Coord2D(1, 17, 1, 17) }), 1, 5, 17, 39, 1, ModelRendererTurbo.MR_FRONT, new float[] {17 ,4 ,18}); // Shape 48
		bodyModel[21].setRotationPoint(69F, 6F, 25F);
		bodyModel[21].rotateAngleX = 0.4712389F;
		bodyModel[21].rotateAngleY = 3.14159265F;

		bodyModel[22].addBox(0F, 0F, 0F, 24, 1, 10, 0F); // Box 69
		bodyModel[22].setRotationPoint(-32F, 6F, -5.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 20, 1, 10, 0F); // Box 70
		bodyModel[23].setRotationPoint(50F, 6F, 10.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 20, 1, 10, 0F); // Box 71
		bodyModel[24].setRotationPoint(50F, 6F, -21.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 12, 5, 12, 0F); // Box 72
		bodyModel[25].setRotationPoint(-4F, 0F, -6F);
		bodyModel[25].rotateAngleZ = -0.03490659F;

		bodyModel[26].addBox(0F, 0F, 0F, 18, 2, 12, 0F); // Box 73
		bodyModel[26].setRotationPoint(6F, 0F, -6F);
		bodyModel[26].rotateAngleZ = 1.27409035F;

		bodyModel[27].addBox(0F, 0F, 0F, 12, 4, 14, 0F); // Box 74
		bodyModel[27].setRotationPoint(-24F, 6F, -7F);
		bodyModel[27].rotateAngleZ = 1.74532925F;

		bodyModel[28].addBox(0F, 0F, 0F, 1, 4, 14, 0F); // Box 78
		bodyModel[28].setRotationPoint(-12F, -23F, -7F);
		bodyModel[28].rotateAngleZ = 1.74532925F;

		bodyModel[29].addBox(0F, 0F, 0F, 18, 2, 12, 0F); // Box 81
		bodyModel[29].setRotationPoint(20F, 0F, 20F);
		bodyModel[29].rotateAngleY = -1.57079633F;
		bodyModel[29].rotateAngleZ = 1.6231562F;

		bodyModel[30].addBox(0F, 0F, 0F, 12, 5, 12, 0F); // Box 82
		bodyModel[30].setRotationPoint(20F, 0F, 20F);
		bodyModel[30].rotateAngleY = -1.57079633F;
		bodyModel[30].rotateAngleZ = -0.03490659F;

		bodyModel[31].addBox(0F, 0F, 0F, 18, 2, 12, 0F); // Box 83
		bodyModel[31].setRotationPoint(39F, 0F, 21F);
		bodyModel[31].rotateAngleY = -1.57079633F;
		bodyModel[31].rotateAngleZ = 1.6231562F;

		bodyModel[32].addBox(0F, 0F, 0F, 12, 5, 12, 0F); // Box 84
		bodyModel[32].setRotationPoint(39F, 0F, 21F);
		bodyModel[32].rotateAngleY = -1.57079633F;
		bodyModel[32].rotateAngleZ = -0.03490659F;

		bodyModel[33].addBox(0F, 0F, 0F, 18, 2, 12, 0F); // Box 85
		bodyModel[33].setRotationPoint(56F, 0F, 21F);
		bodyModel[33].rotateAngleY = -1.57079633F;
		bodyModel[33].rotateAngleZ = 1.6231562F;

		bodyModel[34].addBox(0F, 0F, 0F, 12, 5, 12, 0F); // Box 86
		bodyModel[34].setRotationPoint(56F, 0F, 21F);
		bodyModel[34].rotateAngleY = -1.57079633F;
		bodyModel[34].rotateAngleZ = -0.03490659F;

		bodyModel[35].addBox(0F, 0F, 0F, 18, 2, 12, 0F); // Box 87
		bodyModel[35].setRotationPoint(20F, 0F, -19.5F);
		bodyModel[35].rotateAngleY = -1.57079633F;
		bodyModel[35].rotateAngleZ = 1.44862328F;

		bodyModel[36].addBox(0F, 0F, 0F, 12, 5, 12, 0F); // Box 88
		bodyModel[36].setRotationPoint(20F, 0F, -9.5F);
		bodyModel[36].rotateAngleY = -1.57079633F;
		bodyModel[36].rotateAngleZ = -0.03490659F;

		bodyModel[37].addBox(0F, 0F, 0F, 18, 2, 12, 0F); // Box 89
		bodyModel[37].setRotationPoint(39F, 0F, -21F);
		bodyModel[37].rotateAngleY = -1.57079633F;
		bodyModel[37].rotateAngleZ = 1.44862328F;

		bodyModel[38].addBox(0F, 0F, 0F, 12, 5, 12, 0F); // Box 90
		bodyModel[38].setRotationPoint(39F, 0F, -11F);
		bodyModel[38].rotateAngleY = -1.57079633F;
		bodyModel[38].rotateAngleZ = -0.03490659F;

		bodyModel[39].addBox(0F, 0F, 0F, 18, 2, 12, 0F); // Box 91
		bodyModel[39].setRotationPoint(56F, 0F, -21F);
		bodyModel[39].rotateAngleY = -1.57079633F;
		bodyModel[39].rotateAngleZ = 1.44862328F;

		bodyModel[40].addBox(0F, 0F, 0F, 12, 5, 12, 0F); // Box 92
		bodyModel[40].setRotationPoint(56F, 0F, -11F);
		bodyModel[40].rotateAngleY = -1.57079633F;
		bodyModel[40].rotateAngleZ = -0.03490659F;

		bodyModel[41].addBox(0F, 0F, 0F, 40, 20, 13, 0F); // Box 99
		bodyModel[41].setRotationPoint(18F, -19F, -50F);

		bodyModel[42].addBox(0F, 2F, 0F, 55, 25, 20, 0F); // Box 100
		bodyModel[42].setRotationPoint(41F, -53F, 32F);
		bodyModel[42].rotateAngleZ = -0.78539816F;

		bodyModel[43].addBox(0F, 2F, -20F, 55, 25, 20, 0F); // Box 101
		bodyModel[43].setRotationPoint(41F, -53F, -32F);
		bodyModel[43].rotateAngleZ = -0.78539816F;

		bodyModel[44].addBox(0F, 0F, 0F, 11, 1, 19, 0F); // Box 86
		bodyModel[44].setRotationPoint(71F, -33F, 68F);

		bodyModel[45].addBox(0F, 0F, 0F, 11, 1, 19, 0F); // Box 87
		bodyModel[45].setRotationPoint(71F, -33F, -87F);

		bodyModel[46].addBox(0F, 0F, 0F, 40, 20, 13, 0F); // Box 88
		bodyModel[46].setRotationPoint(18F, -19F, 36F);

		bodyModel[47].addBox(0F, -5.5F, -10.5F, 0, 11, 21, 0F); // Box 89
		bodyModel[47].setRotationPoint(-24F, -15F, 0F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 90
		bodyModel[48].setRotationPoint(0F, 0F, 0F);


		tailModel = new ModelRendererTurbo[9];
		tailModel[0] = new ModelRendererTurbo(this, 638, 438, textureX, textureY); // Shape 1
		tailModel[1] = new ModelRendererTurbo(this, 596, 870, textureX, textureY); // Shape 3
		tailModel[2] = new ModelRendererTurbo(this, 454, 956, textureX, textureY); // Shape 4
		tailModel[3] = new ModelRendererTurbo(this, 650, 810, textureX, textureY); // Shape 5
		tailModel[4] = new ModelRendererTurbo(this, 458, 866, textureX, textureY); // Shape 6
		tailModel[5] = new ModelRendererTurbo(this, 636, 742, textureX, textureY); // Shape 7
		tailModel[6] = new ModelRendererTurbo(this, 634, 608, textureX, textureY); // Shape 9
		tailModel[7] = new ModelRendererTurbo(this, 412, 168, textureX, textureY); // Shape 39
		tailModel[8] = new ModelRendererTurbo(this, 378, 10, textureX, textureY); // Shape 43

		tailModel[0].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(50, 0, 50, 0), new Coord2D(64, 4, 64, 4), new Coord2D(40, 18, 40, 18), new Coord2D(0, 17, 0, 17) }), 1, 64, 18, 151, 1, ModelRendererTurbo.MR_FRONT, new float[] {17 ,41 ,28 ,15 ,50}); // Shape 1
		tailModel[0].setRotationPoint(-10F, -9F, -25F);
		tailModel[0].rotateAngleX = 3.66519143F;
		tailModel[0].rotateAngleY = -0.19198622F;

		tailModel[1].addShape3D(0F, 0F, -1F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(50, 0, 50, 0), new Coord2D(0, 22, 0, 22) }), 1, 50, 22, 127, 1, ModelRendererTurbo.MR_FRONT, new float[] {22 ,55 ,50}); // Shape 3
		tailModel[1].setRotationPoint(-10F, -9F, -25F);
		tailModel[1].rotateAngleX = -0.6981317F;
		tailModel[1].rotateAngleY = -0.19198622F;

		tailModel[2].addShape3D(0F, 0F, -1F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(50, 0, 50, 0), new Coord2D(64, 4, 64, 4), new Coord2D(40, 18, 40, 18), new Coord2D(0, 17, 0, 17) }), 1, 64, 18, 151, 1, ModelRendererTurbo.MR_FRONT, new float[] {17 ,41 ,28 ,15 ,50}); // Shape 4
		tailModel[2].setRotationPoint(-10F, -9F, 25F);
		tailModel[2].rotateAngleX = -3.66519143F;
		tailModel[2].rotateAngleY = 0.19198622F;

		tailModel[3].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(50, 0, 50, 0), new Coord2D(0, 22, 0, 22) }), 1, 50, 22, 127, 1, ModelRendererTurbo.MR_FRONT, new float[] {22 ,55 ,50}); // Shape 5
		tailModel[3].setRotationPoint(-10F, -9F, 25F);
		tailModel[3].rotateAngleX = 0.6981317F;
		tailModel[3].rotateAngleY = 0.19198622F;

		tailModel[4].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(25, 0, 25, 0), new Coord2D(30, 15, 30, 15), new Coord2D(0, 15, 0, 15) }), 1, 30, 15, 82, 1, ModelRendererTurbo.MR_FRONT, new float[] {16 ,30 ,16 ,20}); // Shape 6
		tailModel[4].setRotationPoint(-72F, -5F, -15F);
		tailModel[4].rotateAngleX = -1.29154365F;
		tailModel[4].rotateAngleY = -1.57079633F;

		tailModel[5].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(25, 0, 25, 0), new Coord2D(23, 27, 23, 27), new Coord2D(7, 27, 7, 27) }), 1, 25, 27, 92, 1, ModelRendererTurbo.MR_FRONT, new float[] {28 ,16 ,28 ,20}); // Shape 7
		tailModel[5].setRotationPoint(-72F, -5F, -15F);
		tailModel[5].rotateAngleX = -2.00712864F;
		tailModel[5].rotateAngleY = -1.57079633F;

		tailModel[6].addShape3D(0F, -15F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(26, 0, 26, 0), new Coord2D(30, 53, 30, 53), new Coord2D(0, 53, 0, 53) }), 1, 30, 53, 160, 1, ModelRendererTurbo.MR_FRONT, new float[] {54 ,30 ,54 ,22}); // Shape 9
		tailModel[6].setRotationPoint(-21.5F, -21.5F, -15F);
		tailModel[6].rotateAngleX = -4.39822972F;
		tailModel[6].rotateAngleY = -1.57079633F;

		tailModel[7].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(100, 0, 100, 0), new Coord2D(12, 27, 12, 27), new Coord2D(0, 27, 0, 27) }), 1, 100, 27, 232, 1, ModelRendererTurbo.MR_FRONT, new float[] {27 ,12 ,93 ,100}); // Shape 39
		tailModel[7].setRotationPoint(61F, -29F, -15F);
		tailModel[7].rotateAngleX = 0.6981317F;
		tailModel[7].rotateAngleZ = 3.14159265F;

		tailModel[8].addShape3D(0F, 0F, -1F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(99, 0, 99, 0), new Coord2D(12, 27, 12, 27), new Coord2D(0, 27, 0, 27) }), 1, 99, 27, 230, 1, ModelRendererTurbo.MR_FRONT, new float[] {27 ,12 ,92 ,99}); // Shape 43
		tailModel[8].setRotationPoint(61F, -29F, 15F);
		tailModel[8].rotateAngleX = -0.6981317F;
		tailModel[8].rotateAngleZ = 3.14159265F;


		leftWingModel = new ModelRendererTurbo[3];
		leftWingModel[0] = new ModelRendererTurbo(this, 760, 554, textureX, textureY); // Box 14
		leftWingModel[1] = new ModelRendererTurbo(this, 706, 82, textureX, textureY); // Shape 26
		leftWingModel[2] = new ModelRendererTurbo(this, 706, 82, textureX, textureY); // Shape 90

		leftWingModel[0].addBox(0F, 0F, 0F, 64, 15, 19, 0F); // Box 14
		leftWingModel[0].setRotationPoint(-2F, -25F, -38.5F);
		leftWingModel[0].rotateAngleX = 0.78539816F;
		leftWingModel[0].rotateAngleZ = -0.01745329F;

		leftWingModel[1].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(18, 0, 18, 0), new Coord2D(0, 13, 0, 13) }), 3, 18, 13, 54, 3, ModelRendererTurbo.MR_FRONT, new float[] {13 ,23 ,18}); // Shape 26
		leftWingModel[1].setRotationPoint(22F, -34F, -39F);
		leftWingModel[1].rotateAngleX = 1.57079633F;

		leftWingModel[2].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(35, 0, 35, 0), new Coord2D(0, 20, 0, 20) }), 3, 35, 20, 96, 3, ModelRendererTurbo.MR_FRONT, new float[] {20 ,41 ,35}); // Shape 90
		leftWingModel[2].setRotationPoint(72F, -34F, -67F);
		leftWingModel[2].rotateAngleX = 1.57079633F;


		rightWingModel = new ModelRendererTurbo[3];
		rightWingModel[0] = new ModelRendererTurbo(this, 762, 480, textureX, textureY); // Box 15
		rightWingModel[1] = new ModelRendererTurbo(this, 850, 430, textureX, textureY); // Shape 32
		rightWingModel[2] = new ModelRendererTurbo(this, 702, 80, textureX, textureY); // Shape 91

		rightWingModel[0].addBox(0F, 0F, 0F, 64, 16, 19, 0F); // Box 15
		rightWingModel[0].setRotationPoint(-2F, -39F, 26.5F);
		rightWingModel[0].rotateAngleX = -0.78539816F;
		rightWingModel[0].rotateAngleZ = -0.01745329F;

		rightWingModel[1].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(18, 13, 18, 13), new Coord2D(0, 13, 0, 13) }), 3, 18, 13, 54, 3, ModelRendererTurbo.MR_FRONT, new float[] {13 ,18 ,23}); // Shape 32
		rightWingModel[1].setRotationPoint(22F, -34F, 52F);
		rightWingModel[1].rotateAngleX = 1.57079633F;

		rightWingModel[2].addShape3D(0F, 0F, -3F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(35, 0, 35, 0), new Coord2D(0, 20, 0, 20) }), 3, 35, 20, 96, 3, ModelRendererTurbo.MR_FRONT, new float[] {20 ,41 ,35}); // Shape 91
		rightWingModel[2].setRotationPoint(72F, -34F, 67F);
		rightWingModel[2].rotateAngleX = -1.57079633F;


		bodyWheelModel = new ModelRendererTurbo[16];
		bodyWheelModel[0] = new ModelRendererTurbo(this, 884, 260, textureX, textureY); // Box 49
		bodyWheelModel[1] = new ModelRendererTurbo(this, 80, 119, textureX, textureY); // Shape 50
		bodyWheelModel[2] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Shape 51
		bodyWheelModel[3] = new ModelRendererTurbo(this, 3, 116, textureX, textureY); // Shape 52
		bodyWheelModel[4] = new ModelRendererTurbo(this, 6, 102, textureX, textureY); // Shape 53
		bodyWheelModel[5] = new ModelRendererTurbo(this, 45, 100, textureX, textureY); // Shape 54
		bodyWheelModel[6] = new ModelRendererTurbo(this, 92, 100, textureX, textureY); // Shape 55
		bodyWheelModel[7] = new ModelRendererTurbo(this, 850, 20, textureX, textureY); // Box 56
		bodyWheelModel[8] = new ModelRendererTurbo(this, 86, 83, textureX, textureY); // Shape 57
		bodyWheelModel[9] = new ModelRendererTurbo(this, 45, 85, textureX, textureY); // Shape 58
		bodyWheelModel[10] = new ModelRendererTurbo(this, 3, 84, textureX, textureY); // Shape 64
		bodyWheelModel[11] = new ModelRendererTurbo(this, 616, 930, textureX, textureY); // Shape 65
		bodyWheelModel[12] = new ModelRendererTurbo(this, 988, 442, textureX, textureY); // Box 66
		bodyWheelModel[13] = new ModelRendererTurbo(this, 530, 932, textureX, textureY); // Shape 67
		bodyWheelModel[14] = new ModelRendererTurbo(this, 460, 926, textureX, textureY); // Shape 68
		bodyWheelModel[15] = new ModelRendererTurbo(this, 544, 592, textureX, textureY); // Box 94

		bodyWheelModel[0].addBox(0F, 0F, 0F, 7, 9, 4, 0F); // Box 49
		bodyWheelModel[0].setRotationPoint(-24F, 6F, -2.5F);

		bodyWheelModel[1].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(10, 0, 10, 0), new Coord2D(8, 5, 8, 5), new Coord2D(2, 5, 2, 5) }), 4, 10, 5, 28, 4, ModelRendererTurbo.MR_FRONT, new float[] {6 ,6 ,6 ,10}); // Shape 50
		bodyWheelModel[1].setRotationPoint(-15F, 15F, -2.5F);

		bodyWheelModel[2].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(10, 0, 10, 0), new Coord2D(8, 5, 8, 5), new Coord2D(2, 5, 2, 5) }), 4, 10, 5, 28, 4, ModelRendererTurbo.MR_FRONT, new float[] {6 ,6 ,6 ,10}); // Shape 51
		bodyWheelModel[2].setRotationPoint(-25F, 15F, -2.5F);
		bodyWheelModel[2].rotateAngleZ = 3.14159265F;

		bodyWheelModel[3].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(10, 0, 10, 0), new Coord2D(8, 5, 8, 5), new Coord2D(2, 5, 2, 5) }), 4, 10, 5, 28, 4, ModelRendererTurbo.MR_FRONT, new float[] {6 ,6 ,6 ,10}); // Shape 52
		bodyWheelModel[3].setRotationPoint(-15F, 15F, 5.5F);

		bodyWheelModel[4].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(10, 0, 10, 0), new Coord2D(8, 5, 8, 5), new Coord2D(2, 5, 2, 5) }), 4, 10, 5, 28, 4, ModelRendererTurbo.MR_FRONT, new float[] {6 ,6 ,6 ,10}); // Shape 53
		bodyWheelModel[4].setRotationPoint(-25F, 15F, 5.5F);
		bodyWheelModel[4].rotateAngleZ = 3.14159265F;

		bodyWheelModel[5].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(10, 0, 10, 0), new Coord2D(8, 5, 8, 5), new Coord2D(2, 5, 2, 5) }), 4, 10, 5, 28, 4, ModelRendererTurbo.MR_FRONT, new float[] {6 ,6 ,6 ,10}); // Shape 54
		bodyWheelModel[5].setRotationPoint(66F, 15F, 13.5F);

		bodyWheelModel[6].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(10, 0, 10, 0), new Coord2D(8, 5, 8, 5), new Coord2D(2, 5, 2, 5) }), 4, 10, 5, 28, 4, ModelRendererTurbo.MR_FRONT, new float[] {6 ,6 ,6 ,10}); // Shape 55
		bodyWheelModel[6].setRotationPoint(56F, 15F, 13.5F);
		bodyWheelModel[6].rotateAngleZ = 3.14159265F;

		bodyWheelModel[7].addBox(0F, 0F, 0F, 7, 9, 4, 0F); // Box 56
		bodyWheelModel[7].setRotationPoint(57F, 5F, 13.5F);

		bodyWheelModel[8].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(10, 0, 10, 0), new Coord2D(8, 5, 8, 5), new Coord2D(2, 5, 2, 5) }), 4, 10, 5, 28, 4, ModelRendererTurbo.MR_FRONT, new float[] {6 ,6 ,6 ,10}); // Shape 57
		bodyWheelModel[8].setRotationPoint(66F, 15F, 21.5F);

		bodyWheelModel[9].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(10, 0, 10, 0), new Coord2D(8, 5, 8, 5), new Coord2D(2, 5, 2, 5) }), 4, 10, 5, 28, 4, ModelRendererTurbo.MR_FRONT, new float[] {6 ,6 ,6 ,10}); // Shape 58
		bodyWheelModel[9].setRotationPoint(56F, 15F, 21.5F);
		bodyWheelModel[9].rotateAngleZ = 3.14159265F;

		bodyWheelModel[10].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(10, 0, 10, 0), new Coord2D(8, 5, 8, 5), new Coord2D(2, 5, 2, 5) }), 4, 10, 5, 28, 4, ModelRendererTurbo.MR_FRONT, new float[] {6 ,6 ,6 ,10}); // Shape 64
		bodyWheelModel[10].setRotationPoint(66F, 15F, -9.5F);

		bodyWheelModel[11].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(10, 0, 10, 0), new Coord2D(8, 5, 8, 5), new Coord2D(2, 5, 2, 5) }), 4, 10, 5, 28, 4, ModelRendererTurbo.MR_FRONT, new float[] {6 ,6 ,6 ,10}); // Shape 65
		bodyWheelModel[11].setRotationPoint(56F, 15F, -9.5F);
		bodyWheelModel[11].rotateAngleZ = 3.14159265F;

		bodyWheelModel[12].addBox(0F, 0F, 0F, 7, 9, 4, 0F); // Box 66
		bodyWheelModel[12].setRotationPoint(57F, 5F, -17.5F);

		bodyWheelModel[13].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(10, 0, 10, 0), new Coord2D(8, 5, 8, 5), new Coord2D(2, 5, 2, 5) }), 4, 10, 5, 28, 4, ModelRendererTurbo.MR_FRONT, new float[] {6 ,6 ,6 ,10}); // Shape 67
		bodyWheelModel[13].setRotationPoint(66F, 15F, -17.5F);

		bodyWheelModel[14].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(10, 0, 10, 0), new Coord2D(8, 5, 8, 5), new Coord2D(2, 5, 2, 5) }), 4, 10, 5, 28, 4, ModelRendererTurbo.MR_FRONT, new float[] {6 ,6 ,6 ,10}); // Shape 68
		bodyWheelModel[14].setRotationPoint(56F, 15F, -17.5F);
		bodyWheelModel[14].rotateAngleZ = 3.14159265F;

		bodyWheelModel[15].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 94
		bodyWheelModel[15].setRotationPoint(4.3F, -25F, -10F);
		bodyWheelModel[15].rotateAngleZ = 0.17453293F;


		bodyDoorOpenModel = new ModelRendererTurbo[1];
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 544, 592, textureX, textureY); // Box 95

		bodyDoorOpenModel[0].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 95
		bodyDoorOpenModel[0].setRotationPoint(1.31F, -24.5F, -3F);
		bodyDoorOpenModel[0].rotateAngleZ = 0.17453293F;


		tailDoorOpenModel = new ModelRendererTurbo[1];
		tailDoorOpenModel[0] = new ModelRendererTurbo(this, 206, 65, textureX, textureY); // Shape 115

		tailDoorOpenModel[0].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(50, 0, 50, 0), new Coord2D(36, 53, 36, 53), new Coord2D(14, 53, 14, 53) }), 1, 50, 53, 182, 1, ModelRendererTurbo.MR_FRONT, new float[] {55 ,22 ,55 ,50}); // Shape 115
		tailDoorOpenModel[0].setRotationPoint(70F, 6F, -25F);
		tailDoorOpenModel[0].rotateAngleX = -1.78023584F;
		tailDoorOpenModel[0].rotateAngleY = -1.57079633F;


		tailDoorCloseModel = new ModelRendererTurbo[1];
		tailDoorCloseModel[0] = new ModelRendererTurbo(this, 226, 650, textureX, textureY); // Shape 50

		tailDoorCloseModel[0].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(50, 0, 50, 0), new Coord2D(36, 53, 36, 53), new Coord2D(14, 53, 14, 53) }), 1, 50, 53, 182, 1, ModelRendererTurbo.MR_FRONT, new float[] {55 ,22 ,55 ,50}); // Shape 50
		tailDoorCloseModel[0].setRotationPoint(70F, 6F, -25F);
		tailDoorCloseModel[0].rotateAngleX = -1.27409035F;
		tailDoorCloseModel[0].rotateAngleY = -1.57079633F;


		leftWingPos2Model = new ModelRendererTurbo[1];
		leftWingPos2Model[0] = new ModelRendererTurbo(this, 228, 394, textureX, textureY); // Shape 40

		leftWingPos2Model[0].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(51, 0, 51, 0), new Coord2D(19, 40, 19, 40), new Coord2D(0, 40, 0, 40) }), 3, 51, 40, 162, 3, ModelRendererTurbo.MR_FRONT, new float[] {40 ,19 ,52 ,51}); // Shape 40
		leftWingPos2Model[0].setRotationPoint(188F, -30F, -15F);
		leftWingPos2Model[0].rotateAngleX = 1.30899694F;


		rightWingPos2Model = new ModelRendererTurbo[1];
		rightWingPos2Model[0] = new ModelRendererTurbo(this, 210, 324, textureX, textureY); // Shape 41

		rightWingPos2Model[0].addShape3D(0F, 0F, -3F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(51, 0, 51, 0), new Coord2D(19, 40, 19, 40), new Coord2D(0, 40, 0, 40) }), 3, 51, 40, 162, 3, ModelRendererTurbo.MR_FRONT, new float[] {40 ,19 ,52 ,51}); // Shape 41
		rightWingPos2Model[0].setRotationPoint(188F, -30F, 15F);
		rightWingPos2Model[0].rotateAngleX = -1.30899694F;


		hudModel = new ModelRendererTurbo[3];
		hudModel[0] = new ModelRendererTurbo(this, 1012, 608, textureX, textureY); // Box 91
		hudModel[1] = new ModelRendererTurbo(this, 1045, 595, textureX, textureY); // Box 92
		hudModel[2] = new ModelRendererTurbo(this, 1045, 595, textureX, textureY); // Box 93

		hudModel[0].addBox(0F, -5.5F, -10.5F, 0, 11, 21, 0F); // Box 91
		hudModel[0].setRotationPoint(-19F, -15F, 0F);

		hudModel[1].addBox(0F, -5.5F, -10.5F, 0, 11, 21, 0F); // Box 92
		hudModel[1].setRotationPoint(-14F, -15F, 0F);

		hudModel[2].addBox(0F, -5.5F, -10.5F, 0, 11, 21, 0F); // Box 93
		hudModel[2].setRotationPoint(-29F, -15F, 0F);


		helicopterModeParts = new ModelRendererTurbo[5];
		helicopterModeParts[0] = new ModelRendererTurbo(this, 16, 742, textureX, textureY); // Box 99
		helicopterModeParts[1] = new ModelRendererTurbo(this, 974, 136, textureX, textureY); // Box 100
		helicopterModeParts[2] = new ModelRendererTurbo(this, 16, 574, textureX, textureY); // Box 104
		helicopterModeParts[3] = new ModelRendererTurbo(this, 968, 58, textureX, textureY); // Box 105
		helicopterModeParts[4] = new ModelRendererTurbo(this, 846, 592, textureX, textureY); // Box 96

		helicopterModeParts[0].addBox(0F, 0F, 0F, 60, 20, 15, 0F); // Box 99
		helicopterModeParts[0].setRotationPoint(50F, -60F, -67F);
		helicopterModeParts[0].rotateAngleZ = -1.57079633F;

		helicopterModeParts[1].addBox(0F, 0F, 0F, 7, 14, 11, 0F); // Box 100
		helicopterModeParts[1].setRotationPoint(47F, -67F, -65F);
		helicopterModeParts[1].rotateAngleZ = -1.57079633F;

		helicopterModeParts[2].addBox(0F, 0F, 0F, 60, 20, 15, 0F); // Box 104
		helicopterModeParts[2].setRotationPoint(50F, -60F, 52F);
		helicopterModeParts[2].rotateAngleZ = -1.57079633F;

		helicopterModeParts[3].addBox(0F, 0F, 0F, 7, 14, 11, 0F); // Box 105
		helicopterModeParts[3].setRotationPoint(47F, -67F, 54F);
		helicopterModeParts[3].rotateAngleZ = -1.57079633F;

		helicopterModeParts[4].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 96
		helicopterModeParts[4].setRotationPoint(1.31F, -24.5F, -7F);
		helicopterModeParts[4].rotateAngleZ = 0.17453293F;


		planeModeParts = new ModelRendererTurbo[4];
		planeModeParts[0] = new ModelRendererTurbo(this, 754, 304, textureX, textureY); // Box 20
		planeModeParts[1] = new ModelRendererTurbo(this, 866, 202, textureX, textureY); // Box 21
		planeModeParts[2] = new ModelRendererTurbo(this, 236, 740, textureX, textureY); // Box 27
		planeModeParts[3] = new ModelRendererTurbo(this, 880, 146, textureX, textureY); // Box 28

		planeModeParts[0].addBox(0F, 0F, 0F, 60, 20, 15, 0F); // Box 20
		planeModeParts[0].setRotationPoint(22F, -42F, -67F);

		planeModeParts[1].addBox(0F, 0F, 0F, 7, 14, 11, 0F); // Box 21
		planeModeParts[1].setRotationPoint(18F, -39F, -65F);

		planeModeParts[2].addBox(0F, 0F, 0F, 60, 20, 15, 0F); // Box 27
		planeModeParts[2].setRotationPoint(22F, -42F, 52F);

		planeModeParts[3].addBox(0F, 0F, 0F, 7, 14, 11, 0F); // Box 28
		planeModeParts[3].setRotationPoint(18F, -39F, 54F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}