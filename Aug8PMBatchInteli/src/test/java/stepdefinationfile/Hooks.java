package stepdefinationfile;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import resuable.BaseCode;

import java.io.IOException;

import static resuable.BaseCode.driver;

public class Hooks {

    @Before() //start
    public void setup() throws IOException {
        System.out.println("Browser Starts.....");
        BaseCode.browserInvocation();
    }
    @BeforeStep()
    public void tak(){

    }
    @AfterStep()  // execute after each and every statment
    public void takeScreenshot(Scenario s){

        byte[] h =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        s.attach(h,"image/png",s.getName());
    }

    @After() // end of scenario
    public void tearDown(){
        System.out.println("Browser close....");
    }




}
