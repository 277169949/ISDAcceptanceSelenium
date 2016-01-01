package com.libo.testcases;

import java.util.concurrent.TimeUnit;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.libo.tools.BrowserDriverTools;

public class SystemConfigTestCase extends TestCase {

	private WebDriver driver;
	private String baseUrl;

	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		 
	}

	@Test
	public void testUntitled() throws Exception {
		LoginTestCase.login();
		driver = BrowserDriverTools.getBrowserDriverInstance("chrome");
		driver.findElement(By.id("logIn")).click();

	}

	@After
	public void tearDown() throws Exception {
		// driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

}
