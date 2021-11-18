package com.enigma;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeaponTest {

    @Test
    public void ableToCreateWeaponNameAndDamage(){
        Weapon weapon = new Weapon("Excalibur", 120, 5);
        assertNotNull(weapon);
    }

    @Test
    public void getDamage_should_return100_when_WeaponWithDamage100Created(){
        Weapon weapon = new Weapon("Busur", 100, 2);
        assertEquals(100, weapon.getDamage());
    }

    @Test
    public void shouldDecreaseEnergyByOne_when_Called(){
        Weapon weapon = new Weapon("Busur", 100, 2);
        weapon.used();
        assertEquals(1, weapon.getEnergy());
    }

    @Test
    public void shouldDecreaseEnergyByTwo_when_CalledTwice(){
        Weapon weapon = new Weapon("Busur", 100, 2);
        weapon.used();
        weapon.used();
        assertEquals(0, weapon.getEnergy());
    }




}