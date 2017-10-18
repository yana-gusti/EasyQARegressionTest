package Methods.MyProjects;

import Methods.BasePageMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by yanagusti on 10/5/17.
 */
public class TestObjects extends BasePageMethods{

    public void addTestObject(WebDriver driver, String url) throws InterruptedException {
        driver.findElement(By.linkText("Add Test Object")).click();
        waitForElement(driver, ".//*[@id='myModal']/div/div");
        sendText(driver, ".//*[@id='test_object_link']", url);
        Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='test_object_link']")).submit();


    }

    public void viewTestObject(WebDriver driver, String url){
        driver.findElement(By.className("test-object")).findElement(By.xpath("./td[8]/a")).click();
        waitForElement(driver, ".//*[@id='myModal']/div/div");
        Assert.assertEquals(url, driver.findElement(By.xpath(".//*[@id='myModal']/div/div/div[2]/a")).getText());
        clickButton(driver, ".//*[@id='myModal']/div/div/div[2]/div/button[1]");
        clickButton(driver, ".//*[@id='myModal']/div/div/div[1]/span/span");
    }

    public void deleteTestObject(WebDriver driver) throws InterruptedException {
        driver.findElement(By.className("test-object")).findElement(By.xpath("./td[1]/a")).click();
        driver.findElement(By.className("test-object")).findElement(By.xpath("./td[1]/a")).submit();
        Thread.sleep(2000);
        clickButton(driver, "html/body/div[2]/div[2]/span");

    }
}
