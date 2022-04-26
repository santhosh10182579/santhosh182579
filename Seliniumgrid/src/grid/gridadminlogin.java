package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class gridadminlogin {

public	String driver;
   @Parameters({"browser"})
	@Test
	public void  adminlogintest(String br) throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		
		switch (br.toLowerCase()) {
		case "chrome":
			cap.setBrowserName("chrome");
			break;
		case "firefox":
			cap.setBrowserName("firefox");
			break;
		case "safari":
			cap.setBrowserName("safari");
			break;
			
		default:
			System.out.println("no browser is present");
			break;
		}
		//cap.setBrowserName("chrome");
		//cap.setPlatform(Platform.WINDOWS);
		
		URL huburl = new URL("present in the grid console in http format and we have to throw malformexception");
		RemoteWebDriver driver = new RemoteWebDriver(huburl,cap);
		
		driver.findElement(By.id("")).sendKeys("");
		driver.findElement(By.id("")).sendKeys("");
		driver.findElement(By.linkText("")).click();
		
		
	}
	
	

}
