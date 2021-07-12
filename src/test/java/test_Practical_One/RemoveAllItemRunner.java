package test_Practical_One;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import practicalTest.RemoveAllItem;
import util.BrowserFactory;

public class RemoveAllItemRunner {

	WebDriver driver;

	@Test
	public void removeAllItemRunner() {

		driver = BrowserFactory.launchBrowser();

		RemoveAllItem remove = PageFactory.initElements(driver, RemoveAllItem.class);

		remove.remove_All_Items();
		BrowserFactory.tearDown();
	}

}
