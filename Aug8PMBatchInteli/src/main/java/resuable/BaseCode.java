package resuable;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseCode {

    public static WebDriver driver;  //null //chrome
    public static Properties prob;
    public static void browserInvocation() throws IOException {

        FileInputStream fis = new FileInputStream(new File("src/main/resources/configuration/conif.properties"));
        prob = new Properties();
        prob.load(fis);

        if(prob.getProperty("browser").equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }
        else if(prob.getProperty("browser").equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }
        else if(prob.getProperty("browser").equalsIgnoreCase("safari")){
            driver = new SafariDriver();
        }
        else{
            throw new InvalidArgumentException("pass the valid browsermname");
        }

        driver.navigate().to(prob.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

}
