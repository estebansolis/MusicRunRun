package com.HackRice.musicrun.com.musicrun.gameworld;

import com.badlogic.gdx.Gdx;

/**
 * Created by Esteban on 1/31/2015.
 */
public class GameRenderer {
    private GameWorld myWorld;

    public GameRenderer(GameWorld world) {
        myWorld = world;
    }

    public void render() {
        Gdx.app.log("GameRenderer", "render");
    }
}
