package HomeAssignment.week3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
     
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
	    driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("(//input[@name='phoneNumber'])")).sendKeys("322");
		driver.findElement(By.xpath("(//button[text()='Find Leads'])")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		String leadID=driver.findElement(By.xpath("(//a[text()='11173'])")).getText();
		System.out.println("The 1st lead ID is:" + " "+ leadID);
		
		driver.findElement(By.xpath("(//a[text()='11173'])")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("(//a[text()='Delete'])")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("(//a[text()='Find Leads'])")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("(//input[@name='id'])")).sendKeys("11173");
		driver.findElement(By.xpath("(//button[text()='Find Leads'])")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String output=driver.findElement(By.xpath("(//div[text()='No records to display'])")).getText();
		if(output.equals("No records to display"))
		{
			System.out.println(" The lead list 11155 is" + " " + output);
		}
		else {
			System.out.println("deletion is not successful");
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
