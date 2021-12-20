import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UIAutomatorTest extends Base {

	public static void main(String[] args) throws MalformedURLException { 
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = capabilities();  
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//driver.findElementByAndroidUIAutomator("attribute(value)");
		
		//in java you can't write double code into the double code that is why you
		//you have to pass special character value for e.g.("text(\"views\")");
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click(); 
		System.out.println("Test 1");
		//driver.findElementByAndroidUIAutomator("text(\"Animation\")").click(); 
		System.out.println("Test 2");
		
		//validate clickable feature for all options
	 driver.findElementByAndroidUIAutomator("new UiSelector().property(value)"); //for identify the properties e.g clickable, scrollable, etc by using the concatination new
	 //UIselector.
		System.out.println(driver.findElementByAndroidUIAutomator("new UiSelector().clickable(true)").getSize());  // for knowing the result size how many we have written
		

		
	}

}