package com.mygdx.squirrel_game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.squirrel_game.squirrel_game;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Squirrel Game";
		config.width = 1280;
		config.height = 800;
		new LwjglApplication(new squirrel_game(), config);
	}
}
