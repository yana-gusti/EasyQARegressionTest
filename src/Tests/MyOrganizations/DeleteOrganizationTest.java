package Tests.MyOrganizations;

import Methods.MyOrganizations.Organization;
import Tests.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by yanagusti on 10/4/17.
 */
public class DeleteOrganizationTest  extends BaseTest{
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
