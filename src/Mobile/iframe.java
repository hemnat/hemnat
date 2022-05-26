package Mobile;

import java.awt.Dimension;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iframe {
  @Test
  public void iframes() 
  {
	  WebDriver driver;
	  //Setting the webdriver.chrome.driver property to its executable's location
      System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
      //Instantiating driver object
      driver = new ChromeDriver();
      //Using get() method to open a webpage
      driver.get("https://techtuts.in/");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
       
      List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
      int numOfFrames = iframes.size();
      System.out.println("Total Number of iframe is:" +numOfFrames);
      
      for(int i=1;i<=numOfFrames;i++)
      {
    	  driver.switchTo().frame(i);
    	  driver.switchTo().defaultContent();
      }
      
      driver.switchTo().frame("google_esf"); 
       
  }
}
