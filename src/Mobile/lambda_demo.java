package Mobile;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class lambda_demo 
{
	    String username = "hemanthybrent";
	    String accesskey = "jTKiyBm1BVRGDVfowoYyN5CSYX4jg8f4DJM79OMxtRZJtgbOSr";
	    static RemoteWebDriver driver = null;
	    String gridURL = "@hub.lambdatest.com/wd/hub";
	    boolean status = false;
	    WebDriver driver1;
	    
	    @BeforeTest
	    @org.testng.annotations.Parameters(value={"browser","version","platform"})
	    public void setUp(String browser, String version, String platform) throws Exception {
	       DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("browserName", browser);
	        capabilities.setCapability("version", version);
	        capabilities.setCapability("platform", platform); // If this cap isn't specified, it will just get the any available one
	        capabilities.setCapability("build", "HybrentWebApp");
	        capabilities.setCapability("name", "HybrentMultiBrowser");
	        capabilities.setCapability("network", true); // To enable network logs
	        capabilities.setCapability("visual", true); // To enable step by step screenshot
	        capabilities.setCapability("video", true); // To enable video recording
	        capabilities.setCapability("console", true); // To capture console logs
	        try 
	        {
	            driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + gridURL), capabilities);
	        } catch (MalformedURLException e) {
	            System.out.println("Invalid grid URL");
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }
	    @Test
	    public void test() {
	       
	        try {
	        	
	        	driver1.get("https://qa5.test.hybrent.com/b/#/admin/users");
	        	driver1.manage().window().maximize();
	        	driver1.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	   	      
	        	driver1.findElement(By.id("userName")).sendKeys("admin");
	        	driver1.findElement(By.id("password")).sendKeys("goouser");
	        	driver1.findElement(By.xpath("/html/body/div[1]/section/div/div/div/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
	   	      Thread.sleep(8000);
	   	      
	   	 } 
	        
	        catch (Exception e) 
	        {
	            System.out.println(e.getMessage());
	        } 
	        finally
	        {
	            tearDown();
	        }
	    }
	   
	    
	    @AfterTest
	    private void tearDown() 
	    {
	        if (driver != null) {
	            ((JavascriptExecutor) driver).executeScript("lambda-status=" + status);
	            driver.quit(); //really important statement for preventing your test execution from a timeout.
	        }
	        
	    }
}
	    
	  
	    


	    

