package Mobile;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Class1 
{
	WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception
	{
	
	//Check if parameter passed from TestNG is 'firefox'
	if(browser.equalsIgnoreCase("firefox"))
	{
	//create firefox instance
    System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
	driver = new FirefoxDriver();
	}
	//Check if parameter passed as 'chrome'
	else if
	(
	browser.equalsIgnoreCase("chrome"))
	{
	//set path to chromedriver.exe
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
	driver = new ChromeDriver();
	}
	
	else if(browser.equalsIgnoreCase("IE"))
	{
	//set path to Edge.exe
	System.setProperty("webdriver.ie.driver","E:\\Selenium\\IEDriverServer.exe");
	driver = new InternetExplorerDriver();
	}
	
	else
	{
	//If no browser is passed throw exception
	throw new Exception("Incorrect Browser");
	}
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void CrossBrowser() throws InterruptedException
	{
		
	long start = System.currentTimeMillis();
	driver.get("https://www.browserstack.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	//Get the browser load time
	long finish = System.currentTimeMillis();
	long totalTime = finish - start; 
	System.out.println("Total Time for page load - "+totalTime); 
	
	//Verify the login
	String verify_website= driver.findElement(By.xpath("//*[@id=\"post-26\"]/div[1]/div/div/div/article[1]/div/div/div/div[1]/h1")).getText();
	assertEquals(verify_website, "App & Browser Testing Made Easy");
	
	//Verify the title
	String get_title=driver.getTitle();
	System.out.println(get_title);
	assertEquals(get_title, "Most Reliable App & Cross Browser Testing Platform | BrowserStack");
	
	
	driver.close();
	
	}
}

