package basicPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssertion {
@Test
public void testGoogle() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	String title=driver.getTitle();
	String exceptedTitle="Google";
	Assert.assertEquals(title, exceptedTitle);
	driver.quit();
	
	
}
}
