package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rob\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//Load URL
		driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");
		
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//input[@id='searchBtn'][1]").click();
		
		//Alert SimpleAlert = driver.switchTo().alert();
		//SimpleAlert.getText();
		String alertmessage = driver.switchTo().alert().getText();
		
				
		//System.out.println (alertmessage):
		System.out.println("Alert Message is:" + alertmessage);
		
		//Tread.sleep(2000);
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		
		//driver.close();
		

	}

}
