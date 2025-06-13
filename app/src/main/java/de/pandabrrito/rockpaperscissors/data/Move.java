package de.pandabrrito.rockpaperscissors.data;

import java.util.Arrays;
import java.util.List;

public enum Move {
    ROCK, PAPER, SCISSORS, FIRE, SPONGE, AIR, WATER, HUMAN, GUN;

    public boolean beats(Move move) {
        return switch (this) {
            case ROCK -> move == SCISSORS || move == FIRE || move == SPONGE || move == HUMAN;
            case PAPER -> move == ROCK || move == AIR || move == WATER || move == GUN;
            case SCISSORS -> move == PAPER || move == AIR || move == SPONGE || move == HUMAN;
            case FIRE -> move == SCISSORS || move == PAPER || move == SPONGE;
            case SPONGE -> move == WATER || move == AIR || move == PAPER || move == GUN;
            case AIR -> move == FIRE || move == ROCK || move == WATER || move == GUN;
            case WATER -> move == FIRE || move == ROCK || move == SCISSORS || move == GUN;
            case HUMAN -> move == SPONGE || move == PAPER || move == AIR || move == WATER;
            case GUN -> move == ROCK || move == FIRE || move == SCISSORS || move == HUMAN;
        };

    }

    public static List<Move> filterArray(int n) {
        return Arrays.asList(Arrays.copyOfRange(Move.values(), 0, n));
    }

}
