package meena1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class mena {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		WebDriver driver;
	}
	public void openBrowser() throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://apps.qaplanet.in/qahrm");
		
		driver=new ChromeDriver();
		driver.get("http://apps.qaplanet.in/qahrm");
		Thread.sleep(3000);
		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
	 driver.findElement(By.name("txtPassword")).sendKeys("lab1");
	driver.findElement(By.name("Submit")).click();
		
		String expTitle="OrangeHRM";
		String actTitle=driver.getTitle();
		Assert.assertEquals(actTitle, expTitle);
		Reporter.log("Verify Login Passed");
		
		
}
}