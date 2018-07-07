package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {

        //Given
        World world = new World();
        Continent asia = new Continent("Asia");
        Continent europe = new Continent("Europe");
        Continent africa = new Continent("Africa");
        world.addContinent(asia);
        world.addContinent(europe);
        world.addContinent(africa);

        asia.addCountry(new Country("China", new BigDecimal("1330044605")));
        asia.addCountry(new Country("Thailand", new BigDecimal("65493000")));
        asia.addCountry(new Country("India", new BigDecimal("1147996000")));
        asia.addCountry(new Country("Japan", new BigDecimal("127078679")));

        europe.addCountry(new Country("Poland", new BigDecimal("38346279")));
        europe.addCountry(new Country("Germany", new BigDecimal("80996685")));
        europe.addCountry(new Country("Italy", new BigDecimal("61680122")));
        europe.addCountry(new Country("France", new BigDecimal("66259012")));

        africa.addCountry(new Country("Egypt", new BigDecimal("97041072")));
        africa.addCountry(new Country("Morocco", new BigDecimal("33986655")));
        africa.addCountry(new Country("Sudan", new BigDecimal("37345935")));
        africa.addCountry(new Country("Ghana", new BigDecimal("27499924")));


        //When
        BigDecimal peopleQuantity = world.getWorldPeopleQuantity();
        BigDecimal expected = new BigDecimal("3113767968");

        //Then
        Assert.assertEquals(expected, peopleQuantity);

    }
}
