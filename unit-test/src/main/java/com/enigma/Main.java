package com.enigma;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Chou", 100, 120);
        Weapon weapon = new Weapon("Exc", 100, 5);

        hero.attachWeapon(weapon);
        System.out.println(hero);
    }
}
