package Tests.MyProjects.TestRuns;

import Methods.MyProjects.Projects;
import Methods.MyProjects.TestRuns;
import Tests.BaseTest;
import org.testng.annotations.Test;

import java.awt.*;

/**
 * Created by yanagusti on 10/5/17.
 */
public class EditTestRunTest extends BaseTest {
    @Test
    public void editTestRun() throws InterruptedException, AWTException {
        Projects projects = openProject();
        projects.goToTestActivities(driver);
        TestRuns testRuns = new TestRuns();
        testRuns.editTestRun(driver, "test1");
        logout();
    }
}
