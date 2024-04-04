package demo1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D://Java_31stmarch//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//by id
		driver.findElement(By.id("inputUsername")).sendKeys("smitanimbulkar");
		//by name
		driver.findElement(By.name("inputPassword")).sendKeys("smita123");
		//by class name
		driver.findElement(By.className("signInBtn")).click();
		///by css selector
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		//by linklist
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		//by xpath
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Smita");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("smitanimbulkar02@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("7780973647");
		driver.findElement(By.className("reset-pwd-btn")).click();
		String msg = driver.findElement(By.cssSelector(".infoMsg")).getText();
		System.out.println(msg);
		driver.findElement(By.className("go-to-login-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("smitanimbulkar");
		///regular expression css selector-
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
	}

}
