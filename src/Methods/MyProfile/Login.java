package Methods.MyProfile;

import Methods.BasePageMethods;
import org.openqa.selenium.WebDriver;

/**
 * Created by yanagusti on 10/4/17.
 */
public class Login extends BasePageMethods{


    public void login(WebDriver driver, String _email, String _pass){

        sendText(driver,".//*[@id='user_email']", _email);
        sendText(driver,".//*[@id='user_password']", _pass);
        clickButton(driver,".//*[@id='new_user']/input[2]"); //signin button
    }

    public void logout(WebDriver driver){

        clickButton(driver, ".//*[@id='head_menu']/div[3]/a[2]"); //logout button
    }

    public MyProfile goToMyProfile(WebDriver driver){
        clickButton(driver,".//*[@id='head_menu']/div[3]/a[1]"); //My Profile button
        return new MyProfile();
    }





}
