package com.HackRice.musicrun.com.musicrun.helpers;

import com.HackRice.musicrun.com.musicrun.gameobjects.RunningMan;
import com.badlogic.gdx.InputProcessor;

/**
 * Created by Esteban on 1/31/2015.
 */
public class InputHelpers implements InputProcessor {

    private RunningMan myMan;

    public InputHelpers(RunningMan man){
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
