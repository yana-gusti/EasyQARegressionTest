package Tests.MyProfile;

import Methods.MyProfile.Login;
import Methods.MyProfile.MyProfile;
import Tests.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by yanagusti on 10/4/17.
 */
public class MyProfileTests extends BaseTest{

    @Test
    public void changeBillingInfo() throws InterruptedException {
        Login login = new Login();
        login.login(driver,email, password);
        waitForElement(".//*[@id='mCSB_2_container']/div[1]/div/div/div/div/div[1]/div[1]/a");
        MyProfile myProfile = login.goToMyProfile(driver);
        Thread.sleep(2000);
        myProfile.changeBillingInfo(driver,"test", "test", "test","test","12312", "test", "Albania");
        waitForElement("html/body/div[2]/div[1]");
        myProfile.checkText(driver,"Update Success", "html/body/div[2]/div[1]");
        myProfile.clickButton(driver, "html/body/div[2]/div[2]/span");
        Thread.sleep(2000);
        Assert.assertEquals("test", driver.findElement(By.xpath(".//*[@id='user_company']")).getAttribute("value").toString());
        myProfile.changeBillingInfo(driver,"test1", "test1", "test1","test1","12311", "test1", "Australia");
        waitForElement("html/body/div[2]/div[1]");
        myProfile.checkText(driver,"Update Success", "html/body/div[2]/div[1]");
        myProfile.clickButton(driver, "html/body/div[2]/div[2]/span");
        Assert.assertEquals("test1", driver.findElement(By.xpath(".//*[@id='user_company']")).getAttribute("value").toString());
        login.logout(driver);
    }


}
