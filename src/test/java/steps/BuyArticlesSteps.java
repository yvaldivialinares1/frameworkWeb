package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BuyArticlesPage;
import pages.LoginPage;

public class BuyArticlesSteps {
    BuyArticlesPage buyArticlesPage = new BuyArticlesPage();

    @And("^Select the laptop (.*)$")
    public void selectTheLaptop(String laptopName) {
        buyArticlesPage.selectItem(laptopName);
    }
    @And("^Verify the laptop (.*) is displayed$")
    public void verifyTheLaptopIsDisplayed(String laptopName) {
        buyArticlesPage.verifyTheLaptopIsDisplayed(laptopName);
    }
    //Verify the laptop Sony vaio i5 is displayed
}
