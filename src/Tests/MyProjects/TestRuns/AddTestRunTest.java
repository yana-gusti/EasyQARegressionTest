package Tests.MyProjects.TestRuns;

import Methods.MyProjects.Projects;
import Methods.MyProjects.TestRuns;
import Tests.BaseTest;
import org.testng.annotations.Test;

import java.awt.*;

/**
 * Created by yanagusti on 10/5/17.
 */
public class AddTestRunTest extends BaseTest {
    @Test
    public void createTestRun() throws InterruptedException, AWTException {
        Projects projects = openProject();
        projects.goToTestActivities(driver);
        TestRuns testRuns = new TestRuns();
        testRuns.createTestRun(driver, "test");
        logout();
    }
}
