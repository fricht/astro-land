package com.fricht.astroland;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.fricht.astroland.screen.MainMenu;


public class AstroLand extends Game {

    public static final int VIEWPORT_WIDTH = 1920 / 2;
    public static final int VIEWPORT_HEIGHT = 1080 / 2;

    public SpriteBatch batch;

    // always loaded screens
    private MainMenu menu_screen;

    @Override
    public void create() {
        batch = new SpriteBatch();
        menu_screen = new MainMenu(this);
        setScreen(menu_screen);
    }

    public void goto_menu() {
        setScreen(menu_screen);
    }

    @Override
    public void dispose() {
        batch.dispose();
    }

}
