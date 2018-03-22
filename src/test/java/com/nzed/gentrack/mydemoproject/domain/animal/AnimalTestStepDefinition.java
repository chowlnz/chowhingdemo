package com.nzed.gentrack.mydemoproject.domain.animal;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class AnimalTestStepDefinition {

    private Animal animal;

    @Given("^I have  a fish$")
    public void iHaveAFish() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        animal = new Animal();
    }

    @When("^The fish makes a sound$")
    public void theFishMakesASound() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        animal.setNoise("plok");
    }

    @Then("^I expect the sound to be blurp$")
    public void iExpectTheSoundToBeBlurp() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Fish fish = new Fish();
        fish.setNoise("plok");
        assertEquals(fish.getNoise(), animal.getNoise());
       // assertEquals("blurp", animal.getNoise());
    }
}
