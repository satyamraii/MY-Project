import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class SwipeDemo extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capabilities();  
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
	//	driver.findElementByXPath("//android.widget.TextView[@text='2. Inline']").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		driver.findElementByXPath("*//*[@content-desc='9']").click();
		System.out.println("Pass");
		
		//for swiping action
		TouchAction t = new TouchAction(driver); 
		//long press //find Element //2sec //move to another element and release it
		//t.longPress(longPressOptions().withElement(element(pn)).withDuration(ofSeconds(2))).release().perform(); //
		//for performing the gesture, we have to import webelement, gesture(long press,tap option),duration packages.
		
		WebElement first=driver.findElementByXPath("*//*[@content-desc='15']");
		WebElement second=driver.findElementByXPath("*//*[@content-desc='45']");
		
		t.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(2))).moveTo(element(second)).release().perform();
		System.out.println("Swipe Performed");
		
		
	}
}