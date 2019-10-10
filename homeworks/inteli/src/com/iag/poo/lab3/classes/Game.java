package com.iag.poo.lab3.classes;

public class Game {
    private final ID;
    private final Player PLAYER1, PLAYER2;
    private final String TUR;

    public Game(Player PLAYER1, Player PLAYER2, String TUR) {
        this.PLAYER1 = PLAYER1;
        this.PLAYER2 = PLAYER2;
        this.TUR = TUR;
    }

    public Game() {
    }

    public Player getPLAYER1() {
        return PLAYER1;
    }

    public Player getPLAYER2() {
        return PLAYER2;
    }

    public String getTUR() {
        return TUR;
    }
}
