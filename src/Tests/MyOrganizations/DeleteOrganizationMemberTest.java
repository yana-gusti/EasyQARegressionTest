package Tests.MyOrganizations;

import Methods.MyOrganizations.Organization;
import Methods.MyOrganizations.OrganizationMembers;
import Tests.BaseTest;
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
        logout();
    }
}
