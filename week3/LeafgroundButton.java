package HomeAssignment.week3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class LeafgroundButton {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//button[@name='j_idt88:j_idt90'])")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String title = driver.getTitle();
		if(title.equals("Dashboard"))
		{
			System.out.println("The title of the page is:" + " "+ title);
		}
		else
		{
			System.out.println("incorrect page title");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Navigate back
		driver.navigate().back();
		
		
		WebElement button = driver.findElement(By.xpath("(//button[@name='j_idt88:j_idt92'])"));
		boolean b1=button.isEnabled();
		if(b1) {
			System.out.println("Confirm the button is enabled:");
		}else {
			System.out.println("Confirm the button is disabled.");
		}
		
		//FInd and print the location or position
		
		Point location = driver.findElement(By.xpath("(//button[@name='j_idt88:j_idt94'])")).getLocation();
		System.out.println("X:"+ " " + location.getX());
		System.out.println("Y:"+ " "+ location.getY());
		
		//find and print the background color
		
		String b_color = driver.findElement(By.xpath("(//button[@name='j_idt88:j_idt96'])")).getCssValue("background-color");
		System.out.println("The background color of \"save button\" is:"+ " "+ b_color);
		String hexcolor = Color.fromString(b_color).asHex();
		System.out.println(hexcolor);
		
		
		//Find and print the height and width
		
		Dimension size = driver.findElement(By.xpath("(//button[@name='j_idt88:j_idt98'])")).getSize();
		System.out.println("Height and width of this button:"+ " "+ size);
		
		driver.close();
		
		
		
		// TODO Auto-generated method stub

	}

}
