package stepdefinitions;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;

public class ParallelStepDefinitions {
    @Given("Thread id yi yazdirir")
    public void threadIdYiYazdirir() {

        System.out.println("Thread id = " + Thread.currentThread().getId());
    }
}
