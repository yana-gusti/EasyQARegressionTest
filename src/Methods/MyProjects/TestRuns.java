package Methods.MyProjects;

import Methods.BasePageMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

/**
 * Created by yanagusti on 10/5/17.
 */
public class TestRuns extends BasePageMethods {

    public void createTestPlan(WebDriver driver, String name) throws InterruptedException {
        driver.findElement(By.className("nav-tabs")).findElement(By.xpath("./li[3]/a")).click();
        Thread.sleep(1000);
        clickButton(driver, ".//*[@id='create_test_run']");
        waitForElement(driver, ".//*[@id='new_test_run']/div[1]");
        sendText(driver, ".//*[@id='test_run_title']", name);
        sendText(driver, ".//*[@id='test_run_description']", name);
        clickButton(driver, ".//*[@id='assignedTestRun']/div/a");
        clickButton(driver, ".//*[@id='assignedTestRun']/ul/li[2]/a");
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(By.xpath(".//*[@id='assignedTestRun']/div/a"))).perform();
        builder.moveToElement(driver.findElement(By.xpath(".//*[@id='mCSB_4_scrollbar_vertical']/div"))).click().perform();
        Thread.sleep(1000);
        clickButton(driver, ".//*[@id='testRunSelect']/div/a");
        clickButton(driver, ".//*[@id='testRunSelect']/ul/li[2]/a");
        driver.findElement(By.className("modal-body")).findElement(By.xpath("./div[5]/input")).click();
        Thread.sleep(1000);
        Assert.assertEquals(name, driver.findElement(By.className("testRun-box-item-info")).findElement(By.xpath("./a")).getText());
    }

}
