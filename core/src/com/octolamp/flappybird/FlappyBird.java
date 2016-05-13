package com.octolamp.flappybird;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class FlappyBird extends ApplicationAdapter {
	SpriteBatch batch;
	public float scale;
	Texture castle1, castle2, bow, background, healthUpgrade, powerUpgrade, speedUpgrade;
	public int startX = 220;
	public int startY = 225;

//	//create enemy and arrow objects
//	Entity[] enemy = new Entity[6];
//	Arrow[] arrows = new Arrow[3];

	public int reloadTime = 0;

	//Upgradeable stats
	public int firingSpeed = 65;
	public double damage = 1;
	public double maxHealth = 100;

	//current castle health
	public double castleHealth = 100;

	//Difficulty level, controls spawn rate and enemy health
	public double difficulty = 0.0005;

	public int enemiesKilled = 0;
	public int upgrades = 1;
	public boolean levellingUp = false;

	@Override
	public void create () {
		batch = new SpriteBatch();

		//Sets all the stuff back since initialize is used to reset the game
		castleHealth = 100;
		maxHealth = 100;
		enemiesKilled = 0;
		upgrades = 1;
		firingSpeed = 65;
		difficulty = 0.0005;

		//Loads the pictures
		castle1 = new Texture("castle1.png");
		castle2 = new Texture("castle2.png");
		bow = new Texture("bow.png");
		background = new Texture("background.png");
		healthUpgrade = new Texture("HU.png");
		powerUpgrade = new Texture("PU.png");
		speedUpgrade = new Texture("SU.png");

//		//Makes the enemies and arrows
//		for (int i = 0; i < enemy.length; i++)
//			enemy[i] = new Entity(65, 55);
//		for (int i = 0; i < arrows.length; i++)
//			arrows[i] = new Arrow();

		scale = (float)Gdx.graphics.getHeight()/background.getHeight();

	}

	@Override
	public void render () {

		batch.begin();
		//display background to full screen size
		draw(background, 0, 0);

		batch.end();
	}

	public void draw(Texture texture, int x, int y)
	{
		batch.draw(texture, x, y, background.getWidth()*scale, background.getHeight()*scale);
	}

}
