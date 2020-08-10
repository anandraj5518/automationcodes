package Koch.Test;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class objectRepository {
public WebElement getFromTextBox() {
		return fromTextBox;
	}

	public WebElement getPuneCityOption() {
		return puneCityOption;
	}

	public WebElement getToTextBox() {
		return toTextBox;
	}

	public WebElement getHydrabadCityOption() {
		return hydrabadCityOption;
	}

	public WebElement getDepartureInput() {
		return departureInput;
	}

	public WebElement getDepartureDate() {
		return departureDate;
	}

	public WebElement getReturnInput() {
		return returnInput;
	}

	public WebElement getReturnDate() {
		return returnDate;
	}

	public WebElement getNextButton() {
		return nextButton;
	}

	public WebElement getPassengersInput() {
		return passengersInput;
	}

	public WebElement getTwoPatientSelect() {
		return twoPatientSelect;
	}

	public WebElement getClosePassengerSelect() {
		return closePassengerSelect;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

@FindBy (xpath = "//div[text()='From']/following-sibling::input")
private WebElement fromTextBox;

@FindBy (xpath = "//div[text()='PNQ - Pune, India']")
private WebElement puneCityOption;

@FindBy (xpath = "//div[text()='To']/following-sibling::input")
private WebElement toTextBox;

@FindBy (xpath = "//div[text()='HYD - Hyderabad, India']")
private WebElement hydrabadCityOption;

@FindBy (xpath = "//div[text()='Departure']/following-sibling::input")
private WebElement departureInput;

@FindBy(xpath="//td[@data-date='17092020']/div[1]")
private WebElement departureDate;


@FindBy (xpath = "//div[text()='Return']/following-sibling::input")
private WebElement returnInput;


@FindBy(xpath="//td[@data-date='24102020']/div[1]")
private WebElement returnDate;

@FindBy(xpath="//button[@class='ixi-icon-arrow rd-next']")
private WebElement nextButton;

@FindBy (xpath = "//div[text()='Travellers | Class']/following-sibling::input")
private WebElement passengersInput;

@FindBy (xpath = "//span[@class='counter-item u-text-center u-ib current' and text()='2']")
private WebElement twoPatientSelect;

@FindBy (xpath = "//div[text()='Travellers']/div")
private WebElement closePassengerSelect;

@FindBy (xpath = "//button[text()='Search']/div/span")
private WebElement searchButton;


/*Result Page Elements*/

@FindBy (xpath = "//div[text()='Non stop']/../../span/span")
private WebElement nonstopCheckbox;

@FindBy (xpath="//div[@class='price']/div/span[2]")
private List<WebElement> priceList;

public List<WebElement> getPriceList() {
	return priceList;
}

@FindBy (xpath="//div[@class='airline-text']/div")
private List<WebElement> flightList;

public List<WebElement> getFlightList() {
	return priceList;
}


}
