package scraper.tools;

public class BankInfo {

	public static void main(String[] args) {
		
		PageObjectFactory factory = new PageObjectFactory();
		BoaPageObject boaPage = (BoaPageObject) factory.getPageObject("bank");
		
		boaPage.sendId("idHere");
		

	}

}
