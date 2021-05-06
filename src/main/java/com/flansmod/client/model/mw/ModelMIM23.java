package com.flansmod.client.model.mw;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMIM23 extends ModelVehicle
{
	public ModelMIM23()
	{
		int textureX = 512;
		int textureY = 512;
		
		bodyModel = new ModelRendererTurbo[10];
		bodyModel[0] = new ModelRendererTurbo(this, 329, 75, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 383, 167, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Shape 6
		bodyModel[6] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Shape 7
		bodyModel[7] = new ModelRendererTurbo(this, 410, 45, textureX, textureY); // Shape 8
		bodyModel[8] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Shape 9
		bodyModel[9] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 10

		bodyModel[0].addBox(0F, 0F, 0F, 14, 3, 14, 0F); // Box 0
		bodyModel[0].setRotationPoint(-7F, 7F, -7F);

		bodyModel[1].addBox(0F, 0F, 0F, 12, 2, 12, 0F); // Box 1
		bodyModel[1].setRotationPoint(-6F, 8F, 7F);

		bodyModel[2].addBox(0F, 0F, 0F, 12, 2, 12, 0F); // Box 3
		bodyModel[2].setRotationPoint(-6F, 8F, -19F);

		bodyModel[3].addBox(0F, 0F, 0F, 12, 2, 12, 0F); // Box 4
		bodyModel[3].setRotationPoint(7F, 8F, 6F);
		bodyModel[3].rotateAngleY = -1.57079633F;

		bodyModel[4].addBox(0F, 0F, 0F, 12, 2, 12, 0F); // Box 5
		bodyModel[4].setRotationPoint(-19F, 8F, 6F);
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


		turretModel = new ModelRendererTurbo[18];
		turretModel[0] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 12
		turretModel[1] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 13
		turretModel[2] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Shape 14
		turretModel[3] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 15
		turretModel[4] = new ModelRendererTurbo(this, 227, 178, textureX, textureY); // Shape 16
		turretModel[5] = new ModelRendererTurbo(this, 76, 171, textureX, textureY); // Shape 17
		turretModel[6] = new ModelRendererTurbo(this, 164, 129, textureX, textureY); // Shape 18
		turretModel[7] = new ModelRendererTurbo(this, 337, 122, textureX, textureY); // Shape 19
		turretModel[8] = new ModelRendererTurbo(this, 296, 182, textureX, textureY); // Box 18
		turretModel[9] = new ModelRendererTurbo(this, 115, 77, textureX, textureY); // Box 19
		turretModel[10] = new ModelRendererTurbo(this, 82, 115, textureX, textureY); // Box 24
		turretModel[11] = new ModelRendererTurbo(this, 256, 129, textureX, textureY); // Shape 25
		turretModel[12] = new ModelRendererTurbo(this, 160, 174, textureX, textureY); // Shape 26
		turretModel[13] = new ModelRendererTurbo(this, 19, 173, textureX, textureY); // Shape 27
		turretModel[14] = new ModelRendererTurbo(this, 64, 76, textureX, textureY); // Box 28
		turretModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 29
		turretModel[16] = new ModelRendererTurbo(this, 18, 131, textureX, textureY); // Box 30
		turretModel[17] = new ModelRendererTurbo(this, 11, 81, textureX, textureY); // Box 31

		turretModel[0].addBox(0F, 0F, 0F, 23, 1, 33, 0F); // Box 12
		turretModel[0].setRotationPoint(-16F, 2F, -9F);

		turretModel[1].addBox(0F, 0F, 0F, 26, 6, 17, 0F); // Box 13
		turretModel[1].setRotationPoint(-19F, -4F, -9F);

		turretModel[2].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(3, 0, 3, 0), new Coord2D(3, 6, 3, 6) }), 33, 3, 6, 16, 33, ModelRendererTurbo.MR_FRONT, new float[] {7 ,6 ,3}); // Shape 14
		turretModel[2].setRotationPoint(10F, -4F, -9F);
		turretModel[2].rotateAngleX = 3.14159265F;

		turretModel[3].addBox(0F, 0F, 0F, 22, 11, 17, 0F); // Box 15
		turretModel[3].setRotationPoint(-28F, -15F, -9F);

		turretModel[4].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(16, 0, 16, 0), new Coord2D(16, 11, 16, 11) }), 3, 16, 11, 47, 3, ModelRendererTurbo.MR_FRONT, new float[] {20 ,11 ,16}); // Shape 16
		turretModel[4].setRotationPoint(10F, -4F, 8F);

		turretModel[5].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(16, 0, 16, 0), new Coord2D(16, 11, 16, 11) }), 3, 16, 11, 47, 3, ModelRendererTurbo.MR_FRONT, new float[] {20 ,11 ,16}); // Shape 17
		turretModel[5].setRotationPoint(10F, -4F, -6F);

		turretModel[6].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(16, 0, 16, 0), new Coord2D(16, 11, 16, 11) }), 3, 16, 11, 47, 3, ModelRendererTurbo.MR_FRONT, new float[] {20 ,11 ,16}); // Shape 18
		turretModel[6].setRotationPoint(10F, -4F, 1F);

		turretModel[7].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(6, 0, 6, 0), new Coord2D(6, 9, 6, 9) }), 17, 6, 9, 26, 17, ModelRendererTurbo.MR_FRONT, new float[] {11 ,9 ,6}); // Shape 19
		turretModel[7].setRotationPoint(-19F, 2F, -9F);
		turretModel[7].rotateAngleX = 3.14159265F;
		turretModel[7].rotateAngleZ = 4.71238898F;

		turretModel[8].addBox(0F, 0F, 0F, 12, 4, 5, 0F); // Box 18
		turretModel[8].setRotationPoint(-28F, -15F, -14F);

		turretModel[9].addBox(0F, 0F, 0F, 18, 2, 12, 0F); // Box 19
		turretModel[9].setRotationPoint(-28F, -17F, -9F);

		turretModel[10].addBox(0F, 0F, 0F, 7, 6, 16, 0F); // Box 24
		turretModel[10].setRotationPoint(0F, -4F, 8F);

		turretModel[11].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(7, 0, 7, 0), new Coord2D(7, 5, 7, 5) }), 16, 7, 5, 21, 16, ModelRendererTurbo.MR_FRONT, new float[] {9 ,5 ,7}); // Shape 25
		turretModel[11].setRotationPoint(10F, -4F, 24F);

		turretModel[12].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(7, 0, 7, 0), new Coord2D(7, 5, 7, 5) }), 11, 7, 5, 21, 11, ModelRendererTurbo.MR_FRONT, new float[] {9 ,5 ,7}); // Shape 26
		turretModel[12].setRotationPoint(1F, -10F, -9F);
		turretModel[12].rotateAngleX = 1.57079633F;

		turretModel[13].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(7, 0, 7, 0), new Coord2D(7, 5, 7, 5) }), 11, 7, 5, 21, 11, ModelRendererTurbo.MR_FRONT, new float[] {9 ,5 ,7}); // Shape 27
		turretModel[13].setRotationPoint(-13F, 1F, -9F);
		turretModel[13].rotateAngleX = 1.57079633F;
		turretModel[13].rotateAngleZ = 3.14159265F;

		turretModel[14].addBox(0F, 0F, 0F, 1, 6, 11, 0F); // Box 28
		turretModel[14].setRotationPoint(2F, -11F, 10F);
		turretModel[14].rotateAngleZ = -0.17453293F;

		turretModel[15].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 29
		turretModel[15].setRotationPoint(1.5F, -6F, 13F);

		turretModel[16].addBox(0F, 0F, 0F, 10, 2, 10, 0F); // Box 30
		turretModel[16].setRotationPoint(-16F, 0F, 11F);

		turretModel[17].addBox(0F, 0F, 0F, 2, 16, 10, 0F); // Box 31
		turretModel[17].setRotationPoint(-19F, -15.5F, 11F);
		turretModel[17].rotateAngleZ = 0.08726646F;


		barrelModel = new ModelRendererTurbo[4];
		barrelModel[0] = new ModelRendererTurbo(this, 93, 243, textureX, textureY); // Box 20
		barrelModel[1] = new ModelRendererTurbo(this, 92, 222, textureX, textureY); // Box 21
		barrelModel[2] = new ModelRendererTurbo(this, 28, 219, textureX, textureY); // Box 22
		barrelModel[3] = new ModelRendererTurbo(this, 219, 78, textureX, textureY); // Box 23

		barrelModel[0].addBox(0F, 0F, 0F, 47, 2, 2, 0F); // Box 20
		barrelModel[0].setRotationPoint(-7F, -10F, 2F);

		barrelModel[1].addBox(0F, 0F, 0F, 47, 2, 2, 0F); // Box 21
		barrelModel[1].setRotationPoint(-7F, -10F, -5F);

		barrelModel[2].addBox(47F, 0F, 0F, 15, 3, 3, 0F); // Box 22
		barrelModel[2].setRotationPoint(-7F, -10.5F, -5.5F);

		barrelModel[3].addBox(47F, 0F, 0F, 15, 3, 3, 0F); // Box 23
		barrelModel[3].setRotationPoint(-7F, -10.5F, 1.5F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}