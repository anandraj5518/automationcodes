package Koch.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class testScenario {
	@Test
	public  void test() throws Throwable {
		
		int count=0;
		
		SoftAssert asser=new SoftAssert();
		
		String expectedPageTitle="ixigo";
		String expectedResultPage="Pune - Hyderabad, Economy Flights, roundtrip, 10 Aug - 12 Aug";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.ixigo.com/");
		String actPageTitle=driver.getTitle();
		asser.assertEquals(expectedPageTitle.contains(actPageTitle), expectedPageTitle.equals(expectedPageTitle));
		if(expectedPageTitle.contains(actPageTitle))
			Reporter.log("Page Title Matched");
		else
			Reporter.log("Page Title Didn't Matched");
		/*Provided Departure city */
		objectRepository or= PageFactory.initElements(driver, objectRepository.class);
		or.getFromTextBox().sendKeys("Pune");
		Thread.sleep(2000);
		or.getPuneCityOption().click();
		/*Provided To city */
		or.getToTextBox().sendKeys("Hydrabad");
		Thread.sleep(2000);
		or.getHydrabadCityOption().click();
		/*Provided Departure Date */
		or.getDepartureInput().click();
		while(count<=10) {
			
		
		try {
			or.getDepartureDate().click();
		}
		catch (Exception e) {
			or.getNextButton().click();
			count++;
		}
		}
		/*Provided Return date */
		or.getReturnInput().click();
		while(count<=10) {
			
			
			try {
				or.getReturnDate().click();
			}
			catch (Exception e) {
				or.getNextButton().click();
				count++;
			}
			}
		/*Provided No Of Passenger */
			or.getPassengersInput().click();
			or.getTwoPatientSelect().click();
			or.getClosePassengerSelect().click();
			/*Click On Search */
			or.getSearchButton().click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			String actResultPage =driver.getTitle();
			asser.assertEquals(actResultPage, expectedResultPage);
			List<WebElement> flightList= or.getFlightList();
			List<String> flyList=new ArrayList<String>(flightList.size());
			for(WebElement wl :flightList) {
				flyList.add(wl.getText());
				}
			
			List<WebElement> prcLst=or.getPriceList();
			List<Integer> prcListInInt=new ArrayList<Integer>(prcLst.size());
			
			for(WebElement wl :prcLst) {
				prcListInInt.add(Integer.parseInt(wl.getText()));
				}
			for(int i=0;i<=prcLst.size();i++) {
				if(prcListInInt.get(i)<5000) {
					Reporter.log(flyList.get(i));
				}
			}
	}
	

}
