package com.unitbv;

import java.util.Random;

public class Game {
    private Player player1;
    private Player player2;
    private Player winner;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public Player getLoser() {
        Player[] gamePlayers = new Player[]{this.player1, this.player2};
        int loser = new Random().nextInt(gamePlayers.length);
        this.winner = 0 == loser ? gamePlayers[1] : gamePlayers[0];
        return gamePlayers[loser];
    }

    public Player getWinner() {
        return winner;
    }
}
