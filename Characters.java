package Homework.RPG.MyGame;

public class Characters implements Assaulter {
    private int maxHp, hp, attack, defense, level;
    private int place, xp, gold;
    private int strength;
    private int agility;
    private int damage;
    private String name;

    public void setHp(int hp) {
        if (hp > maxHp) {
            this.hp = maxHp;
        } else {
            if (hp < 0) {
                this.hp = 0;
            } else {
                this.hp = hp;
            }
        }
    }

    public Characters(int maxHp, int hp, int attack, int defense, int level, int place, int xp, int gold, int strength, int agility, int damage, String name) {
        this.maxHp = maxHp;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.level = level;
        this.place = place;
        this.xp = xp;
        this.gold = gold;
        this.strength = strength;
        this.agility = agility;
        this.damage = damage;
        this.name = name;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getHp() {
        return hp;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int attack() {
        if (agility * 3 > getRandomValue()) return strength;
        else return damage;
    }

        private int getRandomValue() {
            return (int) (Math.random() * 100);
        }

    /*private String crash (Characters target) {
        target.hp -= this.damage;
        return String.format("%s attacks %s for %d damage!", this.name, target.name, this.damage);
    }*/

    public void info () {
        System.out.println("\tYour HP: " + name + hp);
    }

}




