package selenium.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EcoEatsOrder {
	WebDriver driver;

	@Test
	public void ecoeatsOrder() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ecoeatsbd.netlify.app/");
		driver.findElement(By.name("name")).sendKeys("Admin Refat");
		driver.findElement(By.name("phone")).sendKeys("01575267132");
		driver.findElement(By.name("address")).sendKeys("Dhaka Bangladesh Selenium");
		driver.findElement(By.xpath("//*[@id=\"order\"]/div/div/div[1]/div/div[2]/div/button")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
