package Tests.MyProfile;

import Methods.MyProfile.Login;
import Methods.MyProfile.MyProfile;
import Tests.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by yanagusti on 10/4/17.
 */
public class ChangePasswordTest extends BaseTest {

    @Test
    public void changePassword(){
        Login login = new Login();
        login.login(driver, email, password);
        waitForElement(".//*[@id='mCSB_2_container']/div[1]/div/div/div/div/div[1]/div[1]/a");
        MyProfile myProfile = login.goToMyProfile(driver);
        waitForElement(".//*[@id='content']/div/div[1]/h2");
        myProfile.goToChangePass(driver);
        waitForElement(".//*[@id='content']/div/div[1]/h2");
        myProfile.changePassword(driver, password, "123123");
        login.logout(driver);
        login.login(driver, email, "123123");
        waitForElement(".//*[@id='mCSB_2_container']/div[1]/div/div/div/div/div[1]/div[1]/a");
        login.goToMyProfile(driver);
        waitForElement(".//*[@id='content']/div/div[1]/h2");
        myProfile.goToChangePass(driver);
        waitForElement(".//*[@id='content']/div/div[1]/h2");
        myProfile.changePassword(driver, "123123", password);
        login.logout(driver);
    }
}
