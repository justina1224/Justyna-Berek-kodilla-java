package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {

        try {
            //Given
            Bigmac bigmac = new Bigmac.BigmacBuilder()
                    .ingredient("lettuce")
                    .bun("without a sesame")
                    .sauce("barbecue")
                    .ingredient("cheese")
                    .ingredient("chili papers")
                    .ingredient("cucumber")
                    .burgers(2)
                    .build();
            System.out.println(bigmac);

            //When
            int howManyAdditionalIngredients = bigmac.getIngredients().size();

            //Then
            Assert.assertEquals(4, howManyAdditionalIngredients);
            Assert.assertEquals(2, bigmac.getBurgers());
            Assert.assertEquals("barbecue", bigmac.getSauce());
            Assert.assertTrue("lettuce", bigmac.getIngredients().contains("lettuce"));

        } catch (IngredientNotAvailableException e) {
            System.out.println(e.getMessage());
            System.out.println("Please change your composition, available ingredients: \n" +
                    "bun: with or without a sesame, \n" +
                    "sauces: standard, Thousand Island, barbecue, \n" +
                    "additional ingredients: lettuce, onion, bacon, cucumber, chili papers, mushrooms, prawn and cheese");
        }
    }
}