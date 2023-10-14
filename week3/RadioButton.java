package HomeAssignment.week3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//label[text()='Chrome'])[1]")).click();
		
		driver.findElement(By.xpath("(//label[text()='Chennai'])")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement button = driver.findElement(By.xpath("(//label[text()='Chennai'])"));
		button.click();
		boolean V_button = button.isSelected();
	if(button.isSelected()) {
		System.out.println("Chennai Radio Button is selected:"+ " "+ V_button);
	}else
	{
		System.out.println("Chennai Radio Button is selected:"+ " "+ V_button);
	}		
	
	List<WebElement>defaultRadio = driver.findElements(By.xpath(
			"//h5[text()='Find the default select radio button']/following::div/table/tbody/tr/td/div/div/input"));
	for (int i = 1; i <defaultRadio.size(); i++) {
		if (defaultRadio.get(i).isSelected()) {
			String selectedValue = driver.findElement(By.xpath(
					"(//h5[text()='Find the default select radio button']/following::div/table/tbody/tr/td/div/following-sibling::label)["
							+ (i + 1) + "]"))
					.getText();
			System.out.println("The selected radio button is: " + selectedValue);
		}
	}

	if (driver.findElement(By.xpath("//label[text()='21-40 Years']//preceding::input[contains(@value,'21')]"))
			.isSelected()) {
		System.out.println("Age group is already selected");
	} else {
		driver.findElement(By.xpath("//label[text()='21-40 Years']")).click();
		System.out.println("Age group is selected now");
	}
	driver.close();
			
		
	
	
			
		} 
	}

			
			
			
		
			
		
		
		
		
	

		// TODO Auto-generated method stub

	


