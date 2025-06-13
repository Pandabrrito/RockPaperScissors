package de.pandabrrito.rockpaperscissors.data;

import java.util.Arrays;
import java.util.List;

public enum Move {
    // RPS-3 (The Classic)
    ROCK,
    PAPER,
    SCISSORS,

    // RPS-7 (New additions for 7 total)
    FIRE,
    SPONGE,
    AIR,
    WATER,

    // RPS-9 (New additions for 9 total)
    HUMAN,
    GUN,

    // RPS-11 (New additions for 11 total)
    WOLF,
    DEVIL,

    // RPS-15 (New additions for 15 total)
    SNAKE,
    TREE,
    DRAGON,
    LIGHTNING;

    public boolean beats(Move move) {
        return switch (this) {
            // RPS-3 moves
            case ROCK -> move == FIRE || move == SCISSORS || move == HUMAN || move == WOLF || move == SPONGE || move == TREE;
            case PAPER -> move == AIR || move == ROCK || move == WATER || move == DEVIL || move == DRAGON || move == GUN || move == LIGHTNING;
            case SCISSORS -> move == AIR || move == PAPER || move == HUMAN || move == WOLF || move == SPONGE || move == TREE;

            // RPS-7 additions
            case FIRE -> move == SCISSORS || move == PAPER || move == HUMAN || move == WOLF || move == SPONGE || move == TREE;
            case SPONGE -> move == PAPER || move == AIR || move == WATER || move == DEVIL || move == DRAGON || move == GUN || move == LIGHTNING;
            case AIR -> move == FIRE || move == ROCK || move == WATER || move == DEVIL || move == GUN || move == DRAGON || move == LIGHTNING;
            case WATER -> move == DEVIL || move == DRAGON || move == ROCK || move == FIRE || move == SCISSORS || move == GUN || move == LIGHTNING;

            // RPS-9 additions
            case HUMAN -> move == WOLF || move == SPONGE || move == PAPER || move == AIR || move == WATER || move == DRAGON;
            case GUN -> move == ROCK || move == TREE || move == FIRE || move == SCISSORS || move == SNAKE || move == HUMAN || move == WOLF;

            // RPS-11 additions
            case WOLF -> move == SPONGE || move == PAPER || move == AIR || move == WATER || move == DRAGON || move == LIGHTNING || move == DEVIL;
            case DEVIL -> move == ROCK || move == FIRE || move == LIGHTNING || move == SNAKE || move == HUMAN;

            // RPS-15 additions
            case SNAKE -> move == HUMAN || move == WOLF || move == SPONGE || move == TREE || move == PAPER || move == AIR || move == WATER;
            case TREE -> move == WOLF || move == SPONGE || move == PAPER || move == AIR || move == WATER || move == DEVIL;
            case DRAGON -> move == DEVIL || move == LIGHTNING || move == FIRE || move == ROCK || move == SNAKE;
            case LIGHTNING -> move == GUN || move == SCISSORS || move == ROCK || move == TREE || move == FIRE || move == SNAKE || move == HUMAN;
        };

    }

    public static List<Move> filterArray(int n) {
        return Arrays.asList(Arrays.copyOfRange(Move.values(), 0, n));
    }

}
