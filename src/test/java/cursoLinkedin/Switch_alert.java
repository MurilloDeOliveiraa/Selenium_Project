package cursoLinkedin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_alert {

	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://WebDrivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/switch-window");
		driver.manage().window().maximize();
		
		WebElement alert_button = driver.findElement(By.id("alert-button"));
		alert_button.click();
		
		//biblioteca para ações com alertas
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();

	}

}
