package practicalTest;

import org.junit.Before;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveSingleItem {

	WebDriver driver;

	public RemoveSingleItem(WebDriver driver) {

		this.driver = driver;

	}

	@FindBy(how = How.CSS, using = "input[value=Remove]")
	WebElement REMOVE_ITEMS_FROM_LIST;
	@FindBy(how = How.CSS, using = "input[name= data]")
	WebElement ADD_ITEMS_FIELD;
	@FindBy(how = How.CSS, using = "input[value=Add]")
	WebElement CLICK_ADD_BUTTON_FIELD;
	@FindBy(how = How.CSS, using = "div#todos-content li:nth-of-type(1) input")
	WebElement VERIFY_CHECKBOX_FIELD_ONE;
	@FindBy(how = How.CSS, using = "input[name='todo[0]']")
	WebElement VERIFY_FIRST_ELEMENT_ISDISPLAYED;

	
	public void add_Items_To_The_List() {
		for (int i = 0; i <= 3; i++) {
			ADD_ITEMS_FIELD.sendKeys("addone" + i);
			CLICK_ADD_BUTTON_FIELD.click();
		}

	}
	
	public void remove_One_Item_From_List() {
		//driver.get("https://techfios.com/test/101/index.php");
		VERIFY_CHECKBOX_FIELD_ONE.click();
		REMOVE_ITEMS_FROM_LIST.click();
		try {
			VERIFY_FIRST_ELEMENT_ISDISPLAYED.isDisplayed();
		} catch (NoSuchElementException e) {
			System.out.println("ONE ITEM IS DELETED");

		}

	}

}
