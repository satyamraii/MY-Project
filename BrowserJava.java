import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;


public class BrowserJava extends BaseChrome {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<WebElement> driver = capabilities();
		/*driver.get("http://device.pcloudy.com");  //for hitting the browser on real device we have to call the driver in this order.
 driver.findElementByXPath("//*[@id='userId']").sendKeys("sat72331@gmail.com");
  driver.findElementByXPath("//*[@id='loginform']/div[2]/input").sendKeys("Rsatyam866#");
 driver.findElementByXPath("//*[@id='loginSubmitBtn']").click();   //for finding xpath->rightclick->copyxpath*/

/*driver.get("http://cricbuzz.com");
driver.findElementByXPath("//a[@href='#menu']").click();
driver.findElementByCssSelector("a[title='Cricbuzz Home']").click();
//driver.findElementByXPath("//*[@id=\"top\"]/div/div[3]/div[2]/a").click();
System.out.println(driver.getCurrentUrl());
  JavascriptExecutor jse = (JavascriptExecutor) driver;
  jse.executeScript("window.scrollBy(0,450)", "");
  Assert.assertTrue(driver.findElement(By.xpath("//h4[text()='Top Stories']")).getAttribute("class").contains("header")); //here we are validating that this xpath is containing the header path or not.
 //getAttribute("class")->string contains header value here or not.
  System.out.println("Pass");*/
		
	driver.get("http://facebook.com");
	driver.findElementByXPath("//*[@id='m_login_email']").sendKeys("ram@gmail.com");
	driver.findElementByXPath("//*[@id='m_login_password']").sendKeys("Password");;
	//driver.findElementByXPath("//button[@value='Log In']").click();
	driver.findElementByXPath("//*[@id='u_0_5']/button").click();
	System.out.println("Pass");
  
 //Process for debugging adb
//adb devices - unauthorized
//adb -kill server
//adb start-server
//adb devices
  
  
 }
	
}