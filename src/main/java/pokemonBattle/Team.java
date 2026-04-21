package main.java.pokemonBattle;

import java.util.List;

public class Team {

    private final List<Pokemon> pokemons;

    public Team(List<Pokemon> pokemons) {

        this.pokemons = pokemons;
    }

    public List<Pokemon> getAlivePokemons() {

        return pokemons.stream()
                .filter(Pokemon::isAlive)
                .toList();
    }

    public boolean isAlive() {

        return pokemons.stream().anyMatch(Pokemon::isAlive);
    }

    public List<Pokemon> getAll() {

        return pokemons;
    }
}