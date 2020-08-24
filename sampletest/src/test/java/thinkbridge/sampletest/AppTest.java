package thinkbridge.sampletest;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AppTest {
@Test
public void sampleTest() {
	String expFirstLang="English";
	String expSecondLang="Dutch";
	String expLoginMsg="A welcome email has been sent. Please check your email.";
	
	
	SoftAssert asser= new SoftAssert();
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://jt-dev.azurewebsites.net/#/SignUp");
	
	ObjectRepositories obj= PageFactory.initElements(driver, ObjectRepositories.class);
	
	
	/*Test Scenario*/
	obj.getLanguageDropdownIcon().click();
	List<WebElement> lst= obj.getLanguages();
	List<String> lst1=new ArrayList<String>(lst.size());
	for(int i=0;i<=lst.size();i++) {
		lst1.add(lst.get(i).getText());
	}
	String actFirstLang= lst1.get(0);
	Reporter.log("First Languagle In List = "+ lst1.get(0));
	String actsecondlang=lst1.get(1);
	Reporter.log("Second Language In The List = "+lst1.get(1));
	asser.assertEquals(actFirstLang, expFirstLang);
	asser.assertEquals(expSecondLang, actsecondlang);
	
	obj.getFirstLanguage().click();
	obj.getName().sendKeys("Anand");
	obj.getOrgName().sendKeys("Anand");
	obj.getEmail().sendKeys("fromandywithlove@gmail.com");
	obj.getCheckBox().click();
	obj.getSignupButton().click();
	String actErrMsg=obj.getErrorMassage().getText();
	Reporter.log("Login Massage =" +actErrMsg);
	asser.assertEquals(actErrMsg,expLoginMsg );
	/*Validating the email in my gmail is almost impossible because it requires an otp each time i login with a new device*/
}
}
    