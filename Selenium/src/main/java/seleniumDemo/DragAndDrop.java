package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver(); //for Chrome
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rob\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); //for Chrome
		
		///Loud URL
		//driver.get("https://jqueryui.com/droppable/");
		
		//driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Enter into the frame
		//driver.switchTo().frame(0);
		
		//WebElement Dragable = driver.findElementById("draggable");
		//WebElement Droppable = driver.findElementById("droppable");
		//Actions action = new Actions(driver);
		
		//Thread.sleep(2000);
		//action.dragAndDrop(Dragable, Droppable).perform();
		//action.clickAndHold(Droppable).moveToElement(Droppable).release().build().perform();
		
		//Switch back from frame
		//driver.switchTo().defaultContent();
		
		//driver.close();
		
		
		
		
		
		
	}

}
