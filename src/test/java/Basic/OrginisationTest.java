package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrginisationTest {
	@Test
	public void CreateOrginasationTest() {

		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");

	}

}
