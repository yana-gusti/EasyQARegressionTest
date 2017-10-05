package Tests.MyProjects.TestPlan;

import Methods.MyProjects.Projects;
import Methods.MyProjects.TestPlans;
import Tests.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by yanagusti on 10/5/17.
 */
public class AddTestCaseTest extends BaseTest {

    @Test
    public void createTestCase() throws InterruptedException {
        Projects projects = openProject();
        projects.goToTestActivities(driver);
        TestPlans testPlans = new TestPlans();
        testPlans.createTestCase(driver, "test");
        logout();
    }
}
