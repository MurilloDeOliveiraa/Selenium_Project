package cursoLinkedin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_buttons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://WebDrivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/radiobutton");
		driver.manage().window().maximize();

		WebElement radio_button1 = driver.findElement(By.id("radio-button-1"));
		radio_button1.click();
		
		WebElement radio_button2 = driver.findElement(By.cssSelector("input[value='option2']"));
		WebElement radio_button3 = driver.findElement(By.cssSelector("input[value='option3']"));
		
		radio_button2.click();
		radio_button3.click();
		
	}

}
