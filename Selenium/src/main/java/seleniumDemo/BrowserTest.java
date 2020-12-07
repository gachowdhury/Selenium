package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserTest {

	public static void main(String[] args) {
	


		//launch chrome browser

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// load url
		driver.get("http://leaftaps.com/opentaps");


		//Maximize window
		driver.manage().window().maximize();

		//Print Title of the page
		//driver.getTitle();
		System.out.println(driver.getTitle());

		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Thread.sleep(2000);

		//enter username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//driver.findElementById("username").sendKeys("DemoSalesManager");

		//enter password
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		//driver.findElementByName("PASSWORD").sendKeys("crmsfa");

		//click login btn
		
		driver.findElementByClassName("decorativeSubmit").click();

		//Thread.sleep(2000);
		
		//click CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();
		//driver.findElementByLinkText("CRM/SFA").click();

		//Thread.sleep(2000);
	
		//close browser
		driver.close();

		}
}