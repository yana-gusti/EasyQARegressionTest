package Methods.MyProjects;

import Methods.BasePageMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.sleep;

/**
 * Created by yanagusti on 10/5/17.
 */
public class TestReports extends BasePageMethods {

    public void testPlanReport(WebDriver driver) throws InterruptedException {
        driver.findElement(By.className("nav-tabs")).findElement(By.xpath("./li[4]/a")).click();
        sleep(1000);
        clickButton(driver, ".//*[@id='report-type']/div/a");
        waitForElement(driver, ".//*[@id='report-type']/ul/li[2]/a");
        clickButton(driver, ".//*[@id='report-type']/ul/li[2]/a");
        waitForElement(driver, ".//*[@id='test-plan-report']/div/a");
        clickButton(driver, ".//*[@id='test-plan-report']/div/a");
        waitForElement(driver, ".//*[@id='test-plan-report']/ul/li[2]/a");
        clickButton(driver, ".//*[@id='test-plan-report']/ul/li[2]/a");
        clickButton(driver, ".//*[@id='report-button']");
        waitForElement(driver, ".//*[@id='tab_content']/div/div/div/div[2]/h3");


    }

    public void testRunReport(WebDriver driver) throws InterruptedException {
        driver.findElement(By.className("nav-tabs")).findElement(By.xpath("./li[4]/a")).click();
        sleep(1000);
        clickButton(driver, ".//*[@id='report-type']/div/a");
        waitForElement(driver, ".//*[@id='report-type']/ul/li[3]/a");
        clickButton(driver, ".//*[@id='report-type']/ul/li[3]/a");
        waitForElement(driver, ".//*[@id='test-run-report']/div/a");
        clickButton(driver, ".//*[@id='test-run-report']/div/a");
        waitForElement(driver, ".//*[@id='test-run-report']/ul/li[2]/a");
        clickButton(driver, ".//*[@id='test-run-report']/ul/li[2]/a");
        clickButton(driver, ".//*[@id='report-button']");
        waitForElement(driver, ".//*[@id='tab_content']/div/div/div/div[2]/h3");

    }

    public void userSpentTimeReport(WebDriver driver) throws InterruptedException {
        driver.findElement(By.className("nav-tabs")).findElement(By.xpath("./li[4]/a")).click();
        sleep(1000);
        clickButton(driver, ".//*[@id='report-type']/div/a");
        waitForElement(driver, ".//*[@id='report-type']/ul/li[4]/a");
        clickButton(driver, ".//*[@id='report-type']/ul/li[4]/a");
        waitForElement(driver, ".//*[@id='user-report']/div/a");
        clickButton(driver, ".//*[@id='user-report']/div/a");
        waitForElement(driver, ".//*[@id='user-report']/ul/li[2]/a");
        clickButton(driver, ".//*[@id='user-report']/ul/li[2]/a");
        clickButton(driver, ".//*[@id='report-button']");
        waitForElement(driver, ".//*[@id='tab_content']/div/div/div/div[2]/h3");

    }

    public void projectSpentTimeReport(WebDriver driver) throws InterruptedException {
        driver.findElement(By.className("nav-tabs")).findElement(By.xpath("./li[4]/a")).click();
        sleep(1000);
        clickButton(driver, ".//*[@id='report-type']/div/a");
        new Actions(driver).moveToElement(driver.findElement(By.xpath(".//*[@id='report-type']/ul/li[5]/a")))
                .build().perform();
        waitForElement(driver, ".//*[@id='report-type']/ul/li[5]/a");
        clickButton(driver, ".//*[@id='report-type']/ul/li[5]/a");
        clickButton(driver, ".//*[@id='report-button']");
        waitForElement(driver, ".//*[@id='tab_content']/div/div/div/div[2]/h3");

    }

    public void issuesByStatusReport(WebDriver driver) throws InterruptedException {
        driver.findElement(By.className("nav-tabs")).findElement(By.xpath("./li[4]/a")).click();
        sleep(1000);
        clickButton(driver, ".//*[@id='report-type']/div/a");
        new Actions(driver).moveToElement(driver.findElement(By.xpath(".//*[@id='report-type']/ul/li[6]/a")))
                .build().perform();
        waitForElement(driver, ".//*[@id='report-type']/ul/li[6]/a");
        clickButton(driver, ".//*[@id='report-type']/ul/li[6]/a");
        clickButton(driver, ".//*[@id='report-button']");
        waitForElement(driver, ".//*[@id='tab_content']/div/div/div/div[2]/h3");

    }

    public void issuesByPriorityReport(WebDriver driver) throws InterruptedException {
        driver.findElement(By.className("nav-tabs")).findElement(By.xpath("./li[4]/a")).click();
        sleep(1000);
        clickButton(driver, ".//*[@id='report-type']/div/a");
        new Actions(driver).moveToElement(driver.findElement(By.xpath(".//*[@id='report-type']/ul/li[7]/a")))
                .build().perform();
        waitForElement(driver, ".//*[@id='report-type']/ul/li[7]/a");
        clickButton(driver, ".//*[@id='report-type']/ul/li[7]/a");
        clickButton(driver, ".//*[@id='report-button']");
        waitForElement(driver, ".//*[@id='tab_content']/div/div/div/div[2]/h3");

    }

    public void issuesByTypeReport(WebDriver driver) throws InterruptedException {
        driver.findElement(By.className("nav-tabs")).findElement(By.xpath("./li[4]/a")).click();
        sleep(1000);
        clickButton(driver, ".//*[@id='report-type']/div/a");
        new Actions(driver).moveToElement(driver.findElement(By.xpath(".//*[@id='report-type']/ul/li[8]/a")))
                .build().perform();
        waitForElement(driver, ".//*[@id='report-type']/ul/li[8]/a");
        clickButton(driver, ".//*[@id='report-type']/ul/li[8]/a");
        clickButton(driver, ".//*[@id='report-button']");
        waitForElement(driver, ".//*[@id='tab_content']/div/div/div/div[2]/h3");

    }

    public void crashesByVersionReport(WebDriver driver) throws InterruptedException {
        driver.findElement(By.className("nav-tabs")).findElement(By.xpath("./li[4]/a")).click();
        sleep(1000);
        clickButton(driver, ".//*[@id='report-type']/div/a");
        new Actions(driver).moveToElement(driver.findElement(By.xpath(".//*[@id='report-type']/ul/li[9]/a")))
                .build().perform();
        waitForElement(driver, ".//*[@id='report-type']/ul/li[9]/a");
        clickButton(driver, ".//*[@id='report-type']/ul/li[9]/a");
        clickButton(driver, ".//*[@id='report-button']");
        waitForElement(driver, ".//*[@id='tab_content']/div/div/div/div[2]/h3");

    }
}
