package Mobile;




import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;



public class UserChange 
{
	@Test
	public void f() throws InterruptedException 
	  { 
	      WebDriver driver;
		  //Setting the webdriver.chrome.driver property to its executable's location
	      System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
	      //Instantiating driver object
	      driver = new ChromeDriver();
	      //Using get() method to open a webpage
	      driver.get("https://qa5.test.hybrent.com/b/#/admin/users");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	      
	      driver.findElement(By.id("userName")).sendKeys("admin");
	      driver.findElement(By.id("password")).sendKeys("goouser");
	      driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
	      Thread.sleep(8000);
	      //driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div/div[2]/ul[3]/li/admin-menu/a")).click();;
	     //driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div/div[2]/ul[3]/li/admin-menu/ul/ul[1]/li[4]/a")).click();
	     //Thread.sleep(10000);
	   
	   String Before="/html/body/div[1]/section/div/div/div/div/div/div/div[3]/div[";
	   String After="]/div[1]/div[2]/div[3]";
	   String Before_Edit="/html/body/div[1]/section/div/div/div/div/div/div/div[3]/div[";
	   String After_Edit="]/div[3]/div/span/span";
	   for (int j = 3; j <= 12; j++) 
	   {  
		   String xpath=Before+j+After;    
	       String get_email=driver.findElement(By.xpath(xpath)).getText();
	       System.out.println(get_email);
	       /*
	       if(!get_email.contains("@hybre.com"))
	       {
	    	   String xpath_edit=Before_Edit+j+After_Edit;    
		       driver.findElement(By.xpath(xpath_edit)).click();
		       driver.findElement(By.xpath("//*[@id=\"isotopeContainer\"]/div[3]/div[3]/div/ul/li[1]/a")).click();
	       }
	       */
	 	}
	 
	   String NextButton= driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/div/div/div/div[4]/div[2]/ul/li[9]/a")).getAttribute("class");
	   
	   while (!NextButton.contains("disabled")) 
	   {
	   for (int k = 1; k <= 5; k++)
	   {
		   driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/div/div/div/div[4]/div[2]/ul/li[9]/a")).click();
		   Thread.sleep(3500);
		   
		   for (int j = 3; j <= 12; j++) 
		   {  
			   String xpath=Before+j+After;    
		   String get_email=driver.findElement(By.xpath(xpath)).getText();
		   System.out.println(get_email);
		 	}
		 }
	   break;
	   }
	   String NextButton1= driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/div/div/div/div[4]/div[2]/ul/li[10]/a")).getAttribute("class");
	   while (!NextButton1.contains("disabled")) 
	   {
		   driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/div/div/div/div[4]/div[2]/ul/li[10]/a")).click();
		   Thread.sleep(5000);
		   
		   for (int j = 3; j <= 12; j++) 
		   {  
			   String xpath=Before+j+After;    
		   String get_email=driver.findElement(By.xpath(xpath)).getText();
		   System.out.println(get_email);
		 	}
		 }
	   }
}

	   /*
	   /html/body/div[1]/section/div/div/div/div/div/div/div[4]/div[2]/ul/li[9]/a
	   /html/body/div[1]/section/div/div/div/div/div/div/div[4]/div[2]/ul/li[9]/a
	   /html/body/div[1]/section/div/div/div/div/div/div/div[4]/div[2]/ul/li[10]/a
	 //*[@id="ng-view"]/div/div[4]/div[2]/ul/li[10]/a
	  * 
	  */
		


	    
	 
	      
		      /*
	      float get_float = Float.parseFloat(get_value.substring(1, 5));
	      float get_float = Float.parseFloat(get_value.substring(1, 5));
	      
	      /html/body/div[1]/section/div/div/div/div/div/div/div[4]/div[2]/ul/li[4]/a
	      /html/body/div[1]/section/div/div/div/div/div/div/div[4]/div[2]/ul/li[4]/a
	      /html/body/div[1]/section/div/div/div/div/div/div/div[4]/div[2]/ul/li[5]/a
	      
	      /*
	      /html/body/div[1]/section/div/div/div/div/div/div/div[3]/div[3]/div[1]/div[2]/div[3]
	      /html/body/div[1]/section/div/div/div/div/div/div/div[3]/div[3]/div[1]/div[2]/div[3]
	      /html/body/div[1]/section/div/div/div/div/div/div/div[3]/div[4]/div[1]/div[2]/div[3]
	      /html/body/div[1]/section/div/div/div/div/div/div/div[3]/div[6]/div[1]/div[2]/div[3]
	      /html/body/div[1]/section/div/div/div/div/div/div/div[3]/div[7]/div[1]/div[2]/div[3]
	      /html/body/div[1]/section/div/div/div/div/div/div/div[3]/div[12]/div[1]/div[2]/div[3]
	       * 
	       */
	     
	      /*
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
		  */
	      
	  
	

