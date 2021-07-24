package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHanding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		WebElement custid = driver.findElement(By.xpath("//*[@name='cusid']"));
		WebElement submit = driver.findElement(By.xpath("//*[@name='submit']"));
		
		custid.sendKeys("1234");
		
		submit.click();

        Alert alert = driver.switchTo().alert();
        
        /*alert.accept();*/
        alert.dismiss();
	}
}
