package Homework.RPG.MyGame;

public class Goblin extends Enemy {
    public Goblin(int maxHp, int hp, int attack, int defense, int level, int place, int xp, int gold, int strength, int agility, int damage, String name) {
        super(maxHp, hp, attack, defense, level, place, xp, gold, strength, agility, damage, name);

        System.out.println("Created goblin " + name + "," + "HP: " + hp);
    }
}
