package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.appointmentPage;
import utils.BrowserUtils;
import utils.ConfigurationsReader;
import utils.Driver;

public class appointmenPageSteps extends BrowserUtils{
    appointmentPage appointmenPage = new appointmentPage();

    @Given("The user wants to go to main page")
    public void theUserWantsToGoToMainPage() {
        Driver.getDriver().get(ConfigurationsReader.getProperties("demoURL"));
    }

    @When("The user wants to add all information")
    public void theUserWantsToAddAllInformation() {
        appointmenPage.setCustomerName();
        appointmenPage.setPetName();
        appointmenPage.setDate();
        appointmenPage.setTime();
        appointmenPage.setSymptoms();
    }


    @Then("The user wants to click on submit button")
    public void theUserWantsToClickOnSubmitButton() {
        appointmenPage.clickButton();




    }
  
  }
