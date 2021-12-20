import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;   //for line no 26 we have to import this package
import static io.appium.java_client.touch.TapOptions.tapOptions;  //for using the tap options arguments, we have to import it
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;  //for using long press
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import static java.time.Duration.ofSeconds;  // for of seconds
import static io.appium.java_client.touch.offset.ElementOption.element; //for element

public class Gestures extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = capabilities();  
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		 System.out.println("Test 1");
		
		//Tap Option
	    TouchAction t = new TouchAction(driver);    //Tap Action method (Touch Action Class)
	 WebElement expandList = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");   //here we are not clicking we are just grabbing xPath
	   //we have stored the xpath of webelement into the expand list variable.
	 t.tap(tapOptions().withElement(element(expandList))).perform() ;  //Arguments
	    System.out.println("Test 2");
	    driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
	    System.out.println("Test 3");
	    
	    
	   WebElement pn = driver.findElementByXPath("//android.widget.TextView[@text='People Names']"); //pn=public names
	   //Long press
	   t.longPress(longPressOptions().withElement(element(pn)).withDuration(ofSeconds(2))).release().perform(); //
	   System.out.println(driver.findElementById("android:id/title").isDisplayed());  //for displaying the action we have used the resource id of the sample Menu.
	   
	   
	   
}
}