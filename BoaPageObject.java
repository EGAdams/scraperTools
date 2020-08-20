package scraper.tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BoaPageObject extends PageObject {

    public BoaPageObject(WebDriverObject webDriverObjectArg) {
        super(webDriverObjectArg);
    }

    private WebElement getSearchField() {
        return webDriverObject.findElement(By.id("search"));
    }
    
    public void searchFor(String text) {
        getSearchField().sendKeys(text);
    }

    
    private WebElement getIdField() {
        return webDriverObject.findElement(By.id("onlineId1"));
    }
    
    public void sendId(String id) {
    	getIdField().sendKeys(id);
    }
    
    private WebElement getPassField() {
        return webDriverObject.findElement(By.id("passcode1"));
    }
    
    public void sendPass(String text) {
    	getPassField().sendKeys(text);
    }
    
    public void getNav() {
    	webDriverObject.findElement(By.id("navHomeLoans"));
    	System.out.println("got nav.");
    }

    public String getSearchLabel() {
        WebElement element = webDriverObject.findElement(By.cssSelector("div.find label"));
        return element.getText();
    }

    
    public void clearSearch() {
        webDriverObject.executeJavaScript("$('span.cancel').click()");
    }
}


// onlineId1 //passcode1

