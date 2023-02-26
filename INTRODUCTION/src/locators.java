import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("submit")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		// Thread.sleep(1000);
		try {

			Thread.sleep(1000); // 1000 milliseconds is one second.

		} catch (InterruptedException ex) {

			Thread.currentThread().interrupt();

		}
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("mahesh");
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("mahesh@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9964922715"); // by xpath traversing
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[2]")).click();
		System.out.println(driver.findElement(By.className("infoMsg")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click(); // by locating
																									// element by xpath
																									// and then
																									// traversing to
																									// required element
		try {

			Thread.sleep(1000); // 1000 milliseconds is one second.

		} catch (InterruptedException ex) {

			Thread.currentThread().interrupt();

		}
		driver.findElement(By.xpath("//form[@class='form']/input[1]")).sendKeys("rahul");
		driver.findElement(By.xpath("//form[@class='form']/input[2]")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//div[@class='checkbox-container']/span[1]/input")).click();
		driver.findElement(By.xpath("//div[@class='checkbox-container']/span[2]/input")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		try {

			Thread.sleep(1000); // 1000 milliseconds is one second.

		} catch (InterruptedException ex) {

			Thread.currentThread().interrupt();

		}
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");

		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();

	}

}
