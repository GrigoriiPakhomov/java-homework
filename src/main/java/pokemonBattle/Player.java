package main.java.pokemonBattle;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public abstract class Player {

    protected final Team team;

    public abstract Skill chooseSkill(
            Pokemon pokemon
    );

    public abstract List<Pokemon> chooseTargets(
            Skill skill,
            Team enemyTeam
    );
}