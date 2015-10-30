


package com.lifeshield.qa;

import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Lifeshield {
	public WebDriver wd = null; 
	@BeforeTest
	public void setUp() throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		//This is the Real device. 
		capabilities.setCapability("bundleid", "com.lifeshield.qa");
		capabilities.setCapability("udid", "8ccbec4b6d3d1cb67a78c321c60d603fb5f24319");
		capabilities.setCapability("deviceName", "iPhone 6 plus"); 
		capabilities.setCapability("platformName", "IOS");
		capabilities.setCapability("ipa", "LifeShieldQA.ipa");
		// This is the simulator 
		
		
		
		/*capabilities.setCapability(CapabilityType.BROWSER_NAME, "iOS");
		capabilities.setCapability(CapabilityType.VERSION, "8.4");
		capabilities.setCapability(CapabilityType.PLATFORM, "Mac OS X");
		capabilities.setCapability("deviceName", "iPhone 6");
		capabilities.setCapability("app","/Users/uashraf/Desktop/LIfesheild QA/Payload/Lifeshield QA.app");		
		capabilities.setCapability("platformName", "IOS");
		//capabilities.setCapability("PID", value);*/
		
		
		
		wd = new RemoteWebDriver(new URL("http://172.31.98.43:4723/wd/hub"), capabilities);
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		
		System.out.println("App Launched");
		
	}
	
	

@Test(priority=1)
	
	public void login() throws Exception {
		
		
		
		
		
		if(wd.findElement(By.name("Switch Environment")).isDisplayed()) {
			wd.findElement(By.name("Switch Environment")).click();
				System.out.println("Selecting The Environment");
		}else{
				System.out.println("Selecting environment failed");
				// Add code to rerun the test from last step 
		}
		if(wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[4]/UIAActionSheet[1]/UIACollectionView[1]/UIACollectionCell[3]/UIAButton[1]")).isDisplayed()) {
			wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[4]/UIAActionSheet[1]/UIACollectionView[1]/UIACollectionCell[3]/UIAButton[1]")).click();
				System.out.println("Environment is selected");
		}else{
				System.out.println("Environment is not selected");
				// Add code to rerun the test from last step 
		}		
		if(wd.findElement(By.name("Login User Name")).isDisplayed()){
			wd.findElement(By.name("Login User Name")).sendKeys("ashrafv3");
				System.out.println("Username Has been entered");
		}else{
				System.out.println("Username is not displaying");
				// Add code to rerun the test from last step 
		}
		if(wd.findElement(By.name("Login Password")).isDisplayed()){
			wd.findElement(By.name("Login Password")).sendKeys("3@rmuffs");
				System.out.println("Password is entered");
		}else{
				System.out.println("Password failed to enter");
				// Add code to rerun the test from last step 
		}
		
		if(wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).isDisplayed()) {
			wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
				System.out.println("Systme is loggin in");
				try {
			    Thread.sleep(45000);                 
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
							}else{
										System.out.println("System did not login");
										// Add code to rerun the test from last step 
		}
		if(wd.findElement(By.name("ibp/staging/ashrafv3")).isDisplayed()){
			System.out.println("System is logged in");
		}
		
		
	}
@Test(priority=2)

	public void armingInstant() throws Exception {
		
		wd.findElement(By.name("INSTANT")).click();
		if(wd.findElement(By.name("INSTANT")).isDisplayed()){
				System.out.println("Element is good");
			}else{
				System.out.println("Element is no show");
		}
		if(wd.findElement(By.name("DISARM")).isDisplayed()){
		wd.findElement(By.name("DISARM")).click();
		}
		if(wd.findElement(By.name("1")).isDisplayed()); {
			wd.findElement(By.name("1")).click();
			wd.findElement(By.name("1")).click();
			wd.findElement(By.name("1")).click();
			wd.findElement(By.name("1")).click();
			System.out.println("System is disarmed");
		}
	}
	@Test(priority=3)
	public void armingStay() throws Exception {
	
		
		if(wd.findElement(By.name("STAY")).isDisplayed());{
			wd.findElement(By.name("STAY")).click();
			System.out.println("System is armed Stay");

		}
		if(wd.findElement(By.name("System Arming in")).isDisplayed());{
			try {
			    Thread.sleep(45000);                 
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
		}
		if(wd.findElement(By.name("DISARM")).isDisplayed()){
			wd.findElement(By.name("DISARM")).click();
		}
		if(wd.findElement(By.name("1")).isDisplayed()); {
			wd.findElement(By.name("1")).click();
			wd.findElement(By.name("1")).click();
			wd.findElement(By.name("1")).click();
			wd.findElement(By.name("1")).click();
			System.out.println("System is disarmed");	
		}
		}
	@Test(priority=4)

	public void armingAway() throws Exception {

		
		
		if(wd.findElement(By.name("AWAY")).isDisplayed());{
			wd.findElement(By.name("AWAY")).click();
			System.out.println("System is armed Away");

		}
		if(wd.findElement(By.name("System Arming in")).isDisplayed());{
			try {
			    Thread.sleep(45000);                 
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
		}
		if(wd.findElement(By.name("DISARM")).isDisplayed()){
			wd.findElement(By.name("DISARM")).click();
		}
		if(wd.findElement(By.name("1")).isDisplayed()); {
			wd.findElement(By.name("1")).click();
			wd.findElement(By.name("1")).click();
			wd.findElement(By.name("1")).click();
			wd.findElement(By.name("1")).click();
			System.out.println("System is disarmed");

		}
			
		
		
		
		
		
		
		
		
		
	}
	@Test(priority=5)

	public void logout() throws Exception {
		
		
		if(wd.findElement(By.name("settingsIcon")).isDisplayed()){
			wd.findElement(By.name("settingsIcon")).click();
				System.out.println("Settings button is visible");
		}else{
				System.out.println("Setting is not visible");
			//Add code to rerun the test
		}
		if(wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAStaticText[1]")).isDisplayed()){
			wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAStaticText[1]")).click();
				System.out.println("System is in settings");
		}else{
				System.out.println("system is not in settings");
		}
		
		if(wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[6]/UIAStaticText[1]")).isDisplayed()){
			wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[6]/UIAStaticText[1]")).click();
		}
		
		if(wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAAlert[1]/UIAScrollView[1]/UIAStaticText[1]")).isDisplayed()){
			wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAAlert[1]/UIAScrollView[1]/UIAStaticText[1]")).click();
				System.out.println("Logout is done");
		}
	}
		
	}
	

	
	

