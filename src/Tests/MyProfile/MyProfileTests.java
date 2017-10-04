package Tests.MyProfile;

import Methods.MyProfile.Login;
import Methods.MyProfile.MyProfile;
import Tests.BaseTest;
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
        waitForElement(".//*[@id='edit_user_543']/div[1]/h3");
        myProfile.changeBillingInfo(driver,"test", "test", "test","test","12312", "test", "Albania");
        waitForElement("html/body/div[2]/div[1]");
        myProfile.checkText(driver,"Update Success", "html/body/div[2]/div[1]");
        myProfile.clickButton(driver, "html/body/div[2]/div[2]/span");
        myProfile.checkText(driver,"test", ".//*[@id='user_company']");
        myProfile.changeBillingInfo(driver,"test1", "test1", "test1","test1","12311", "test1", "Australia");
        waitForElement("html/body/div[2]/div[1]");
        myProfile.checkText(driver,"Update Success", "html/body/div[2]/div[1]");
        myProfile.clickButton(driver, "html/body/div[2]/div[2]/span");
        myProfile.checkText(driver,"test1", ".//*[@id='user_company']");
        login.logout(driver);
    }

    @Test
    public void changePassword(){
        Login login = new Login();
        login.login(driver, email, password);
        waitForElement(".//*[@id='mCSB_2_container']/div[1]/div/div/div/div/div[1]/div[1]/a");
        MyProfile myProfile = login.goToMyProfile(driver);
        waitForElement(".//*[@id='edit_user_543']/div[1]/h3");
        myProfile.goToChangePass(driver);
        waitForElement(".//*[@id='content']/div/div[1]/h2");
        myProfile.changePassword(driver, password, "123123");
        login.logout(driver);
        login.login(driver, email, "123123");
        waitForElement(".//*[@id='mCSB_2_container']/div[1]/div/div/div/div/div[1]/div[1]/a");
        login.goToMyProfile(driver);
        waitForElement(".//*[@id='edit_user_543']/div[1]/h3");
        myProfile.goToChangePass(driver);
        waitForElement(".//*[@id='content']/div/div[1]/h2");
        myProfile.changePassword(driver, "123123", password);
        login.logout(driver);
    }
}
