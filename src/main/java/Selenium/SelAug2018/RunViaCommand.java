package Selenium.SelAug2018;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RunViaCommand {
	
	@Test
	public void loginVerification(){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).clear();
	    driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    System.out.println("Login button clicked");
		
	}

}
