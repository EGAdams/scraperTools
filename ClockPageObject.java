package scraper.tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ClockPageObject {

    private WebDriverObject webDriverObject;

    public ClockPageObject(WebDriverObject webDriverObjectArg) {
        this.webDriverObject = webDriverObjectArg;
    }

    private WebElement getEpochTime() {
        return webDriverObject.findElement(By.id("search"));
    }
}

