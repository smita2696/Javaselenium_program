package demo1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class locators2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D://Java_31stmarch//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String Name="Smita";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		locators2 m1=new locators2();
		String pass=m1.getpassowrd(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//by id
		driver.findElement(By.id("inputUsername")).sendKeys(Name);
		//by name
		driver.findElement(By.name("inputPassword")).sendKeys(pass);
		//by class name
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.tagName("p")).getText();
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+Name+",");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.close();
		
	}
	
	public String getpassowrd(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		String msg = driver.findElement(By.cssSelector(".infoMsg")).getText();
		String[] arr = msg.split("'");
		String password = arr[1].split("'")[0];
		return password;
		
	}
	
	
}
