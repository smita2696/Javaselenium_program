package demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class updatedropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D://Java_31stmarch//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("input[id*=friendsandfamily]")).click();
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		
		int i=1;
		//we have created the loop for the selecting number of time the button 
		while(i<=3) {
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='PNQ']")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='ATQ']")).click();
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement option:options)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
			
		}
		driver.findElement(By.className("ui-datepicker-trigger")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		driver.findElement(By.cssSelector("input[value='RoundTrip']")).click();
		
		
		
	}

}
