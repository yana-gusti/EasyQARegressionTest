package Methods.MyOrganizations;

import Methods.BasePageMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by yanagusti on 10/4/17.
 */
public class Organization extends BasePageMethods {

    public void createOrganization(WebDriver driver, String name){

        clickButton(driver, ".//*[@id='head_menu']/div[2]/a[1]");
        waitForElement(driver, ".//*[@id='myModal']/div/div/div[1]/h3");
        sendText(driver, ".//*[@id='organization_title']", name);
        clickButton(driver, ".//*[@id='new_organization']/input[2]");
        waitForElement(driver, ".//*[@id='my_organization']/div[1]/h2");

    }

    public void goToMyOrganizations(WebDriver driver){
        clickButton(driver, ".//*[@id='head_menu']/ul/li[1]/a");
        waitForElement(driver, ".//*[@id='my_organization']/div[1]/h2");
    }

    public OrganizationMembers goToOrganizationMembers(WebDriver driver){
        clickButton(driver, ".//*[@id='left-menu']/li[3]/a");
        waitForElement(driver, ".//*[@id='dashboard']/div/div[1]/h2");
        return new OrganizationMembers();
    }

    public void openOrganization(WebDriver driver){
        clickButton(driver, ".//*[@id='my_organization']/div[2]/div/div[1]/div/a");
        waitForElement(driver, ".//*[@id='dashboard']/div/div[1]/h2");
    }

    public void changeOrganization(WebDriver driver, String name){
        clickButton(driver, ".//*[@id='dashboard']/div/div[1]/a");
        waitForElement(driver, ".//*[@id='myModal']/div/div/div[1]/h3");
        sendText(driver, ".//*[@id='organization_title']", name);
        driver.findElement(By.name("commit")).click();
        waitForElement(driver, ".//*[@id='dashboard']/div/div[1]/h2");
    }

    public void deleteOrganization(WebDriver driver){
        clickButton(driver, ".//*[@id='left-menu']/li[4]/a/span[2]");
        waitForElement(driver, ".//*[@id='dashboard']/div/div[1]/h2");
        clickButton(driver, ".//*[@id='dashboard']/div/div[1]/a");
        waitForElement(driver, ".//*[@id='myModal']/div/div/div[1]/h3");
        clickButton(driver, ".//*[@id='confirm']");
        waitForElement(driver, ".//*[@id='my_organization']/div[1]/h2");
    }
}
