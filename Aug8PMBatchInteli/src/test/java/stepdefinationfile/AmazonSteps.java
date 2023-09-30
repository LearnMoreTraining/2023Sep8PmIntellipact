package stepdefinationfile;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.tr.Ama;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pageobjects.AmazonHomePage;
import pageobjects.AmazonSignInPage;
import pageobjects.BookSpiceHomePage;
import resuable.BaseCode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AmazonSteps extends BaseCode {

    @Given("user should navigate to url")
    public void launchUrl() throws IOException {

        BaseCode.browserInvocation();
    }


    @When("user enter the search keyword {string} and click on search icon")
    public void enterSearchKeyword(String keyword) {

        AmazonHomePage.enterSearchKeyword(keyword);
        AmazonHomePage.clickSearchButton();

    }

    @Then("user validate the message")
    public void validateMessage() {

    }


    @When("user clicks the login button on homepage")
    public void clicklogin() {

        AmazonHomePage.clickSignInButton();

    }

    @And("user enter the credi")
    public void userEnterTheCredi() {

        AmazonSignInPage.enterMailId("an.aravinth22@gmail.com");
        AmazonSignInPage.clickContinueButton();
        AmazonSignInPage.enterPassword("1234");
        AmazonSignInPage.clickSignIn();



    }

    @When("user selects the value from category dropdown")
    public void selectCategaory() {

        AmazonHomePage.handelByValue("");
        for(int i =0 ; i < AmazonHomePage.getDropdownSize() ; i++){
          String val =  AmazonHomePage.getDropdownValues(i);
            System.out.println(val);
        }

    }

    @Given("user selects the value from from and to dropdown")
    public void userSelectsTheValueFromFromAndToDropdown() {

        driver.findElement(By.xpath("//span[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXTaction']/following-sibling::input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']")).click();
        BookSpiceHomePage.selectValueFromDropdown(2,2);
    }

    @Given("user clicks the baby wishlist")
    public void userClicksTheBabyWishlist() {

        WebElement signInElement = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions a = new Actions(driver);
        a.clickAndHold(signInElement).build().perform();
       String keyActions = Keys.chord(Keys.CONTROL,Keys.ENTER);
        driver.findElement(By.linkText("Baby Wishlist")).sendKeys(keyActions);



    }

    @Then("verify whether the user naviages to baby wishlist page")
    public void verifyWhetherTheUserNaviagesToBabyWishlistPage() {

       Set<String> winPro = driver.getWindowHandles();
       for(String a:winPro){
           driver.switchTo().window(a);
           if(driver.getTitle().equals("")){
               break;
           }
       }

        Assert.assertEquals("Amazon: Baby Wish List",driver.getTitle());
        if(driver.getTitle().equals(": Baby Wish List")){

            Assert.assertTrue(true);
        }
        else{

            Assert.assertTrue(false);
        }

        driver.switchTo().defaultContent();
    }

    @Given("user iterates the colun values")
    public void userIteratesTheColunValues() {

       // WebElement eyTable = driver.findElement(By.xpath("//table[@class='infobox vcard']"));

      //  WebElement eyTable = driver.findElement(By.cssSelector("table[class='infobox vcard']"));
        WebElement eyTable = driver.findElement(By.cssSelector(".infobox.vcard"));
        int coluOneSize= eyTable.findElements(By.tagName("th")).size();
        List<WebElement> k = eyTable.findElements(By.tagName("th")); //13
        List<String> coloneval = new ArrayList<String>();  //empty list
        for(WebElement g:k) {
            coloneval.add(g.getText());
        }
        System.out.println(coloneval);


//        for(int i =0 ; i < coluOneSize ; i++){
//            String columnOneValue = eyTable.findElements(By.tagName("th")).get(i).getText();
//           coloneval.add(columnOneValue);
//        }

//
//
//        }
//        System.out.println(coloneval);
//
//        List <String> coltwoval =  new ArrayList<String>();
//        for(int k = 1 ; k < eyTable.findElements(By.tagName("td")).size();k++){
//
//            coltwoval.add(eyTable.findElements(By.tagName("td")).get(k).getText());
//
//        }
//
//        WebElement eyRevenu = driver.findElement(By.className("wikitable"));
//
//        for(int i =0 ; i < eyRevenu.findElements(By.xpath("//tr/child::td[1]")).size();i++){
//
//            driver.findElement(By.cssSelector("#username"));
//        }


    }

    @Given("drag and drop the element")
    public void dragAndDropTheElement() {

        Actions d = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        d.dragAndDrop(source,target).build().perform();
    }
}
