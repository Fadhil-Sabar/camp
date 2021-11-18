package com.enigma;

public class Weapon {
    private String name;
    private Integer damage;
    private Integer energy;

    public Weapon(String name, Integer damage, Integer energy) {
        this.name = name;
        this.damage = damage;
        this.energy = energy;
    }

    public void used(){
        if(this.energy > 0){
            this.energy--;
        }
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", energy=" + energy +
                '}';
    }

    public Integer getDamage() {
        return damage;
    }

    public int getEnergy() {
        return energy;
    }
}
