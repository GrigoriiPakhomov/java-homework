package main.java.pokemonBattle;

public class Pokemon {

    private static final int HP_INCREASE_PER_LEVEL = 10;
    private static final int ATTACK_INCREASE_PER_LEVEL = 2;

    private String name;
    private int hp;
    private int attack;
    private int level;
    private int maxHp;

    public Pokemon(String name, int hp, int attack, int level) {

        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.level = level;
        this.maxHp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public int getLevel() {
        return level;
    }

    public void takeDamage(int damage) {

        hp = Math.max(0, hp - damage);
    }

    public void heal(int amount) {

        hp = Math.min(maxHp, hp + amount)
    }

    public void levelUp() {

        level++;
        hp += HP_INCREASE_PER_LEVEL;
        attack += ATTACK_INCREASE_PER_LEVEL;

        System.out.println(name + " получил новый уровень!");
    }

    public boolean isAlive() {

        return hp > 0;
    }
}