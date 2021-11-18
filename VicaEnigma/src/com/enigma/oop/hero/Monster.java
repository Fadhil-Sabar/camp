package com.enigma.oop.hero;

public class Monster implements Hitable{
    private String name;
    private Integer hp;
    private Integer baseDamage;

    public Monster(String name, Integer hp, Integer baseDamage) {
        this.name = name;
        this.hp = hp;
        this.baseDamage = baseDamage;
    }

    @Override
    public void receivedDamage(Heroes heroes) {
        this.hp = this.hp - heroes.getBaseDamage();
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", baseDamage=" + baseDamage +
                '}';
    }
}
