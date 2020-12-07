package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rob\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		//Load URL
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		
		driver.manage().window().maximize();
		
		//Implicitly wait
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Way-1
		//driver.switchTo().frame("fname");
		//driver.switchTo().frame("lname");
		
		//Way-2
		//driver.switchTo().frame("1");
				
		//Way-3
		//WebElement iframe = driver.findElementByXPath("//input[@value='John']");
		//driver.switchTo().frame(iframe);
		
		driver.switchTo().frame(driver.findElementByXPath("//iframe[@id='iframeResult']"));
		
		driver.findElementByXPath("//input[@value='John']").clear();
		driver.findElementByXPath("//input[@value='John']").sendKeys("FrameIn");
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//input[@value='Doe']").clear();
		driver.findElementByXPath("//input[@value='Doe']").sendKeys("Selenium");
		
		driver.switchTo().defaultContent();
		//driver.switchTo().parentFrame();
		
		
		Thread.sleep(3000);
		
		//driver.close();
		
		
		
	}

}
