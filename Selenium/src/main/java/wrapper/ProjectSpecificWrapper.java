package wrapper;

public class ProjectSpecificWrapper {

	@BeforeMethod
	public void login() {
	
	}

	
	
	@AfterMethod
	public void closeBrowser(){
	driver.close();
}
}
