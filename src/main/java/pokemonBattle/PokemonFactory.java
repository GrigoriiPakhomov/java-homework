package main.java.pokemonBattle;

public class PokemonFactory {

    public static Pokemon createCharmander() {

        return new Pokemon(
                "Charmander",
                PokemonType.FIRE,
                100,
                12,
                1
        );
    }

    public static Pokemon createSquirtle() {

        return new Pokemon(
                "Squirtle",
                PokemonType.WATER,
                110,
                10,
                1
        );
    }

    public static Pokemon createBulbasaur() {

        return new Pokemon(
                "Bulbasaur",
                PokemonType.GRASS,
                105,
                11,
                1
        );
    }

    public static Pokemon createPikachu() {

        return new Pokemon(
                "Pikachu",
                PokemonType.ELECTRIC,
                90,
                15,
                1
        );
    }
}