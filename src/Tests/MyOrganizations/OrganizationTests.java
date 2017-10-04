package Tests.MyOrganizations;

import Methods.MyOrganizations.Organization;
import Tests.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yanagusti on 10/4/17.
 */
public class OrganizationTests extends BaseTest{

    @Test
    public void addOrganization(){
        login();
        Organization organization = new Organization();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String dates= dateFormat.format(date);
        organization.createOrganization(driver, "test"+ dates);
        Assert.assertEquals("test"+ dates, driver.findElement(By.xpath(".//*[@id='my_organization']/div[2]/div[1]/div[1]/div/a")).getText());
        logout();
    }

    @Test
    public void changeOrganization() throws InterruptedException {
        login();
        Organization organization = new Organization();
        organization.goToMyOrganizations(driver);
        organization.openOrganization(driver);
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String dates= dateFormat.format(date);
        organization.changeOrganization(driver, "test"+ dates);
        Thread.sleep(1000);
        Assert.assertEquals("test"+ dates, driver.findElement(By.xpath(".//*[@id='dashboard']/div/div[1]/h2")).getText());
        logout();
    }

    @Test
    public void deleteOrganization(){
        login();
        Organization organization = new Organization();
        organization.goToMyOrganizations(driver);
        organization.openOrganization(driver);
        organization.deleteOrganization(driver);
        logout();
    }
}
