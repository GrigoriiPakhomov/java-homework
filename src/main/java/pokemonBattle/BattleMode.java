package main.java.pokemonBattle;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum BattleMode {

    ONE_VS_ONE(1),

    TWO_VS_TWO(2),

    FOUR_VS_FOUR(4);

    private final int teamSize;
}