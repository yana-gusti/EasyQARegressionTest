package Tests.MyProjects;

import Methods.MyProjects.Projects;
import Tests.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by yanagusti on 10/4/17.
 */
public class DeleteProjectTest extends BaseTest {
    @Test
    public void removeProject() throws InterruptedException {
        Projects projects = openProject();
        projects.goToSettings(driver);
        projects.deleteProject(driver);
        Assert.assertEquals("No project found", driver.findElement(By.className("content-wrapper")).findElement(By.xpath("./div/p")).getText());
    }
}
