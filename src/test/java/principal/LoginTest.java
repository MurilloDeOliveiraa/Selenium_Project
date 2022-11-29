package principal;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



public class LoginTest {

	public static void main(String[] args) {
		//Comando da biblioteca WebDriverManager para sempre buscar pela última atualização desse browser
		//Pode ser usado para outros tipos de browsers tb
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C://WebDrivers/chromedriver");
		
		// Criação de um objeto para acessar os métodos e atributos da Classe ChromeDriver
		ChromeDriver driver1 = new ChromeDriver();
		//EdgeDriver driver2 = new EdgeDriver();    // Testando em 2 browsers diferentes
				
				
		driver1.get("https://www.saucedemo.com/");
		driver1.manage().window().maximize();
	
				
		driver1.findElement(By.id("user-name")).sendKeys("standard_user");
		driver1.findElement(By.id("password")).sendKeys("secret_sauce");
		driver1.findElement(By.cssSelector("#login-button")).click();
				
		//driver1.close();
		//driver2.get("https://www.google.com");

	}

}
