package cursoLinkedin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdrow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://WebDrivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/dropdown");
		driver.manage().window().maximize();

		WebElement dropdown_button = driver.findElement(By.id("dropdownMenuButton"));
		dropdown_button.click();
		
		WebElement autocompleteItem = driver.findElement(By.id("autocomplete"));
		autocompleteItem.click();

	}

}
