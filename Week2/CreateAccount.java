package HomeAssignment.Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("abab");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		//select Industry
		
		WebElement F_Industry = driver.findElement(By.name("industryEnumId"));
		Select industry=new Select(F_Industry);
		industry.selectByIndex(3);
		
		//select Ownership
		
		WebElement F_Ownership = driver.findElement(By.name("ownershipEnumId"));
		Select ownership=new Select(F_Ownership);
		ownership.selectByVisibleText("S-Corporation");
		
		//Source
		
		WebElement F_Source = driver.findElement(By.id("dataSourceId"));
		Select source=new Select(F_Source);
		source.selectByValue("LEAD_EMPLOYEE");
		
		//Select marketingCampaignId
		
		WebElement F_MCI = driver.findElement(By.id("marketingCampaignId"));
		Select mci=new Select(F_MCI);
		mci.selectByIndex(6);
		
		//Select State
		
		WebElement SP = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select state=new Select(SP);
		state.selectByValue("TX");
		
		//Click the "Create Account" button
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.linkText("My Accounts")).click();
		String accname= driver.findElement(By.partialLinkText("abab")).getText();
		System.out.println("accname");
		if(accname.contains(accname)) {
			System.out.println(accname + " " + "True");
			
		}else
			System.out.println("False");
		
		driver.close();
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
