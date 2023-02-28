import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addtocart {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };
		try {

			Thread.sleep(4000); // 1000 milliseconds is one second.

		} catch (InterruptedException ex) {
			
			Thread.currentThread().interrupt();

		}
		additems(driver, itemsNeeded);

	}

	public static void additems(WebDriver driver, String[] itemsNeeded) {
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		int j = 0;
		for (int i = 0; i < products.size(); i++) {
			// name formattedName
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			List itemsNeededList = Arrays.asList(itemsNeeded);
			if (itemsNeededList.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			}
			if (j == itemsNeeded.length) {
				break;
			}
		}
	}
}
//this is to check demo