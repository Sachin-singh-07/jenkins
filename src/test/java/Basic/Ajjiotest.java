package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ajjiotest {
	@Test
	public void CreateOrginasationTest() {

		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		// Login to application
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("password");
		driver.findElement(By.id("submitButton")).click();

		// Click on Organizations
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();

	}

}
