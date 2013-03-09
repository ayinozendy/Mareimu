package com.ichiro_style.games.mareimu;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class MareimuDesktop {

    private static String OSX_APP_NAME = "Mareimu";
    private static String APP_TITLE = "Mareimu Desktop";

    public static void main(String[] args) {
        changeMacMenuBarApplicationName();
        loadLibgdxApplication();
    }

    private static void changeMacMenuBarApplicationName() {
        System.setProperty("com.apple.mrj.application.apple.menu.about.name", OSX_APP_NAME);
    }

    private static void loadLibgdxApplication() {
        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
        cfg.title = APP_TITLE;
        cfg.useGL20 = true;
        cfg.width = 800;
        cfg.height = 480;
        cfg.resizable = false;
        new LwjglApplication(new MareimuMainApplication(), cfg);
    }
}
