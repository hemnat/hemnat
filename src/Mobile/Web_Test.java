package Mobile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Web_Test {
  @Test
  public void f() 
  { 
      WebDriver driver;
	  //Setting the webdriver.chrome.driver property to its executable's location
      System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
      //Instantiating driver object
      driver = new ChromeDriver();
      driver.manage().window().maximize();
 	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
      //Using get() method to open a webpage
      driver.get("https://www.google.co.in");
      
      //Verify google page displayed
     boolean isDisplyed= driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[2]")).isDisplayed();
     if(isDisplyed)
     {
    	 System.out.println("Google website screen is displayed.");
     }
  	else
  	{
  		System.out.println("Google website screen is not displayed.");	
  	}
     
   //Verify Duration less than one
      driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("selenium");
	  driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys(Keys.ENTER);
	  String get_value=driver.findElement(By.xpath("//*[@id=\"result-stats\"]/nobr")).getText();
	  System.out.println(get_value);
	  float get_float = Float.parseFloat(get_value.substring(1, 5));
	  System.out.println(get_float);
	  
	if (get_float<1 ) 
	{
		System.out.println("Duration is less than one");
	}
	else
	{
		System.out.println("Duration is greater than one");
	}
	
	driver.quit();
	
	
	
	
	  
	
      
  }
}
