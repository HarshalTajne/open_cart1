package testCases;





import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

       WebDriver driver;	
	
	@BeforeClass
	public void setup() throws InterruptedException
	{
		//WebDriverManager.chromedriver().setup();
	//	ChromeOptions options = new ChromeOptions();
	//	options.addArguments("--remote-allow-origins=*");
		
		
		
		driver=new FirefoxDriver();
	
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	
	    driver.get("http://localhost/opencartsite/");
	
	    driver.manage().window().maximize();
	
	}
	
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	public String randomeString() //Randomly take a to z
	{
		
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return (generatedString);
	}
	
	public String randomeNumber() {  //Randomly tahea 1 to 0
		String generatedString2 = RandomStringUtils.randomNumeric(10);
	    return(generatedString2);
	
	}
	
	public String randomeAlphaNumeric() {
		String st = RandomStringUtils.randomAlphabetic(4);
		String num =RandomStringUtils.randomNumeric(3);
	   
		return(st+"@"+num);
	
	}
	
	
	
	
	
	
	
	
	
	
}
