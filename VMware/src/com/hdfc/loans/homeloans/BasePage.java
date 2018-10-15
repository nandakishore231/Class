package com.hdfc.loans.homeloans;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage 
{
	static WebDriver driver;
	public static String path="./data.properties";
	
	public static String loadData(String key) throws IOException
	{
		File f=new File(path);
		FileInputStream fis=new FileInputStream(f);
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(key);
	}
	
	public static void launch(String browser,String url)
	{
		if(browser.equalsIgnoreCase("CHROME"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Browser Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		driver.get(url);
	}

}
