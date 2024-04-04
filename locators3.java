package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators3 {

	public static void main(String[] args) {
		//how to traverse from parents to child and sibling to another sibling
		System.setProperty("webdriver.chrome.driver","D://Java_31stmarch//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("/html/body/header/div/button[1]/following-sibling::button[1]")
				).getText());
		
		//how to traverse from child to parents-->/html/body/header/div/button[1]/parent::div/parent::header it is not used in the real time 
		//but this is for the interview quetion how to traverse from the child to parent through xpath.
		System.out.println(driver.findElement(By.xpath("/html/body/header/div/button[1]/parent::div/button[2]")
				).getText());
		driver.manage().window().maximize();
	}

}
