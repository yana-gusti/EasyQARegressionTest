package Methods.MyProfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by yanagusti on 10/4/17.
 */
public class Login{

    WebElement email;
    WebElement pass;
    WebElement signInButton;

    public void login(WebDriver driver, String _email, String _pass){

        email = driver.findElement(By.xpath(".//*[@id='user_email']"));
        pass = driver.findElement(By.xpath(".//*[@id='user_password']"));
        signInButton = driver.findElement(By.xpath(".//*[@id='new_user']/input[2]"));

        email.click();
        email.clear();
        email.sendKeys(_email);

        pass.click();
        pass.clear();
        pass.sendKeys(_pass);

        signInButton.click();
    }

}
