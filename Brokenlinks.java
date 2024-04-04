package demo1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Brokenlinks {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D://Java_31stmarch//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();//dont forget to pass the option ch object
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> lst=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a=new SoftAssert();
		
		for(WebElement link:lst)
		{
			String url=link.getAttribute("href");
			HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int responcode=conn.getResponseCode();
			a.assertTrue(responcode<400,url + link.getText() +" this url is broken"+responcode);
			
		}
		a.assertAll();
	}

}
