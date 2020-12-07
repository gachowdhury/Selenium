package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	WebElement rightclick = driver.findElementByXPath("//span[text()='right click me']");
	//WebElement rightclick = driver.findElementByClassName("context-menu-one btn btn-neutral");
	
	Actions action = new Actions(driver);
	Thread.sleep(2000);
	
	action.contextClick(rightclick).perform();
	
	//driver.close();
	
	
	
		
	}

}
