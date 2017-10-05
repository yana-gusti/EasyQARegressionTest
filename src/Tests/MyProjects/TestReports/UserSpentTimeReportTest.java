package Tests.MyProjects.TestReports;

import Methods.MyProjects.Projects;
import Methods.MyProjects.TestReports;
import Tests.BaseTest;
import org.testng.annotations.Test;

import java.awt.*;

/**
 * Created by yanagusti on 10/5/17.
 */
public class UserSpentTimeReportTest extends BaseTest {

    @Test
    public void userSpentTimeReport() throws InterruptedException, AWTException {
        Projects projects = openProject();
        projects.goToTestActivities(driver);
        TestReports testReports = new TestReports();
        testReports.userSpentTimeReport(driver);
        logout();
    }
}
