package Mobile;

import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Demo_Test {
	
	public AndroidDriver<WebElement>  driver;
	String get_orderNO1;

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
	
	public static int getRandomInteger(int maximum, int minimum)
	{ 
		return ((int) (Math.random()*(maximum - minimum))) + minimum; 
	}

	
	@Test(priority = 1)
	public void Login() throws InterruptedException 
	{
		
		WebElement sitename=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText\n" + 
				""));
		sitename.sendKeys("qa11.test");
		

		WebElement gobtn=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.widget.Button"));
	    gobtn.click();
	    Thread.sleep(1500);
	 
	 
	 WebElement Username= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.widget.EditText"));
	 Username.sendKeys("davis");
	
	 WebElement Password=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.EditText\n" + 
	 		""));
	 Password.sendKeys("goouser");
	 
	 WebElement Login=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.widget.Button"));
	 Login.click();
	 Thread.sleep(6000);
	}
	
	@Test(priority = 2)
	public void Make_CycleCount() throws InterruptedException 
	{
		WebDriverWait menu1= new WebDriverWait(driver, 50);
		try {
		     WebElement menu_button=menu1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button")));
		     menu_button.click();
		}
		catch (Exception e) 
		{
			WebElement menu_button=menu1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button")));
		     menu_button.click();
		}
	 
		 WebElement menu_view=  menu1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View"))); 
		 Dimension size = menu_view.getSize();
		    System.out.println(size.height+"height");
		    System.out.println(size.width+"width");
		     System.out.println(size);
		     int startPoint = (int) (size.height * 0.7);
		     int endPoint = (int) (size.height *0.1);
		     int ScreenPlace =(int) (size.width*0.5);  
		   	  TouchAction ts = new TouchAction(driver);
		  	 ts.press(PointOption.point(ScreenPlace,startPoint))
		   .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
		   .moveTo(PointOption.point(ScreenPlace,endPoint)).release().perform();
		WebDriverWait menu2= new WebDriverWait(driver, 50);
   WebElement Click_Template=  menu2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[5]/android.view.View\n" + 
   		"")));
   Click_Template.click();
   Thread.sleep(5000);
   
   WebElement Scan_out_Template=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[2]\n" + 
			""));
	Scan_out_Template.click();
	Thread.sleep(3000);
	
	 WebElement Scan_out_Template1=  menu2.until(ExpectedConditions.visibilityOfElementLocated(By.id("eabfc617-8610-4b8a-9954-aef55ad3535d")));
		Scan_out_Template1.click();
		Reporter.log("=====Scan_out Template Started sucessfully=====", true);
		
}

}
	
	

