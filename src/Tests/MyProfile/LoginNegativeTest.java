package Tests.MyProfile;

import Methods.MyProfile.Login;
import Tests.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by yanagusti on 10/4/17.
 */
public class LoginNegativeTest extends BaseTest {

    @Test
    public void loginNegative(){
        Login login = new Login();
        login.login(driver,email, password+"1");
        waitForElement(".//*[@id='new_user']/div[1]/span");
        Assert.assertEquals("Invalid Email or password.", driver.findElement(By.xpath(".//*[@id='new_user']/div[1]/span")).getText());
    }
}
