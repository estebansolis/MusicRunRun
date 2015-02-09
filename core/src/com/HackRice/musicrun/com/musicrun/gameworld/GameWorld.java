package com.HackRice.musicrun.com.musicrun.gameworld;

import com.HackRice.musicrun.com.musicrun.gameobjects.RunningMan;
import com.HackRice.musicrun.com.musicrun.gameobjects.ScrollHandler;
import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by Esteban on 1/31/2015.
 */
public class GameWorld {

    private RunningMan man;
    private ScrollHandler scroller;
    private Rectangle ground;


    public GameWorld(int midPointY){

        man = new RunningMan(33, midPointY -5,17,12 );
        scroller = new ScrollHandler(midPointY + 66);
        ground = new Rectangle(0, midPointY + 66, 136,11);
    }

    public void update(float delta) {

        if (delta > .15f) {
            delta = .15f;
        }

        man.update(delta);
        scroller.update(delta);

        if (scroller.collides(man) && man.isAlive()) {
            scroller.stop();
            man.die();

        }

        if (Intersector.overlaps(man.getBoundingCircle(), ground)) {
            //scroller.stop();

          //  man.die();
            man.decelerate();
            man.groundTouch();
        }

    }
    public RunningMan getMan(){
        return man;
    }

    public ScrollHandler getScroller() {
        return scroller;
    }



}


