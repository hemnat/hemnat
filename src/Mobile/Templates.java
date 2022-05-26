package Mobile;

import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Templates 
{
		public AndroidDriver<WebElement> driver;
		 String po_no;
		 String Orders;

		 public String getAlphaNumericString(int n) 
		    { 
		  
		        // chose a Character random from this String 
		        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123";
		                                    
		  
		        // create StringBuffer size of AlphaNumericString 
		        StringBuilder sb = new StringBuilder(n); 
		  
		        for (int i = 0; i < n; i++) 
		        { 
		  
		            // generate a random number between 
		            // 0 to AlphaNumericString variable length 
		            int index 
		                = (int)(AlphaNumericString.length() 
		                        * Math.random()); 
		  
		            // add Character one by one in end of sb 
		            sb.append(AlphaNumericString 
		                          .charAt(index)); 
		        } 
		  
		        return sb.toString(); 
		    } 
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
		 Thread.sleep(7500);
		}
		@Test(priority = 2)
		public void Order_Template() throws InterruptedException 
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
		     int endPoint = (int) (size.height *0.5);
		     int ScreenPlace =(int) (size.width*0.5);  
		   	  @SuppressWarnings("rawtypes")
			TouchAction ts = new TouchAction(driver);
		  	 ts.press(PointOption.point(ScreenPlace,startPoint))
		   .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
		   .moveTo(PointOption.point(ScreenPlace,endPoint)).release().perform();
		  	Thread.sleep(500);
		  	 
		  	WebElement Click_Order_Template=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[4]/android.view.View"));
		  	Click_Order_Template.click();
		  	Thread.sleep(3000);
		  	
		  	WebElement Click_Template_name=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[4]/android.view.View[1]/android.view.View[1]\n" + 
		  			""));
		  	Click_Template_name.click();
		  	Thread.sleep(3000);
		  	
		  	WebElement fill_default_qty=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.widget.Button"));
		  	fill_default_qty.click();
		  	Thread.sleep(3000);
		  	
		  	WebElement use_my_po=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[3]/android.widget.ListView/android.view.View[5]/android.view.View[2]\n" + 
		  			""));
		  	use_my_po.click();
		  	Thread.sleep(3000);
		  	
		  	WebElement enter_pono=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[3]/android.widget.ListView/android.view.View[6]/android.widget.EditText"));
		  	enter_pono.sendKeys("Test"+getAlphaNumericString(5));
		  	Thread.sleep(3000);
		  	
		  	WebElement make_order=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.Button\n" + 
		  			""));
		  	make_order.click();
		  	Thread.sleep(2000);
		  	
		  	WebElement confirm_order=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[2]\n" + 
		  			""));
		  	confirm_order.click();
		  	Thread.sleep(2000);
		  	
		  	WebElement confirm_order2=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[2]\n" + 
		  			""));
		  	confirm_order2.click();
		  	Thread.sleep(8000);
		  	
		 
		  	/*
		  	WebElement back_btn=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button"));
		  	back_btn.click();
		  	Thread.sleep(6000);
		  	*/
		 }
		
		@Test(priority = 3)
		public void Scan_Out_Template() throws InterruptedException 
		{
			
			//click menu
		WebElement menu_button1=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button"));
		menu_button1.click();
		Thread.sleep(1500);
		  	 
	    WebElement Click_Template=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[4]/android.view.View"));
	    Click_Template.click();
		Thread.sleep(3000);
		
		WebElement Scan_out_Template=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[2]\n" + 
				""));
		Scan_out_Template.click();
		Thread.sleep(3000);
		
		WebElement Scan_out_detail=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[4]/android.view.View[1]/android.view.View[1]"));
		Scan_out_detail.click();
		Thread.sleep(3000);
		
		WebElement Done_Scan_out=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.Button"));
		Done_Scan_out.click();
		Thread.sleep(3000);
		
		WebElement Sussess_popup=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.widget.Button\n" + 
				""));
		Sussess_popup.click();
		Thread.sleep(3000);
		
		WebElement Complete=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.Button\n" + 
				""));
		Complete.click();
		Thread.sleep(3000);
		
		WebElement Cancel_charge_centre=  driver.findElement(By.xpath("	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[1]"));
		Cancel_charge_centre.click();
		Thread.sleep(2000);
		
		WebElement Auto_Attach_Stock=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[2]\n" + 
				""));
		Auto_Attach_Stock.click();
		Thread.sleep(2000);
		
		WebElement Final_Complete=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.Button\n" + 
				""));
		Final_Complete.click();
		Thread.sleep(8000);
		
		WebElement back=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button\n" + 
				""));
		back.click();
	  	Thread.sleep(6000);
	  	
	  	WebElement back2=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button"));
	  	back2.click();
	  	Thread.sleep(5000);
	  	
		}
		
		@Test(priority = 4)
		public void Kit_Template() throws InterruptedException 
		{
			
			WebElement click_kit=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[3]"));
		  	click_kit.click();
		  	Thread.sleep(4000);
		  	
		  	WebElement kit_detail=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[4]/android.view.View[1]/android.view.View[1]"));
		  	kit_detail.click();
		  	Thread.sleep(5000);
		  	
		  	WebElement select_inv=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[2]"));
		  	select_inv.click();
		  	Thread.sleep(1000);
		  	
		  	WebElement select_inv_fnl=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.widget.ListView/android.view.View[1]/android.view.View/android.view.View/android.widget.Button\n" + 
		  			""));
		  	select_inv_fnl.click();
		  	Thread.sleep(3000);
		  	
		  	WebElement make_kit=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.Button\n" + 
		  			""));
		  	make_kit.click();
		  	Thread.sleep(8000);	
			
		}
		
}
 


		

