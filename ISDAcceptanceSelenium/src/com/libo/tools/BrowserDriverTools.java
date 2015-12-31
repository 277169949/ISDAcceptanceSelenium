package com.libo.tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
 

public class BrowserDriverTools {

	public static WebDriver getChromeDriver() {

		WebDriver driver=new  ChromeDriver();
		 
		return driver;
	}
	public static WebDriver getIEDriver() {

		WebDriver driver=new  InternetExplorerDriver();
		 
		return driver;
	}

	
	public static WebDriver getFirefoxDriver(){
		WebDriver driver=new  FirefoxDriver();
		driver.manage().window().maximize();		
		return driver;
	}
	
	
}
