package com.in28minutes.selenium.crossbrowser.framework;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserFrameworkTest {

	WebDriver driver = null;
	
	@Parameters("browser")
	@BeforeClass
	public void before(@Optional("chrome")String browser) {
		if(browser.equals("chrome")) {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mythos\\Desktop\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		}else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			throw new RuntimeException("Does not support browser + " + browser);
		}		
	}
	
	
	@Test
	public void lounchBoxPage() {		
		//Launch a web page
		driver.get("https://bulma.io/documentation/elements/box/");
	}
	
	@Test
	public void lounchImagePage() {	
		//Launch a web page
		driver.get("https://bulma.io/documentation/elements/image/");
	}
	
	@AfterClass
	public void after() {
	
		driver.quit();
	}
}
