package com.sampleproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookloginTest {
  @Test
  public void f() {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
		 driver = new ChromeDriver(); 
		 driver.get("https://www.facebook.com/");
		String gt= driver.getTitle();
		System.out.println("Title of the page is :"+gt);
		driver.close();

  }
}
