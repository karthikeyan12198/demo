package test;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newtest {
	static WebDriver driver;
	protected WebElement methodOne(){
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement eon=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		eon.sendKeys("Hello");
		eon.sendKeys(Keys.ENTER);
	
		return eon;
		
	}
	public static void two(){
		
	}
	
	private static void one(){
		int a=110;
		int b=20;
		int c=a+b;
		System.out.println(c);
			
	}

	public static void main(String[] args) {
		//newtest.methodOne();
//newtest t=new newtest();
//t.methodOne();
		//classname obj=new Classname();
newtest news=new newtest();
//newtest news2=new newtest();
//news2.one();
news.one();
news.methodOne();
//newtest.two();
//newtest.two();

	}

}
