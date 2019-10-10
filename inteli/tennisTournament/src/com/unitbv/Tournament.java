package com.unitbv;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tournament {
    private List<Player> players;
    private List<Game> games;

    public Tournament(List<Player> players) {
        this.players = players;
    }

    public List<Game> getTournamentResult() {
        this.games = new ArrayList<>();
        while (this.players.size() > 1) {
            int randomPlayer1 = new Random().nextInt(this.players.size());
            int randomPlayer2 = new Random().nextInt(this.players.size());
            if (randomPlayer1 != randomPlayer2) {
                Player player1 = this.players.get(randomPlayer1);
                Player player2 = this.players.get(randomPlayer2);
                Game game = new Game(player1, player2);
                this.games.add(game);
                this.players.remove(game.getLoser());
            }

        }
        return this.games;
    }


}
