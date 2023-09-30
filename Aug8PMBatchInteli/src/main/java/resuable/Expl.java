package resuable;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Expl extends BaseCode {

    public void applyWait(int duration){
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(duration));
    }
}
