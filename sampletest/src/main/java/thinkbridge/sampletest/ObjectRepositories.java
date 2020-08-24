package thinkbridge.sampletest;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ObjectRepositories {
	
	@FindBy(xpath="//div[@id='language']//i[@class='caret pull-right']")
	private WebElement languageDropdownIcon;
	
	@FindBy(xpath="//a/div")
	private List<WebElement> languages;
	
	public List<WebElement> getLanguages() {
		return languages;
	}


	@FindBy(xpath="(//a/div)[1]")
	private WebElement firstLanguage;
	
	@FindBy(xpath="(//a/div)[2]")
	private WebElement secondLanguage;
	
	
	@FindBy(id="name")
	private WebElement name;
	
	@FindBy(id="orgName")
	private WebElement orgName;
	
	@FindBy(id="singUpEmail")
	private WebElement email;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkBox;
	
	@FindBy(xpath="//button")
	private WebElement signupButton;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-custom']/span")
	private WebElement errorMassage;
	
	

	public WebElement getErrorMassage() {
		return errorMassage;
	}

	public WebElement getLanguageDropdownIcon() {
		return languageDropdownIcon;
	}

	public WebElement getFirstLanguage() {
		return firstLanguage;
	}

	public WebElement getSecondLanguage() {
		return secondLanguage;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getOrgName() {
		return orgName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getSignupButton() {
		return signupButton;
	}
	
	

}
