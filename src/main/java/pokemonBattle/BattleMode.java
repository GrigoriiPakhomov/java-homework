package main.java.pokemonBattle;

public enum BattleMode {

    ONE_VS_ONE(1),
    TWO_VS_TWO(2),
    FOUR_VS_FOUR(4);

    private final int teamSize;

    BattleMode(int teamSize) {

        this.teamSize = teamSize;
    }

    public int getTeamSize() {

        return teamSize;
    }
}