package de.pandabrrito.rockpaperscissors.data;

public class Player {

    private final String name;
    private int currentLife;

    public Player(String name, int startingLives) {
        this.name = name;
        this.currentLife = startingLives;
    }

    public String getName() {
        return name;
    }

    public int getCurrentLife() {
        return currentLife;
    }

    public void loseLife() {
        if (currentLife > 0) {
            currentLife--;
        }
    }

    public boolean isAlive() {
        return currentLife <= 0;
    }

    public int getChoice(int availableMoves) {
        return 0;
    }

}
