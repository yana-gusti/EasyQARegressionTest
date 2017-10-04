package Methods.MyProfile;

import Methods.BasePageMethods;
import org.openqa.selenium.WebDriver;

/**
 * Created by yanagusti on 10/4/17.
 */
public class MyProfile extends BasePageMethods{

    public void changeBillingInfo(WebDriver driver, String _company, String _street, String _city, String _state,
                                  String _zip, String _phone, String _country) throws InterruptedException {

        sendText(driver, ".//*[@id='user_company']", _company);
        sendText(driver,".//*[@id='user_street_address']", _street);
        sendText(driver,".//*[@id='user_city']", _city);
        sendText(driver,".//*[@id='user_state']", _state);
        sendText(driver,".//*[@id='user_zip_code']", _zip);
        sendText(driver,".//*[@id='user_phone_number']", _phone);
        selectItem(driver,".//*[@id='user_country']/div/a", _country);
        clickButton(driver,".//*[@id='head_menu']/div[3]/a[2]"); //save button

    }

    public void changePassword(WebDriver driver, String old_pass, String new_pass){
        sendText(driver, ".//*[@id='current_password']", old_pass);
        sendText(driver, ".//*[@id='user_password']", new_pass);
        sendText(driver, ".//*[@id='user_password_confirmation']", new_pass);
        clickButton(driver, ".//*[@id='edit_user_password']/input[2]");

    }

    public void goToChangePass(WebDriver driver){
        clickButton(driver, ".//*[@id='left-menu']/li[2]/a");
    }
}
