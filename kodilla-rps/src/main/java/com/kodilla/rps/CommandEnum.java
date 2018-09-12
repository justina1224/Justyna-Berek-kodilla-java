package com.kodilla.rps;

public enum CommandEnum {
    ROCK(MoveEnum.ROCK),
    PAPER(MoveEnum.PAPER),
    SCISSORS(MoveEnum.SCISSORS),
    LIZARD(MoveEnum.LIZARD),
    SPOCK(MoveEnum.SPOCK),
    YES(null),
    NO(null),
    START(null),
    CONTINUE(null),
    INVALID(null);

    private final MoveEnum gameMove;

    private CommandEnum(MoveEnum gameMove) {
        this.gameMove = gameMove;
    }

    public MoveEnum getGameMove() {
        return gameMove;
    }
}