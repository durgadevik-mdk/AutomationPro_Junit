package practicalTest;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import util.BrowserFactory;

public class ToggleAllItem {

	WebDriver driver;

	public ToggleAllItem(WebDriver driver) {

		this.driver = driver;

	}

	@FindBy(how = How.CSS, using = "input[name= allbox]")
	WebElement TOGGLE_ALL_CHECKBOX_FIELD;
	@FindBy(how = How.CSS, using = "input[value=Remove]")
	WebElement REMOVE_ITEMS_FROM_LIST;
	@FindBy(how = How.CSS, using = "input[name= data]")
	WebElement ADD_ITEMS_FIELD;
	@FindBy(how = How.CSS, using = "input[value=Add]")
	WebElement CLICK_ADD_BUTTON_FIELD;
	@FindBy(how = How.CSS, using = "div#todos-content li:nth-of-type(1) input")
	WebElement VERIFY_CHECKBOX_FIELD_ONE;
	@FindBy(how = How.CSS, using = "div#todos-content li:nth-of-type(2) input")
	WebElement VERIFY_CHECKBOX_FIELD_TWO;
	@FindBy(how = How.CSS, using = "div#todos-content li:nth-of-type(3) input")
	WebElement VERIFY_CHECKBOX_FIELD_THREE;
	@FindBy(how = How.CSS, using = "div#todos-content li:nth-of-type(4) input")
	WebElement VERIFY_CHECKBOX_FIELD_FOUR;
	

	public void remove_All_Items_From_List_Before_Adding() {
		TOGGLE_ALL_CHECKBOX_FIELD.click();
		REMOVE_ITEMS_FROM_LIST.click();

	}

	public void add_Items_To_The_List() {
		for (int i = 0; i <= 3; i++) {
			ADD_ITEMS_FIELD.sendKeys("addone" + i);
			CLICK_ADD_BUTTON_FIELD.click();
		}

	}

	public void verify_Items_Are_Selected() {
		TOGGLE_ALL_CHECKBOX_FIELD.click();
		Assert.assertTrue(VERIFY_CHECKBOX_FIELD_ONE.isSelected());
		Assert.assertTrue(VERIFY_CHECKBOX_FIELD_TWO.isSelected());
		Assert.assertTrue(VERIFY_CHECKBOX_FIELD_THREE.isSelected());
		Assert.assertTrue(VERIFY_CHECKBOX_FIELD_FOUR.isSelected());
	}

	

}
