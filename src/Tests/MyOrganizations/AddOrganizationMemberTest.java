package Tests.MyOrganizations;

import Methods.MyOrganizations.Organization;
import Methods.MyOrganizations.OrganizationMembers;
import Tests.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by yanagusti on 10/4/17.
 */
public class AddOrganizationMemberTest extends BaseTest {

    @Test
    public void addMember() throws InterruptedException {
        login();
        Organization organization = new Organization();
        organization.goToMyOrganizations(driver);
        organization.openOrganization(driver);
        OrganizationMembers organizationMembers = organization.goToOrganizationMembers(driver);
        organizationMembers.addMembers(driver, "yana.gusti+2@gmail.com");
        logout();
    }




}
