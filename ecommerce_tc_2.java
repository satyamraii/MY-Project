import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ecommerce_tc_2 extends Base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		
	  //.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("hello");  //Resource id'
		//driver.findElement(By.xpath("//*[@text='Enter name here']")).sendKeys("hello");
		//driver.hideKeyboard();
		driver.findElementByXPath("//android.widget.RadioButton[@text='Female']").click();   //Text
	//	driver.findElement(By.xpath("//*[@text='Female']")).click();  //Text
		driver.findElement(By.id("android:id/text1")).click();
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Argentina\").instance(0))");
		driver.findElement(By.xpath("//*[@text='Argentina']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		System.out.println("Success");
	String toastMessages=driver.findElement(By.xpath("android.widget.Toast[1]")).getAttribute("name");  //android.widget.Toast[1]->Tag Name,which ever text is printing into the toast, it will give in Name Attribute.
		//name attribute for toast messages will have the content.
	//String toastMessages->step 2.//toast message will show in the output.
	//Assert.assertEquals("Please enter your name", toastMessages); //actual validation to verify error msg is correctly verifying or not.
	//Here assert.equal will compare the toastmessage with you actual string value, if it will be correct then it will be passed otherwise it will be thrown an error.
		
		System.out.println(toastMessages);
		
		//for learning about the toast messages, Please go through with video link->https://www.youtube.com/watch?v=y2H5C-SLEA0

	}

}
