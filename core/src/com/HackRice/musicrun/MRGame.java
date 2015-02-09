package com.HackRice.musicrun;


import com.HackRice.musicrun.com.musicrun.helpers.AssetLoader;
import com.HackRice.musicrun.com.musicrun.screens.GameScreen;
import com.badlogic.gdx.Game;

public class MRGame extends Game{


    @Override
    public void create() {
     //Gdx.app.log("MRGame","created");

        AssetLoader.load();
        setScreen(new GameScreen());
    }
    @Override
    public void dispose(){
        super.dispose();
        AssetLoader.dispose();
    }
}
