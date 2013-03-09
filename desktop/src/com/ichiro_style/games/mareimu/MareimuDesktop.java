package com.ichiro_style.games.mareimu;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class MareimuDesktop {
    public static void main(String[] args) {
        loadLibgdxApplication();
    }

    private static void loadLibgdxApplication() {
        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
        cfg.title = "Mareimu Desktop";
        cfg.useGL20 = true;
        cfg.width = 800;
        cfg.height = 480;
        cfg.resizable = false;
        new LwjglApplication(new MareimuMainApplication(), cfg);
    }
}