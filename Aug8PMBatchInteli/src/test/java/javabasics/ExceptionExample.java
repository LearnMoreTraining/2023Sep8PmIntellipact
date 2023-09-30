package javabasics;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import resuable.BaseCode;

import java.time.Duration;
import java.util.NoSuchElementException;

public class ExceptionExample extends BaseCode {

    public static void main(String[] args) {


        String a = "$13";
        try {
            driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit")).click();
            driver.findElement(By.id("popUpConverter")).click();
            int b = 10;
            int c = Integer.parseInt(a);
            System.out.println(b + c);
        }
        catch(NumberFormatException k){

          String va=  a.substring(1);
          int v = Integer.parseInt(va);
            System.out.println(v+10);

        }
        catch (NoSuchElementException k){

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("popUpConverter")));
            driver.findElement(By.id("popUpConverter")).click();

        }

        finally {

        }

    }
}
