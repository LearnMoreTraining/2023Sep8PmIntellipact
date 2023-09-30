package pageobjects;

import org.openqa.selenium.By;
import resuable.BaseCode;

public class BookSpiceHomePage extends BaseCode {

    public static void selectValueFromDropdown(int ul , int li){
        driver.findElement(By.xpath("//div[@id='dropdownGroup1']/descendant::ul["+ul+"]/child::li["+li+"]")).click();
    }

    public static String getValueFromTable(int rowIndex , int colIndex){

      return  driver.findElement(By.xpath("//table[@class='wikitable']//tr["+rowIndex+"]//td["+colIndex+"]")).getText();
    }

    public static String getValueFromTable(int colIndex){
      return  driver.findElement(By.xpath("//table[@class='wikitable']//tr//td["+colIndex+"]")).getText();
    }

    public static String getValueFromTable(String text){
        return driver.findElement(By.xpath("//table[@class='wikitable']//td[normalize-space(text())='"+text+"']/following-sibling::td")).getText();
    }

    public static void byText(String cityName){
        driver.findElement(By.xpath("//a[text()='"+cityName+"']")).click();
    }
}
