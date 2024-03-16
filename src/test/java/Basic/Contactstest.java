package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Contactstest {
	@Test
	public void CreateOrginasationTest() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");

	}

}
