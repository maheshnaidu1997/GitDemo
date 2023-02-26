import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class additems {

	public static void main(String[] args) {

WebDriver driver = new ChromeDriver();


driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
WebDriverWait w =new WebDriverWait(driver, Duration.ofSeconds(10));
driver.get("https://rahulshettyacademy.com/seleniumPractise/");
String[] items= { "Cucumber", "Brocolli", "Beetroot" };
addproducts(driver,items);
driver.findElement(By.xpath("//img[@alt='Cart']")).click();
driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rahulshettyacademy");
driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
driver.findElement(By.xpath("//button[text()='Place Order']")).click();
Select dropdowns=new Select(driver.findElement(By.xpath("//div[@class='wrapperTwo']/div/select")));
dropdowns.selectByVisibleText("India");
//System.out.println(dropdowns.getOptions());
driver.findElement(By.xpath("//input[@type='checkbox']")).click();
driver.findElement(By.xpath("//button[text()='Proceed']")).click();

	}
	
	
	
public static void  addproducts(WebDriver driver, String[] items)
{
	List<WebElement> products=driver.findElements(By.xpath("//h4[@class='product-name']"));
	int j=0;
	for(int i=0; i<products.size();i++)
	{
		String[] modified=products.get(i).getText().split("-");
		String finalproduct=modified[0].trim();
		List actualitems=Arrays.asList(items);
		
		if(actualitems.contains(finalproduct))
		{
			j++;
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			
		}
		if (j==actualitems.size())
		{
		break;	
		}
	}
	
}
}
