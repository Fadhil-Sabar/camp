package com.enigma;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    @Test
    public void ableCreateHeroWithNameAndDamage(){
        Hero hero = new Hero("Kirito", 120, 100);
        assertNotNull(hero);
    }

    @Test
    public void attachWeapon_should_increaseDamageBy100_when_WeaponWithDamage100Attached(){
        Hero hero = new Hero("Kirito", 20, 100);
        Weapon weapon = Mockito.mock(Weapon.class);
        Mockito.when(weapon.getDamage()).thenReturn(100);

        hero.attachWeapon(weapon);
        assertEquals(200, hero.getDamage());
    }

    @Test
    public void attack_should_callWeaponUsedMethodOnce_When_calledOnce(){
        Hero hero = new Hero("Kirito", 20, 100);
        Weapon mockWeapon = Mockito.mock(Weapon.class);

        hero.attachWeapon(mockWeapon);
        hero.attack();

        Mockito.verify(mockWeapon, Mockito.times(1)).used();
    }


}