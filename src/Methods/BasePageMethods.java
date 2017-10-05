package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * Created by yanagusti on 10/4/17.
 */
public class BasePageMethods{

    public void sendText(WebDriver driver, String xpath, String text){
        WebElement element = driver.findElement(By.xpath(xpath));
        element.click();
        element.clear();
        element.sendKeys(text);
    }

    public void clickButton(WebDriver driver, String xpath){
        WebElement element = driver.findElement(By.xpath(xpath));
        element.click();
    }

    public void selectItem( WebDriver driver, String xpath, String visibleText){

        Select select = new Select(driver.findElement(By.xpath(xpath)));
        select.selectByVisibleText(visibleText);
    }

    public void checkText(WebDriver driver, String text, String xpath){
        Assert.assertEquals(text, driver.findElement(By.xpath(xpath)).getText());
    }

    public void scroll(WebDriver driver) {
        Actions dragger = new Actions(driver);
        WebElement draggablePartOfScrollbar = driver.findElement(By.xpath(".//*[@id='mCSB_5_dragger_vertical']"));
        int numberOfPixelsToDragTheScrollbarDown1 = 1500;
        for (int i = 10; i < 1000; i = i + numberOfPixelsToDragTheScrollbarDown1) {
            try {
                // this causes a gradual drag of the scroll bar, 10 units at a time
                dragger.moveToElement(draggablePartOfScrollbar).clickAndHold().moveByOffset(0, numberOfPixelsToDragTheScrollbarDown1).release().perform();
                Thread.sleep(1000L);
            } catch (Exception e1) {
            }

        }
    }

    public void waitForElement(WebDriver driver, String xpath){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }


}
