package Tests.MyProjects;

import Methods.MyProjects.Projects;
import Tests.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yanagusti on 10/4/17.
 */
public class ChangeProjectTest extends BaseTest {
    @Test
    public void changeProject(){
        Projects projects = openProject();
        projects.goToSettings(driver);
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String dates= dateFormat.format(date);
        projects.changeProject(driver, "test"+ dates);
        driver.get(baseUrl);
        projects.goToMyProjects(driver);
        Assert.assertEquals("test"+ dates, driver.findElement(By.className("project-main-info")).findElement(By.xpath("./div/a")).getText());
    }
}
