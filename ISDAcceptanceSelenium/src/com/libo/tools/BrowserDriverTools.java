package com.libo.tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserDriverTools {

	private static WebDriver browserDriver;

	private BrowserDriverTools() {
	}

	public static WebDriver getBrowserDriverInstance(String type) {

		switch (type) {
		case "ie":
			if (browserDriver == null) {
				browserDriver = getIEDriver();
			}
			break;
		case "chrome":
			if (browserDriver == null) {
				browserDriver = getChromeDriver();
			}
			break;
		case "firefox":
			if (browserDriver == null) {
				browserDriver = getFirefoxDriver();
			}
			break;
		default:
			browserDriver = getFirefoxDriver();
			break;
		}
		browserDriver.manage().window().maximize();
		return browserDriver;
	}

	public static WebDriver getChromeDriver() {
		System.setProperty("webdriver.chrome.driver",
				"BrowserDriver/chromeDriverServer.exe");
		WebDriver driver = new ChromeDriver();

		return driver;
	}

	public static WebDriver getIEDriver() {
		System.setProperty("webdriver.ie.driver",
				"BrowserDriver/IEDriverServer_32.exe");
		DesiredCapabilities ieCapabilities = DesiredCapabilities
				.internetExplorer();
		ieCapabilities
				.setCapability(
						InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
						true);
		WebDriver driver = new InternetExplorerDriver(ieCapabilities);

		return driver;
	}

	public static WebDriver getFirefoxDriver() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;
	}

}
