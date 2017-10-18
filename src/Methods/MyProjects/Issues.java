package Methods.MyProjects;

import Methods.BasePageMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by yanagusti on 10/5/17.
 */
public class Issues extends BasePageMethods {

    public void createIssue(WebDriver driver, String summary) throws InterruptedException {
        driver.findElement(By.className("head_title_top")).findElement(By.xpath("./a")).click();
        waitForElement(driver, ".//*[@id='myModal']/div/div");
        sendText(driver, ".//*[@id='issue_summary']", summary);
        clickButton(driver, ".//*[@id='new_issue']/div[2]/input");
        Thread.sleep(2000);
        Assert.assertEquals(summary, driver.findElement(By.className("card_content")).findElement(By.xpath("./div/p")).getText());
    }

    public void openIssue(WebDriver driver){
        clickButton(driver, ".//*[@id='status-1']/div");
        clickButton(driver, ".//*[@id='status-1']/div");
        waitForElement(driver, ".//*[@id='myModal']/div/div");
    }

    public void closeIssue(WebDriver driver){
        clickButton(driver, ".//*[@id='myModal']/div/div/span/span");
    }

    public void editIssue(WebDriver driver, String summary) throws InterruptedException {
        openIssue(driver);
        driver.findElement(By.className("tab-footer")).findElement(By.xpath("./div[1]/div")).click();
        sendText(driver, ".//*[@id='issue_summary']", summary);
        sendText(driver, ".//*[@id='issue_description']", summary);

        driver.findElement(By.className("tab-footer")).findElement(By.xpath("./div[2]/input")).click();
        Thread.sleep(1000);
        closeIssue(driver);
        Thread.sleep(2000);
        Assert.assertEquals(summary, driver.findElement(By.className("card_content")).findElement(By.xpath("./div/p")).getText());
    }

    public void deleteIssue(WebDriver driver) throws InterruptedException {
        openIssue(driver);
        driver.findElement(By.cssSelector("a.btn.btn-red.btn-big")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(2000);
    }
}
