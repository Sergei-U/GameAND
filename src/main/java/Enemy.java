package Homework.RPG.MyGame.src.main.java;

public class Enemy extends Characters{
    public static String[] enemies = {"Goblin", "Skeleton"};

    public Enemy(int maxHp, int hp, int attack, int defense, int level, int place, int xp, int gold, int strength, int agility, int damage, String name) {
        super(maxHp, hp, attack, defense, level, place, xp, gold, strength, agility, damage, name);
    }
}
