package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

// All the objects belonging to one page will be defined in java class

public class HomePage {   //here Homepage is class name
	//1. Is to call the driver object from testcase to page object file.
	
	//Concatenate driver
	public HomePage(AppiumDriver driver)  //here driver is argument, the driver is creating a connection between our Basics.java and Homepage.java class.
	
	
	//We can use Android driver also instead of Appiumdriver.
	//Here we have defined constructor, Home page is a method which will always same as a class name 
	//in case of constructor and constructor have the capability to accepting the arguments.
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this); //here we are defining this because we are referring this page only, if we 
		//need to define other class then we will pass that class name ...for e.g.. preference.java
		
		//AppiumFieldDecorator= we are using in case of appium for campatibility purpose for Android or IOS incase of the Appium,it's not required incase
		//of selenium.
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Preference']")
	public WebElement Preferences; //here preference is variable
	
	//In Line no. 11, we are replacing this below line of code with this code..this is new style.Cool :)
	
	//Why we are using webelement here?
	//WebElement 231 is a general interface that all the other classes (RemoteWebElement, MobileElement, AndroidElement, IOSElement) implement. which means that if you have an object of type WebElement it will have all the basic functions a web element can have. If you need more specific functions you can use other objects like: RemoteWebElement, MobileElement, AndroidElement, IOSElement
	//Also note that WebElement & RemoteWebElement are bundled with Selenium while MobileElement, AndroidElement & IOSElement are specific to Appium.
   // For a list of the specific functions in each of them please refer to:
	
	// Preferences= driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();

}
