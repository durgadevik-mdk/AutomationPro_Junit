package practicalTest;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveAllItem {

	WebDriver driver;

	public RemoveAllItem(WebDriver driver) {

		this.driver = driver;

	}

	@FindBy(how = How.CSS, using = "input[name= allbox]")
	WebElement TOGGLE_ALL_CHECKBOX_FIELD;
	@FindBy(how = How.CSS, using = "input[value=Remove]")
	WebElement REMOVE_ITEMS_FROM_LIST;
	@FindBy(how = How.CSS, using = "input[name='todo[1]']")
	WebElement VERIFY_SECOND_ELEMENT_ISDISPLAYED;
	@FindBy(how = How.CSS, using = "input[name='todo[2]']")
	WebElement VERIFY_THIRSD_ELEMENT_ISDISPLAYED;
	@FindBy(how = How.CSS, using = "input[name='todo[3]']")
	WebElement VERIFY_FOURTH_ELEMENT_ISDISPLAYED;

	public void remove_All_Items() {
		TOGGLE_ALL_CHECKBOX_FIELD.click();
		REMOVE_ITEMS_FROM_LIST.click();
		try {
			VERIFY_SECOND_ELEMENT_ISDISPLAYED.isDisplayed();
			VERIFY_THIRSD_ELEMENT_ISDISPLAYED.isDisplayed();
			VERIFY_FOURTH_ELEMENT_ISDISPLAYED.isDisplayed();
		} catch (NoSuchElementException e) {
			System.out.println("ALL ITEMS ARE DELETED");

		}

	}

}
