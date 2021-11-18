package com.enigma.oop.hero;

public class Tower implements Hitable{
    private Integer hp;
    private Integer towerDefense;

    public Tower(Integer hp, Integer towerDefense) {
        this.hp = hp;
        this.towerDefense = towerDefense;
    }

    @Override
    public void receivedDamage(Heroes heroes) {
        this.hp += towerDefense -= heroes.getBaseDamage();
    }

    @Override
    public String toString() {
        return "Tower{" +
                "hp=" + hp +
                ", towerDefense=" + towerDefense +
                '}';
    }
}
