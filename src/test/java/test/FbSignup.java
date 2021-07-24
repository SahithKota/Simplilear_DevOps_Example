package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		/*WebElement create = driver.findElement(By.xpath("//*[text()='Create New Account']"));*/
		WebElement create = driver.findElement(By.xpath("//*[contains(text(),'Create')]")); //for long text simply write contains

		create.click();
		
		WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
	    Select Monthdropdown = new Select(month);
		Monthdropdown.selectByVisibleText("Jan");
		
		WebElement Gender = driver.findElement(By.xpath("//*[@type='radio' and @value='2']"));
		Gender.click();
		
		driver.quit();

	}

}