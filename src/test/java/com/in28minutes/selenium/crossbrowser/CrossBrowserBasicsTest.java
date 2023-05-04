package com.in28minutes.selenium.crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class CrossBrowserBasicsTest {
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
	@Ignore
	public void ieBrowser() {
		  //Iexplorer
		  
		  //Iexplorer Web Driver EXE
		  WebDriverManager.iedriver().setup();
		  //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mythos\\Desktop\\Drivers\\chromedriver.exe");
		  
		  //WebDriver Interface - Create an instance of the driver of the browser
		  WebDriver driver = new InternetExplorerDriver();
		  
		  //Launch a web page
		  driver.get("https://bulma.io/documentation/elements/box/");
		  
		  sleep(3);
		  
		  driver.quit();
		  driver.close();
		}
	
	@Test
	@Ignore
	public void edgeBrowser() {
		//Edge
		  
		//Edge Web Driver EXE
		WebDriverManager.edgedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mythos\\Desktop\\Drivers\\chromedriver.exe");
		//WebDriver Interface - Create an instance of the driver of the browser
		WebDriver driver = new EdgeDriver();
		  
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
