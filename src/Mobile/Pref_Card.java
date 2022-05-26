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

public class Pref_Card {
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
	public void Pick_List() throws InterruptedException 
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
	   	  @SuppressWarnings("rawtypes")
		TouchAction ts = new TouchAction(driver);
	  	 ts.press(PointOption.point(ScreenPlace,startPoint))
	   .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
	   .moveTo(PointOption.point(ScreenPlace,endPoint)).release().perform();
	  	Thread.sleep(500);
	  	 
	  	WebElement Click_pick_list=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[6]/android.view.View\n" + 
	  			""));
	  	Click_pick_list.click();
	  	Thread.sleep(6000);
	  	
	  	WebElement Detail_pick_list=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[1]\n" + 
	  			""));
	  	Detail_pick_list.click();
	  	Thread.sleep(4000);
	  	
	  	WebElement Click_more=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button"));
	  	Click_more.click();
	  	Thread.sleep(2000);
	  	
	  	WebElement Auto_Attach=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.Button[6]\n" + 
	  			""));
	  	Auto_Attach.click();
	  	Thread.sleep(6000);
	  	
	  	Click_more.click();
	  	Thread.sleep(1500);
	  	
	  	WebElement Move_to_execute=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.Button[7]\n" + 
	  			""));
	  	Move_to_execute.click();
	  	Thread.sleep(5000);
	}
	  	@Test(priority = 3)
		public void Execute_Cases() throws InterruptedException 
		{
	  	
	  	WebElement Click_menu=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button\n" + 
	  			""));
	  	Click_menu.click();
	  	Thread.sleep(3000);
	  	
	  	WebElement Click_Execute_Cases=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[7]/android.view.View\n" + 
	  			""));
	  	Click_Execute_Cases.click();
	  	Thread.sleep(3000);
	  	
	  	WebElement Click_case_detail=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]\n" + 
	  			""));
	  	Click_case_detail.click();
	  	Thread.sleep(3000);
	  	
	  	WebElement Click_Back=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button\n" + 
	  			""));
	  	Click_Back.click();
	  	Thread.sleep(7000);
		}
	  	
	  	@Test(priority = 4)
		public void Complete_Cases() throws InterruptedException 
		{
	  	
	  	WebElement Click_menu=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button\n" + 
	  			""));
	  	Click_menu.click();
	  	Thread.sleep(3000);
	  	
	  	WebElement Click_Cases=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[8]/android.view.View\n" + 
	  			""));
	  	Click_Cases.click();
	  	Thread.sleep(5500);
	  	
	  	WebElement Case_Detail=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[1]\n" + 
	  			""));
	  	Case_Detail.click();
	  	Thread.sleep(3000);
	  	
	  	WebElement Click_Save=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.Button"));
	  	Click_Save.click();
	  	Thread.sleep(4000);
	  	
	  	WebElement Click_More=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button\n" + 
	  			""));
	  	Click_More.click();
	  	Thread.sleep(1500);
	  	
		WebElement Move_To_Picklist=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.Button[4]\n" + 
				""));
		Move_To_Picklist.click();
	  	Thread.sleep(5000);
	}
}
