import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class HybridBase {
	public static AndroidDriver<AndroidElement> capabilities(String device) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver; //creating the local variable here.
	
		  //for running in real devices we have to pass 

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("pCloudy_Username", "satyam.kumar@sstsinc.com");
		capabilities.setCapability("pCloudy_ApiKey", "krrzb6w2f6t62kmxky9hz6sd");
		
		if(device.equals("emulator"))
		{
			capabilities.setCapability("Capability_DeviceFullName","emulator");
		}
		else if(device.equals("real"))
		{
		capabilities.setCapability("pCloudy_DeviceFullName","SAMSUNG_GalaxyNote8_Android_9.0.0");
		
		}
		//capabilities.setCapability("pCloudy_DeviceFullName","SAMSUNG_GalaxyNote8_Android_9.0.0");
		//capabilities.setCapability("deviceName","Android Device"); //for running the appium in physical device.
        capabilities.setCapability("pCloudy_DurationInMinutes", 10);
		capabilities.setCapability("platformVersion", "9.0.0");
		capabilities.setCapability("newCommandTimeout", 600);
		capabilities.setCapability("launchTimeout", 90000);
		capabilities.setCapability("pCloudy_ApplicationName", "original.apk");
		capabilities.setCapability("appPackage", "io.appium.android.apis");
		capabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		capabilities.setCapability("automationName", "uiautomator2");
		driver = new AndroidDriver<>(new URL("https://device.pcloudy.com/appiumcloud/wd/hub"), capabilities);
		System.out.println("Driver Generated");
		return driver;	
		
}
}