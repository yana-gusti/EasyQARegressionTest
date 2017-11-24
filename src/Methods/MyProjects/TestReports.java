package Methods.MyProjects;

import Methods.BasePageMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        waitForElement(driver, ".//*[@id='report-type']/ul/div/div/li[2]/a");
        clickButton(driver, ".//*[@id='report-type']/ul/div/div/li[2]/a");
        waitForElement(driver, ".//*[@id='test-plan-report']/div/a");
        clickButton(driver, ".//*[@id='test-plan-report']/div/a");
        waitForElement(driver, ".//*[@id='test-plan-report']/ul/div/div/li[2]/a");
        clickButton(driver, ".//*[@id='test-plan-report']/ul/div/div/li[2]/a");
        clickButton(driver, ".//*[@id='report-button']");
        waitForElement(driver, ".//*[@id='tab_content']/div/div/div/div[2]/h3");


    }

    public void testRunReport(WebDriver driver) throws InterruptedException {
        driver.findElement(By.className("nav-tabs")).findElement(By.xpath("./li[4]/a")).click();
        sleep(1000);
        clickButton(driver, ".//*[@id='report-type']/div/a");
        waitForElement(driver, ".//*[@id='report-type']/ul/div/div/li[3]/a");
        clickButton(driver, ".//*[@id='report-type']/ul/div/div/li[3]/a");
        waitForElement(driver, ".//*[@id='test-run-report']/div/a");
        clickButton(driver, ".//*[@id='test-run-report']/div/a");
        sleep(1000);
        waitForElement(driver, ".//*[@id='test-run-report']/ul/div/div/li[2]/a");
        clickButton(driver, ".//*[@id='test-run-report']/ul/div/div/li[2]/a");
        clickButton(driver, ".//*[@id='report-button']");
        waitForElement(driver, ".//*[@id='tab_content']/div/div/div/div[2]/h3");

    }

    public void userSpentTimeReport(WebDriver driver) throws InterruptedException {
        driver.findElement(By.className("nav-tabs")).findElement(By.xpath("./li[4]/a")).click();
        sleep(1000);
        clickButton(driver, ".//*[@id='report-type']/div/a");
        waitForElement(driver, ".//*[@id='report-type']/ul/div/div/li[4]/a");
        clickButton(driver, ".//*[@id='report-type']/ul/div/div/li[4]/a");
        waitForElement(driver, ".//*[@id='user-report']/div/a");
        clickButton(driver, ".//*[@id='user-report']/div/a");
        waitForElement(driver, ".//*[@id='user-report']/ul/div/div/li[2]/a");
        clickButton(driver, ".//*[@id='user-report']/ul/div/div/li[2]/a");
        clickButton(driver, ".//*[@id='report-button']");
        waitForElement(driver, ".//*[@id='tab_content']/div/div/div/div[2]/h3");

    }

    public void projectSpentTimeReport(WebDriver driver) throws InterruptedException {
        generateReport(5, driver);

    }

    public void issuesByStatusReport(WebDriver driver) throws InterruptedException {
        generateReport(6, driver);

    }

    public void issuesByPriorityReport(WebDriver driver) throws InterruptedException {
        generateReport(7, driver);

    }

    public void issuesByTypeReport(WebDriver driver) throws InterruptedException {
        generateReport(8, driver);

    }

    public void crashesByVersionReport(WebDriver driver) throws InterruptedException {
        generateReport(9, driver);

    }

    public void generateReport(Integer i, WebDriver driver) throws InterruptedException {
        driver.findElement(By.className("nav-tabs")).findElement(By.xpath("./li[4]/a")).click();
        sleep(1000);
        clickButton(driver, ".//*[@id='report-type']/div/a");
        sleep(1000);
        WebElement list = driver.findElement(By.className("test-reports-item-cases")).
                findElement(By.xpath("./div/div/ul/div/div/li["+i+"]/a"));
        sleep(1000);

        Actions actions = new Actions(driver);
        actions.moveToElement(list);
        actions.click();

        actions.build().perform();

        sleep(1000);

        clickButton(driver, ".//*[@id='report-button']");
        waitForElement(driver, ".//*[@id='tab_content']/div/div/div/div[2]/h3");
    }
}
