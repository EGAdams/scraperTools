/**
 * 
 */
package scraper.tools;

/**
 * @author Owner
 *
 */
public class CLPageObject extends PageObject {

	public CLPageObject(WebDriverObject webDriverObject) {
		super(webDriverObject);
	}
	
	public static void main(String[] args) {
		PageObjectFactory factory = new PageObjectFactory();
		CLPageObject page = (CLPageObject) factory.getPageObject("cl");
	}

}
