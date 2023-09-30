package pageobjects;

import org.openqa.selenium.By;
import resuable.BaseCode;

public class SalesForceLoginPage extends BaseCode {

    public static void enterUserName(String username){
        driver.findElement(By.name("username")).sendKeys(username);

      //  driver.findElement(By.xpath("//div[@id='username_container']/child::input[1]")).sendKeys(username);
    }

    public static void enterPassword(String password){

        driver.findElement(By.id("password")).sendKeys(password);
    }

    public static void clickLoginButton(){

        driver.findElement(By.id("Login")).click();
    }

    public static String getErrorMessage(){

       String acutalResult = driver.findElement(By.id("error")).getText();
       return acutalResult;
    }
}
