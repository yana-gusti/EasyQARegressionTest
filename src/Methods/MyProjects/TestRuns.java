package Methods.MyProjects;

import Methods.BasePageMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import static java.lang.Thread.sleep;

/**
 * Created by yanagusti on 10/5/17.
 */
public class TestRuns extends BasePageMethods {

    public void createTestRun(WebDriver driver, String name) throws InterruptedException {
        driver.findElement(By.className("nav-tabs")).findElement(By.xpath("./li[3]/a")).click();
        sleep(1000);
        clickButton(driver, ".//*[@id='create_test_run']");
        waitForElement(driver, ".//*[@id='new_test_run']/div[1]");
        sendText(driver, ".//*[@id='test_run_title']", name);
        clickButton(driver, ".//*[@id='assignedTestRun']/div/a");
        clickButton(driver, ".//*[@id='assignedTestRun']/ul/div/div/li[2]/a");

        sendText(driver, ".//*[@id='test_run_description']", name);

        sleep(1000);
        new Actions(driver).moveToElement(driver.findElement(By.className("modal-body")).findElement(By.xpath("./div[5]/input")))
                .build().perform();
        clickButton(driver, ".//*[@id='testRunSelect']/div/a");
        sleep(1000);
        waitForElement(driver, ".//*[@id='testRunSelect']/ul/div/div/li[2]/a");
        clickButton(driver, ".//*[@id='testRunSelect']/ul/div/div/li[2]/a");
        driver.findElement(By.xpath(".//*[@id='testRunSelect']/ul/div/div/li[2]/a")).submit();
        sleep(2000);
        Assert.assertEquals(name, driver.findElement(By.className("testRun-box-item-info")).findElement(By.xpath("./a")).getText());
    }

    public void editTestRun(WebDriver driver, String name) throws InterruptedException {
        driver.findElement(By.className("nav-tabs")).findElement(By.xpath("./li[3]/a")).click();
        sleep(1000);
        driver.findElement(By.className("testRun-box-item-info")).findElement(By.xpath("./a[2]")).click();
        waitForElement(driver, ".//*[@id='test_run_title']");
        sendText(driver, ".//*[@id='test_run_title']", name);
        sendText(driver, ".//*[@id='test_run_description']", name);
        driver.findElement(By.xpath(".//*[@id='test_run_description']")).submit();
        sleep(2000);
        Assert.assertEquals(name, driver.findElement(By.className("testRun-box-item-info")).findElement(By.xpath("./a")).getText());
    }

    public void cloneTestRun(WebDriver driver) throws InterruptedException {
        driver.findElement(By.className("nav-tabs")).findElement(By.xpath("./li[3]/a")).click();
        sleep(1000);
        driver.findElement(By.className("testRun-box-item-info")).findElement(By.xpath("./a[3]")).click();
        sleep(1000);
        driver.findElement(By.className("buttons-block")).findElement(By.xpath("./span")).click();
        sleep(1000);
        Assert.assertEquals("Cloned: test1", driver.findElement(By.className("testRun-box-item-info")).findElement(By.xpath("./a")).getText());
    }

    public void deleteTestRun(WebDriver driver) throws InterruptedException {
        driver.findElement(By.className("nav-tabs")).findElement(By.xpath("./li[3]/a")).click();
        sleep(1000);
        driver.findElement(By.className("testRun-box-item-info")).findElement(By.xpath("./a[4]")).click();
       sleep(2000);

    }




}
