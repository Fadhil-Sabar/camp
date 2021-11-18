package com.enigma.oop.hero;

import java.util.Objects;

public class Heroes implements Hitable{
    private String name;
    private Integer hp;
    private Integer baseDamage;

    public Heroes(String name, Integer hp, Integer baseDamage) {
        this.name = name;
        this.hp = hp;
        this.baseDamage = baseDamage;
    }

    public void attack(Hitable hitable){
        hitable.receivedDamage(this);
    }

    public Integer getBaseDamage() {
        return baseDamage;
    }



    @Override
    public void receivedDamage(Heroes heroes) {
        this.hp = this.hp - heroes.getBaseDamage();
    }

    @Override
    public String toString() {
        return "Heroes{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", baseDamage=" + baseDamage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Heroes heroes = (Heroes) o;
        return Objects.equals(name, heroes.name) && Objects.equals(hp, heroes.hp) && Objects.equals(baseDamage, heroes.baseDamage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hp, baseDamage);
    }
}
