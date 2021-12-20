import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class Base {

	//public static void main(String[] args) throws MalformedURLException {
	//We are placing the capabilities into the base class and creating the separate class for all
	//test cases and call this function there rather than duplicating
	
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		
		//capabilities here treat like as a function,//data type
		//driver that we have to add this one also AndroidDriver<AndroidElement>
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("pCloudy_Username", "satyam.kumar@sstsinc.com");
		capabilities.setCapability("pCloudy_ApiKey", "v2bd4n2jpp89m57q3ngbsqym");
		capabilities.setCapability("pCloudy_DeviceFullName","GOOGLE_PixelXL_Android_9.0.0_d1e54");
		//capabilities.setCapability("deviceName","Android Device"); //for running the appium in physical device.
        capabilities.setCapability("pCloudy_DurationInMinutes", 10);
		capabilities.setCapability("newCommandTimeout", 600);
		capabilities.setCapability("launchTimeout", 90000);
		capabilities.setCapability("pCloudy_ApplicationName", "original.apk");
		capabilities.setCapability("appPackage", "io.appium.android.apis");
		capabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		//capabilities.setCapability("pCloudy_ApplicationName", "General-Store.apk");
		//capabilities.setCapability("appPackage", "com.androidsample.generalstore");
		//capabilities.setCapability("appActivity", "com.androidsample.generalstore.SplashActivity");
		capabilities.setCapability("automationName", "uiautomator2");
		capabilities.setCapability("adbExecTimeout", 90000);
		capabilities.setCapability("noReset", true);
		capabilities.setCapability("fullReset", false);
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("https://device.pcloudy.com/appiumcloud/wd/hub"), capabilities);  //driver object
		
		//help us to automate all the test case because this driver object having the capability to handle all the Android OS.
		//https://device.pcloudy.com/appiumcloud/wd/hub->connection to server link, capabilities->this will retreive all the capabilities from the server 
		//in the latest version of the appium we have to pass this arguments <AndroidElement>, AndroidDriver class, we are using because we are running the appium in Android device.
		System.out.println("Driver Generated");
		
		return driver;   //here returning a driver as a object 
		
		

	}

}