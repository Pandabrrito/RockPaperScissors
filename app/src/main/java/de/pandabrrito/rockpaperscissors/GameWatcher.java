package de.pandabrrito.rockpaperscissors;

import de.pandabrrito.rockpaperscissors.data.Move;
import de.pandabrrito.rockpaperscissors.data.Player;

import java.util.List;

public class GameWatcher {

    private final Player player1;
    private final Player player2;
    private final int gamemode;

    public GameWatcher(Player p1, Player p2, int gm) {
        player1 = p1;
        player2 = p2;
        gamemode = gm;
    }

    public void runRound() {
        int p1Choice = player1.getChoice(gamemode);
        int p2Choice = player2.getChoice(gamemode);

        List<Move> choices = Move.filterArray(gamemode);

        System.out.println("\n" + player1.getName() + ": " + choices.get(p1Choice-1) + "\n=== vs ===\n" +
                player2.getName() + ": " + choices.get(p2Choice-1) + "\n");

        checkWinner(p1Choice, p2Choice, choices);
    }

    private void checkWinner(int p1Choice, int p2Choice, List<Move> choices) {
        if (p1Choice == p2Choice) {
            System.out.println("Draw");
        } else if (choices.get(p1Choice - 1).beats(choices.get(p2Choice - 1))) {
            System.out.println(player1.getName() + " won");
            player2.loseLife();
        } else {
            System.out.println(player2.getName() + " won");
            player1.loseLife();
        }
    }

    public void finalResults() {
        System.out.println("\n====== Game Over ======");
        if (player1.isAlive()) {
            System.out.println(player2.getName() + " won with " + player2.getCurrentLife() + " life left.");
        } else {
            System.out.println(player1.getName() + " won with " + player1.getCurrentLife() + " life left.");
        }
    }

    public boolean isGameDone() {
        return player1.isAlive() || player2.isAlive();
    }
}
