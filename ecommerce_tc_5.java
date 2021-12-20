import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class ecommerce_tc_5 extends Base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		
	    driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("hello");  //Resource id'
		//driver.findElement(By.xpath("//*[@text='Enter name here']")).sendKeys("hello");
		driver.hideKeyboard();
		driver.findElementByXPath("//android.widget.RadioButton[@text='Female']").click();   //Text
	//	driver.findElement(By.xpath("//*[@text='Female']")).click();  //Text
		driver.findElement(By.id("android:id/text1")).click();
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Argentina\").instance(0))");
		driver.findElement(By.xpath("//*[@text='Argentina']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		System.out.println("Success");
//	String toastMessages=driver.findElement(By.xpath("android.widget.Toast[1]")).getAttribute("name");  //android.widget.Toast[1]->Tag Name,which ever text is printing into the toast, it will give in Name Attribute.
		//name attribute for toast messages will have the content.
	//String toastMessages->step 2.
		
		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
		//driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(1).click();//here this script is failing because after add to cart of the product of the 0 index,.get(1) will not treat like as a first index because the product of 0 index already added into the cart so it will again treat like as 0 index only.
		
		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();   
		Thread.sleep(4000);
		
	  
	  //Mobile Gestures (Long press)
	  WebElement checkbox = driver.findElement (By.className ("android.widget.CheckBox"));
	  TouchAction t = new TouchAction (driver);
	  t.tap(tapOptions().withElement(element(checkbox))).perform() ;
	  
	
	 driver.findElement (By.id ("com.androidsample.generalstore:id/btnProceed")).click();
	 Thread.sleep (7000);
	 Set<String> contexts = driver.getContextHandles();
	 for (String contextName : contexts) {
	     System.out.println(contextName);
	 }
	 
	 driver.context ("WEBVIEW_com.androidsample.generalstore");
	 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hello");
	 driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER); //for hitting the enter after passing the value hello.
	 driver.pressKey (new KeyEvent(AndroidKey.BACK));
	 driver.context ("NATIVE_APP");
	}
	 
}
	 
	
	
	












