package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KiteLoginwebbrosermanager {
	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().version("100.0").setup();
		//WebDriver driver = new ChromeDriver();
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://kite.zerodha.com");
		driver.manage().window().maximize();
		
	}

}
