package pageobjects;

import org.openqa.selenium.By;
import resuable.BaseCode;

public class AmazonSignInPage extends BaseCode {

    public static void enterMailId(String mailId){

     //   driver.findElement(By.id("ap_email")).sendKeys(mailId);
    //   driver.findElement(By.className("a-input-text a-span12 auth-autofocus auth-required-field")).sendKeys(mailId);

        driver.findElement(By.xpath("//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")).sendKeys(mailId);
    }

    public static void clickContinueButton(){

        driver.findElement(By.xpath("//input[@id='continue']")).click();
    }

    public static void enterPassword(String password){
        driver.findElement(By.name("password")).sendKeys(password);
    }

    public static void clickSignIn(){

        driver.findElement(By.id("signInSubmit")).click();

    }

}
