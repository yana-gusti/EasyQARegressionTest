package Methods.MyProjects;

import Methods.BasePageMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by yanagusti on 10/4/17.
 */
public class Projects extends BasePageMethods{

    public void createProjetc(WebDriver driver, String name){
        clickButton(driver,".//*[@id='head_menu']/div[2]/a[2]");
        waitForElement(driver, ".//*[@id='myModal']/div/div/div[1]/h3");
        clickButton(driver, ".//*[@id='organization']/div/a");
        waitForElement(driver, ".//*[@id='organization']/ul/li[2]/a");
        clickButton(driver, ".//*[@id='organization']/ul/li[2]/a");
        clickButton(driver, ".//*[@id='new_project']/div/div[1]/div[2]/div/label[1]");
        clickButton(driver, ".//*[@id='new_project']/div/div[1]/div[2]/div/label[2]");
        clickButton(driver, ".//*[@id='new_project']/div/div[1]/div[2]/div/label[3]");
        sendText(driver, ".//*[@id='project_title']", name);
        clickButton(driver, ".//*[@id='new_project']/input[3]");
        waitForElement(driver, ".//*[@id='mCSB_1_container']/div[1]/div/div/div[1]/h1");
    }

    public void openProject(WebDriver driver){

        driver.findElement(By.className("project-main-info")).findElement(By.xpath("./div/a")).click();
        waitForElement(driver, ".//*[@id='modal_window']");
    }

    public void goToMyProjects(WebDriver driver){
        clickButton(driver, ".//*[@id='head_menu']/ul/li[2]/a");
        waitForElement(driver, ".//*[@id='search']");

    }

    public TestObjects goToTestObjects(WebDriver driver) throws InterruptedException {
        clickButton(driver, ".//*[@id='left-menu']/li[2]/a");
        Thread.sleep(2000);
        return new TestObjects();
    }

    public void goToIntegrations(WebDriver driver){
        clickButton(driver, ".//*[@id='left-menu']/li[3]/a");
        waitForElement(driver, ".//*[@id='content']/div/div[2]/a[1]");
    }

    public void goToTestActivities(WebDriver driver){
        clickButton(driver, ".//*[@id='left-menu']/li[4]/a");
        waitForElement(driver, ".//*[@id='testingActivities']/div[1]/h3");

    }

    public void goToIssues(WebDriver driver){
        clickButton(driver, ".//*[@id='project_title']");
        waitForElement(driver, ".//*[@id='mCSB_8_container']/div[1]/div/div[2]/div/div/div/div[1]/div/div[1]/div[1]/a");
    }

    public void goToCrashes(WebDriver driver){
        clickButton(driver, ".//*[@id='left-menu']/li[6]/a");
        waitForElement(driver, ".//*[@id='mCSB_8_container']/div[1]/div/div[2]/div/div/div/div/h2");

    }

    public void goToSettings(WebDriver driver){
        clickButton(driver, ".//*[@id='left-menu']/li[7]/a");
        waitForElement(driver, ".//*[@id='content']/div/a");

    }

    public void changeProject(WebDriver driver, String name){
        clickButton(driver, ".//*[@id='content']/div/a");
        waitForElement(driver, ".//*[@id='myModal']/div/div/div[1]/h3");
        sendText(driver, ".//*[@id='project_title']", name);
        driver.findElement(By.className("modal-body")).findElement(By.xpath("./form/input[3]")).click();
        waitForElement(driver, ".//*[@id='content']/div/h3");


    }

    public void addProjectMember(WebDriver driver){
        driver.findElement(By.className("nav-tabs")).findElement(By.xpath("./li[2]/a")).click();
        waitForElement(driver, ".//*[@id='modal_window']");
        clickButton(driver, ".//*[@id='modal_window']");
        waitForElement(driver, ".//*[@id='add_members']/tbody/tr[2]/td[6]/label");
        driver.findElement(By.className("project-role")).findElement(By.xpath("./div/div/div/a/label")).click();
        driver.findElement(By.className("project-role")).findElement(By.xpath("./div/div/ul/li[2]/a")).click();

        clickButton(driver, ".//*[@id='send']");
        waitForElement(driver, ".//*[@id='content']/div/table/tbody/tr[2]/td[2]");

    }

    public void deleteProjectMember(WebDriver driver){
        driver.findElement(By.className("nav-tabs")).findElement(By.xpath("./li[2]/a")).click();
        waitForElement(driver, ".//*[@id='modal_window']");
        clickButton(driver, ".//*[@id='modal_window']");
        waitForElement(driver, ".//*[@id='add_members']/tbody/tr[2]/td[6]/label");
        clickButton(driver, ".//*[@id='add_members']/tbody/tr[2]/td[6]/label");
        clickButton(driver, ".//*[@id='send']");
        waitForElement(driver, ".//*[@id='content']/div/table/tbody/tr[2]/td[2]");

    }

    public void deleteProject(WebDriver driver) throws InterruptedException {
        driver.findElement(By.className("nav-tabs")).findElement(By.xpath("./li[3]/a")).click();
        Thread.sleep(1000);
        waitForElement(driver, ".//*[@id='content']/div/a");
        WebElement element = driver.findElement(By.xpath("//*[@id='content']/div/a"));

        JavascriptExecutor ex = (JavascriptExecutor) driver;
        ex.executeScript("arguments[0].click();", element);

        waitForElement(driver, ".//*[@id='myModal']/div/div");
        clickButton(driver, ".//*[@id='confirm']");
        waitForElement(driver, ".//*[@id='mCSB_7_container']/div[1]/div/div/p");

    }
}
