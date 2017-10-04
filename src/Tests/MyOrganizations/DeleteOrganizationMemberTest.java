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
public class DeleteOrganizationMemberTest  extends BaseTest{

    @Test
    public void deleteMember(){
        login();
        Organization organization = new Organization();
        organization.goToMyOrganizations(driver);
        organization.openOrganization(driver);
        OrganizationMembers organizationMembers = organization.goToOrganizationMembers(driver);
        organizationMembers.deleteMember(driver);
        Assert.assertEquals("1", driver.findElement(By.xpath(".//*[@id='dashboard']/div/div[2]/div/table/thead/tr/td[1]/span")).getText());
        logout();
    }
}
