package demo1;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class selenium {

	public static void main(String[] args) {
		
		//CHROMEDRIVER
		System.setProperty("webdriver.chrome.driver","D://Java_31stmarch//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		
		//EDGEDRIVER
		System.setProperty("webdriver.edge.driver","D://Java_31stmarch//msedgedriver.exe");
		WebDriver driver1=new EdgeDriver();
		driver1.get("https://rahulshettyacademy.com");
		System.out.println(driver1.getTitle());
		
		
		ArrayList a=new ArrayList();
		a.add("smita");
		a.add(3);
		System.out.println(a);
	}

}
