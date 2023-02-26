import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdowns2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
		try {

		    Thread.sleep(4000);                 //1000 milliseconds is one second.

		} catch(InterruptedException ex) {

		    Thread.currentThread().interrupt();

		}
		
		List<WebElement> options=driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
		for(WebElement option:options)
		{
			if (option.getText().equalsIgnoreCase("India"))
			{option.click();
				break;
			}
		}
			
		

	}

}
