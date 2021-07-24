package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement Username = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement Password = driver.findElement(By.xpath("//input[@name='pass']"));
		WebElement Loginbutton = driver.findElement(By.xpath("//button[@name='login']"));
		
		Username.sendKeys("abc@gmail.com");
		Password.sendKeys("aaa");
		Loginbutton.click();
		
		driver.quit();

	}

}