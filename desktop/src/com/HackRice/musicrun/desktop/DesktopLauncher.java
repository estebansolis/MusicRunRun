package com.HackRice.musicrun.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.HackRice.musicrun.MRGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new MRGame(), config);
        config.title = "MusicRun";
        config.width = 272;
        config.height = 408;
        new LwjglApplication(new MRGame(), config);
    }
}
