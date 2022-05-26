
package Mobile;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class practice1 {
 
  @Test
  public void demosite() throws InterruptedException 
  {
	  WebDriver driver;
	  //Setting the webdriver.chrome.driver property to its executable's location
      System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
      //Instantiating driver object
      driver = new ChromeDriver();
      //Using get() method to open a webpage
      driver.get("https://demo.guru99.com/test/newtours/register.php");
      driver.manage().window().maximize();
      WebElement firstname= driver.findElement(By.name("firstName"));
      firstname.sendKeys("Chris");
      
      WebElement lastname= driver.findElement(By.name("lastName"));
      lastname.sendKeys("john");
      
      WebElement phonenumber= driver.findElement(By.name("phone"));
      phonenumber.sendKeys("093849848");
      
      WebElement email= driver.findElement(By.name("userName"));
      email.sendKeys("test@test.com");
      
      Select country= new Select(driver.findElement(By.name("country")));
      country.selectByVisibleText("CANADA");
      
      WebElement submit= driver.findElement(By.name("submit"));
      submit.click();
      
      WebElement verification= driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font"));
      assertEquals(verification, "Thank you for registering. You may now sign-in using the user name and password you've just entered.");
          
   }
  
}
