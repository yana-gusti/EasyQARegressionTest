package Tests;

import Methods.MyProfile.Login;
import Methods.MyProjects.Projects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
        System.setProperty("webdriver.chrome.driver", "./drivers/for mac/chromedriver");
        ChromeOptions chrome_options = new ChromeOptions();
        chrome_options.addArguments("--headless");
        chrome_options.addArguments("--remote-debugging-port=9222");
        chrome_options.addArguments("--disable-gpu");

        driver = new ChromeDriver(chrome_options);

        switch (server) {
            case "prod":
                baseUrl = "https://app.geteasyqa.com/";
                driver.get(baseUrl+"/users/sign_in");
                waitForElement(".//*[@id='user_email']");
                break;
            case "test":
                baseUrl = "http://qa_dashboard.test.thinkmobiles.com:8085/";
                driver.get(baseUrl+"/users/sign_in");
                waitForElement(".//*[@id='user_email']");
                break;
            default:
                break;

        }


    }

//    @BeforeMethod
//
//    public void SetUp() throws InterruptedException {
//
//
//        System.setProperty("webdriver.chrome.driver", "./drivers/for mac/chromedriver");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--window-size=1920,1400");
//        driver = new ChromeDriver(options);
//
//        baseUrl = "https://app.geteasyqa.com/";
//
//        driver.get(baseUrl+"/users/sign_in");
//        waitForElement(".//*[@id='user_email']");
//
//    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.close();
    }

    public void waitForElement(String xpath){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }

    public void login(){
        Login login = new Login();
        login.login(driver, email, password);
        waitForElement(".//*[@id='mCSB_2_container']/div[1]/div/div/div/div/div[1]/div[1]/a");
    }

    public Projects openProject(){
        Login login = new Login();
        login.login(driver, email, password);
        waitForElement(".//*[@id='mCSB_2_container']/div[1]/div/div/div/div/div[1]/div[1]/a");
        Projects projects = new Projects();
        projects.goToMyProjects(driver);
        projects.openProject(driver);
        return projects;
    }

    public void logout(){
        Login login = new Login();
        login.logout(driver);

    }

}
