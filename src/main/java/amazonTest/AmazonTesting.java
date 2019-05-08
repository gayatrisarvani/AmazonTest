package amazonTest;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTesting {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Launch chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\usarvani\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Launch Amazon website in Chrome browser
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung");
		Thread.sleep(2000);
		driver.findElement(By.className("nav-input")).submit();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//span[text()='Samsung Galaxy M20 (Ocean Blue, 4+64GB)']//parent::a[@class='a-link-normal a-text-normal']"))
				.click();
		Thread.sleep(2500);
		switchToLatestBrowser();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		driver.findElement(By.xpath("//a[@id='hlb-ptc-btn-native']")).click();
		driver.quit();

	}
	
	 public static void switchToLatestBrowser(){
	  
	  
	  ArrayList<String> getAllWindows = new
	  ArrayList<String>(driver.getWindowHandles()); int maxWindowSize =
	  driver.getWindowHandles().size();
	  driver.switchTo().window(getAllWindows.get(maxWindowSize-1));
	  driver.manage().window().maximize();
	  
	  
	  
	  }
	 

}
