package Tests.MyProjects;

import Methods.MyProjects.Projects;
import Tests.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by yanagusti on 10/4/17.
 */
public class DeleteProjectMemberTest extends BaseTest {

    @Test
    public void deleteProjectMember(){
        Projects projects = openProject();
        projects.goToSettings(driver);
        projects.deleteProjectMember(driver);

    }
}
