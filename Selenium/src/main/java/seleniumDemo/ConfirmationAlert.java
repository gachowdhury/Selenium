package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rob\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		//Load URL
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.manage().window().maximize();
		
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		//driver.findElementByXPath("//button[text()='Try it']").click();
		
		//switch to alert
		Alert alert = driver.switchTo().alert();
		//Alert ConfirmationAlert = driver.switchTo().alert();
		
		//Tread.sleep(4000);
		
		alert.getText();
		//ConfirmationAlert.getText();
		//alert.sendKeys("I am learning Selenium");
		alert.sendKeys("I am learning Selenium");
		//ConfirmationAlert.sendKeys("I am learning Selenium Automation Tool");
		alert.accept();
		//ConfirmationAlert.accept();
		
		//print the message
		//System.out.println(driver.findElement(ById("demo").getText());
		System.out.println(driver.findElementById("demo").getText());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

				
	}

}
