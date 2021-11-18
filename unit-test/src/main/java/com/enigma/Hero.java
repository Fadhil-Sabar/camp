package com.enigma;

public class Hero {
    private String name;
    private Integer hp;
    private Integer baseDamage;
    private Weapon weapon;

    public Hero(String name, Integer hp, Integer baseDamage) {
        this.name = name;
        this.hp = hp;
        this.baseDamage = baseDamage;
    }

    public void attachWeapon(Weapon weapon){
        this.weapon = weapon;
        this.baseDamage = this.baseDamage + weapon.getDamage();
    }

    public Integer getDamage() {
        return this.baseDamage;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", baseDamage=" + baseDamage +
                ", weapon=" + weapon +
                '}';
    }

    public void attack() {
        if(weapon!=null){
            weapon.used();
        }
    }
}
