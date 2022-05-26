package Mobile;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;


public class Shipment 
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
	 Thread.sleep(7500);
	}
	
	@Test(priority = 2)
	public void shipment() throws InterruptedException 
	{
		
	 //click menu
	 WebElement menu_button=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button\n" + 
		 		""));
	 menu_button.click();
	 Thread.sleep(1500); 
	 
	 WebElement click_shipment=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[8]/android.view.View\n" + 
	 		""));
	 click_shipment.click();
	 Thread.sleep(3000);
	 
	 WebElement click_detail=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]\n" + 
	 		""));
	 click_detail.click();
	 Thread.sleep(1500);
	 
	 WebElement fill_qty=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.Button\n" + 
	 		""));
	 fill_qty.click();
	 Thread.sleep(1500);
	 
	 WebElement fill_all_qty=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.Button[1]\n" + 
	 		""));
	 fill_all_qty.click();
	 Thread.sleep(1500);
	 
	 WebElement select_inv=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[3]/android.view.View[2]\n" + 
	 		""));
	 select_inv.click();
	 Thread.sleep(1500);
	 
	 WebElement select_inv1=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.widget.ListView/android.view.View[2]/android.view.View/android.view.View/android.widget.Button"));
	 select_inv1.click();
	 Thread.sleep(1500);
	 
	 WebElement Action=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.Button\n" + 
	 		""));
	 Action.click();
	 Thread.sleep(1500);
	 
	 WebElement receive=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.Button"));
	 receive.click();
	 Thread.sleep(2000);
	 
	 WebElement yes_popup=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[2]"));
	 yes_popup.click();
	 Thread.sleep(2000);
	 	 
	 WebElement min=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[6]/android.view.View/android.widget.EditText\n" + 
	 		""));
	 min.sendKeys("5");
	
	 
	 WebElement max=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[7]/android.view.View/android.widget.EditText"));
	 max.sendKeys("15");
	 
	 WebElement par=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[8]/android.view.View/android.widget.EditText\n" + 
	 		""));
	 par.sendKeys("7");
		 
	 WebElement add_to_inventory=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.Button[2]\n" + 
	 		""));
	 add_to_inventory.click();
	 Thread.sleep(2000);
	}
	
}
