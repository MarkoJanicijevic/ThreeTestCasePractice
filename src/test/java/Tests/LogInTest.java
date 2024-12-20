package Tests;

import Base.BaseTest;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp () {
        driver.navigate().to("https://the-internet.herokuapp.com/");
    }

    @Test
    public void logInTestWithValidCredentials () {
        homepage.clickOnFormAuthentication();
        formauthenticationpage.enterUsername("tomsmith");
        formauthenticationpage.enterPassword("SuperSecretPassword!");
        formauthenticationpage.clickOnLogInButton();
        Assert.assertTrue(formauthenticationpage.getSuccessMessage().isDisplayed());

    }
    @Test
    public void logInWithInvalidUsername () {
        homepage.clickOnFormAuthentication();
        formauthenticationpage.enterUsername("not tomsmith");
        formauthenticationpage.enterPassword("SuperSecretPassword!");
        formauthenticationpage.clickOnLogInButton();
        Assert.assertTrue(formauthenticationpage.getErrorMessage().isDisplayed());

    }

    @Test
    public void logInWithInvalidPassword () {
        homepage.clickOnFormAuthentication();
        formauthenticationpage.enterUsername("tomsmith");
        formauthenticationpage.enterPassword("NoSuperSecretPassword!");
        formauthenticationpage.clickOnLogInButton();
        Assert.assertTrue(formauthenticationpage.getErrorMessage().isDisplayed());

    }

    @AfterClass
    public void closeChrome () {
        driver.quit();
    }

}
