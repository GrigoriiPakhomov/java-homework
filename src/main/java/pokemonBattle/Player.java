package main.java.pokemonBattle;

import java.util.List;

public abstract class Player {

    protected Team team;

    public Player(Team team) {

        this.team = team;
    }

    public Team getTeam() {

        return team;
    }

    public abstract Skill chooseSkill(Pokemon pokemon);

    public abstract List<Pokemon> chooseTargets(
            Skill skill,
            Team enemyTeam
    );
}