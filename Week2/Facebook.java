package HomeAssignment.Week2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	
	public void fbaccount() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       driver.findElement(By.name("firstname")).sendKeys("ababgh");
       driver.findElement(By.name("lastname")).sendKeys("cdefg");
       driver.findElement(By.name("reg_email__")).sendKeys("9912345612");
       driver.findElement(By.id("password_step_input")).sendKeys("PWRD");

      
       //select Day
       //ctrl+1+L
       WebElement Sday = driver.findElement(By.name("birthday_day"));
       Select day=new Select(Sday);
       day.selectByValue("22");
       
       //select month
       WebElement Smon = driver.findElement(By.id("month"));
       Select mon=new Select(Smon);
       mon.selectByValue("6");
       
       //select year
       WebElement Syear = driver.findElement(By.id("year"));
       Select year=new Select(Syear);
       year.selectByVisibleText("2023");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

       
       
       WebElement radio1 = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
       radio1.click();
     
       
	}
     public static void main(String[] args) {
		Facebook FB=new Facebook();
		FB.fbaccount();
		
		
		
		// TODO Auto-generated method stub

	}

}
