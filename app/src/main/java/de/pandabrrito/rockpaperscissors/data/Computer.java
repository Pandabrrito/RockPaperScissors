package de.pandabrrito.rockpaperscissors.data;

import java.util.Random;

public class Computer extends Player {

    private final Random random = new Random();

    public Computer(int startingLives) {
        super("Computer", startingLives);
    }

    public int getChoice(int availableMoves) {
        return random.nextInt(availableMoves) + 1; // Generates a random number between 1 and availableMoves
    }

}
