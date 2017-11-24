package Methods.MyProjects;

import Methods.BasePageMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by yanagusti on 10/5/17.
 */
public class TestPlans extends BasePageMethods{

    public void createTestPlan(WebDriver driver, String name) throws InterruptedException {
        driver.findElement(By.className("nav-tabs")).findElement(By.xpath("./li[2]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("newtestplanlink")).findElement(By.xpath("./a")).click();
        waitForElement(driver, ".//*[@id='myModal']/div/div");
        sendText(driver, ".//*[@id='test_plan_title']", name);
        sendText(driver, ".//*[@id='test_plan_description']", name);
        driver.findElement(By.className("modal-body")).findElement(By.xpath("./form/div[3]/input")).click();
        Thread.sleep(1000);
        Assert.assertEquals(name, driver.findElement(By.className("plans-info-item-inner")).findElement(By.xpath("./a/h3")).getText());
    }

    public void editTestPlan(WebDriver driver, String name) throws InterruptedException {
        driver.findElement(By.className("nav-tabs")).findElement(By.xpath("./li[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("plans-icons")).findElement(By.xpath("./div[2]")).click();
        waitForElement(driver, ".//*[@id='myModal']/div/div");
        sendText(driver, ".//*[@id='test_plan_title']", name);
        sendText(driver, ".//*[@id='test_plan_description']", name);
        driver.findElement(By.className("modal-body")).findElement(By.xpath("./form/div[3]/input")).click();
        Thread.sleep(1000);
        Assert.assertEquals(name, driver.findElement(By.className("plans-info-item-inner")).findElement(By.xpath("./a/h3")).getText());
    }

    public void deleteTestPlan(WebDriver driver) throws InterruptedException {
        driver.findElement(By.className("nav-tabs")).findElement(By.xpath("./li[2]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("plans-icons")).findElement(By.xpath("./div[1]")).click();
        waitForElement(driver, ".//*[@id='myModal']/div/div");
        clickButton(driver, ".//*[@id='confirm']");
        Thread.sleep(1000);

    }

    public void createModule(WebDriver driver, String name) throws InterruptedException {
        driver.findElement(By.className("nav-tabs")).findElement(By.xpath("./li[2]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("cases")).findElement(By.xpath("./div[1]/a")).click();
        waitForElement(driver, ".//*[@id='myModal']/div/div");
        sendText(driver, ".//*[@id='test_module_title']", name);
        sendText(driver, ".//*[@id='test_module_description']", name);
        driver.findElement(By.className("modal-body")).findElement(By.xpath("./form/div[3]/input")).click();
        Thread.sleep(1000);
        Assert.assertEquals(name+" (0)", driver.findElement(By.className("test-name")).getText());
    }

    public void editModule(WebDriver driver, String name) throws InterruptedException {
        driver.findElement(By.className("nav-tabs")).findElement(By.xpath("./li[2]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("test-lead")).findElement(By.xpath("./a[2]")).click();
        waitForElement(driver, ".//*[@id='myModal']/div/div");
        sendText(driver, ".//*[@id='test_module_title']", name);
        sendText(driver, ".//*[@id='test_module_description']", name);
        driver.findElement(By.className("modal-body")).findElement(By.xpath("./form/div[3]/input")).click();
        Thread.sleep(1000);
        Assert.assertEquals(name+"(0)", driver.findElement(By.className("test-name")).getText());
    }

    public void deleteModule(WebDriver driver) throws InterruptedException {
        driver.findElement(By.className("nav-tabs")).findElement(By.xpath("./li[2]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("test-lead")).findElement(By.xpath("./a[1]")).click();
        waitForElement(driver, ".//*[@id='myModal']/div/div");
        clickButton(driver, ".//*[@id='confirm']");
        Thread.sleep(1000);
    }

    public void createTestCase(WebDriver driver, String name) throws InterruptedException {
        driver.findElement(By.className("nav-tabs")).findElement(By.xpath("./li[2]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("test-caret")).click();
        driver.findElement(By.className("case")).click();
        waitForElement(driver, ".//*[@id='myModal']/div/div");
        sendText(driver, ".//*[@id='test_case_title']", name);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input.submit_project.btn.btn-green")).click();
        Thread.sleep(1000);
        Assert.assertEquals(name, driver.findElement(By.cssSelector("td.test-title")).getText());
    }

    public void editTestCase(WebDriver driver, String name) throws InterruptedException {
        driver.findElement(By.className("nav-tabs")).findElement(By.xpath("./li[2]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("test-caret")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("cases-test-content-item")).findElement(By.xpath("./table/tbody/tr[2]/td[11]/div/a[2]/span")).click();
        waitForElement(driver, ".//*[@id='myModal']/div/div");
        Thread.sleep(1000);
        sendText(driver, ".//*[@id='test_case_title']", name);
        driver.findElement(By.className("modal-content")).findElement(By.xpath("./form/div[2]/input")).click();
        Thread.sleep(1000);
        Assert.assertEquals(name, driver.findElement(By.cssSelector("td.test-title")).getText());
    }

    public void deleteTestCase(WebDriver driver) throws InterruptedException {
        driver.findElement(By.className("nav-tabs")).findElement(By.xpath("./li[2]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("test-caret")).click();
        driver.findElement(By.className("cases-test-content-item")).findElement(By.xpath("./table/tbody/tr[2]/td[11]/div/a[1]/span")).click();
        waitForElement(driver, ".//*[@id='myModal']/div/div");
        clickButton(driver, ".//*[@id='confirm']");
        Thread.sleep(1000);
        Assert.assertEquals("test1 (0)", driver.findElement(By.className("test-name")).getText());
    }
}
