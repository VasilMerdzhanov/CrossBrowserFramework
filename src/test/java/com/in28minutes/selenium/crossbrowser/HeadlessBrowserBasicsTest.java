package com.in28minutes.selenium.crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

	public class HeadlessBrowserBasicsTest {
	  @Test
	  public void chromeBrowser() {
		  //Chrome
		  
		  //Chrome Web Driver EXE
		  //WebDriverManager.chromedriver().setup();
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mythos\\Desktop\\Drivers\\chromedriver.exe");
		  
		  //WebDriver Interface - Create an instance of the driver of the browser
		  WebDriver driver = new ChromeDriver();
		  
		  //Launch a web page
		  driver.get("https://bulma.io/documentation/elements/box/");
		  
		  sleep(3);
		  
		  driver.quit();
	  }
	
	@Test
	public void firefoxBrowser() {
		  //Firefox
		  
		  //Firefox Web Driver EXE
		  WebDriverManager.firefoxdriver().setup();
		  //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mythos\\Desktop\\Drivers\\chromedriver.exe");
		  
		  //WebDriver Interface - Create an instance of the driver of the browser
		  WebDriver driver = new FirefoxDriver();
		  
		  //Launch a web page
		  driver.get("https://bulma.io/documentation/elements/box/");
		  
		  sleep(3);
		  
		  driver.quit();
	}
	
	@Test
	public void phantomJS() {
		  WebDriverManager.phantomjs().setup();
		 
		  WebDriver driver = new PhantomJSDriver();
		  
		  //Launch a web page
		  driver.get("https://bulma.io/documentation/elements/box/");
		  
		 // sleep(3);
		  
		  driver.quit();
	}
	
	 @Test
	  public void chromeBrowserHeadlessBrowsing() {
		  //Chrome Web Driver EXE
		  //WebDriverManager.chromedriver().setup();
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mythos\\Desktop\\Drivers\\chromedriver.exe");
		  
		  ChromeOptions options = new ChromeOptions();
		  options.setHeadless(true);
		  
		  //WebDriver Interface - Create an instance of the driver of the browser
		  WebDriver driver = new ChromeDriver(options);
		  
		  //Launch a web page
		  driver.get("https://bulma.io/documentation/elements/box/");
		  
		  sleep(3);
		  
		  driver.quit();
	  }
	 
	 @Test
		public void firefoxBrowserHeadlessBrowsing() {
			 
			  //Firefox Web Driver EXE
			  WebDriverManager.firefoxdriver().setup();
			  //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mythos\\Desktop\\Drivers\\chromedriver.exe");
			  
			  FirefoxOptions options = new FirefoxOptions();
			  options.setHeadless(true);
			  
			  //WebDriver Interface - Create an instance of the driver of the browser
			  WebDriver driver = new FirefoxDriver(options);
			  
			  //Launch a web page
			  driver.get("https://bulma.io/documentation/elements/box/");
			  
			  sleep(3);
			  
			  driver.quit();
		}
	 
	private void sleep(int i) {
		
		try {
			Thread.sleep(i * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
