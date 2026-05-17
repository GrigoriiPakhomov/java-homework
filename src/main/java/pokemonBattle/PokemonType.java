package main.java.pokemonBattle;

public enum PokemonType {

    FIRE,
    WATER,
    GRASS,
    ELECTRIC;

    public double getEffectiveness(PokemonType opponent) {

        if (this==FIRE && opponent==GRASS) return 2;
        if (this==WATER && opponent==FIRE) return 2;
        if (this==GRASS && opponent==WATER) return 2;

        return 1;
    }
}