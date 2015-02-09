package com.HackRice.musicrun.com.musicrun.helpers;

import com.HackRice.musicrun.com.musicrun.gameobjects.RunningMan;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by Esteban on 1/31/2015.
 */

public class InputHelpers implements InputProcessor {
    float screenWidth = Gdx.graphics.getWidth();
    float screenHeight = Gdx.graphics.getHeight();
    float gameWidth = 136;
    float gameHeight = screenHeight / (screenWidth / gameWidth);

    int i = 0;
    private RunningMan myMan;
    int midPointY = (int) (gameHeight / 2);
    private Rectangle ground = new Rectangle(0, midPointY + 66, 136, 11);

    public InputHelpers(RunningMan man)
    {
        myMan = man;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {

        myMan.onClick();


        return true;// if clicked
    }

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
