package test_Practical_One;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import practicalTest.ToggleAllItem;
import util.BrowserFactory;

public class ToggleAllItemRunner {
	

	WebDriver driver;

	@Test
	public void toggleAllItemRunner() {

		driver = BrowserFactory.launchBrowser();

		ToggleAllItem toggleall = PageFactory.initElements(driver, ToggleAllItem.class);

		toggleall.remove_All_Items_From_List_Before_Adding();
		toggleall.add_Items_To_The_List();
		toggleall.verify_Items_Are_Selected();
		BrowserFactory.tearDown();
		
	}


}
