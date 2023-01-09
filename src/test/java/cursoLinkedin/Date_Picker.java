package cursoLinkedin;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Picker {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://WebDrivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/datepicker");
		driver.manage().window().maximize();

		WebElement date_field = driver.findElement(By.id("datepicker"));
		date_field.sendKeys("29/11/2022");
		date_field.sendKeys(Keys.RETURN);  //simula o aperto da tecla return("enter" no meu teclado)
		
	}

}
