package seleniumDemo;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLead {

	//public static void main(String[] args) {
	
	@Test
	public void CreateLead() {
		
		// TODO Auto-generated method stub

		//Launch Chrome browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rob\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//Load URL
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Enter Username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		//Enter Password
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		
		//Click on Login Button
		driver.findElementByClassName("decorativeSubmit"). click();
		
		//click CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();
			

		//Thread.sleep(2000);
			
		//click create lead
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys("ABC");
		//driver.findElementByName("companyName").sendKeys("XYZ");

		//enter first name		  
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Hema");
		
		//enter last name
		//driver.findElementByXPath("(//input[@name='lastName'])[3]").sendKeys("Ma");
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Ma");
		
		//annual revenue
		 driver.findElementByXPath("//input[@id='createLeadForm_annualRevenue']").sendKeys("100");

		//enter Description
		//driver.findElementByXPath("//textarea[@name='description']").sendKeys("It is a Software company");
		
		driver.findElementByXPath("//textarea[@id='createLeadForm_description']").sendKeys("Write impotant note");
		
		//driver.findElementById("createLeadForm_primaryEmail").sendKeys("abc@yahoo.com");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("abc@yahoo.com");
		driver.findElementByXPath("//input[@id='createLeadForm_primaryWebUrl']").sendKeys("yahoo.com");
		
		driver.findElementByXPath("//input[@id='createLeadForm_generalCity']").sendKeys("Channai");
		
		//Click Create Lead to create the Lead
		//driver.findElementByXPath("//input[@value='Create Lead']").click();
		
		// Thread.sleep(2000);
		 
		//close browser
		//driver.close();
		
		//select source
		//Thread.sleep(2000);
		
		/* WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(source);
		//dd.selectByVisibleText("Word of Mouth");
		dd.selectByValue("LEAD_WORDOFMOUTH");
		dd.selectByValue("LEAD_WEBSITE");
		
		
		
		WebElement mktcam = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dd1 = new Select(mktcam);
		dd1.selectByValue("DEMO_MKTG_CAMP");
		
		//choose Industry
		//WebElement ind = driver.findElementByXPath("//select[@id='createLeadForm_industryEnumId']");
		//Select dd2 = new Select(ind);
		//dd2.selectByIndex(7);
		
		WebElement ind = driver.findElementByXPath("//select[@id='createLeadForm_industryEnumId']");
		Select dd2 = new Select(ind);
		dd2.selectByIndex(7);
		
		//choose Ownership
		WebElement ownership = driver.findElementByXPath("//select[@name='ownershipEnumId']");
		Select dd3 = new Select (ownership);
		//dd3.selectByValue("OWN_PUBLIC_CORP");
		dd3.selectByVisibleText("Public Corporation");
		
		//Prefered Currency
		WebElement precur = driver.findElementById("createLeadForm_currencyUomId");
		Select dd4 = new Select (precur);
		//dd4.selectByValue("USD");
		dd4.selectByVisibleText("USD- American Dollar");*/
		
		//for Bhabi
		
		//Choose Marketing Campaign
		WebElement source = driver.findElementById ("createLeadForm_dataSourceId");
		Select dd = new Select (source);
		dd.selectByValue ("LEAD_WORDOFMOUTH");
		
		//WebElement mktcam= driver.findElementByXPath("//select [@id='createLeadForm_marketingCampaignId]");
		//Select dd1 = new Select (mktcam);
		//dd1.selectByVisibleText("Automobile");
		
		WebElement mktcam = driver.findElementByXPath("//select[@id='createLeadForm_marketingCampaignId']");
		Select dd1 = new Select (mktcam);
		dd1.selectByVisibleText("Automobile");
		
		//Choose Industry
		WebElement ind = driver.findElementById ("createLeadForm_industryEnumId");
		Select dd2 = new Select (ind);
		dd2.selectByValue("IND_INSURANCE");
		
		//Choose Ownership
		WebElement ownership= driver.findElementByXPath ("//select [@name='ownershipEnumId']");
		Select dd3 = new Select (ownership);
		dd3.selectByVisibleText ("Corporation");
		
		//Preferred Currency
		WebElement precur = driver.findElementByXPath("//select[@id='createLeadForm_currencyUomId']");
		Select dd4 = new Select (precur);
		dd4.selectByVisibleText("USD - American Dollar");
		//dd4.selectByValue("USD");
		
		
		
		
		
			



		
		//close browser
		driver.close();

		 
		
		
	}

}
