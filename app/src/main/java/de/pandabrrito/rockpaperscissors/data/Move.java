package de.pandabrrito.rockpaperscissors.data;

import java.util.Arrays;
import java.util.List;

public enum Move {

    //RPS-3 (Classic)
    ROCK, PAPER, SCISSORS,

    //RPS-7 additions
    FIRE, SPONGE, AIR, WATER,

    //RPS-9 additions
    MAN, GUN,

    //RPS-11 additions
    WOLF, DEVIL,

    //RPS-15 additions
    SNAKE, TREE, DRAGON, LIGHTNING,

    //RPS-25 additions
    AXE, ALIEN, BOWL, COCKROACH, DYNAMITE, MONKEY, MOON, NUKE, SUN, WOMAN,

    //RPS-101 additions
    TORNADO, QUICKSAND, PIT, CHAIN, LAW, WHIP, SWORD, DEATH, WALL, CAMERA, CHAINSAW,
    SCHOOL, POISON, CAGE, PEACE, COMPUTER, CASTLE,  BLOOD, PORCUPINE, VULTURE, KING, QUEEN,
    PRINCE, PRINCESS, POLICE, BABY, HOME, TRAIN, CAR, NOISE, BICYCLE, TURNIP, DUCK, CAT, BIRD,
    FISH, SPIDER, BRAIN, COMMUNITY, CROSS, MONEY, VAMPIRE, CHURCH, BUTTER, BOOK, CLOUD,
    AIRPLANE, GRASS, FILM, TOILET, PLANET, GUITAR, CUP, BEER, RAIN, TV, RAINBOW, UFO,
    PRAYER, MOUNTAIN, SATAN, DIAMOND, PLATINUM, GOLD, FENCE, VIDEO_GAME, MATH, ROBOT, HEART, ELECTRICITY,
    MEDUSA, POWER, LASER, SKY, TANK, HELICOPTER;


