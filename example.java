package annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class example1 {
	WebDriver driver;
@BeforeClass
public void openBrowser() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.amazon.com");
	System.out.println("Browser Started");
}
@Test
public void buttonClick(){
WebElement we =driver.findElement(By.id("twotabsearchtextbox"));
we.sendKeys("one plus nord ce 5");
we.click();

System.out.println("Clicked on nav search bar");
}
@AfterClass
public void closeAll() {
	driver.quit();
	
}
}
