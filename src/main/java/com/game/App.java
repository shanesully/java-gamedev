package com.game;

public class App implements Runnable {
    public static Thread game;

    public void start() {
        game = new Thread(this, "game");
        game.start();
    }

    public static void init() {
        System.out.println("Initializing game...");
    }

    public void run() {
        init();
    }

    public static void main(String[] args) {
        new App().start();
    }

}