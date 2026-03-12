package basicPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionExample {
@Test
public void launch() throws InterruptedException{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	String beforeLogin=driver.getCurrentUrl();
	WebElement loginButton = driver.findElement(By.id("login-button"));
	Assert.assertTrue(loginButton.isDisplayed());
	loginButton.submit();
	String afterLogin=driver.getCurrentUrl();
	Assert.assertNotEquals(beforeLogin, afterLogin);
	System.out.println("Yes!!!! It is Redirected");
	driver.quit();
	
	
}
}
