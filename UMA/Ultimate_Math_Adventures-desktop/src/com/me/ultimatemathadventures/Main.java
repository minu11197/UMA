package com.me.ultimatemathadventures;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Ultimate_Math_Adventures";
		cfg.useGL20 = false;
		cfg.width = 800;
		cfg.height = 480;
		new LwjglApplication(new UlimateMathAdventures(), cfg);
	}
}
