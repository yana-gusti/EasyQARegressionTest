package Tests.MyOrganizations;

import Methods.MyOrganizations.Organization;
import Methods.MyOrganizations.OrganizationMembers;
import Tests.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by yanagusti on 10/4/17.
 */
public class AddOrganizationMemberTest extends BaseTest {

    @Test
    public void addMember(){
        login();
        Organization organization = new Organization();
        organization.goToMyOrganizations(driver);
        organization.openOrganization(driver);
        OrganizationMembers organizationMembers = organization.goToOrganizationMembers(driver);
        organizationMembers.addMembers(driver, "yana.gusti+2@gmail.com");
        Assert.assertEquals("Test Demo", driver.findElement(By.xpath(".//*[@id='dashboard']/div/div[2]/div/table/tbody/tr[3]/td[2]/p[1]")).getText());
        logout();
    }




}
