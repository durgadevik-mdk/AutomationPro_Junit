package test_Practical_One;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import practicalTest.RemoveSingleItem;
import util.BrowserFactory;

public class RemoveSingleItemRunner {

	WebDriver driver;

	@Test
	public void test_Toggle_All_Checkbox() {
		
		driver = BrowserFactory.launchBrowser();
		RemoveSingleItem removeitem = PageFactory.initElements(driver, RemoveSingleItem.class);
		removeitem.add_Items_To_The_List();
		removeitem.remove_One_Item_From_List();		;
		BrowserFactory.tearDown();
	}

}
