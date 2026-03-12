package basicPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertion {

@Test
public void performLogin() {

WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();

SoftAssert soft = new SoftAssert();

driver.get("https://www.saucedemo.com/");

String before = driver.getCurrentUrl();

driver.findElement(By.id("user-name")).sendKeys("standard_user");
driver.findElement(By.id("password")).sendKeys("secret_sauce");
driver.findElement(By.id("logi-button")).click();

String after = driver.getCurrentUrl();

soft.assertNotEquals(before, after);

System.out.println("Navigated to another page after login");

soft.assertAll();

driver.quit();
}
}
