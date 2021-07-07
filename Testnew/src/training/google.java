package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class google {
	WebDriver driver;
	@Test
	public void trainingTwo()
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\844897\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		WebElement ef=driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/a/span[2]"));
		ef.click();
		WebElement one=driver.findElement(By.id("firstName"));
		one.sendKeys("karthi");
		
							
	}
	

}
