package com.iag.poo.lab3.classes;

public class ScoreGame {
    private Game game;
    private int[] nrGamesPlayer1, nrGamesPlayer2;

    public ScoreGame(Game game, int[] nrGamesPlayer1, int[] nrGamesPlayer2) {
        this.game = game;
        this.nrGamesPlayer1 = nrGamesPlayer1;
        this.nrGamesPlayer2 = nrGamesPlayer2;
    }

    public ScoreGame() {
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public int[] getNrGamesPlayer1() {
        return nrGamesPlayer1;
    }

    public void setNrGamesPlayer1(int[] nrGamesPlayer1) {
        this.nrGamesPlayer1 = nrGamesPlayer1;
    }

    public int[] getNrGamesPlayer2() {
        return nrGamesPlayer2;
    }

    public void setNrGamesPlayer2(int[] nrGamesPlayer2) {
        this.nrGamesPlayer2 = nrGamesPlayer2;
    }
}
