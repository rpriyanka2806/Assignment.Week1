package HomeAssignment.week3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		
		//create lead
		driver.findElement(By.xpath("(//a[text()='Create Lead'])")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("(//input[@id='createLeadForm_companyName'])")).sendKeys("abcdefl company");
		driver.findElement(By.xpath("(//input[@id='createLeadForm_firstName'])")).sendKeys("FNacabb");
		driver.findElement(By.xpath("(//input[@id='createLeadForm_lastName'])")).sendKeys("LNaabbc");
		driver.findElement(By.xpath("(//input[@id='createLeadForm_firstNameLocal'])")).sendKeys("FNLaac");
		
		driver.findElement(By.xpath("(//input[@id='createLeadForm_departmentName'])")).sendKeys("ECE");
		driver.findElement(By.xpath("(//textarea[@id='createLeadForm_description'])")).sendKeys("Hello");
		
		driver.findElement(By.xpath("(//input[@id='createLeadForm_primaryEmail'])")).sendKeys("Hello@gmail.com");
		
		//select functionality
		WebElement state1 = driver.findElement(By.xpath("(//select[@id='createLeadForm_generalStateProvinceGeoId'])"));
		Select state=new Select(state1);
		state.selectByValue("NY");
		
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Edit functionality
		
		driver.findElement(By.xpath("(//a[text()='Edit'])")).click();
		WebElement CL = driver.findElement(By.xpath("(//textarea[text()='Hello'])"));
		CL.clear();
		
		driver.findElement(By.xpath("(//textarea[@id='updateLeadForm_importantNote'])")).sendKeys("Hello chennai");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String title = driver.getTitle();
		System.out.println("Title of the resulting page is:" + " " + title);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.close();
		
		
		// TODO Auto-generated method stub

	}

}
