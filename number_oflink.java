package demo1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class number_oflink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D://Java_31stmarch//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//footer section
		WebElement footer1=driver.findElement(By.id("gf-BIG"));
		System.out.println(footer1.findElements(By.tagName("a")).size());
		
		//footer first column
		WebElement column1=footer1.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(column1.findElements(By.tagName("a")).size());
		
		//go to each link on new tab
		for(int i=1;i<column1.findElements(By.tagName("a")).size();i++)
		{
			//to open new tab before clicking on the link
			String clickonnewtab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			column1.findElements(By.tagName("a")).get(i).sendKeys(clickonnewtab);
			Thread.sleep(5000L);
			
			
		}	
		
		Set<String> xyz=driver.getWindowHandles();
		Iterator<String> it=xyz.iterator();
		
		while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
				
			}
			
			
		

	}

}
