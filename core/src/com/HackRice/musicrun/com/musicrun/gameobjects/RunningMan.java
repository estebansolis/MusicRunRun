package com.HackRice.musicrun.com.musicrun.gameobjects;

import com.badlogic.gdx.math.Vector2;

/**
 * Created by Esteban on 1/31/2015.
 */
public class RunningMan {
  // position.x then refers to the x coordinate, and velocity.y would correspond to the speed in the y direction. acceleration just means change in velocity,
  // just like velocity means change in position.

    private Vector2 position;
    private Vector2 velocity;
    private Vector2 acceleration;

    private float rotation; // for handling rotation
    private int width;
    private int height;

    public RunningMan(float x, float y, int width, int height){
        this.width = width;
        this.height = height;
        position = new Vector2(x,y);
        velocity = new Vector2(0,0);
        acceleration = new Vector2(0,460);
    }
    public void update(float delta) {

        velocity.add(acceleration.cpy().scl(delta));

        if (velocity.y > 200) {
            velocity.y = 200;
        }

        position.add(velocity.cpy().scl(delta));

    }

    public void onClick() {
        velocity.y = -140;
    }

    public float getX() {
        return position.x;
    }

    public float getY() {
        return position.y;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public float getRotation() {
        return rotation;
    }
}
