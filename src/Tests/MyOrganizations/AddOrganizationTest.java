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
public class AddOrganizationTest extends BaseTest{

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




}
