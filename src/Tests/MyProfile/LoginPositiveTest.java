package Tests.MyProfile;


import Tests.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by yanagusti on 10/4/17.
 */
public class LoginPositiveTest extends BaseTest {

    @Test
    public void loginPositive(){
       login();
        waitForElement(".//*[@id='mCSB_2_container']/div[1]/div/div/div/div/div[1]/div[1]/a");
        Assert.assertEquals("Yana Gusti", driver.findElement(By.xpath(".//*[@id='mCSB_2_container']/div[1]/div/div/div/div/div[1]/div[1]/a")).getText());
        logout();
    }



}
