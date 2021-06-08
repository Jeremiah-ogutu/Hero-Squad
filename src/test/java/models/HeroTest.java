
package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {

    @Test
    public void newHeroInstantiatesCorrectly_true(){
        Hero hero= setUpNewHero();
        assertEquals(true,hero instanceof Hero);
    }

    @Test
    public void heroMustHaveAName(){
        Hero hero =setUpNewHero();
        assertEquals("kenya1",hero.getName());
    }
    //test age


    //tests power
    @Test
    public void getPowerChecksTheHerosPower(){
        Hero hero =setUpNewHero();
        assertEquals("kento",hero.getPower());
    }

    //tests weakness
    @Test
    public void getWeaknessInstantiatesHeroWeakness(){
        Hero hero =setUpNewHero();
        assertEquals("fire",hero.getWeakness());
    }
    private Hero setUpNewHero() {
        return new Hero("ping-pop",24,"kento","fire");
    }


}
