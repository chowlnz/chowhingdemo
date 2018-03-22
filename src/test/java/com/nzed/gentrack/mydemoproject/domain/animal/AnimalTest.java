package com.nzed.gentrack.mydemoproject.domain.animal;

import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {
    Animal animal = new Animal();

    @Test
    public void nameTest() {
        animal.setName("Goldie");
        Assert.assertEquals(animal.getName(), "Goldie");
    }

    @Test
    public void colorTest() {
        animal.setColor("Black");
        Assert.assertEquals(animal.getColor(), "Black");
    }

    @Test
    public void noOfLegsTest() {
        animal.setNoOfLegs(0);
        Assert.assertEquals(animal.getNoOfLegs(), 0);
    }
}
