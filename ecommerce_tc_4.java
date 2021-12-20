import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ecommerce_tc_4 extends Base {

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
		
	  String amount1 = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();
	//	amount1 =amount1.substring(1);  //for removing the $ sign, $=160.97
	//	double amount1value =Double.parseDouble(amount1);  //for changing the string value into the double value
	    double amount1value= getAmount (amount1);
		System.out.println(amount1value + "amount1value");
		
		String amount2 =driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();
		//$ 120.0
	//	amount2 =amount2.substring(1);
		//120.0
	//	double amount2value=Double.parseDouble(amount2);
		
		double amount2value= getAmount (amount2);
		System.out.println(amount2value + "amount2value");
		
	   double sumofproducts	=amount1value+amount2value;
	   System.out.println(sumofproducts + "sumofproducts");
	   
	   String Totalvalueofproducts =driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
	   Totalvalueofproducts = Totalvalueofproducts.substring(1);
	   double Totalvalueofproductsvalue = Double.parseDouble(Totalvalueofproducts);
	   System.out.println(Totalvalueofproductsvalue + "Totalvalueofproductsvalue");
	   
	   
	  Assert.assertEquals(Totalvalueofproductsvalue, sumofproducts);
	  
	  //Mobile Gestures (Long press)
	  WebElement checkbox = driver.findElement (By.className ("android.widget.CheckBox"));
	  TouchAction t = new TouchAction (driver);
	  t.tap(tapOptions().withElement(element(checkbox))).perform() ;
	  
	 WebElement tc = driver.findElement (By.xpath("//*[@text='Please read our terms of conditions']"));
	 t.longPress(longPressOptions().withElement(element(tc)).withDuration(ofSeconds(2))).release().perform();
	 
	 driver.findElement (By.id ("android:id/button1")).click();
	 driver.findElement (By.id ("com.androidsample.generalstore:id/btnProceed")).click();
	}
	
	public static double getAmount(String value)
	{
		value= value.substring (1);
		double amount1value =Double.parseDouble(value); //we are calling a function to remove the redundency of line no 43.44,49 & 51.
		
	
		return amount1value;
	}

}











