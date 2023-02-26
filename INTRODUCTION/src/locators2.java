import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String password= getpassword(driver);
		String name= "mahesh";
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		
		
		driver.findElement(By.xpath("//div[@class='checkbox-container']/span[1]/input")).click();
		driver.findElement(By.xpath("//div[@class='checkbox-container']/span[2]/input")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		

	}
	
	public static String getpassword(WebDriver driver)
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		try {

		    Thread.sleep(4000);                 //1000 milliseconds is one second.

		} catch(InterruptedException ex) {

		    Thread.currentThread().interrupt();

		}
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		String passwordtext= driver.findElement(By.xpath("//form/p")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordsplit1=passwordtext.split("'");
		String[] passwordsplit2= passwordsplit1[1].split("'");
		String password=passwordsplit2[0];
		return password;
		
		
	}
	
	
	
	
	
	
	
	

}



