package Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;

    WebElement FormAuthentication;


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getFormAuthentication() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[21]/a")); // pokusao sam da nadjem preko  driver.findElement(By.linkText("Form authentication") i nece iz nekog razloga
    }

    public void clickOnFormAuthentication () {
        getFormAuthentication().click();
    }
}
