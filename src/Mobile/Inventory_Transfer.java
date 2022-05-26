package Mobile;

import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Inventory_Transfer 
{
	public AndroidDriver<WebElement> driver;
	 String po_no;
	 String Orders;

	@BeforeTest
	public void setUp_Device() throws Exception 
	{
		
	 // Created object of DesiredCapabilities class.
		//ChromeOptions chromeOptions = new ChromeOptions();
	 DesiredCapabilities capabilities = new DesiredCapabilities();
	
	 // Set android deviceName desired capability. Set your device name.
	 capabilities.setCapability("deviceName", "ZY2242XGM3");

	 // Set android VERSION desired capability. Set your mobile device's OS version.
	 capabilities.setCapability(CapabilityType.VERSION, "8.1.0");

	 // Set android platformName desired capability. It's Android in our case here.
	 capabilities.setCapability("platformName", "Android");
	 
	 //capabilities.setCapability(MobileCapabilityType.AUTO_WEBVIEW, true);
	 //capabilities.setCapability( "chromedriverExecutable", "D://hromedriver_win32 (2)//chromedriver.exe");
	
	 
	 // Set your application's appPackage 
	 capabilities.setCapability("appPackage", "com.hybrent.hybrent");
	
	 // Set android appActivity desired capability.
	 capabilities.setCapability("appActivity", "com.hybrent.hybrent.MainActivity");
	 
	 // Set skipUnlock to true
	 capabilities.setCapability("skipUnlock", true);
	 
	 // Created object of RemoteWebDriver will all set capabilities.
	 // Set appium server address and port number in URL string.
	 driver = new AndroidDriver<WebElement> (new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@Test(priority = 1)
	public void Login() throws InterruptedException 
	{
		
		WebElement sitename=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText\n" + 
				""));
		sitename.sendKeys("qa9.test");
		

		WebElement gobtn=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.widget.Button"));
	    gobtn.click();
	    Thread.sleep(1500);
	 
	 
	 WebElement Username= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.widget.EditText"));
	 Username.sendKeys("haris");
	
	 WebElement Password=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.EditText\n" + 
	 		""));
	 Password.sendKeys("goouser");
	 
	 WebElement Login=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.widget.Button"));
	 Login.click();
	}
	@Test(priority = 2)
	public void Inventory_Transfer() throws InterruptedException 
	{
		
	 //click menu
		WebElement menu_button=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button\n" + 
		 		""));
		 menu_button.click();
	 Thread.sleep(1500);
	 
	 //click shop
	 WebElement menu_view=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View"));
		 
	 Dimension size = menu_view.getSize();
	    System.out.println(size.height+"height");
	    System.out.println(size.width+"width");
	     System.out.println(size);
	     int startPoint = (int) (size.height * 1);
	     int endPoint = (int) (size.height *0.3);
	     int ScreenPlace =(int) (size.width*0.5);  
	   	  TouchAction ts = new TouchAction(driver);
	  	 ts.press(PointOption.point(ScreenPlace,startPoint))
	   .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
	   .moveTo(PointOption.point(ScreenPlace,endPoint)).release().perform();
	  	Thread.sleep(500);
	  	 
	  	WebElement Click_Inventory_Recieve=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[5]/android.view.View\n" + 
	  			""));
	  	Click_Inventory_Recieve.click();
	  	Thread.sleep(3000);
		 
		 WebElement click_record=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[1]\n" + 
		 		""));
		 click_record.click();
		 Thread.sleep(3000);
		 
		 WebElement click_action=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.widget.Button\n" + 
		 		""));
		 click_action.click();
		 Thread.sleep(1000);
	  	
		 WebElement recieve_all_item=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.Button[1]\n" + 
		 		""));
		 recieve_all_item.click();
		 Thread.sleep(1000);
		 
		 WebElement click_stockinfo=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[7]/android.view.View[3]/android.view.View\n" + 
		 		""));
		 click_stockinfo.click();
		 Thread.sleep(2000);
		 
		WebElement select_stockinfo=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View[12]/android.view.View/android.widget.CheckBox\n" + 
				""));
		 select_stockinfo.click();
		 Thread.sleep(500);
		 
		 WebElement cancel_popup=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]/android.widget.Button\n" + 
		 		""));
		 cancel_popup.click();
		 Thread.sleep(1000);
		 
		 WebElement select_inv=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[4]/android.view.View[2]/android.view.View\n" + 
		 		""));
		 select_inv.click();
		 Thread.sleep(1000);
		 
		 WebElement select_inv1=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.widget.ListView/android.view.View[2]/android.view.View/android.view.View/android.widget.Button\n" + 
		 		""));
		 select_inv1.click();
		 Thread.sleep(1000);
		 
		 WebElement add_sign=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[1]/android.widget.Button\n" + 
		 		""));
		 add_sign.click();
		 Thread.sleep(1000);
		 
		 WebElement Create_vendor_Signature=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.Image\n" + 
			 		""));
			 Dimension size1 = Create_vendor_Signature.getSize();
			    System.out.println(size.height+"height");
			    System.out.println(size.width+"width");
			     System.out.println(size);
			     int startPoint1 = (int) (size1.height * 1);
			     int endPoint1 = (int) (size1.height *0.3);
			     int ScreenPlace1 =(int) (size1.width*0.5); 
			     int ScreenPlace2 =(int) (size1.width*0.8);  
			   	  TouchAction ts1 = new TouchAction(driver);
			   	
			   	 ts1.press(PointOption.point(ScreenPlace1,startPoint1))
			   .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
			   .moveTo(PointOption.point(ScreenPlace1,endPoint1)).release().perform();
			 Thread.sleep(1000);
			 	ts1.press(PointOption.point(ScreenPlace2,startPoint1))
				   .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
				   .moveTo(PointOption.point(ScreenPlace2,endPoint1)).release().perform();
				 Thread.sleep(1000);
			 
			 WebElement close_sign=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[4]/android.widget.Button[2]\n" + 
			 		""));
			 close_sign.click();
			 Thread.sleep(1000);
			 
			 WebElement complete_recieve=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button"));
			 complete_recieve.click();
			 Thread.sleep(1000);
	}
			 
			 @AfterTest
				public void quit_driver() throws InterruptedException 
				{
				 driver.quit();
				}
		 
		 
	}
	
	
	


