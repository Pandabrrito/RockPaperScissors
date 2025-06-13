package de.pandabrrito.rockpaperscissors.data;

import static de.pandabrrito.rockpaperscissors.util.NumberValidator.numberValidator;

public class User extends Player {

    public User(String name, int startingLives) {
        super(name, startingLives);
    }

    @Override
    public int getChoice(int availableMoves) {
        int counter = 1;

        System.out.println("Choose your move:");

        for (Move move : Move.filterArray(availableMoves)) {
            System.out.println(counter + " - " + move);
            counter++;
        }

        System.out.println("Choose a number between 1 and " + availableMoves + ":");

        return numberValidator(1, Move.filterArray(availableMoves).size());
    }

}
