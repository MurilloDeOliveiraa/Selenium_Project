package principal;

import java.util.Scanner;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.beust.jcommander.internal.Console;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login2 {
	
	public static WebDriver driver;  //WebDriver é um tipo de estrutura que facilita o código
									 //não preciso criar várias variáveis para cada tipo de browser
	public static void main(String[] args) {
			
		menu();
		
		Scanner scanner = new Scanner(System.in);
		String user_answer = scanner.nextLine();
		
		//Comando para dizer onde o nosso arquivo do ChromeDriver está instalado no PC
		System.setProperty("webdriver.chrome.driver", "C://WebDrivers/chromedriver");
		
		if (user_answer.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if(user_answer.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		
		// Steps of Test Automation
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();
		JOptionPane.showMessageDialog(null, "Teste OK");
		driver.close();
		driver.quit();
		
		
		
	}
	
	public static void menu() {
		System.out.println("OPÇÕES DE BROWSERS");
		System.out.println("-> Chrome");
		System.out.println("-> Edge");
		System.out.println("");
		System.out.println("Digite o browser que quer usar:");
	}
}
	
