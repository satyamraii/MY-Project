import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.util.prefs.Preferences;

import org.openqa.selenium.By;

import PageObject.HomePage;
import PageObject.Preference;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basics extends Base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capabilities();   //first calling capabilities() method, driver object is responsible for all the automation process here, we have
		//to pass the data type of the driver.
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//xpath id className, androidUIautomator -> for identify the objects as a locator.
		/* xpath syntax
		 * //tagName[@attribute='value']
		 * 
		 */
		Thread.sleep(30000);
		
		HomePage h=new HomePage (driver); //here driver is argument. //the whole thing is like a class and h is a object of this class.
		
		//Constructor of class will be invoked when you create object for the class
		//otherwise default constructor would be called
		// Constructor can defined as arguments.
		
//click on preference button:-
		
		// driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();    //Attribute-Text
		// System.out.println("Test 1");
		 
		// you can call the methods or variables of the class with class object.
		h.Preferences.click();
		
		Preference p=new Preference(driver);
		 
		 
		 //driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();  //Attribute-Text
		// System.out.println("Test 2");
		 
		 p.Preferencedependencies.click();
		 
		 driver.findElementById("android:id/checkbox").click();  //Attribute-id   
		 System.out.println("Test 3");
		 
		// (//android.widget.RelativeLayout)[2]")
		 driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();  //Attribute-classname and layout place  //for clicking on the button use .click
		 //to handle the duplicate instances
		 System.out.println("Test 4");
		 
		 driver.findElementByClassName("android.widget.EditText").sendKeys("hello");     //Attribute-class  
		 System.out.println("Test 5");
		 
		 driver.findElementByXPath("//android.widget.Button[@resource-id='android:id/button1']").click();    //Attribute-Resource id
		//  driver.findElements(By.className("android.widget.Button")).get(1).click();    //Get(1)-> for pulling out the specific index
		  System.out.println("Test 6");
			 
  
			  driver.quit();
			  System.out.println("Quit");
				 
			  
			
			
		}
		 
	}