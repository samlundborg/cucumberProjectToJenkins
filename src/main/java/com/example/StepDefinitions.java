package com.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    @Given("sample feature file is ready")
    public void givenStatement() {
        System.out.println("Given OK!");
    }

    @When("I run the feature file")
    public void whenStatement() {
        System.out.println("When OK!");
    }

    @Then("run should be successful")
    public void thenStatement() {
        System.out.println("Then OK!");
    }
}
