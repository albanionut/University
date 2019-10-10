package com.unitbv;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Main {
    public static String randomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }

    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            players.add(new Player(UUID.randomUUID(), randomString()));

        }

        Tournament tournament = new Tournament(players);
        for (Game game : tournament.getTournamentResult()) {
            System.out.println(game.getPlayer1().toString() + game.getPlayer2().toString());
            System.out.println("****** Game Winner: " + game.getWinner().getName()+ " ********");
        }
    }


}
