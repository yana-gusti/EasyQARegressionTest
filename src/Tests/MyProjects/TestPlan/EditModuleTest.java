package Tests.MyProjects.TestPlan;

import Methods.MyProjects.Projects;
import Methods.MyProjects.TestPlans;
import Tests.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by yanagusti on 10/5/17.
 */
public class EditModuleTest extends BaseTest {

    @Test
    public void createModule() throws InterruptedException {
        Projects projects = openProject();
        projects.goToTestActivities(driver);
        TestPlans testPlans = new TestPlans();
        testPlans.editModule(driver, "test1");
        logout();
    }
}
