package Methods.MyOrganizations;

import Methods.BasePageMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

/**
 * Created by yanagusti on 10/4/17.
 */
public class OrganizationMembers extends BasePageMethods {

    public void addMembers(WebDriver driver, String email){
        clickButton(driver, ".//*[@id='dashboard']/div/div[1]/a");
        waitForElement(driver, ".//*[@id='myModal']/div/div/div/h3");
        sendText(driver, ".//*[@id='emails']", email);
        clickButton(driver, ".//*[@id='myModal']/div/div/form/div[2]/input");
        waitForElement(driver, ".//*[@id='dashboard']/div/div[1]/a");

        


    }



    public void deleteMember(WebDriver driver){
        clickButton(driver, ".//*[@id='dashboard']/div/div[2]/div/table/tbody/tr[3]/td[6]/span/span[1]");
        Alert alert = driver.switchTo().alert();
        alert.accept();
        waitForElement(driver, ".//*[@id='dashboard']/div/div[2]/div/table/thead/tr/td[1]/span");
    }
}
