package main.java.pokemonBattle;

public class Pokemon {

    private String name;
    private int hp;
    private int attack;
    private int level;

    public Pokemon(String name, int hp, int attack, int level) {

        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.level = level;
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

        hp -= damage;

        if (hp < 0) {
            hp = 0;
        }
    }

    public void heal(int amount) {

        hp += amount;
    }

    public void levelUp() {

        level++;

        hp += 10;

        attack += 2;

        System.out.println(name + " leveled up!");
    }

    public boolean isAlive() {

        return hp > 0;
    }
}