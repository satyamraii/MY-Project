import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.util.List;  //for using size() method with driver.findElements()

public class ecommerce_tc_3 extends Base {

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
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Argentina\").instance(0))"); //scrolling method
		driver.findElement(By.xpath("//*[@text='Argentina']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		System.out.println("Success");
	//String toastMessages=driver.findElement(By.xpath("android.widget.Toast[1]")).getAttribute("name");  //android.widget.Toast[1]->Tag Name,which ever text is printing into the toast, it will give in Name Attribute.
		//name attribute for toast messages will have the content.
	//String toastMessages->step 2.
		//System.out.println(driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size());  //this xpath locator will print the no's of products which will be present in the visible mode.


driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"LeBron Soldier 12 \").instance(0))"));
		//Scrolling method to find the exact element and coordinates.(\"com.androidsample.generalstore:id/rvProductList\"))->Parent method, (\"LeBron Soldier 12 \")->Child method
		int count = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();   //we are not getting specific value for adding the products into the cart, int count->for counting all the products.
		for(int i=0; i<count; i++)
		{
		 
			String text = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
			//if(text=="LeBron Soldier 12");
			if(text.equalsIgnoreCase("LeBron Soldier 12") );
			{
				
				driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
				break;
			}
		
			
		}
		
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		
        String LastpageText = driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
        Assert.assertEquals(LastpageText, "LeBron Soldier 12" );   //here we are validating that both page(page 2, page 3) of text value is equal or not.
		

	}
}


