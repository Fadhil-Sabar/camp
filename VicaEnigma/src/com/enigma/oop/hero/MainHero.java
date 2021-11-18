package com.enigma.oop.hero;

import java.util.HashSet;
import java.util.Set;

public class MainHero {
    public static void main(String[] args) {
        Heroes chou = new Heroes("Chou", 1000, 150);
        Heroes saber = new Heroes("Saber", 1500, 200);
        Monster minion = new Monster("Minion", 3000, 50);
        Tower tower = new Tower(2000, 200);

        chou.attack(saber);
//        System.out.println(saber);

        chou.attack(minion);
//        System.out.println(minion);

        chou.attack(tower);
        System.out.println(tower);
        Set<Heroes> heroesSet = new HashSet<>();

        heroesSet.add(chou);
        heroesSet.add(saber);

        for (Heroes heroes : heroesSet){
            System.out.println(heroes);
        }
    }
}
