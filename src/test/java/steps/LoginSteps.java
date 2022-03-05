package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.LoginPageObject;
import pages.LoginPage;
import pages.RegisterUserPage;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Given("^The user complete the fields with the correct data for the login$")
    public void typeUserPassword() {
        loginPage.typeCorrectUserPassword();
    }

    @Then("^Verify the username (.*) displayed$")
    public void verifyUsernameIsdisplayed(String flag) {
        switch (flag) {
            case "is":
                Assert.assertTrue(loginPage.verifyUsernameIsdisplayed());
                break;
            case "is not":
                Assert.assertTrue(loginPage.verifyUsernameIsNotDisplayed());
                break;
        }

    }
}
