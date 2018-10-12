package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\halfblood\\Downloads\\chromedriver_win32.zip\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.google.co.in");
driver.findElement(By.name("q")).sendKeys("selenium");

	}

}
