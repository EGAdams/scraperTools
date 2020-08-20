package scraper.tools;

public class PageObjectFactory {

	public PageObject getPageObject(String pageType) {
		
		if(pageType == "bank") {
			WebDriverObject driverObject = new WebDriverObject("bank");
			return new BoaPageObject(driverObject);
			
		}else if(pageType == "cl") {
			WebDriverObject driverObject = new WebDriverObject("cl");
			return new CLPageObject(driverObject);
		}
		
		return null;
	}
}
