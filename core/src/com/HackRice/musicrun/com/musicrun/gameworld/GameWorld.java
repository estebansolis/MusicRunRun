package com.HackRice.musicrun.com.musicrun.gameworld;

import com.HackRice.musicrun.com.musicrun.gameobjects.RunningMan;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by Esteban on 1/31/2015.
 */
public class GameWorld {
    private RunningMan man;

    public GameWorld(int midPointY){
        man = new RunningMan(33, midPointY -5,17,12 );
    }

    public void update(float delta) {
        man.update(delta);
    }

    public RunningMan getMan(){
        return man;
    }
}


