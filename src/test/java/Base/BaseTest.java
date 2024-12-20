package Base;

import Pages.FormAuthenticationPage;
import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    public WebDriver driver;
    public HomePage homepage;
    public FormAuthenticationPage formauthenticationpage;

    @BeforeClass
    public void setUP () {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        homepage = new HomePage(driver);
        formauthenticationpage = new FormAuthenticationPage(driver);

    }
}
