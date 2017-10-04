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
public class AddProjectTest extends BaseTest{

    @Test
    public void addProject(){
        login();
        Projects projects = new Projects();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String dates= dateFormat.format(date);
        projects.createProjetc(driver, "test"+ dates);
        Assert.assertEquals("test"+ dates, driver.findElement(By.xpath(".//*[@id='mCSB_1_container']/div[1]/div/div/div[2]/div[2]/div[1]/div/a")).getText());
        logout();
    }








}
