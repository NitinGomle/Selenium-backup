package com.selenium.Online.Core_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class App 
{
	static WebDriver driver;
    public static void main( String[] args )
    {
    	
    	/*System.setProperty("webdriver.gecko.driver","D:\\Testing Software\\geckodriver.exe");
    	driver = new FirefoxDriver(); */
    	System.setProperty("webdriver.chrome.driver","D:\\Testing Software\\Selenium\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("www.gmail.com");
        System.out.println( "Hello World!" );
    }
}
