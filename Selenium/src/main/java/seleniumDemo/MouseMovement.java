package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rob\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		//Load URL
		driver.get("http://mrbool.com/");
				
		driver.manage().window().maximize();
		
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement content = driver.findElementByClassName("menulink");
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(content).perform();
		
		//Click on ARTICLES
		Thread.sleep(2000);
		//driver.findElementByXPath("(//a[text()='Articles'])[1]").click();
		//driver.findElementByXPath("//a[text()='Single Videos']").click();
		driver.findElementByXPath("(//a[text()='Courses'])[2]").click();
		
		//driver.close();
		
		
		
		
		
		
		
		
		
	}

}
