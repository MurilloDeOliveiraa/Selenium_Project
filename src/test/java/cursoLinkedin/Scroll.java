package cursoLinkedin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {

	public static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://WebDrivers/chromedriver.exe");

		driver.get("https://formy-project.herokuapp.com/scroll");
		driver.manage().window().maximize();

		WebElement fullName_textBox = driver.findElement(By.id("name"));
		
		//Biblioteca Actions para interagir com a página(driver)
		Actions actions = new Actions(driver);
		actions.moveToElement(fullName_textBox);
		
		fullName_textBox.sendKeys("Murillo Lopes");
		
		WebElement date_textBox = driver.findElement(By.id("date"));
		date_textBox.sendKeys("29/11/2022");

	}

}
