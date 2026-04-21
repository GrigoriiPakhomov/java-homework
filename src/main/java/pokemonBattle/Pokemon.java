package main.java.pokemonBattle;

public class Pokemon {

    private static final int HP_INCREASE_PER_LEVEL = 10;
    private static final int ATTACK_INCREASE_PER_LEVEL = 2;

    private final String name;
    private final PokemonType type;

    private int hp;
    private int attack;
    private int level;
    private int maxHp;

    public Pokemon(String name, PokemonType type, int hp, int attack, int level) {

        this.name = name;
        this.type = type;
        this.hp = hp;
        this.attack = attack;
        this.level = level;
        this.maxHp = hp;
    }

    public String getName() {
        return name;
    }

    public PokemonType getType() {
        return type;
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public boolean isAlive() {

        return hp > 0;
    }

    public void takeDamage(int damage) {

        hp = Math.max(0, hp - damage);
    }

    public void heal(int amount) {

        hp = Math.min(maxHp, hp + amount);
    }

    public void levelUp() {

        level++;

        maxHp += HP_INCREASE_PER_LEVEL;

        attack += ATTACK_INCREASE_PER_LEVEL;

        hp = maxHp;

        System.out.println(name + " получил новый уровень!");
    }
}