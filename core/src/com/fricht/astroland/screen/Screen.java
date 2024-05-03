package com.fricht.astroland.screen;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.fricht.astroland.AstroLand;


public interface Screen {

    public void create(AstroLand game);

    public void resize(int width, int height);

    public void render(SpriteBatch batch);

    public void pause();

    public void resume();

    public void dispose();

}
