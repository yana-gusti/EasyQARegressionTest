package Tests.MyProjects;

import Methods.MyProjects.Projects;
import Tests.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by yanagusti on 10/4/17.
 */
public class AddProjectMemberTest extends BaseTest {

    @Test
    public void addProjectMember(){
        Projects projects = openProject();
        projects.goToSettings(driver);
        projects.addProjectMember(driver);
        Assert.assertEquals("Test Demo", driver.findElement(By.xpath(".//*[@id='content']/div/table/tbody/tr[2]/td[2]/p[1]")).getText());
    }
}
