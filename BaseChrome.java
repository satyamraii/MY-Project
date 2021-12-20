import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class BaseChrome {

	//public static void main(String[] args) throws MalformedURLException {
	//We are placing the capabilities into the base class and creating the separate class for all
	//test cases and call this function there rather than duplicating
	
	public static AndroidDriver<WebElement> capabilities() throws MalformedURLException {
		AndroidDriver<WebElement> driver;
		
		//capabilities here treat like as a function,//data type
		//driver that we have to add this one also AndroidDriver<AndroidElement>
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("pCloudy_Username", "satyam.kumar@sstsinc.com");
		capabilities.setCapability("pCloudy_ApiKey", "krrzb6w2f6t62kmxky9hz6sd");
		capabilities.setCapability("pCloudy_DeviceFullName","SAMSUNG_GalaxyJ7Prime_Android_8.1.0_78777");
		//capabilities.setCapability("deviceName","Android Device"); //for running the appium in physical device.
        capabilities.setCapability("pCloudy_DurationInMinutes", 10);
		capabilities.setCapability("platformVersion", "9.0.0");
		capabilities.setCapability("newCommandTimeout", 600);
		capabilities.setCapability("launchTimeout", 90000);
		capabilities.setBrowserName("Chrome");
		capabilities.setCapability("automationName", "uiautomator2");
		//capabilities.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
		 driver = new AndroidDriver<WebElement>(new URL("https://device.pcloudy.com/appiumcloud/wd/hub"), capabilities);  //driver object
		//help us to automate all the test case because this driver object having the capability to handle all the Android OS.
		//https://device.pcloudy.com/appiumcloud/wd/hub->connection to server link, capabilities->this will retreive all the capabilities from the server 
		//in the latest version of the appium we have to pass this arguments <AndroidElement>, AndroidDriver class, we are using because we are running the appium in Android device.
		System.out.println("Driver Generated");
		return driver;   //here returning a driver as a object 
		
		

	}

}