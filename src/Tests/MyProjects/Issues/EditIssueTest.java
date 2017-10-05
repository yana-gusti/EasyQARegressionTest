package Tests.MyProjects.Issues;

import Methods.MyProjects.Issues;
import Methods.MyProjects.Projects;
import Tests.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by yanagusti on 10/5/17.
 */
public class EditIssueTest extends BaseTest {

    @Test
    public void editIssue() throws InterruptedException {
        Projects projects = openProject();
        Issues issues = projects.goToIssues(driver);
        issues.editIssue(driver, "test1");
        logout();
    }
}
