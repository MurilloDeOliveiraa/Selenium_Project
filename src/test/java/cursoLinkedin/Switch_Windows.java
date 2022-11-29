package cursoLinkedin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_Windows {

		public static WebDriver driver = new ChromeDriver();
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://WebDrivers/chromedriver");
		
		driver.get("https://formy-project.herokuapp.com/switch-window");
		driver.manage().window().maximize();
		
		WebElement newTab_button = driver.findElement(By.id("new-tab-button"));
		newTab_button.click();
		
		String originalHandle = driver.getWindowHandle();
		
//		for (String handle1: driver.getWindowHandles()) {
//			driver.switchTo().window(handle1);
//		}
		Thread.sleep(2000);
		driver.switchTo().window(originalHandle);
		
	}

}
