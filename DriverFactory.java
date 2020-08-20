package scraper.tools;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverFactory {
	
	String LocalUrl = "http://127.0.0.1:9515";
	
	public RemoteWebDriver getRemoteWebDriver(String type) {
		
		String url = "";
		ChromeOptions chromeOptions = null;
		
		if (type == "bank") {
			url = "https://www.bankofamerica.com/";
			
			chromeOptions = new ChromeOptions(); 
			String userProfile= "C:\\Users\\Owner\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\"; 
			chromeOptions.addArguments("user-data-dir="+userProfile); 
			//chromeOptions.addArguments("--start-maximized");
		}else if(type == "clock") {
			url = "http://www.allweb-n-mobile.com/projectmanager/awmadmin/index.php";
			chromeOptions = new ChromeOptions();
		}else if(type == "cl") {
			url = "https://tampa.craigslist.org/search/jjj";
			chromeOptions = new ChromeOptions();
		}
		
		RemoteWebDriver driver = null;
		try {
			driver = new RemoteWebDriver(new URL(LocalUrl), chromeOptions);
		} catch (MalformedURLException e) {
			
			
			e.printStackTrace();
		} catch (Exception regularException) {
			System.err.println("*** ERROR: could not build driver.  Make sure that chromedriver.exe is running. ***");
			System.out.println("The last know location was adamsl@Computer:/mnt/c/Users/Owner/automation/selenuimGold$\n"
					+ "Make sure that the chrome version matches! (chromedriver.exe -v matches chrome -> help -> about)");
			regularException.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		return driver;
	}
}

