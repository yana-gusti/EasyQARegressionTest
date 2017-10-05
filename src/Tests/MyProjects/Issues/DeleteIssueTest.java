package Tests.MyProjects.Issues;

import Methods.MyProjects.Issues;
import Methods.MyProjects.Projects;
import Tests.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by yanagusti on 10/5/17.
 */
public class DeleteIssueTest extends BaseTest {
    @Test
    public void deleteIssue() throws InterruptedException {
        Projects projects = openProject();
        Issues issues = projects.goToIssues(driver);
        issues.deleteIssue(driver);
        logout();
    }
}
