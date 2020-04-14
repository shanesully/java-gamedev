package com.game;

import com.engine.io.Window;

public class App implements Runnable {
    public static Thread game;
    public static Window window;
    private static final int WIDTH = 1280;
    private static final int HEIGHT = 720;
    private static final String TITLE = "Game";

    public void start() {
        game = new Thread(this, "game");
        game.start();
    }

    public static void init() {
        System.out.println("Initializing game...");
        window = new Window(WIDTH, HEIGHT, TITLE);
        window.create();
    }

    public void run() {
        init();
        while (!window.shouldClose()) {
            update();
            render();
        }
    }

    public static void main(String[] args) {
        new App().start();
    }

    private void update() {
        System.out.println("Updating game...");
        window.update();
    }

    private void render() {
        System.out.println("Rendering game...");
        window.swapBuffers();
    }

}