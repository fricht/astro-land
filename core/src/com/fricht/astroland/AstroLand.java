package com.fricht.astroland;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.fricht.astroland.screen.Screen;


public class AstroLand implements ApplicationListener {

    SpriteBatch batch;
    Screen current_screen;

    @Override
    public void create() {
        batch = new SpriteBatch();
        current_screen = new ;
    }

    @Override
    public void resize(int width, int height) {}

    @Override
    public void render() {
        ScreenUtils.clear(0f, 0f, 0f, 1f);
        batch.begin();
        batch.disableBlending();
        batch.end();
    }

    @Override
    public void pause() {}

    @Override
    public void resume() {}

    @Override
    public void dispose() {
        batch.dispose();
    }

}
