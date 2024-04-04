package demo1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class sslcheck {

	public static void main(String[] args) throws IOException {
		ChromeOptions option=new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver","D://Java_31stmarch//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(option);//dont forget to pass the option ch object
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("D:\\abc.png"));

	}

}
