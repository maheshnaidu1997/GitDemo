import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class asertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_StudentDiscount']")).isEnabled()
		
Assert.assertFalse(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_StudentDiscount']")).isSelected());
	}

}