    public boolean beats(Move move) {
        return switch (this) {
            case ROCK -> move == DEATH || move == WALL || move == SUN || move == CAMERA || move == FIRE
                    || move == CHAINSAW || move == SCHOOL || move == SCISSORS || move == POISON || move == CAGE
                    || move == AXE || move == PEACE || move == COMPUTER || move == CASTLE || move == SNAKE
                    || move == BLOOD || move == PORCUPINE || move == VULTURE || move == MONKEY || move == KING
                    || move == QUEEN || move == PRINCE || move == PRINCESS || move == POLICE || move == WOMAN
                    || move == BABY || move == MAN || move == HOME || move == TRAIN || move == CAR || move == NOISE
                    || move == BICYCLE || move == TREE || move == TURNIP || move == DUCK || move == WOLF || move == CAT
                    || move == BIRD || move == FISH || move == SPIDER || move == COCKROACH || move == BRAIN
                    || move == COMMUNITY || move == CROSS || move == MONEY || move == VAMPIRE || move == SPONGE
                    || move == CHURCH || move == BUTTER || move == BOOK;
            case PAPER -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == GUN || move == LAW || move == WHIP || move == SWORD || move == ROCK || move == CLOUD
                    || move == AIRPLANE || move == MOON || move == GRASS || move == FILM || move == TOILET
                    || move == AIR || move == GUITAR || move == BOWL || move == CUP || move == BEER || move == RAIN
                    || move == WATER || move == TV || move == RAINBOW || move == UFO || move == ALIEN || move == PRAYER
                    || move == MOUNTAIN || move == SATAN || move == DRAGON || move == DIAMOND || move == PLATINUM
                    || move == GOLD || move == DEVIL || move == FENCE || move == VIDEO_GAME || move == MATH
                    || move == ROBOT || move == HEART || move == ELECTRICITY || move == LIGHTNING || move == MEDUSA
                    || move == POWER || move == LASER || move == NUKE || move == SKY;
            case SCISSORS -> move == POISON || move == CAGE || move == AXE || move == PEACE || move == COMPUTER
                    || move == CASTLE || move == SNAKE || move == BLOOD || move == PORCUPINE || move == VULTURE
                    || move == MONKEY || move == KING || move == QUEEN || move == PRINCE || move == PRINCESS
                    || move == POLICE || move == WOMAN || move == BABY || move == MAN || move == HOME || move == TRAIN
                    || move == CAR || move == NOISE || move == BICYCLE || move == TREE || move == TURNIP || move == DUCK
                    || move == WOLF || move == CAT || move == BIRD || move == FISH || move == SPIDER
                    || move == COCKROACH || move == BRAIN || move == COMMUNITY || move == CROSS || move == MONEY
                    || move == VAMPIRE || move == SPONGE || move == CHURCH || move == BUTTER || move == BOOK
                    || move == PAPER || move == CLOUD || move == AIRPLANE || move == MOON || move == GRASS
                    || move == FILM || move == TOILET || move == AIR;
            case FIRE -> move == CHAINSAW || move == SCHOOL || move == SCISSORS || move == POISON || move == CAGE
                    || move == AXE || move == PEACE || move == COMPUTER || move == CASTLE || move == SNAKE
                    || move == BLOOD || move == PORCUPINE || move == VULTURE || move == MONKEY || move == KING
                    || move == QUEEN || move == PRINCE || move == PRINCESS || move == POLICE || move == WOMAN
                    || move == BABY || move == MAN || move == HOME || move == TRAIN || move == CAR || move == NOISE
                    || move == BICYCLE || move == TREE || move == TURNIP || move == DUCK || move == WOLF || move == CAT
                    || move == BIRD || move == FISH || move == SPIDER || move == COCKROACH || move == BRAIN
                    || move == COMMUNITY || move == CROSS || move == MONEY || move == VAMPIRE || move == SPONGE
                    || move == CHURCH || move == BUTTER || move == BOOK || move == PAPER || move == CLOUD
                    || move == AIRPLANE || move == GRASS;
            case SPONGE -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == GUN || move == CHURCH || move == BUTTER || move == BOOK || move == PAPER || move == CLOUD
                    || move == AIRPLANE || move == MOON || move == GRASS || move == FILM || move == TOILET
                    || move == AIR || move == PLANET || move == GUITAR || move == BOWL || move == CUP || move == BEER
                    || move == RAIN || move == WATER || move == TV || move == RAINBOW || move == UFO || move == ALIEN
                    || move == PRAYER || move == MOUNTAIN || move == SATAN || move == DRAGON || move == DIAMOND
                    || move == PLATINUM || move == GOLD || move == DEVIL || move == FENCE || move == VIDEO_GAME
                    || move == MATH || move == ROBOT || move == HEART || move == ELECTRICITY || move == LIGHTNING
                    || move == MEDUSA || move == POWER || move == LASER || move == NUKE || move == TANK
                    || move == HELICOPTER;
            case AIR -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == GUN || move == LAW || move == WHIP || move == SWORD || move == ROCK || move == DEATH
                    || move == WALL || move == SUN || move == CAMERA || move == FIRE || move == CHAINSAW
                    || move == PLANET || move == GUITAR || move == BOWL || move == CUP || move == BEER || move == RAIN
                    || move == WATER || move == TV || move == RAINBOW || move == UFO || move == ALIEN || move == PRAYER
                    || move == MOUNTAIN || move == SATAN || move == DRAGON || move == PLATINUM || move == GOLD
                    || move == DEVIL || move == FENCE || move == VIDEO_GAME || move == MATH || move == ROBOT
                    || move == HEART || move == ELECTRICITY || move == LIGHTNING || move == MEDUSA || move == POWER
                    || move == LASER || move == NUKE || move == SKY || move == TANK || move == HELICOPTER;
            case WATER -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == GUN || move == WHIP || move == SWORD || move == ROCK || move == DEATH || move == WALL
                    || move == SUN || move == CAMERA || move == FIRE || move == CHAINSAW || move == SCHOOL
                    || move == SCISSORS || move == POISON || move == CAGE || move == AXE || move == PEACE
                    || move == COMPUTER || move == CASTLE || move == TV || move == RAINBOW || move == UFO
                    || move == ALIEN || move == PRAYER || move == MOUNTAIN || move == SATAN || move == DRAGON
                    || move == DIAMOND || move == PLATINUM || move == GOLD || move == DEVIL || move == FENCE
                    || move == VIDEO_GAME || move == MATH || move == ROBOT || move == HEART || move == ELECTRICITY
                    || move == LIGHTNING || move == MEDUSA || move == POWER || move == LASER || move == NUKE
                    || move == SKY || move == TANK || move == HELICOPTER;
            case MAN -> move == HOME || move == TRAIN || move == CAR || move == NOISE || move == BICYCLE || move == TREE
                    || move == TURNIP || move == DUCK || move == WOLF || move == CAT || move == BIRD || move == FISH
                    || move == SPIDER || move == COCKROACH || move == BRAIN || move == COMMUNITY || move == CROSS
                    || move == MONEY || move == VAMPIRE || move == SPONGE || move == CHURCH || move == BUTTER
                    || move == BOOK || move == PAPER || move == CLOUD || move == AIRPLANE || move == MOON
                    || move == GRASS || move == FILM || move == TOILET || move == AIR || move == PLANET
                    || move == GUITAR || move == BOWL || move == CUP || move == BEER || move == RAIN || move == WATER
                    || move == TV || move == RAINBOW || move == UFO || move == ALIEN || move == PRAYER
                    || move == MOUNTAIN || move == SATAN || move == DRAGON || move == DIAMOND || move == PLATINUM
                    || move == GOLD || move == DEVIL;
            case GUN -> move == LAW || move == WHIP || move == SWORD || move == ROCK || move == DEATH || move == WALL
                    || move == SUN || move == CAMERA || move == CHAINSAW || move == SCHOOL || move == SCISSORS
                    || move == POISON || move == CAGE || move == AXE || move == PEACE || move == COMPUTER
                    || move == CASTLE || move == SNAKE || move == BLOOD || move == PORCUPINE || move == VULTURE
                    || move == MONKEY || move == KING || move == QUEEN || move == PRINCE || move == PRINCESS
                    || move == POLICE || move == WOMAN || move == BABY || move == MAN || move == HOME || move == TRAIN
                    || move == CAR || move == NOISE || move == BICYCLE || move == TREE || move == TURNIP || move == DUCK
                    || move == WOLF || move == CAT || move == BIRD || move == FISH || move == SPIDER
                    || move == COCKROACH || move == BRAIN || move == COMMUNITY || move == MONEY || move == VAMPIRE;
            case WOLF -> move == CAT || move == BIRD || move == FISH || move == SPIDER || move == COCKROACH
                    || move == BRAIN || move == COMMUNITY || move == CROSS || move == MONEY || move == VAMPIRE
                    || move == SPONGE || move == CHURCH || move == BUTTER || move == BOOK || move == PAPER
                    || move == CLOUD || move == AIRPLANE || move == MOON || move == GRASS || move == FILM
                    || move == TOILET || move == AIR || move == PLANET || move == GUITAR || move == BOWL || move == CUP
                    || move == BEER || move == RAIN || move == WATER || move == TV || move == RAINBOW || move == UFO
                    || move == ALIEN || move == PRAYER || move == MOUNTAIN || move == SATAN || move == DRAGON
                    || move == DIAMOND || move == PLATINUM || move == GOLD || move == DEVIL || move == FENCE
                    || move == VIDEO_GAME || move == MATH || move == ROBOT || move == HEART || move == ELECTRICITY
                    || move == LIGHTNING || move == MEDUSA || move == POWER;
            case DEVIL -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == GUN || move == LAW || move == WHIP || move == SWORD || move == ROCK || move == DEATH
                    || move == WALL || move == SUN || move == CAMERA || move == FIRE || move == CHAINSAW
                    || move == SCHOOL || move == SCISSORS || move == POISON || move == CAGE || move == AXE
                    || move == PEACE || move == COMPUTER || move == CASTLE || move == BLOOD || move == PORCUPINE
                    || move == VULTURE || move == MONKEY || move == KING || move == QUEEN || move == PRINCE
                    || move == PRINCESS || move == POLICE || move == WOMAN || move == BABY || move == FENCE
                    || move == VIDEO_GAME || move == MATH || move == ROBOT || move == HEART || move == ELECTRICITY
                    || move == LIGHTNING || move == MEDUSA || move == POWER || move == LASER || move == NUKE
                    || move == SKY || move == TANK || move == HELICOPTER;
            case SNAKE -> move == BLOOD || move == PORCUPINE || move == VULTURE || move == MONKEY || move == KING
                    || move == QUEEN || move == PRINCE || move == PRINCESS || move == POLICE || move == WOMAN
                    || move == BABY || move == MAN || move == HOME || move == TRAIN || move == CAR || move == NOISE
                    || move == BICYCLE || move == TREE || move == TURNIP || move == DUCK || move == WOLF || move == CAT
                    || move == BIRD || move == FISH || move == SPIDER || move == COCKROACH || move == BRAIN
                    || move == COMMUNITY || move == CROSS || move == MONEY || move == VAMPIRE || move == SPONGE
                    || move == CHURCH || move == BUTTER || move == BOOK || move == PAPER || move == CLOUD
                    || move == MOON || move == GRASS || move == FILM || move == TOILET || move == AIR || move == PLANET
                    || move == GUITAR || move == BOWL || move == CUP || move == BEER || move == RAIN || move == WATER;
            case TREE -> move == TURNIP || move == DUCK || move == WOLF || move == CAT || move == BIRD || move == FISH
                    || move == SPIDER || move == COCKROACH || move == BRAIN || move == COMMUNITY || move == CROSS
                    || move == MONEY || move == VAMPIRE || move == SPONGE || move == CHURCH || move == BUTTER
                    || move == BOOK || move == PAPER || move == CLOUD || move == AIRPLANE || move == MOON
                    || move == GRASS || move == FILM || move == TOILET || move == AIR || move == PLANET
                    || move == GUITAR || move == BOWL || move == CUP || move == BEER || move == RAIN || move == WATER
                    || move == TV || move == RAINBOW || move == UFO || move == ALIEN || move == PRAYER
                    || move == MOUNTAIN || move == SATAN || move == DRAGON || move == DIAMOND || move == PLATINUM
                    || move == GOLD || move == DEVIL || move == FENCE || move == VIDEO_GAME || move == MATH
                    || move == ROBOT || move == HEART || move == ELECTRICITY;
            case DRAGON -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == GUN || move == LAW || move == WHIP || move == SWORD || move == ROCK || move == DEATH
                    || move == WALL || move == SUN || move == CAMERA || move == FIRE || move == CHAINSAW
                    || move == SCHOOL || move == SCISSORS || move == POISON || move == CAGE || move == AXE
                    || move == PEACE || move == COMPUTER || move == CASTLE || move == SNAKE || move == BLOOD
                    || move == PORCUPINE || move == VULTURE || move == MONKEY || move == KING || move == QUEEN
                    || move == PRINCE || move == DIAMOND || move == PLATINUM || move == GOLD || move == DEVIL
                    || move == FENCE || move == VIDEO_GAME || move == MATH || move == ROBOT || move == HEART
                    || move == ELECTRICITY || move == LIGHTNING || move == MEDUSA || move == POWER || move == LASER
                    || move == NUKE || move == SKY || move == TANK || move == HELICOPTER;
            case LIGHTNING -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == GUN || move == LAW || move == WHIP || move == SWORD || move == ROCK || move == DEATH
                    || move == WALL || move == SUN || move == CAMERA || move == FIRE || move == CHAINSAW
                    || move == SCHOOL || move == SCISSORS || move == POISON || move == CAGE || move == AXE
                    || move == PEACE || move == COMPUTER || move == CASTLE || move == SNAKE || move == BLOOD
                    || move == PORCUPINE || move == VULTURE || move == MONKEY || move == KING || move == QUEEN
                    || move == PRINCE || move == PRINCESS || move == POLICE || move == WOMAN || move == BABY
                    || move == MAN || move == HOME || move == TRAIN || move == CAR || move == NOISE || move == BICYCLE
                    || move == TREE || move == MEDUSA || move == POWER || move == LASER || move == NUKE || move == SKY
                    || move == TANK || move == HELICOPTER;
            case DYNAMITE -> move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN || move == GUN
                    || move == LAW || move == WHIP || move == SWORD || move == ROCK || move == DEATH || move == WALL
                    || move == SUN || move == CAMERA || move == FIRE || move == CHAINSAW || move == SCHOOL
                    || move == SCISSORS || move == POISON || move == CAGE || move == AXE || move == PEACE
                    || move == COMPUTER || move == CASTLE || move == SNAKE || move == BLOOD || move == PORCUPINE
                    || move == VULTURE || move == MONKEY || move == KING || move == QUEEN || move == PRINCE
                    || move == PRINCESS || move == POLICE || move == WOMAN || move == BABY || move == MAN
                    || move == HOME || move == TRAIN || move == CAR || move == NOISE || move == BICYCLE || move == TREE
                    || move == TURNIP || move == DUCK || move == WOLF || move == CAT || move == BIRD || move == FISH
                    || move == SPIDER || move == COCKROACH;
            case TORNADO -> move == QUICKSAND || move == PIT || move == CHAIN || move == GUN || move == LAW
                    || move == WHIP || move == SWORD || move == ROCK || move == DEATH || move == WALL || move == SUN
                    || move == CAMERA || move == FIRE || move == CHAINSAW || move == SCHOOL || move == SCISSORS
                    || move == POISON || move == CAGE || move == AXE || move == PEACE || move == COMPUTER
                    || move == CASTLE || move == SNAKE || move == BLOOD || move == PORCUPINE || move == VULTURE
                    || move == MONKEY || move == KING || move == QUEEN || move == PRINCE || move == PRINCESS
                    || move == POLICE || move == WOMAN || move == BABY || move == MAN || move == HOME || move == TRAIN
                    || move == CAR || move == NOISE || move == BICYCLE || move == TREE || move == TURNIP || move == DUCK
                    || move == WOLF || move == CAT || move == BIRD || move == FISH || move == SPIDER
                    || move == COCKROACH || move == BRAIN || move == AIR;
            case QUICKSAND -> move == PIT || move == CHAIN || move == GUN || move == LAW || move == WHIP
                    || move == SWORD || move == ROCK || move == DEATH || move == WALL || move == SUN || move == CAMERA
                    || move == FIRE || move == CHAINSAW || move == SCHOOL || move == SCISSORS || move == POISON
                    || move == CAGE || move == AXE || move == PEACE || move == COMPUTER || move == CASTLE
                    || move == SNAKE || move == BLOOD || move == PORCUPINE || move == VULTURE || move == MONKEY
                    || move == KING || move == QUEEN || move == PRINCE || move == PRINCESS || move == POLICE
                    || move == WOMAN || move == BABY || move == MAN || move == HOME || move == TRAIN || move == CAR
                    || move == NOISE || move == BICYCLE || move == TREE || move == TURNIP || move == DUCK
                    || move == WOLF || move == CAT || move == BIRD || move == FISH || move == SPIDER
                    || move == COCKROACH || move == BRAIN || move == COMMUNITY;
            case PIT -> move == CHAIN || move == GUN || move == LAW || move == WHIP || move == SWORD || move == ROCK
                    || move == DEATH || move == WALL || move == SUN || move == CAMERA || move == FIRE
                    || move == CHAINSAW || move == SCHOOL || move == SCISSORS || move == POISON || move == CAGE
                    || move == AXE || move == PEACE || move == COMPUTER || move == CASTLE || move == SNAKE
                    || move == BLOOD || move == PORCUPINE || move == VULTURE || move == MONKEY || move == KING
                    || move == QUEEN || move == PRINCE || move == PRINCESS || move == POLICE || move == WOMAN
                    || move == BABY || move == MAN || move == HOME || move == TRAIN || move == CAR || move == NOISE
                    || move == BICYCLE || move == TREE || move == TURNIP || move == DUCK || move == WOLF || move == CAT
                    || move == BIRD || move == FISH || move == SPIDER || move == COCKROACH || move == BRAIN
                    || move == COMMUNITY || move == CROSS;
            case CHAIN -> move == GUN || move == LAW || move == WHIP || move == SWORD || move == ROCK || move == DEATH
                    || move == WALL || move == SUN || move == CAMERA || move == FIRE || move == CHAINSAW
                    || move == SCHOOL || move == SCISSORS || move == POISON || move == CAGE || move == AXE
                    || move == PEACE || move == COMPUTER || move == CASTLE || move == SNAKE || move == BLOOD
                    || move == PORCUPINE || move == VULTURE || move == MONKEY || move == KING || move == QUEEN
                    || move == PRINCE || move == PRINCESS || move == POLICE || move == WOMAN || move == BABY
                    || move == MAN || move == HOME || move == TRAIN || move == CAR || move == NOISE || move == BICYCLE
                    || move == TREE || move == TURNIP || move == DUCK || move == WOLF || move == CAT || move == BIRD
                    || move == FISH || move == SPIDER || move == COCKROACH || move == BRAIN || move == COMMUNITY
                    || move == CROSS || move == MONEY;
            case LAW -> move == WHIP || move == SWORD || move == ROCK || move == DEATH || move == WALL || move == SUN
                    || move == CAMERA || move == FIRE || move == CHAINSAW || move == SCISSORS || move == POISON
                    || move == CAGE || move == AXE || move == PEACE || move == COMPUTER || move == CASTLE
                    || move == SNAKE || move == BLOOD || move == PORCUPINE || move == VULTURE || move == MONKEY
                    || move == KING || move == QUEEN || move == PRINCE || move == PRINCESS || move == POLICE
                    || move == WOMAN || move == BABY || move == MAN || move == HOME || move == TRAIN || move == CAR
                    || move == NOISE || move == BICYCLE || move == TREE || move == TURNIP || move == DUCK
                    || move == WOLF || move == CAT || move == BIRD || move == FISH || move == SPIDER
                    || move == COCKROACH || move == BRAIN || move == COMMUNITY || move == CROSS || move == MONEY
                    || move == VAMPIRE || move == SPONGE;
            case WHIP -> move == SWORD || move == ROCK || move == DEATH || move == WALL || move == SUN || move == CAMERA
                    || move == FIRE || move == CHAINSAW || move == SCHOOL || move == SCISSORS || move == POISON
                    || move == CAGE || move == AXE || move == PEACE || move == COMPUTER || move == CASTLE
                    || move == SNAKE || move == BLOOD || move == PORCUPINE || move == VULTURE || move == MONKEY
                    || move == KING || move == QUEEN || move == PRINCE || move == PRINCESS || move == POLICE
                    || move == WOMAN || move == BABY || move == MAN || move == HOME || move == TRAIN || move == CAR
                    || move == NOISE || move == BICYCLE || move == TREE || move == TURNIP || move == DUCK
                    || move == WOLF || move == CAT || move == BIRD || move == FISH || move == SPIDER || move == BRAIN
                    || move == COMMUNITY || move == CROSS || move == MONEY || move == VAMPIRE || move == SPONGE
                    || move == CHURCH;
            case SWORD -> move == ROCK || move == DEATH || move == WALL || move == SUN || move == CAMERA || move == FIRE
                    || move == CHAINSAW || move == SCHOOL || move == SCISSORS || move == POISON || move == CAGE
                    || move == AXE || move == PEACE || move == COMPUTER || move == CASTLE || move == SNAKE
                    || move == BLOOD || move == PORCUPINE || move == VULTURE || move == MONKEY || move == KING
                    || move == QUEEN || move == PRINCE || move == PRINCESS || move == POLICE || move == WOMAN
                    || move == BABY || move == MAN || move == HOME || move == TRAIN || move == CAR || move == NOISE
                    || move == BICYCLE || move == TREE || move == TURNIP || move == DUCK || move == WOLF || move == CAT
                    || move == BIRD || move == FISH || move == SPIDER || move == COCKROACH || move == BRAIN
                    || move == COMMUNITY || move == CROSS || move == MONEY || move == VAMPIRE || move == SPONGE
                    || move == CHURCH || move == BUTTER;
            case DEATH -> move == WALL || move == SUN || move == CAMERA || move == FIRE || move == CHAINSAW
                    || move == SCHOOL || move == SCISSORS || move == CAGE || move == AXE || move == PEACE
                    || move == COMPUTER || move == CASTLE || move == SNAKE || move == BLOOD || move == PORCUPINE
                    || move == VULTURE || move == MONKEY || move == KING || move == QUEEN || move == PRINCE
                    || move == PRINCESS || move == POLICE || move == WOMAN || move == BABY || move == MAN
                    || move == HOME || move == TRAIN || move == CAR || move == NOISE || move == BICYCLE || move == TREE
                    || move == TURNIP || move == DUCK || move == WOLF || move == CAT || move == BIRD || move == FISH
                    || move == SPIDER || move == COCKROACH || move == BRAIN || move == COMMUNITY || move == CROSS
                    || move == MONEY || move == VAMPIRE || move == SPONGE || move == CHURCH || move == BUTTER
                    || move == BOOK || move == PAPER;
            case WALL -> move == SUN || move == CAMERA || move == FIRE || move == CHAINSAW || move == SCHOOL
                    || move == SCISSORS || move == POISON || move == CAGE || move == AXE || move == PEACE
                    || move == COMPUTER || move == CASTLE || move == SNAKE || move == BLOOD || move == PORCUPINE
                    || move == VULTURE || move == MONKEY || move == KING || move == QUEEN || move == PRINCE
                    || move == PRINCESS || move == POLICE || move == WOMAN || move == BABY || move == MAN
                    || move == HOME || move == TRAIN || move == CAR || move == NOISE || move == BICYCLE || move == TREE
                    || move == TURNIP || move == DUCK || move == WOLF || move == CAT || move == BIRD || move == FISH
                    || move == SPIDER || move == COCKROACH || move == BRAIN || move == COMMUNITY || move == CROSS
                    || move == MONEY || move == VAMPIRE || move == SPONGE || move == CHURCH || move == BUTTER
                    || move == BOOK || move == PAPER || move == CLOUD;
            case SUN -> move == CAMERA || move == FIRE || move == CHAINSAW || move == SCHOOL || move == SCISSORS
                    || move == POISON || move == CAGE || move == AXE || move == PEACE || move == COMPUTER
                    || move == CASTLE || move == SNAKE || move == BLOOD || move == PORCUPINE || move == VULTURE
                    || move == MONKEY || move == KING || move == QUEEN || move == PRINCE || move == PRINCESS
                    || move == POLICE || move == WOMAN || move == BABY || move == MAN || move == HOME || move == TRAIN
                    || move == CAR || move == NOISE || move == BICYCLE || move == TREE || move == TURNIP || move == DUCK
                    || move == WOLF || move == CAT || move == BIRD || move == FISH || move == SPIDER
                    || move == COCKROACH || move == BRAIN || move == COMMUNITY || move == CROSS || move == MONEY
                    || move == VAMPIRE || move == SPONGE || move == CHURCH || move == BUTTER || move == BOOK
                    || move == PAPER || move == CLOUD || move == AIRPLANE;
            case CAMERA -> move == FIRE || move == CHAINSAW || move == SCHOOL || move == SCISSORS || move == POISON
                    || move == CAGE || move == AXE || move == PEACE || move == COMPUTER || move == CASTLE
                    || move == SNAKE || move == BLOOD || move == PORCUPINE || move == VULTURE || move == MONKEY
                    || move == KING || move == QUEEN || move == PRINCE || move == PRINCESS || move == POLICE
                    || move == WOMAN || move == BABY || move == MAN || move == HOME || move == TRAIN || move == CAR
                    || move == NOISE || move == BICYCLE || move == TREE || move == TURNIP || move == DUCK
                    || move == WOLF || move == CAT || move == BIRD || move == FISH || move == SPIDER
                    || move == COCKROACH || move == BRAIN || move == COMMUNITY || move == MONEY || move == VAMPIRE
                    || move == SPONGE || move == CHURCH || move == BUTTER || move == BOOK || move == PAPER
                    || move == CLOUD || move == AIRPLANE || move == MOON;
            case CHAINSAW -> move == SCHOOL || move == SCISSORS || move == POISON || move == CAGE || move == AXE
                    || move == PEACE || move == COMPUTER || move == CASTLE || move == SNAKE || move == BLOOD
                    || move == PORCUPINE || move == VULTURE || move == MONKEY || move == KING || move == QUEEN
                    || move == PRINCE || move == PRINCESS || move == POLICE || move == WOMAN || move == BABY
                    || move == MAN || move == HOME || move == TRAIN || move == CAR || move == NOISE || move == BICYCLE
                    || move == TREE || move == TURNIP || move == DUCK || move == WOLF || move == CAT || move == BIRD
                    || move == FISH || move == SPIDER || move == COCKROACH || move == BRAIN || move == COMMUNITY
                    || move == CROSS || move == MONEY || move == VAMPIRE || move == SPONGE || move == CHURCH
                    || move == BUTTER || move == BOOK || move == PAPER || move == CLOUD || move == AIRPLANE
                    || move == GRASS || move == FILM;
            case SCHOOL -> move == SCISSORS || move == POISON || move == CAGE || move == AXE || move == PEACE
                    || move == COMPUTER || move == CASTLE || move == SNAKE || move == BLOOD || move == PORCUPINE
                    || move == VULTURE || move == MONKEY || move == KING || move == QUEEN || move == PRINCE
                    || move == PRINCESS || move == POLICE || move == WOMAN || move == BABY || move == MAN
                    || move == HOME || move == CAR || move == NOISE || move == BICYCLE || move == TREE || move == TURNIP
                    || move == DUCK || move == WOLF || move == CAT || move == BIRD || move == FISH || move == SPIDER
                    || move == COCKROACH || move == BRAIN || move == COMMUNITY || move == CROSS || move == MONEY
                    || move == VAMPIRE || move == SPONGE || move == CHURCH || move == BUTTER || move == BOOK
                    || move == PAPER || move == CLOUD || move == AIRPLANE || move == MOON || move == GRASS
                    || move == FILM || move == TOILET;
            case POISON -> move == CAGE || move == AXE || move == PEACE || move == COMPUTER || move == CASTLE
                    || move == SNAKE || move == BLOOD || move == PORCUPINE || move == VULTURE || move == MONKEY
                    || move == KING || move == QUEEN || move == PRINCE || move == PRINCESS || move == POLICE
                    || move == WOMAN || move == BABY || move == MAN || move == HOME || move == TRAIN || move == CAR
                    || move == NOISE || move == BICYCLE || move == TREE || move == TURNIP || move == DUCK
                    || move == WOLF || move == CAT || move == BIRD || move == FISH || move == SPIDER
                    || move == COCKROACH || move == BRAIN || move == COMMUNITY || move == CROSS || move == MONEY
                    || move == VAMPIRE || move == SPONGE || move == CHURCH || move == BUTTER || move == BOOK
                    || move == PAPER || move == CLOUD || move == AIRPLANE || move == GRASS || move == FILM
                    || move == TOILET || move == PLANET || move == RAIN;
            case CAGE -> move == AXE || move == PEACE || move == COMPUTER || move == CASTLE || move == SNAKE
                    || move == BLOOD || move == PORCUPINE || move == VULTURE || move == MONKEY || move == KING
                    || move == QUEEN || move == PRINCE || move == PRINCESS || move == POLICE || move == WOMAN
                    || move == BABY || move == MAN || move == HOME || move == TRAIN || move == CAR || move == NOISE
                    || move == BICYCLE || move == TREE || move == TURNIP || move == DUCK || move == WOLF || move == CAT
                    || move == BIRD || move == FISH || move == SPIDER || move == COCKROACH || move == BRAIN
                    || move == COMMUNITY || move == CROSS || move == MONEY || move == VAMPIRE || move == SPONGE
                    || move == CHURCH || move == BUTTER || move == BOOK || move == PAPER || move == AIRPLANE
                    || move == GRASS || move == FILM || move == TOILET || move == AIR || move == PLANET
                    || move == GUITAR;
            case AXE -> move == PEACE || move == COMPUTER || move == CASTLE || move == SNAKE || move == BLOOD
                    || move == PORCUPINE || move == VULTURE || move == MONKEY || move == KING || move == QUEEN
                    || move == PRINCE || move == PRINCESS || move == POLICE || move == WOMAN || move == BABY
                    || move == MAN || move == HOME || move == TRAIN || move == CAR || move == NOISE || move == BICYCLE
                    || move == TREE || move == TURNIP || move == DUCK || move == WOLF || move == CAT || move == BIRD
                    || move == FISH || move == SPIDER || move == COCKROACH || move == BRAIN || move == COMMUNITY
                    || move == CROSS || move == MONEY || move == VAMPIRE || move == SPONGE || move == CHURCH
                    || move == BUTTER || move == BOOK || move == PAPER || move == CLOUD || move == AIRPLANE
                    || move == MOON || move == GRASS || move == FILM || move == TOILET || move == AIR || move == PLANET
                    || move == GUITAR || move == BOWL;
            case PEACE -> move == COMPUTER || move == CASTLE || move == SNAKE || move == BLOOD || move == PORCUPINE
                    || move == VULTURE || move == MONKEY || move == KING || move == QUEEN || move == PRINCE
                    || move == PRINCESS || move == POLICE || move == WOMAN || move == BABY || move == MAN
                    || move == HOME || move == TRAIN || move == CAR || move == NOISE || move == BICYCLE || move == TREE
                    || move == TURNIP || move == DUCK || move == WOLF || move == CAT || move == BIRD || move == FISH
                    || move == SPIDER || move == COCKROACH || move == BRAIN || move == COMMUNITY || move == CROSS
                    || move == MONEY || move == VAMPIRE || move == SPONGE || move == CHURCH || move == BUTTER
                    || move == BOOK || move == PAPER || move == CLOUD || move == AIRPLANE || move == GRASS
                    || move == FILM || move == TOILET || move == AIR || move == PLANET || move == GUITAR || move == BOWL
                    || move == CUP;
            case COMPUTER -> move == CASTLE || move == SNAKE || move == BLOOD || move == PORCUPINE || move == VULTURE
                    || move == MONKEY || move == KING || move == QUEEN || move == PRINCE || move == PRINCESS
                    || move == POLICE || move == WOMAN || move == BABY || move == MAN || move == HOME || move == TRAIN
                    || move == CAR || move == NOISE || move == BICYCLE || move == TREE || move == TURNIP || move == DUCK
                    || move == WOLF || move == CAT || move == BIRD || move == FISH || move == SPIDER
                    || move == COCKROACH || move == BRAIN || move == COMMUNITY || move == CROSS || move == MONEY
                    || move == VAMPIRE || move == SPONGE || move == CHURCH || move == BUTTER || move == BOOK
                    || move == PAPER || move == CLOUD || move == AIRPLANE || move == MOON || move == GRASS
                    || move == FILM || move == TOILET || move == AIR || move == PLANET || move == GUITAR || move == BOWL
                    || move == CUP || move == BEER;
            case CASTLE -> move == SNAKE || move == BLOOD || move == PORCUPINE || move == VULTURE || move == MONKEY
                    || move == KING || move == QUEEN || move == PRINCE || move == PRINCESS || move == POLICE
                    || move == WOMAN || move == BABY || move == MAN || move == HOME || move == TRAIN || move == CAR
                    || move == NOISE || move == BICYCLE || move == TREE || move == TURNIP || move == DUCK
                    || move == WOLF || move == CAT || move == BIRD || move == FISH || move == SPIDER
                    || move == COCKROACH || move == BRAIN || move == COMMUNITY || move == CROSS || move == MONEY
                    || move == VAMPIRE || move == SPONGE || move == CHURCH || move == BUTTER || move == BOOK
                    || move == PAPER || move == AIRPLANE || move == MOON || move == GRASS || move == FILM
                    || move == TOILET || move == AIR || move == PLANET || move == GUITAR || move == BOWL || move == CUP
                    || move == BEER || move == RAIN;
            case BLOOD -> move == PORCUPINE || move == VULTURE || move == MONKEY || move == KING || move == QUEEN
                    || move == PRINCE || move == PRINCESS || move == POLICE || move == WOMAN || move == BABY
                    || move == MAN || move == HOME || move == TRAIN || move == CAR || move == NOISE || move == BICYCLE
                    || move == TREE || move == TURNIP || move == DUCK || move == WOLF || move == CAT || move == BIRD
                    || move == FISH || move == SPIDER || move == COCKROACH || move == BRAIN || move == COMMUNITY
                    || move == CROSS || move == MONEY || move == VAMPIRE || move == SPONGE || move == CHURCH
                    || move == BUTTER || move == BOOK || move == PAPER || move == CLOUD || move == AIRPLANE
                    || move == MOON || move == GRASS || move == FILM || move == TOILET || move == AIR || move == PLANET
                    || move == GUITAR || move == BOWL || move == CUP || move == BEER || move == RAIN || move == WATER
                    || move == TV;
            case PORCUPINE -> move == VULTURE || move == MONKEY || move == KING || move == QUEEN || move == PRINCE
                    || move == PRINCESS || move == POLICE || move == WOMAN || move == BABY || move == MAN
                    || move == HOME || move == TRAIN || move == CAR || move == NOISE || move == BICYCLE
                    || move == TURNIP || move == DUCK || move == WOLF || move == CAT || move == BIRD || move == FISH
                    || move == SPIDER || move == COCKROACH || move == BRAIN || move == COMMUNITY || move == CROSS
                    || move == MONEY || move == VAMPIRE || move == SPONGE || move == CHURCH || move == BUTTER
                    || move == BOOK || move == PAPER || move == CLOUD || move == AIRPLANE || move == MOON
                    || move == GRASS || move == FILM || move == TOILET || move == AIR || move == PLANET
                    || move == GUITAR || move == BOWL || move == CUP || move == BEER || move == RAIN || move == WATER
                    || move == TV || move == RAINBOW;
            case VULTURE -> move == MONKEY || move == KING || move == QUEEN || move == PRINCE || move == PRINCESS
                    || move == POLICE || move == WOMAN || move == BABY || move == MAN || move == HOME || move == TRAIN
                    || move == CAR || move == NOISE || move == BICYCLE || move == TREE || move == TURNIP || move == DUCK
                    || move == WOLF || move == CAT || move == BIRD || move == FISH || move == SPIDER
                    || move == COCKROACH || move == BRAIN || move == COMMUNITY || move == CROSS || move == MONEY
                    || move == VAMPIRE || move == SPONGE || move == CHURCH || move == BUTTER || move == BOOK
                    || move == PAPER || move == AIRPLANE || move == MOON || move == GRASS || move == FILM
                    || move == TOILET || move == AIR || move == PLANET || move == GUITAR || move == BOWL || move == CUP
                    || move == BEER || move == RAIN || move == WATER || move == TV || move == RAINBOW || move == UFO;
            case MONKEY -> move == KING || move == QUEEN || move == PRINCE || move == PRINCESS || move == POLICE
                    || move == WOMAN || move == BABY || move == MAN || move == HOME || move == TRAIN || move == CAR
                    || move == NOISE || move == BICYCLE || move == TREE || move == TURNIP || move == DUCK
                    || move == WOLF || move == CAT || move == BIRD || move == FISH || move == SPIDER
                    || move == COCKROACH || move == BRAIN || move == COMMUNITY || move == CROSS || move == MONEY
                    || move == VAMPIRE || move == SPONGE || move == CHURCH || move == BUTTER || move == BOOK
                    || move == PAPER || move == CLOUD || move == AIRPLANE || move == MOON || move == GRASS
                    || move == FILM || move == TOILET || move == AIR || move == PLANET || move == GUITAR || move == BOWL
                    || move == CUP || move == BEER || move == RAIN || move == WATER || move == TV || move == RAINBOW
                    || move == UFO || move == ALIEN;
            case KING -> move == QUEEN || move == PRINCE || move == PRINCESS || move == POLICE || move == WOMAN
                    || move == BABY || move == MAN || move == HOME || move == TRAIN || move == CAR || move == NOISE
                    || move == BICYCLE || move == TREE || move == TURNIP || move == DUCK || move == WOLF || move == CAT
                    || move == BIRD || move == FISH || move == SPIDER || move == COCKROACH || move == BRAIN
                    || move == COMMUNITY || move == CROSS || move == MONEY || move == VAMPIRE || move == SPONGE
                    || move == CHURCH || move == BUTTER || move == BOOK || move == PAPER || move == CLOUD
                    || move == AIRPLANE || move == MOON || move == GRASS || move == FILM || move == TOILET
                    || move == AIR || move == PLANET || move == GUITAR || move == BOWL || move == CUP || move == BEER
                    || move == RAIN || move == WATER || move == TV || move == RAINBOW || move == UFO || move == ALIEN
                    || move == PRAYER;
            case QUEEN -> move == PRINCE || move == PRINCESS || move == POLICE || move == WOMAN || move == BABY
                    || move == MAN || move == HOME || move == TRAIN || move == CAR || move == NOISE || move == BICYCLE
                    || move == TREE || move == TURNIP || move == DUCK || move == WOLF || move == CAT || move == BIRD
                    || move == FISH || move == SPIDER || move == COCKROACH || move == BRAIN || move == COMMUNITY
                    || move == CROSS || move == MONEY || move == VAMPIRE || move == SPONGE || move == CHURCH
                    || move == BUTTER || move == BOOK || move == PAPER || move == CLOUD || move == AIRPLANE
                    || move == MOON || move == GRASS || move == FILM || move == TOILET || move == AIR || move == PLANET
                    || move == GUITAR || move == BOWL || move == CUP || move == BEER || move == RAIN || move == WATER
                    || move == TV || move == RAINBOW || move == UFO || move == ALIEN || move == PRAYER
                    || move == MOUNTAIN;
            case PRINCE -> move == PRINCESS || move == POLICE || move == WOMAN || move == BABY || move == MAN
                    || move == HOME || move == TRAIN || move == CAR || move == NOISE || move == BICYCLE || move == TREE
                    || move == TURNIP || move == DUCK || move == WOLF || move == CAT || move == BIRD || move == FISH
                    || move == SPIDER || move == COCKROACH || move == BRAIN || move == COMMUNITY || move == CROSS
                    || move == MONEY || move == VAMPIRE || move == SPONGE || move == CHURCH || move == BUTTER
                    || move == BOOK || move == PAPER || move == CLOUD || move == AIRPLANE || move == MOON
                    || move == GRASS || move == FILM || move == TOILET || move == AIR || move == PLANET
                    || move == GUITAR || move == BOWL || move == CUP || move == BEER || move == RAIN || move == WATER
                    || move == TV || move == RAINBOW || move == UFO || move == ALIEN || move == PRAYER
                    || move == MOUNTAIN || move == SATAN;
            case PRINCESS -> move == POLICE || move == WOMAN || move == BABY || move == MAN || move == HOME
                    || move == TRAIN || move == CAR || move == NOISE || move == BICYCLE || move == TREE
                    || move == TURNIP || move == DUCK || move == WOLF || move == CAT || move == BIRD || move == FISH
                    || move == SPIDER || move == COCKROACH || move == BRAIN || move == COMMUNITY || move == CROSS
                    || move == MONEY || move == VAMPIRE || move == SPONGE || move == CHURCH || move == BUTTER
                    || move == BOOK || move == PAPER || move == CLOUD || move == AIRPLANE || move == MOON
                    || move == GRASS || move == FILM || move == TOILET || move == AIR || move == PLANET
                    || move == GUITAR || move == BOWL || move == CUP || move == BEER || move == RAIN || move == WATER
                    || move == TV || move == RAINBOW || move == UFO || move == ALIEN || move == PRAYER
                    || move == MOUNTAIN || move == SATAN || move == DRAGON;
            case POLICE -> move == WOMAN || move == BABY || move == MAN || move == HOME || move == TRAIN || move == CAR
                    || move == BICYCLE || move == TREE || move == TURNIP || move == DUCK || move == WOLF || move == CAT
                    || move == BIRD || move == FISH || move == SPIDER || move == COCKROACH || move == BRAIN
                    || move == COMMUNITY || move == CROSS || move == MONEY || move == VAMPIRE || move == SPONGE
                    || move == CHURCH || move == BUTTER || move == CLOUD || move == AIRPLANE || move == MOON
                    || move == GRASS || move == FILM || move == TOILET || move == AIR || move == PLANET
                    || move == GUITAR || move == BOWL || move == CUP || move == BEER || move == RAIN || move == WATER
                    || move == TV || move == RAINBOW || move == UFO || move == ALIEN || move == PRAYER
                    || move == MOUNTAIN || move == SATAN || move == DRAGON || move == DIAMOND;
            case WOMAN -> move == BABY || move == MAN || move == HOME || move == TRAIN || move == CAR || move == NOISE
                    || move == BICYCLE || move == TREE || move == TURNIP || move == DUCK || move == WOLF || move == CAT
                    || move == BIRD || move == FISH || move == SPIDER || move == COCKROACH || move == BRAIN
                    || move == COMMUNITY || move == CROSS || move == MONEY || move == VAMPIRE || move == SPONGE
                    || move == CHURCH || move == BUTTER || move == BOOK || move == PAPER || move == CLOUD
                    || move == AIRPLANE || move == MOON || move == GRASS || move == FILM || move == TOILET
                    || move == AIR || move == PLANET || move == GUITAR || move == BOWL || move == CUP || move == BEER
                    || move == RAIN || move == WATER || move == TV || move == RAINBOW || move == UFO || move == ALIEN
                    || move == PRAYER || move == MOUNTAIN || move == SATAN || move == DRAGON || move == DIAMOND
                    || move == PLATINUM;
            case BABY -> move == MAN || move == HOME || move == TRAIN || move == CAR || move == NOISE || move == BICYCLE
                    || move == TREE || move == TURNIP || move == DUCK || move == WOLF || move == CAT || move == BIRD
                    || move == FISH || move == SPIDER || move == COCKROACH || move == BRAIN || move == COMMUNITY
                    || move == CROSS || move == MONEY || move == VAMPIRE || move == SPONGE || move == CHURCH
                    || move == BUTTER || move == BOOK || move == PAPER || move == CLOUD || move == AIRPLANE
                    || move == MOON || move == GRASS || move == FILM || move == TOILET || move == AIR || move == PLANET
                    || move == GUITAR || move == BOWL || move == CUP || move == BEER || move == RAIN || move == WATER
                    || move == TV || move == RAINBOW || move == UFO || move == ALIEN || move == PRAYER
                    || move == MOUNTAIN || move == SATAN || move == DRAGON || move == DIAMOND || move == PLATINUM
                    || move == GOLD;
            case HOME -> move == TRAIN || move == CAR || move == NOISE || move == BICYCLE || move == TREE
                    || move == TURNIP || move == DUCK || move == WOLF || move == CAT || move == BIRD || move == FISH
                    || move == SPIDER || move == COCKROACH || move == COMMUNITY || move == CROSS || move == MONEY
                    || move == VAMPIRE || move == SPONGE || move == CHURCH || move == BUTTER || move == BOOK
                    || move == PAPER || move == CLOUD || move == AIRPLANE || move == MOON || move == GRASS
                    || move == FILM || move == TOILET || move == AIR || move == PLANET || move == GUITAR || move == BOWL
                    || move == CUP || move == BEER || move == RAIN || move == WATER || move == TV || move == RAINBOW
                    || move == UFO || move == ALIEN || move == PRAYER || move == MOUNTAIN || move == SATAN
                    || move == DRAGON || move == DIAMOND || move == PLATINUM || move == GOLD || move == DEVIL
                    || move == FENCE;
            case TRAIN -> move == CAR || move == NOISE || move == BICYCLE || move == TREE || move == TURNIP
                    || move == DUCK || move == WOLF || move == CAT || move == BIRD || move == FISH || move == SPIDER
                    || move == COCKROACH || move == COMMUNITY || move == MONEY || move == VAMPIRE || move == SPONGE
                    || move == CHURCH || move == BUTTER || move == BOOK || move == PAPER || move == CLOUD
                    || move == AIRPLANE || move == MOON || move == GRASS || move == FILM || move == TOILET
                    || move == AIR || move == PLANET || move == GUITAR || move == BOWL || move == CUP || move == BEER
                    || move == RAIN || move == WATER || move == TV || move == RAINBOW || move == UFO || move == ALIEN
                    || move == PRAYER || move == MOUNTAIN || move == SATAN || move == DRAGON || move == DIAMOND
                    || move == PLATINUM || move == GOLD || move == DEVIL || move == FENCE || move == VIDEO_GAME;
            case CAR -> move == NOISE || move == BICYCLE || move == TREE || move == TURNIP || move == DUCK
                    || move == WOLF || move == CAT || move == BIRD || move == FISH || move == SPIDER
                    || move == COCKROACH || move == COMMUNITY || move == MONEY || move == VAMPIRE || move == SPONGE
                    || move == CHURCH || move == BUTTER || move == BOOK || move == CLOUD || move == AIRPLANE
                    || move == MOON || move == GRASS || move == FILM || move == TOILET || move == AIR || move == PLANET
                    || move == GUITAR || move == BOWL || move == CUP || move == BEER || move == RAIN || move == WATER
                    || move == TV || move == RAINBOW || move == UFO || move == ALIEN || move == PRAYER
                    || move == MOUNTAIN || move == SATAN || move == DRAGON || move == DIAMOND || move == PLATINUM
                    || move == GOLD || move == DEVIL || move == FENCE || move == VIDEO_GAME || move == MATH;
            case NOISE -> move == BICYCLE || move == TREE || move == TURNIP || move == DUCK || move == WOLF
                    || move == CAT || move == BIRD || move == FISH || move == SPIDER || move == COCKROACH
                    || move == BRAIN || move == COMMUNITY || move == CROSS || move == MONEY || move == VAMPIRE
                    || move == SPONGE || move == CHURCH || move == BUTTER || move == BOOK || move == PAPER
                    || move == CLOUD || move == AIRPLANE || move == MOON || move == GRASS || move == FILM
                    || move == TOILET || move == AIR || move == PLANET || move == GUITAR || move == BOWL || move == CUP
                    || move == BEER || move == RAIN || move == WATER || move == TV || move == RAINBOW || move == UFO
                    || move == ALIEN || move == PRAYER || move == MOUNTAIN || move == SATAN || move == DRAGON
                    || move == DIAMOND || move == PLATINUM || move == GOLD || move == DEVIL || move == FENCE
                    || move == VIDEO_GAME || move == MATH || move == ROBOT;
            case BICYCLE -> move == TREE || move == TURNIP || move == DUCK || move == WOLF || move == CAT
                    || move == BIRD || move == FISH || move == SPIDER || move == COCKROACH || move == BRAIN
                    || move == COMMUNITY || move == MONEY || move == VAMPIRE || move == SPONGE || move == CHURCH
                    || move == BUTTER || move == BOOK || move == PAPER || move == CLOUD || move == AIRPLANE
                    || move == MOON || move == GRASS || move == FILM || move == TOILET || move == AIR || move == PLANET
                    || move == GUITAR || move == BOWL || move == CUP || move == BEER || move == RAIN || move == WATER
                    || move == TV || move == RAINBOW || move == UFO || move == ALIEN || move == PRAYER
                    || move == MOUNTAIN || move == SATAN || move == DRAGON || move == DIAMOND || move == PLATINUM
                    || move == GOLD || move == DEVIL || move == FENCE || move == VIDEO_GAME || move == MATH
                    || move == ROBOT || move == HEART;
            case TURNIP -> move == DUCK || move == WOLF || move == CAT || move == BIRD || move == FISH || move == SPIDER
                    || move == COCKROACH || move == BRAIN || move == COMMUNITY || move == CROSS || move == MONEY
                    || move == VAMPIRE || move == SPONGE || move == CHURCH || move == BUTTER || move == BOOK
                    || move == PAPER || move == CLOUD || move == AIRPLANE || move == MOON || move == GRASS
                    || move == FILM || move == TOILET || move == AIR || move == PLANET || move == GUITAR || move == BOWL
                    || move == CUP || move == BEER || move == RAIN || move == WATER || move == TV || move == RAINBOW
                    || move == UFO || move == ALIEN || move == PRAYER || move == MOUNTAIN || move == SATAN
                    || move == DRAGON || move == DIAMOND || move == PLATINUM || move == GOLD || move == DEVIL
                    || move == FENCE || move == VIDEO_GAME || move == MATH || move == ROBOT || move == HEART
                    || move == ELECTRICITY || move == LIGHTNING;
            case DUCK -> move == WOLF || move == CAT || move == BIRD || move == FISH || move == SPIDER
                    || move == COCKROACH || move == BRAIN || move == COMMUNITY || move == CROSS || move == MONEY
                    || move == VAMPIRE || move == SPONGE || move == CHURCH || move == BUTTER || move == BOOK
                    || move == PAPER || move == CLOUD || move == AIRPLANE || move == MOON || move == GRASS
                    || move == FILM || move == TOILET || move == AIR || move == PLANET || move == GUITAR || move == BOWL
                    || move == CUP || move == BEER || move == RAIN || move == WATER || move == TV || move == RAINBOW
                    || move == UFO || move == ALIEN || move == PRAYER || move == MOUNTAIN || move == SATAN
                    || move == DRAGON || move == DIAMOND || move == PLATINUM || move == GOLD || move == DEVIL
                    || move == FENCE || move == VIDEO_GAME || move == MATH || move == ROBOT || move == HEART
                    || move == ELECTRICITY || move == LIGHTNING || move == MEDUSA;
            case CAT -> move == BIRD || move == FISH || move == SPIDER || move == COCKROACH || move == BRAIN
                    || move == COMMUNITY || move == CROSS || move == MONEY || move == VAMPIRE || move == SPONGE
                    || move == CHURCH || move == BUTTER || move == BOOK || move == PAPER || move == CLOUD
                    || move == AIRPLANE || move == MOON || move == GRASS || move == FILM || move == TOILET
                    || move == AIR || move == PLANET || move == GUITAR || move == BOWL || move == CUP || move == BEER
                    || move == RAIN || move == WATER || move == TV || move == RAINBOW || move == UFO || move == ALIEN
                    || move == PRAYER || move == MOUNTAIN || move == SATAN || move == DRAGON || move == DIAMOND
                    || move == PLATINUM || move == GOLD || move == DEVIL || move == FENCE || move == VIDEO_GAME
                    || move == MATH || move == ROBOT || move == HEART || move == ELECTRICITY || move == LIGHTNING
                    || move == MEDUSA || move == POWER || move == LASER;
            case BIRD -> move == PEACE || move == FISH || move == SPIDER || move == COCKROACH || move == BRAIN
                    || move == COMMUNITY || move == CROSS || move == MONEY || move == VAMPIRE || move == SPONGE
                    || move == CHURCH || move == BUTTER || move == BOOK || move == PAPER || move == CLOUD
                    || move == AIRPLANE || move == MOON || move == GRASS || move == FILM || move == TOILET
                    || move == AIR || move == PLANET || move == GUITAR || move == BOWL || move == CUP || move == BEER
                    || move == RAIN || move == WATER || move == TV || move == RAINBOW || move == UFO || move == ALIEN
                    || move == PRAYER || move == MOUNTAIN || move == SATAN || move == DRAGON || move == DIAMOND
                    || move == PLATINUM || move == GOLD || move == DEVIL || move == FENCE || move == VIDEO_GAME
                    || move == MATH || move == ROBOT || move == HEART || move == ELECTRICITY || move == LIGHTNING
                    || move == MEDUSA || move == POWER || move == LASER || move == NUKE;
            case FISH -> move == SPIDER || move == COCKROACH || move == BRAIN || move == COMMUNITY || move == CROSS
                    || move == MONEY || move == VAMPIRE || move == SPONGE || move == CHURCH || move == BUTTER
                    || move == BOOK || move == PAPER || move == CLOUD || move == AIRPLANE || move == MOON
                    || move == GRASS || move == FILM || move == TOILET || move == AIR || move == PLANET
                    || move == GUITAR || move == BOWL || move == CUP || move == BEER || move == RAIN || move == WATER
                    || move == TV || move == RAINBOW || move == UFO || move == ALIEN || move == PRAYER
                    || move == MOUNTAIN || move == SATAN || move == DRAGON || move == PLATINUM || move == GOLD
                    || move == DEVIL || move == FENCE || move == VIDEO_GAME || move == MATH || move == ROBOT
                    || move == HEART || move == ELECTRICITY || move == LIGHTNING || move == MEDUSA || move == POWER
                    || move == LASER || move == NUKE || move == SKY;
            case SPIDER -> move == COCKROACH || move == BRAIN || move == COMMUNITY || move == CROSS || move == MONEY
                    || move == VAMPIRE || move == SPONGE || move == CHURCH || move == BUTTER || move == BOOK
                    || move == PAPER || move == CLOUD || move == AIRPLANE || move == MOON || move == GRASS
                    || move == FILM || move == TOILET || move == AIR || move == PLANET || move == GUITAR || move == BOWL
                    || move == CUP || move == BEER || move == RAIN || move == WATER || move == TV || move == RAINBOW
                    || move == UFO || move == ALIEN || move == PRAYER || move == MOUNTAIN || move == SATAN
                    || move == DRAGON || move == PLATINUM || move == GOLD || move == DEVIL || move == FENCE
                    || move == VIDEO_GAME || move == MATH || move == ROBOT || move == HEART || move == ELECTRICITY
                    || move == LIGHTNING || move == MEDUSA || move == POWER || move == LASER || move == NUKE
                    || move == SKY || move == TANK;
            case COCKROACH -> move == BRAIN || move == COMMUNITY || move == CROSS || move == MONEY || move == VAMPIRE
                    || move == SPONGE || move == CHURCH || move == BUTTER || move == BOOK || move == CLOUD
                    || move == AIRPLANE || move == MOON || move == GRASS || move == FILM || move == TOILET
                    || move == AIR || move == PLANET || move == GUITAR || move == BOWL || move == CUP || move == BEER
                    || move == RAIN || move == WATER || move == TV || move == RAINBOW || move == UFO || move == ALIEN
                    || move == PRAYER || move == MOUNTAIN || move == SATAN || move == DRAGON || move == PLATINUM
                    || move == GOLD || move == FENCE || move == VIDEO_GAME || move == MATH || move == ROBOT
                    || move == HEART || move == ELECTRICITY || move == LIGHTNING || move == MEDUSA || move == POWER
                    || move == LASER || move == NUKE || move == SKY || move == TANK || move == HELICOPTER;
            case BRAIN -> move == DYNAMITE || move == COMMUNITY || move == CROSS || move == MONEY || move == VAMPIRE
                    || move == SPONGE || move == CHURCH || move == BUTTER || move == BOOK || move == PAPER
                    || move == CLOUD || move == AIRPLANE || move == MOON || move == GRASS || move == FILM
                    || move == TOILET || move == AIR || move == PLANET || move == GUITAR || move == BOWL || move == CUP
                    || move == BEER || move == RAIN || move == WATER || move == TV || move == RAINBOW || move == UFO
                    || move == ALIEN || move == PRAYER || move == MOUNTAIN || move == SATAN || move == DRAGON
                    || move == PLATINUM || move == GOLD || move == DEVIL || move == FENCE || move == VIDEO_GAME
                    || move == MATH || move == ROBOT || move == HEART || move == ELECTRICITY || move == LIGHTNING
                    || move == MEDUSA || move == POWER || move == LASER || move == NUKE || move == SKY || move == TANK
                    || move == HELICOPTER;
            case COMMUNITY -> move == DYNAMITE || move == TORNADO || move == CROSS || move == MONEY || move == VAMPIRE
                    || move == SPONGE || move == CHURCH || move == BUTTER || move == CLOUD || move == AIRPLANE
                    || move == MOON || move == GRASS || move == FILM || move == TOILET || move == AIR || move == PLANET
                    || move == GUITAR || move == BOWL || move == CUP || move == BEER || move == RAIN || move == WATER
                    || move == TV || move == RAINBOW || move == UFO || move == ALIEN || move == PRAYER
                    || move == MOUNTAIN || move == SATAN || move == DRAGON || move == PLATINUM || move == GOLD
                    || move == DEVIL || move == FENCE || move == VIDEO_GAME || move == MATH || move == HEART
                    || move == ELECTRICITY || move == LIGHTNING || move == MEDUSA || move == POWER || move == LASER
                    || move == NUKE || move == SKY || move == TANK || move == HELICOPTER;
            case CROSS -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == MONEY || move == VAMPIRE
                    || move == SPONGE || move == CHURCH || move == BUTTER || move == BOOK || move == PAPER
                    || move == AIRPLANE || move == MOON || move == GRASS || move == FILM || move == TOILET
                    || move == AIR || move == PLANET || move == GUITAR || move == BOWL || move == CUP || move == BEER
                    || move == RAIN || move == WATER || move == TV || move == RAINBOW || move == UFO || move == PRAYER
                    || move == MOUNTAIN || move == SATAN || move == DRAGON || move == DIAMOND || move == PLATINUM
                    || move == GOLD || move == DEVIL || move == VIDEO_GAME || move == MATH || move == ROBOT
                    || move == HEART || move == ELECTRICITY || move == LIGHTNING || move == MEDUSA || move == POWER
                    || move == LASER || move == NUKE || move == SKY || move == TANK || move == HELICOPTER;
            case MONEY -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == VAMPIRE
                    || move == SPONGE || move == CHURCH || move == BOOK || move == AIRPLANE || move == MOON
                    || move == GRASS || move == FILM || move == TOILET || move == AIR || move == PLANET
                    || move == GUITAR || move == BOWL || move == CUP || move == BEER || move == RAIN || move == WATER
                    || move == TV || move == RAINBOW || move == UFO || move == ALIEN || move == PRAYER
                    || move == MOUNTAIN || move == SATAN || move == DRAGON || move == DIAMOND || move == PLATINUM
                    || move == GOLD || move == FENCE || move == VIDEO_GAME || move == MATH || move == ROBOT
                    || move == HEART || move == ELECTRICITY || move == LIGHTNING || move == MEDUSA || move == POWER
                    || move == LASER || move == NUKE || move == SKY || move == TANK || move == HELICOPTER;
            case VAMPIRE -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == SPONGE || move == CHURCH || move == BUTTER || move == BOOK || move == PAPER
                    || move == CLOUD || move == AIRPLANE || move == MOON || move == GRASS || move == FILM
                    || move == TOILET || move == AIR || move == PLANET || move == GUITAR || move == BOWL || move == CUP
                    || move == BEER || move == RAIN || move == WATER || move == TV || move == RAINBOW || move == UFO
                    || move == ALIEN || move == PRAYER || move == MOUNTAIN || move == SATAN || move == DRAGON
                    || move == DIAMOND || move == PLATINUM || move == GOLD || move == DEVIL || move == FENCE
                    || move == VIDEO_GAME || move == MATH || move == ROBOT || move == HEART || move == ELECTRICITY
                    || move == LIGHTNING || move == MEDUSA || move == POWER || move == LASER || move == NUKE
                    || move == SKY || move == TANK || move == HELICOPTER;
            case CHURCH -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == GUN || move == LAW || move == BUTTER || move == BOOK || move == PAPER || move == CLOUD
                    || move == AIRPLANE || move == MOON || move == GRASS || move == FILM || move == TOILET
                    || move == AIR || move == PLANET || move == GUITAR || move == BOWL || move == CUP || move == BEER
                    || move == RAIN || move == WATER || move == TV || move == RAINBOW || move == UFO || move == ALIEN
                    || move == PRAYER || move == MOUNTAIN || move == SATAN || move == DRAGON || move == DIAMOND
                    || move == PLATINUM || move == GOLD || move == DEVIL || move == FENCE || move == VIDEO_GAME
                    || move == MATH || move == ROBOT || move == HEART || move == ELECTRICITY || move == LIGHTNING
                    || move == MEDUSA || move == POWER || move == LASER || move == NUKE || move == SKY || move == TANK
                    || move == HELICOPTER;
            case BUTTER -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == GUN || move == LAW || move == WHIP || move == BOOK || move == PAPER || move == CLOUD
                    || move == AIRPLANE || move == MOON || move == GRASS || move == FILM || move == TOILET
                    || move == AIR || move == PLANET || move == GUITAR || move == BOWL || move == CUP || move == BEER
                    || move == RAIN || move == WATER || move == TV || move == RAINBOW || move == UFO || move == ALIEN
                    || move == PRAYER || move == MOUNTAIN || move == SATAN || move == DRAGON || move == DIAMOND
                    || move == PLATINUM || move == GOLD || move == DEVIL || move == FENCE || move == VIDEO_GAME
                    || move == MATH || move == ROBOT || move == HEART || move == ELECTRICITY || move == LIGHTNING
                    || move == MEDUSA || move == POWER || move == LASER || move == NUKE || move == TANK
                    || move == HELICOPTER;
            case BOOK -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == LAW || move == WHIP || move == PAPER || move == MOON || move == GRASS || move == FILM
                    || move == TOILET || move == AIR || move == GUITAR || move == BEER || move == RAIN || move == WATER
                    || move == TV || move == RAINBOW || move == PRAYER || move == MOUNTAIN || move == SATAN
                    || move == DRAGON || move == DIAMOND || move == PLATINUM || move == GOLD || move == DEVIL
                    || move == FENCE || move == VIDEO_GAME || move == MATH || move == HEART || move == ELECTRICITY
                    || move == LIGHTNING || move == MEDUSA || move == POWER || move == SKY;
            case CLOUD -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == GUN || move == LAW || move == WHIP || move == SWORD || move == ROCK || move == DEATH
                    || move == AIRPLANE || move == MOON || move == GRASS || move == FILM || move == TOILET
                    || move == AIR || move == PLANET || move == GUITAR || move == BOWL || move == CUP || move == BEER
                    || move == RAIN || move == WATER || move == TV || move == RAINBOW || move == UFO || move == ALIEN
                    || move == PRAYER || move == MOUNTAIN || move == SATAN || move == DRAGON || move == DIAMOND
                    || move == PLATINUM || move == GOLD || move == DEVIL || move == FENCE || move == VIDEO_GAME
                    || move == MATH || move == ROBOT || move == HEART || move == ELECTRICITY || move == LIGHTNING
                    || move == MEDUSA || move == POWER || move == LASER || move == NUKE || move == SKY || move == TANK
                    || move == HELICOPTER;
            case AIRPLANE -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == GUN || move == WHIP || move == SWORD || move == ROCK || move == DEATH || move == WALL
                    || move == MOON || move == GRASS || move == FILM || move == TOILET || move == AIR || move == PLANET
                    || move == GUITAR || move == BOWL || move == CUP || move == BEER || move == RAIN || move == WATER
                    || move == TV || move == RAINBOW || move == UFO || move == ALIEN || move == PRAYER
                    || move == MOUNTAIN || move == SATAN || move == DRAGON || move == DIAMOND || move == PLATINUM
                    || move == GOLD || move == DEVIL || move == FENCE || move == VIDEO_GAME || move == MATH
                    || move == ROBOT || move == HEART || move == ELECTRICITY || move == LIGHTNING || move == MEDUSA
                    || move == POWER || move == LASER || move == NUKE || move == SKY || move == TANK
                    || move == HELICOPTER;
            case MOON -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == GUN || move == WHIP || move == SWORD || move == ROCK || move == DEATH || move == WALL
                    || move == SUN || move == GRASS || move == FILM || move == TOILET || move == AIR || move == PLANET
                    || move == GUITAR || move == BOWL || move == CUP || move == BEER || move == RAIN || move == WATER
                    || move == TV || move == RAINBOW || move == UFO || move == ALIEN || move == PRAYER
                    || move == MOUNTAIN || move == SATAN || move == DRAGON || move == DIAMOND || move == PLATINUM
                    || move == GOLD || move == DEVIL || move == FENCE || move == VIDEO_GAME || move == MATH
                    || move == ELECTRICITY || move == LIGHTNING || move == MEDUSA || move == POWER || move == LASER
                    || move == NUKE || move == SKY || move == TANK || move == HELICOPTER;
            case GRASS -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == GUN || move == LAW || move == WHIP || move == SWORD || move == ROCK || move == DEATH
                    || move == WALL || move == SUN || move == CAMERA || move == FILM || move == TOILET || move == AIR
                    || move == PLANET || move == GUITAR || move == BOWL || move == CUP || move == BEER || move == RAIN
                    || move == WATER || move == TV || move == RAINBOW || move == UFO || move == ALIEN || move == PRAYER
                    || move == MOUNTAIN || move == SATAN || move == DRAGON || move == DIAMOND || move == PLATINUM
                    || move == GOLD || move == DEVIL || move == FENCE || move == VIDEO_GAME || move == MATH
                    || move == ROBOT || move == HEART || move == ELECTRICITY || move == LIGHTNING || move == MEDUSA
                    || move == POWER || move == LASER || move == NUKE || move == SKY || move == TANK
                    || move == HELICOPTER;
            case FILM -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == WHIP || move == SWORD
                    || move == ROCK || move == DEATH || move == WALL || move == SUN || move == CAMERA || move == FIRE
                    || move == TOILET || move == AIR || move == PLANET || move == GUITAR || move == CUP || move == BEER
                    || move == RAIN || move == WATER || move == TV || move == RAINBOW || move == UFO || move == ALIEN
                    || move == PRAYER || move == MOUNTAIN || move == SATAN || move == DRAGON || move == DIAMOND
                    || move == PLATINUM || move == DEVIL || move == FENCE || move == VIDEO_GAME || move == MATH
                    || move == HEART || move == ELECTRICITY || move == LIGHTNING || move == MEDUSA || move == POWER
                    || move == LASER || move == NUKE || move == SKY || move == TANK || move == HELICOPTER;
            case TOILET -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == CHAIN || move == GUN
                    || move == LAW || move == WHIP || move == SWORD || move == ROCK || move == DEATH || move == WALL
                    || move == SUN || move == CAMERA || move == FIRE || move == CHAINSAW || move == AIR
                    || move == PLANET || move == BOWL || move == CUP || move == BEER || move == RAIN || move == WATER
                    || move == TV || move == RAINBOW || move == UFO || move == ALIEN || move == PRAYER
                    || move == MOUNTAIN || move == SATAN || move == DRAGON || move == DIAMOND || move == PLATINUM
                    || move == GOLD || move == DEVIL || move == FENCE || move == VIDEO_GAME || move == MATH
                    || move == HEART || move == ELECTRICITY || move == LIGHTNING || move == MEDUSA || move == POWER
                    || move == LASER || move == NUKE || move == SKY || move == TANK || move == HELICOPTER;
            case PLANET -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == GUN || move == SWORD || move == ROCK || move == DEATH || move == WALL || move == SUN
                    || move == CAMERA || move == FIRE || move == CHAINSAW || move == SCHOOL || move == SCISSORS
                    || move == GUITAR || move == BOWL || move == CUP || move == BEER || move == RAIN || move == WATER
                    || move == TV || move == RAINBOW || move == UFO || move == ALIEN || move == PRAYER
                    || move == MOUNTAIN || move == SATAN || move == DRAGON || move == DIAMOND || move == PLATINUM
                    || move == GOLD || move == DEVIL || move == MATH || move == ELECTRICITY || move == LIGHTNING
                    || move == MEDUSA || move == POWER || move == LASER || move == NUKE || move == SKY || move == TANK
                    || move == HELICOPTER;
            case GUITAR -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == GUN || move == LAW || move == WHIP || move == SWORD || move == ROCK || move == DEATH
                    || move == WALL || move == SUN || move == CAMERA || move == FIRE || move == CHAINSAW
                    || move == SCHOOL || move == SCISSORS || move == BOWL || move == CUP || move == BEER || move == RAIN
                    || move == WATER || move == TV || move == RAINBOW || move == UFO || move == ALIEN || move == PRAYER
                    || move == MOUNTAIN || move == SATAN || move == DRAGON || move == DIAMOND || move == PLATINUM
                    || move == GOLD || move == DEVIL || move == VIDEO_GAME || move == MATH || move == ROBOT
                    || move == HEART || move == ELECTRICITY || move == LIGHTNING || move == MEDUSA || move == POWER
                    || move == LASER || move == NUKE || move == SKY || move == TANK || move == HELICOPTER;
            case BOWL -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == GUN || move == LAW || move == WHIP || move == SWORD || move == ROCK || move == DEATH
                    || move == WALL || move == SUN || move == CAMERA || move == FIRE || move == CHAINSAW
                    || move == SCHOOL || move == SCISSORS || move == POISON || move == CAGE || move == CUP
                    || move == BEER || move == RAIN || move == WATER || move == TV || move == RAINBOW || move == UFO
                    || move == ALIEN || move == PRAYER || move == MOUNTAIN || move == SATAN || move == DRAGON
                    || move == DIAMOND || move == PLATINUM || move == GOLD || move == DEVIL || move == VIDEO_GAME
                    || move == MATH || move == ROBOT || move == HEART || move == ELECTRICITY || move == LIGHTNING
                    || move == MEDUSA || move == POWER || move == LASER || move == NUKE || move == SKY || move == TANK
                    || move == HELICOPTER;
            case CUP -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == GUN || move == LAW || move == WHIP || move == SWORD || move == ROCK || move == DEATH
                    || move == WALL || move == SUN || move == CAMERA || move == FIRE || move == CHAINSAW
                    || move == SCHOOL || move == SCISSORS || move == POISON || move == CAGE || move == AXE
                    || move == BEER || move == RAIN || move == WATER || move == TV || move == RAINBOW || move == UFO
                    || move == ALIEN || move == PRAYER || move == MOUNTAIN || move == SATAN || move == DRAGON
                    || move == DIAMOND || move == PLATINUM || move == GOLD || move == DEVIL || move == VIDEO_GAME
                    || move == MATH || move == ROBOT || move == HEART || move == ELECTRICITY || move == LIGHTNING
                    || move == MEDUSA || move == POWER || move == LASER || move == NUKE || move == SKY || move == TANK
                    || move == HELICOPTER;
            case BEER -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == GUN || move == LAW || move == WHIP || move == SWORD || move == ROCK || move == DEATH
                    || move == WALL || move == SUN || move == CAMERA || move == FIRE || move == CHAINSAW
                    || move == SCHOOL || move == SCISSORS || move == POISON || move == CAGE || move == AXE
                    || move == PEACE || move == RAIN || move == WATER || move == TV || move == RAINBOW || move == UFO
                    || move == ALIEN || move == PRAYER || move == MOUNTAIN || move == SATAN || move == DRAGON
                    || move == DIAMOND || move == PLATINUM || move == GOLD || move == DEVIL || move == FENCE
                    || move == VIDEO_GAME || move == MATH || move == ROBOT || move == HEART || move == ELECTRICITY
                    || move == LIGHTNING || move == MEDUSA || move == POWER || move == LASER || move == NUKE
                    || move == SKY || move == TANK || move == HELICOPTER;
            case RAIN -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == GUN || move == LAW || move == WHIP || move == SWORD || move == ROCK || move == DEATH
                    || move == WALL || move == SUN || move == CAMERA || move == FIRE || move == CHAINSAW
                    || move == SCHOOL || move == SCISSORS || move == POISON || move == CAGE || move == AXE
                    || move == PEACE || move == COMPUTER || move == WATER || move == TV || move == RAINBOW
                    || move == UFO || move == ALIEN || move == PRAYER || move == MOUNTAIN || move == SATAN
                    || move == DRAGON || move == DIAMOND || move == PLATINUM || move == GOLD || move == DEVIL
                    || move == FENCE || move == VIDEO_GAME || move == MATH || move == ROBOT || move == HEART
                    || move == ELECTRICITY || move == LIGHTNING || move == MEDUSA || move == POWER || move == LASER
                    || move == NUKE || move == SKY || move == TANK || move == HELICOPTER;
            case TV -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == CHAIN || move == WHIP
                    || move == ROCK || move == DEATH || move == WALL || move == SUN || move == CAMERA || move == FIRE
                    || move == CHAINSAW || move == SCHOOL || move == SCISSORS || move == POISON || move == CAGE
                    || move == PEACE || move == COMPUTER || move == CASTLE || move == FILM || move == RAINBOW
                    || move == UFO || move == ALIEN || move == PRAYER || move == MOUNTAIN || move == SATAN
                    || move == DRAGON || move == DIAMOND || move == PLATINUM || move == GOLD || move == DEVIL
                    || move == FENCE || move == VIDEO_GAME || move == MATH || move == ROBOT || move == HEART
                    || move == ELECTRICITY || move == LIGHTNING || move == MEDUSA || move == POWER || move == LASER
                    || move == SKY || move == TANK || move == HELICOPTER;
            case RAINBOW -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN || move == GUN
                    || move == LAW || move == WHIP || move == SWORD || move == ROCK || move == DEATH || move == WALL
                    || move == SUN || move == CAMERA || move == FIRE || move == CHAINSAW || move == SCHOOL
                    || move == SCISSORS || move == POISON || move == CAGE || move == AXE || move == PEACE
                    || move == COMPUTER || move == CASTLE || move == UFO || move == ALIEN || move == PRAYER
                    || move == MOUNTAIN || move == SATAN || move == DRAGON || move == DIAMOND || move == PLATINUM
                    || move == GOLD || move == DEVIL || move == FENCE || move == VIDEO_GAME || move == MATH
                    || move == ROBOT || move == HEART || move == ELECTRICITY || move == LIGHTNING || move == MEDUSA
                    || move == POWER || move == NUKE || move == SKY || move == TANK || move == HELICOPTER;
            case UFO -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == GUN || move == LAW || move == WHIP || move == SWORD || move == ROCK || move == DEATH
                    || move == WALL || move == SUN || move == CAMERA || move == FIRE || move == CHAINSAW
                    || move == SCHOOL || move == SCISSORS || move == POISON || move == CAGE || move == AXE
                    || move == PEACE || move == COMPUTER || move == CASTLE || move == SNAKE || move == BLOOD
                    || move == PORCUPINE || move == ALIEN || move == PRAYER || move == MOUNTAIN || move == SATAN
                    || move == DRAGON || move == DIAMOND || move == PLATINUM || move == GOLD || move == DEVIL
                    || move == FENCE || move == VIDEO_GAME || move == MATH || move == ROBOT || move == HEART
                    || move == ELECTRICITY || move == LIGHTNING || move == MEDUSA || move == POWER || move == LASER
                    || move == NUKE || move == SKY || move == TANK || move == HELICOPTER;
            case ALIEN -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == GUN || move == LAW || move == WHIP || move == SWORD || move == ROCK || move == DEATH
                    || move == WALL || move == SUN || move == CAMERA || move == FIRE || move == CHAINSAW
                    || move == SCHOOL || move == SCISSORS || move == POISON || move == CAGE || move == AXE
                    || move == PEACE || move == COMPUTER || move == CASTLE || move == SNAKE || move == BLOOD
                    || move == PORCUPINE || move == VULTURE || move == PRAYER || move == MOUNTAIN || move == SATAN
                    || move == DRAGON || move == DIAMOND || move == PLATINUM || move == GOLD || move == DEVIL
                    || move == FENCE || move == VIDEO_GAME || move == MATH || move == ROBOT || move == HEART
                    || move == ELECTRICITY || move == LIGHTNING || move == MEDUSA || move == POWER || move == LASER
                    || move == NUKE || move == SKY || move == TANK || move == HELICOPTER;
            case PRAYER -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == GUN || move == LAW || move == WHIP || move == SWORD || move == ROCK || move == DEATH
                    || move == WALL || move == SUN || move == CAMERA || move == FIRE || move == CHAINSAW
                    || move == SCHOOL || move == SCISSORS || move == POISON || move == CAGE || move == AXE
                    || move == PEACE || move == COMPUTER || move == CASTLE || move == SNAKE || move == BLOOD
                    || move == PORCUPINE || move == VULTURE || move == MONKEY || move == MOUNTAIN || move == SATAN
                    || move == DRAGON || move == DIAMOND || move == PLATINUM || move == GOLD || move == DEVIL
                    || move == FENCE || move == VIDEO_GAME || move == MATH || move == ROBOT || move == HEART
                    || move == ELECTRICITY || move == LIGHTNING || move == MEDUSA || move == POWER || move == LASER
                    || move == NUKE || move == SKY || move == TANK || move == HELICOPTER;
            case MOUNTAIN -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == GUN
                    || move == LAW || move == WHIP || move == SWORD || move == ROCK || move == DEATH || move == WALL
                    || move == SUN || move == CAMERA || move == FIRE || move == CHAINSAW || move == SCHOOL
                    || move == SCISSORS || move == POISON || move == CAGE || move == AXE || move == PEACE
                    || move == COMPUTER || move == CASTLE || move == SNAKE || move == BLOOD || move == PORCUPINE
                    || move == VULTURE || move == MONKEY || move == KING || move == SATAN || move == DRAGON
                    || move == DIAMOND || move == PLATINUM || move == GOLD || move == DEVIL || move == FENCE
                    || move == VIDEO_GAME || move == MATH || move == ROBOT || move == HEART || move == ELECTRICITY
                    || move == LIGHTNING || move == MEDUSA || move == POWER || move == LASER || move == NUKE
                    || move == SKY || move == TANK || move == HELICOPTER;
            case SATAN -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == GUN
                    || move == LAW || move == WHIP || move == SWORD || move == ROCK || move == DEATH || move == WALL
                    || move == SUN || move == CAMERA || move == FIRE || move == CHAINSAW || move == SCISSORS
                    || move == POISON || move == CAGE || move == AXE || move == PEACE || move == COMPUTER
                    || move == CASTLE || move == SNAKE || move == BLOOD || move == PORCUPINE || move == VULTURE
                    || move == MONKEY || move == KING || move == QUEEN || move == DRAGON || move == DIAMOND
                    || move == PLATINUM || move == GOLD || move == DEVIL || move == FENCE || move == VIDEO_GAME
                    || move == MATH || move == ROBOT || move == HEART || move == ELECTRICITY || move == LIGHTNING
                    || move == MEDUSA || move == POWER || move == LASER || move == NUKE || move == SKY || move == TANK
                    || move == HELICOPTER;
            case DIAMOND -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == GUN || move == WHIP || move == SWORD || move == ROCK || move == DEATH || move == WALL
                    || move == SUN || move == CAMERA || move == FIRE || move == CHAINSAW || move == SCHOOL
                    || move == SCISSORS || move == POISON || move == CAGE || move == AXE || move == PEACE
                    || move == COMPUTER || move == CASTLE || move == SNAKE || move == BLOOD || move == PORCUPINE
                    || move == VULTURE || move == MONKEY || move == KING || move == QUEEN || move == PRINCE
                    || move == PRINCESS || move == PLATINUM || move == GOLD || move == DEVIL || move == FENCE
                    || move == VIDEO_GAME || move == MATH || move == ROBOT || move == HEART || move == ELECTRICITY
                    || move == LIGHTNING || move == MEDUSA || move == POWER || move == LASER || move == NUKE
                    || move == SKY || move == TANK || move == HELICOPTER;
            case PLATINUM -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == GUN || move == WHIP || move == SWORD || move == ROCK || move == DEATH || move == WALL
                    || move == SUN || move == CAMERA || move == FIRE || move == CHAINSAW || move == SCHOOL
                    || move == SCISSORS || move == POISON || move == CAGE || move == AXE || move == PEACE
                    || move == COMPUTER || move == CASTLE || move == SNAKE || move == BLOOD || move == PORCUPINE
                    || move == VULTURE || move == MONKEY || move == KING || move == QUEEN || move == PRINCE
                    || move == PRINCESS || move == POLICE || move == GOLD || move == DEVIL || move == FENCE
                    || move == VIDEO_GAME || move == MATH || move == ROBOT || move == HEART || move == ELECTRICITY
                    || move == LIGHTNING || move == MEDUSA || move == POWER || move == LASER || move == NUKE
                    || move == SKY || move == TANK || move == HELICOPTER;
            case GOLD -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == GUN || move == WHIP || move == SWORD || move == ROCK || move == DEATH || move == WALL
                    || move == SUN || move == CAMERA || move == FIRE || move == CHAINSAW || move == SCHOOL
                    || move == SCISSORS || move == POISON || move == CAGE || move == AXE || move == PEACE
                    || move == COMPUTER || move == CASTLE || move == SNAKE || move == BLOOD || move == PORCUPINE
                    || move == VULTURE || move == MONKEY || move == KING || move == QUEEN || move == PRINCE
                    || move == PRINCESS || move == POLICE || move == WOMAN || move == DEVIL || move == FENCE
                    || move == VIDEO_GAME || move == MATH || move == ROBOT || move == HEART || move == ELECTRICITY
                    || move == LIGHTNING || move == MEDUSA || move == POWER || move == LASER || move == NUKE
                    || move == SKY || move == TANK || move == HELICOPTER;
            case FENCE -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == GUN || move == LAW || move == WHIP || move == SWORD || move == ROCK || move == DEATH
                    || move == WALL || move == SUN || move == CAMERA || move == FIRE || move == CHAINSAW
                    || move == SCHOOL || move == SCISSORS || move == POISON || move == CAGE || move == AXE
                    || move == PEACE || move == COMPUTER || move == CASTLE || move == SNAKE || move == BLOOD
                    || move == PORCUPINE || move == VULTURE || move == MONKEY || move == KING || move == QUEEN
                    || move == PRINCE || move == PRINCESS || move == POLICE || move == WOMAN || move == BABY
                    || move == MAN || move == VIDEO_GAME || move == MATH || move == ROBOT || move == HEART
                    || move == ELECTRICITY || move == LIGHTNING || move == MEDUSA || move == POWER || move == LASER
                    || move == NUKE || move == SKY || move == TANK || move == HELICOPTER;
            case VIDEO_GAME -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == GUN || move == LAW || move == WHIP || move == SWORD || move == ROCK || move == DEATH
                    || move == SUN || move == CAMERA || move == FIRE || move == CHAINSAW || move == SCHOOL
                    || move == SCISSORS || move == POISON || move == CAGE || move == AXE || move == PEACE
                    || move == COMPUTER || move == CASTLE || move == SNAKE || move == BLOOD || move == PORCUPINE
                    || move == VULTURE || move == MONKEY || move == KING || move == QUEEN || move == PRINCE
                    || move == PRINCESS || move == POLICE || move == WOMAN || move == BABY || move == MAN
                    || move == HOME || move == MATH || move == ROBOT || move == HEART || move == ELECTRICITY
                    || move == LIGHTNING || move == MEDUSA || move == POWER || move == LASER || move == NUKE
                    || move == SKY || move == TANK || move == HELICOPTER;
            case MATH -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == CHAIN || move == GUN
                    || move == LAW || move == WHIP || move == SWORD || move == ROCK || move == DEATH || move == WALL
                    || move == SUN || move == CAMERA || move == FIRE || move == CHAINSAW || move == SCHOOL
                    || move == SCISSORS || move == POISON || move == CAGE || move == AXE || move == COMPUTER
                    || move == CASTLE || move == SNAKE || move == BLOOD || move == PORCUPINE || move == VULTURE
                    || move == MONKEY || move == KING || move == QUEEN || move == PRINCE || move == PRINCESS
                    || move == POLICE || move == WOMAN || move == BABY || move == MAN || move == BRAIN || move == ROBOT
                    || move == HEART || move == ELECTRICITY || move == LIGHTNING || move == MEDUSA || move == POWER
                    || move == LASER || move == NUKE || move == SKY || move == TANK || move == HELICOPTER;
            case ROBOT -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == GUN || move == WHIP || move == SWORD || move == ROCK || move == DEATH || move == WALL
                    || move == SUN || move == CAMERA || move == FIRE || move == CHAINSAW || move == SCHOOL
                    || move == SCISSORS || move == POISON || move == CAGE || move == AXE || move == PEACE
                    || move == COMPUTER || move == CASTLE || move == SNAKE || move == BLOOD || move == PORCUPINE
                    || move == VULTURE || move == MONKEY || move == KING || move == QUEEN || move == PRINCE
                    || move == PRINCESS || move == POLICE || move == WOMAN || move == BABY || move == MAN
                    || move == HOME || move == TRAIN || move == CAR || move == HEART || move == ELECTRICITY
                    || move == LIGHTNING || move == MEDUSA || move == POWER || move == LASER || move == NUKE
                    || move == SKY || move == TANK || move == HELICOPTER;
            case HEART -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == GUN || move == LAW
                    || move == WHIP || move == SWORD || move == ROCK || move == DEATH || move == WALL || move == SUN
                    || move == CAMERA || move == FIRE || move == CHAINSAW || move == SCHOOL || move == SCISSORS
                    || move == POISON || move == CAGE || move == AXE || move == PEACE || move == COMPUTER
                    || move == CASTLE || move == SNAKE || move == BLOOD || move == PORCUPINE || move == VULTURE
                    || move == MONKEY || move == KING || move == QUEEN || move == PRINCE || move == PRINCESS
                    || move == POLICE || move == WOMAN || move == BABY || move == MAN || move == HOME || move == TRAIN
                    || move == CAR || move == NOISE || move == LIGHTNING || move == MEDUSA || move == POWER
                    || move == LASER || move == NUKE || move == SKY || move == TANK || move == HELICOPTER;
            case ELECTRICITY -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == GUN || move == LAW || move == WHIP || move == SWORD || move == ROCK || move == DEATH
                    || move == WALL || move == SUN || move == CAMERA || move == FIRE || move == CHAINSAW
                    || move == SCHOOL || move == SCISSORS || move == POISON || move == CAGE || move == AXE
                    || move == PEACE || move == COMPUTER || move == CASTLE || move == SNAKE || move == BLOOD
                    || move == PORCUPINE || move == VULTURE || move == MONKEY || move == KING || move == QUEEN
                    || move == PRINCE || move == PRINCESS || move == POLICE || move == WOMAN || move == BABY
                    || move == MAN || move == HOME || move == TRAIN || move == CAR || move == NOISE || move == BICYCLE
                    || move == LIGHTNING || move == MEDUSA || move == POWER || move == LASER || move == NUKE
                    || move == SKY || move == TANK || move == HELICOPTER;
            case MEDUSA -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == GUN || move == LAW || move == WHIP || move == SWORD || move == ROCK || move == DEATH
                    || move == WALL || move == SUN || move == CAMERA || move == FIRE || move == CHAINSAW
                    || move == SCHOOL || move == SCISSORS || move == POISON || move == CAGE || move == AXE
                    || move == PEACE || move == COMPUTER || move == CASTLE || move == BLOOD || move == PORCUPINE
                    || move == VULTURE || move == MONKEY || move == KING || move == QUEEN || move == PRINCE
                    || move == PRINCESS || move == POLICE || move == WOMAN || move == BABY || move == MAN
                    || move == HOME || move == TRAIN || move == CAR || move == NOISE || move == BICYCLE || move == TREE
                    || move == TURNIP || move == POWER || move == LASER || move == NUKE || move == SKY || move == TANK
                    || move == HELICOPTER;
            case POWER -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == GUN || move == LAW || move == WHIP || move == SWORD || move == ROCK || move == DEATH
                    || move == WALL || move == SUN || move == CAMERA || move == FIRE || move == CHAINSAW
                    || move == SCHOOL || move == SCISSORS || move == POISON || move == CAGE || move == AXE
                    || move == PEACE || move == COMPUTER || move == CASTLE || move == SNAKE || move == BLOOD
                    || move == PORCUPINE || move == VULTURE || move == MONKEY || move == KING || move == QUEEN
                    || move == PRINCE || move == PRINCESS || move == POLICE || move == WOMAN || move == BABY
                    || move == MAN || move == HOME || move == TRAIN || move == CAR || move == NOISE || move == BICYCLE
                    || move == TURNIP || move == DUCK || move == LASER || move == NUKE || move == SKY || move == TANK
                    || move == HELICOPTER;
            case LASER -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == GUN || move == LAW || move == WHIP || move == SWORD || move == ROCK || move == DEATH
                    || move == WALL || move == SUN || move == CAMERA || move == FIRE || move == CHAINSAW
                    || move == SCHOOL || move == SCISSORS || move == POISON || move == CAGE || move == AXE
                    || move == PEACE || move == COMPUTER || move == CASTLE || move == SNAKE || move == BLOOD
                    || move == PORCUPINE || move == VULTURE || move == MONKEY || move == KING || move == QUEEN
                    || move == PRINCE || move == PRINCESS || move == POLICE || move == WOMAN || move == BABY
                    || move == MAN || move == HOME || move == TRAIN || move == CAR || move == NOISE || move == BICYCLE
                    || move == TREE || move == TURNIP || move == DUCK || move == WOLF || move == POWER || move == NUKE
                    || move == SKY || move == TANK || move == HELICOPTER;
            case NUKE -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == GUN || move == LAW || move == WHIP || move == SWORD || move == ROCK || move == DEATH
                    || move == WALL || move == SUN || move == CAMERA || move == FIRE || move == CHAINSAW
                    || move == SCHOOL || move == SCISSORS || move == POISON || move == CAGE || move == AXE
                    || move == PEACE || move == COMPUTER || move == CASTLE || move == SNAKE || move == BLOOD
                    || move == PORCUPINE || move == VULTURE || move == MONKEY || move == KING || move == QUEEN
                    || move == PRINCE || move == PRINCESS || move == POLICE || move == WOMAN || move == BABY
                    || move == MAN || move == HOME || move == TRAIN || move == CAR || move == NOISE || move == BICYCLE
                    || move == TREE || move == TURNIP || move == DUCK || move == WOLF || move == CAT || move == POWER
                    || move == SKY || move == TANK || move == HELICOPTER;
            case SKY -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == GUN || move == LAW || move == WHIP || move == SWORD || move == ROCK || move == DEATH
                    || move == WALL || move == SUN || move == CAMERA || move == FIRE || move == CHAINSAW
                    || move == SCHOOL || move == SCISSORS || move == POISON || move == CAGE || move == AXE
                    || move == PEACE || move == COMPUTER || move == CASTLE || move == SNAKE || move == BLOOD
                    || move == PORCUPINE || move == VULTURE || move == MONKEY || move == KING || move == QUEEN
                    || move == PRINCE || move == PRINCESS || move == POLICE || move == WOMAN || move == BABY
                    || move == MAN || move == HOME || move == TRAIN || move == CAR || move == NOISE || move == BICYCLE
                    || move == TREE || move == TURNIP || move == DUCK || move == WOLF || move == CAT || move == BIRD
                    || move == TANK || move == HELICOPTER;
            case TANK -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == GUN || move == LAW || move == WHIP || move == SWORD || move == ROCK || move == DEATH
                    || move == WALL || move == SUN || move == CAMERA || move == FIRE || move == CHAINSAW
                    || move == SCHOOL || move == SCISSORS || move == POISON || move == CAGE || move == AXE
                    || move == PEACE || move == COMPUTER || move == CASTLE || move == SNAKE || move == BLOOD
                    || move == PORCUPINE || move == VULTURE || move == MONKEY || move == KING || move == QUEEN
                    || move == PRINCE || move == PRINCESS || move == POLICE || move == WOMAN || move == BABY
                    || move == MAN || move == HOME || move == TRAIN || move == CAR || move == NOISE || move == BICYCLE
                    || move == TREE || move == TURNIP || move == DUCK || move == WOLF || move == CAT || move == BIRD
                    || move == FISH || move == CLOUD || move == HELICOPTER;
            case HELICOPTER -> move == DYNAMITE || move == TORNADO || move == QUICKSAND || move == PIT || move == CHAIN
                    || move == GUN || move == LAW || move == WHIP || move == SWORD || move == ROCK || move == DEATH
                    || move == WALL || move == SUN || move == CAMERA || move == FIRE || move == CHAINSAW
                    || move == SCHOOL || move == SCISSORS || move == POISON || move == CAGE || move == AXE
                    || move == PEACE || move == COMPUTER || move == CASTLE || move == SNAKE || move == BLOOD
                    || move == PORCUPINE || move == VULTURE || move == MONKEY || move == KING || move == QUEEN
                    || move == PRINCE || move == PRINCESS || move == POLICE || move == WOMAN || move == BABY
                    || move == MAN || move == HOME || move == TRAIN || move == CAR || move == NOISE || move == BICYCLE
                    || move == TREE || move == TURNIP || move == DUCK || move == WOLF || move == CAT || move == BIRD
                    || move == FISH || move == SPIDER || move == CLOUD;
        };
    }

    public static List<Move> filterArray(int n) {
        return Arrays.asList(Arrays.copyOfRange(Move.values(), 0, n));
    }

}
