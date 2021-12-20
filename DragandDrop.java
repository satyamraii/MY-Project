import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;


public class DragandDrop extends Base{

	
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
	     AndroidDriver<AndroidElement> driver = capabilities();  
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
	     
	     driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
	     driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
	     WebElement source=driver.findElementsByClassName("android.view.View").get(1);   //we are finding the exact location by using the index 
	   //  that is we have to add the .get(0), due to the different elements are present with the same class name we have to use elements 
	     //instead of element
	   WebElement destination=driver.findElementsByClassName("android.view.View").get(2);
	     
	    // WebElement source=driver.findElementsByClassName("android.view.View").get(0);
	     //WebElement destination=driver.findElementsByClassName("android.view.View").get(1);
	     
	     
	     TouchAction t = new TouchAction(driver);
	     //longpress(source)/move(destination)//release
	     t.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();
	     t.longPress(element(source)).moveTo(element(destination)).release().perform();
	     

	     

	}
}
