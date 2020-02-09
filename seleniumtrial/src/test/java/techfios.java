

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class techfios {

	
	@Test
	public void validUsersShouldBeAbleToLogIn() throws InterruptedException {

   //Set Chrome as default browser
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
	//Open Chrome Browserd
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	//Go to TechFios Website
	driver.get("http://techfios.com/test/billing/?ng=admin/");
	
	//Type username in the username field
	driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
	
	//Type password in the password field
	driver.findElement(By.name("password")).sendKeys("abc123");

	//Click on Sign In button
	driver.findElement(By.name("login")).click();
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath());
	driver.findElement(By.xpath());
	driver.findElement(By.xpath());
	
	
	
	
	
	
	
	}
	
	
	

	
	
	
	
	
	
	

