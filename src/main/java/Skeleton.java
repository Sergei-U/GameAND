package Homework.RPG.MyGame.src.main.java;

public class Skeleton extends Enemy implements Monsters{
    public Skeleton(int maxHp, int hp, int attack, int defense, int level, int place, int xp, int gold, int strength, int agility, int damage, String name) {
        super(maxHp, hp, attack, defense, level, place, xp, gold, strength, agility, damage, name);

        System.out.println("Created skeleton " + name + "," + "HP: " + hp);
    }

    @Override
    public boolean isAlive() {
        return isAlive();
    }
}
