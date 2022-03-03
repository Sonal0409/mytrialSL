package myseleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Script1 {

	@Test
	public void testcase1() {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","src/main/java/com/automation/driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://en.wikipedia.org/wiki/Main_Page");

	}

}
