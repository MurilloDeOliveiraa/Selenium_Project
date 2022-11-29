package cursoLinkedin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Site_Login {

	public static WebDriver driver = new ChromeDriver();
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://WebDrivers/chromedriver");
		
		driver.get("https://formy-project.herokuapp.com/autocomplete");
		driver.manage().window().maximize();
		
		WebElement address_textBox = driver.findElement(By.id("autocomplete"));
		address_textBox.sendKeys("Rua Goiania");
		
		WebElement street_textBox = driver.findElement(By.id("street_number"));
		street_textBox.sendKeys("1253");
		


	}

}
