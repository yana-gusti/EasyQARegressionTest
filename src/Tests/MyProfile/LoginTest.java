package Tests.MyProfile;


import Methods.MyProfile.Login;
import Tests.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by yanagusti on 10/4/17.
 */
public class LoginTest extends BaseTest {

    @Test
    public void loginPositive(){
       login();
        waitForElement(".//*[@id='mCSB_2_container']/div[1]/div/div/div/div/div[1]/div[1]/a");
        Assert.assertEquals("Yana Gusti", driver.findElement(By.xpath(".//*[@id='mCSB_2_container']/div[1]/div/div/div/div/div[1]/div[1]/a")).getText());
        logout();
    }

    @Test
    public void loginNegative(){
        Login login = new Login();
        login.login(driver,email, password+"1");
        waitForElement(".//*[@id='new_user']/div[1]/span");
        Assert.assertEquals("Invalid Email or password.", driver.findElement(By.xpath(".//*[@id='new_user']/div[1]/span")).getText());
    }

}
