package HomeAssignment.week3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkboxes {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		
		//Basic Checkbox
		driver.findElement(By.xpath("(//span[text()='Basic'])")).click();
		
		//Notification checkbox
		driver.findElement(By.xpath("(//span[text()='Ajax'])")).click();
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//span[text()='Checked'])")));
		
		String message = driver.findElement(By.xpath("(//span[text()='Checked'])")).getText();
        if(message.equals("Checked")) {
        	System.out.println("The notification message is displayed as \"Checked\":");
        	
        }else
        {
        	System.out.println("The notification message is not displayed");
        }
        
        //favorite language
		
        driver.findElement(By.xpath("(//label[text()='Java'])")).click();
        driver.findElement(By.xpath("(//label[text()='Python'])")).click();
        driver.findElement(By.xpath("(//label[text()='Others'])")).click();
        
        //Tri-State Checkbox
        
        WebElement DC = driver.findElement(By.xpath("(//div[contains(@id,'ajaxTriState')])"));
         Actions action=new Actions(driver);
         action.doubleClick(DC).perform();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
         String tristate = driver.findElement(By.xpath("(//p[text()='State = 2'])")).getText();
         if(tristate.equals("State = 2")) {
        	 
        	 System.out.println("state 2 has been selected");
         }else {
        	System.out.println("state 2 not selected"); 
         }
         
         //Toggle Switch
         
         driver.findElement(By.xpath("(//div[contains(@class,'ui-toggleswitch-slider')])")).click();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
         wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//div[contains(@class,'ui-growl-message')])")));
         String toggle = driver.findElement(By.xpath("(//div[contains(@class,'ui-growl-message')])")).getText();
         if(toggle.equals("Checked")) {
        	  System.out.println("toggle message is:" + " " + toggle);
         }
         else {
        	 System.out.println("toggle message is incorrect");
         }
         
         //Verify if the Checkbox is disabled
         
         WebElement checkbox = driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[3]"));
         if(checkbox.isSelected()){
         	System.out.println("enabled");
         }else
         	System.out.println("disabled");
         
         
         //Select multiple options on the page
         WebElement box = driver.findElement(By.xpath("(//ul[@data-label='Cities'])"));
         box.click();
         driver.findElement(By.xpath("//li[@data-item-value='London']/label")).click();
         String ch1 = driver.findElement(By.xpath("//li[@data-item-value='London']/label")).getText();
         System.out.println(ch1);
         
         driver.findElement(By.xpath("//li[@data-item-value='Rome']/label")).click();
         
         //close the web browser
         driver.close();
         
         
         
         
		
        
        
		
		// TODO Auto-generated method stub

	}

}
