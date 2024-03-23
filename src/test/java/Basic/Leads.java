package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Leads {
	@Test
	public void CreateOrginasationTest() {

		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		// adding username
		driver.findElement(By.name("user_name")).sendKeys("admin");

		// adding password
		driver.findElement(By.name("user_password")).sendKeys("password");

		// to click on login button
		driver.findElement(By.id("submitButton")).click();

		// Click on contacts
		driver.findElement(By.xpath("//a[text()='Leads']")).click();

		// To click on create contacts..(+)
		driver.findElement(By.cssSelector("img[alt='Create Lead...']")).click();

	}

}
