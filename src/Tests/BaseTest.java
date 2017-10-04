package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


/**
 * Created by asus on 09.02.17.
 */
public class BaseTest {

    public WebDriver driver;
    public String baseUrl;
    public String email = "yana.gusti+1@gmail.com";
    public String password = "111111";


    @BeforeMethod
    @Parameters("server")
    public void SetUp(String server) {
//        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
//        ChromeOptions chrome_options = new ChromeOptions();
//        chrome_options.addArguments("--headless");
//        chrome_options.addArguments("--disable-gpu");
//
//        driver = new ChromeDriver(chrome_options);

        System.setProperty("webdriver.chrome.driver", "./drivers/for mac/chromedriver");


        driver = new ChromeDriver();

        switch (server) {
            case "prod":
                baseUrl = "https://app.geteasyqa.com/";
                break;
            case "test":
                baseUrl = "http://qa_dashboard.test.thinkmobiles.com:8085/";
                break;
            default:
                break;

        }

        driver.get(baseUrl+"/users/sign_in");
        waitForElement(".//*[@id='user_email']");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.close();
        driver.quit();
    }

    public void waitForElement(String xpath){
        WebDriverWait wait = new WebDriverWait(driver, 5000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }

}
