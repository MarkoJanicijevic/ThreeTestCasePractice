package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormAuthenticationPage {

    WebDriver driver;
    WebElement UsernameField;
    WebElement PasswordField;
    WebElement LogInButton;
    WebElement SuccessMessage;

    public WebElement getErrorMessage() {
        return driver.findElement(By.cssSelector(".flash.error"));
    }

    WebElement ErrorMessage;

    public WebElement getSuccessMessage() {
        return driver.findElement(By.cssSelector(".flash.success"));
    }

    WebElement successMessage;


    public FormAuthenticationPage(WebDriver driver) {
        this.driver = driver;
    }



    public WebElement getUsernameField() {
        return driver.findElement(By.id("username"));
    }

    public WebElement getPasswordField() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getLogInButton() {
        return driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in"));
    }



    public void enterUsername (String x) {
        getUsernameField().clear();
        getUsernameField().sendKeys(x);
    }

    public void enterPassword (String x) {
        getPasswordField().clear();
        getPasswordField().sendKeys(x);
    }

    public void clickOnLogInButton () {
        getLogInButton().click();
    }


}
