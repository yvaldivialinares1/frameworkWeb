package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.LoginPageObject;
import pageObjects.RegisterUserPageObject;
import utils.DataGenerator;

public class LoginPage extends BasePage {
    LoginPageObject loginPageObject = new LoginPageObject();

    public LoginPage() {
        super(driver);
    }

    public void typeCorrectUserPassword() {
        write(loginPageObject.LOGIN_USERNAME, RegisterUserPage.emailGenerated);
        write(loginPageObject.LOGIN_PASSWORD, RegisterUserPage.passwordGenerated);
    }
    public boolean verifyUsernameIsdisplayed(){
        explicitWait(loginPageObject.PRODUCT_STORE_LOGO);
        return verifyVisibleText(loginPageObject.NAME_OF_USER,"Welcome "+RegisterUserPage.emailGenerated);
    }
    public boolean verifyUsernameIsNotDisplayed(){
        return  verifyInvisibleText(loginPageObject.NAME_OF_USER);
    }
}
