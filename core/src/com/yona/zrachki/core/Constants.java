package com.yona.zrachki.core;

import com.badlogic.gdx.Gdx;

public class Constants {
    public static int WIDTH, HEIGHT, DEVICE_WIDTH, DEVICE_HEIGHT, IMAGEBUTTON_SIZE, ANSWER_BUTTON_SIZE;
    public static int TEXT_REGULAR, TEXT_SCRIPT, TEXT_FORMULA;
    public static float BUTTON_SCALE, SCALE_DURATION, ROULETTE_SCALE_STEP,
            LAYERS_SWITCH_DURATION, MENU_SLIDE_DURATION, SCREEN_SWITCH_DURATION, START_SCREEN_ANIMATION;

    public Constants(){
        WIDTH= 540;
        HEIGHT=960;
        DEVICE_HEIGHT=Gdx.graphics.getHeight();
        DEVICE_WIDTH=Gdx.graphics.getWidth();
        IMAGEBUTTON_SIZE=64;
        ANSWER_BUTTON_SIZE=115;

        BUTTON_SCALE=.88f;
        SCALE_DURATION=.055f;
        ROULETTE_SCALE_STEP=0.25f;
        LAYERS_SWITCH_DURATION=.6f;
        MENU_SLIDE_DURATION=.65f;
        SCREEN_SWITCH_DURATION=.95f;
        START_SCREEN_ANIMATION=.5f;

        TEXT_REGULAR=96;
        TEXT_SCRIPT=60;
        TEXT_FORMULA=95;
    }
}
