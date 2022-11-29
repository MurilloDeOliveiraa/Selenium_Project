package cursoLinkedin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://WebDrivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/fileupload");
		driver.manage().window().maximize();

		WebElement upload_field = driver.findElement(By.id("file-upload-field"));
		upload_field.sendKeys("Apresentação em inglês - renault.txt");
	}

}
