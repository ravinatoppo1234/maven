package com.model;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class HandleMarcuryProparty {
	public WebDriver driver;
	Properties prop=new Properties();
	Properties prop1=new Properties();
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After_____Method");
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void Openbrowser() throws IOException {
	  FileInputStream fil=new FileInputStream("D:\\eclipse\\Testing\\ravina\\seleniumTesting\\HandleMarcuryProparty\\Config");
	 prop1.load(fil);
	 FileInputStream file1=new FileInputStream("D:\\eclipse\\Testing\\ravina\\seleniumTesting\\HandleMarcuryProparty\\Propertis");
	 prop.load(file1);
	 
	 System.setProperty("D:\\cjc Software\\Testing\\chromedriver_win32\\chromedriver.exe", prop.getProperty("chrome exe path"));
 System.out.println("browesr :"+prop.getProperty("browesr"));
 System.out.println("url :"+prop.getProperty("url"));
 System.out.println("username1 :"+prop.getProperty("username"));
 System.out.println("password1 :"+prop.getProperty("password"));
 System.out.println("username2 :"+prop.getProperty("username1"));
 System.out.println("password2 :"+prop.getProperty("password1"));
 System.out.println("username3 :"+prop.getProperty("username3"));
 System.out.println("password3 :"+prop.getProperty("password3"));
 if(prop.getProperty("browser").equalsIgnoreCase("chrome"));
 {
	 System.out.println("chrome browser");
	 System.setProperty("webdriver.chrome.driver", prop.getProperty("D:\\cjc Software\\Testing\\chromedriver_win32\\chromedriver.exe"));
	driver=new ChromeDriver();
	System.out.println("chrome browser");
 }
  }

  @AfterSuite
  public void afterSuite() {
  }

}
