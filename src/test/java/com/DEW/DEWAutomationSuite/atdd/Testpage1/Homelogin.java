package com.DEW.DEWAutomationSuite.atdd.Testpage1;

import org.openqa.selenium.By;
import com.DEW.DEWAutomationSuite.atdd.Testpage1.DriverFactory;
import com.DEW.DEWAutomationSuite.atdd.Testpage1.Selenium_Utils;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.UnsupportedCommandException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Homelogin extends Selenium_Utils {

	
	 @FindBy(how = How.XPATH ,using = "//*[@name='username']")
	 private WebElement login;
	 @FindBy(how = How.XPATH,using = "//*[@name='password']")
	 private WebElement password;
	 @FindBy(how = How.XPATH,using = "//*[contains(text(),'Log in')]")
	 private WebElement LoginButton;
	 
	 
	WebDriver driver = DriverFactory.getDriver();
	
	
	
	public Homelogin()
	{
		PageFactory.initElements(driver,this);
	}

public void LoginApp() throws Exception
{
	try {
		 DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = factory.newDocumentBuilder();
		 Document doc = builder.parse("src/test/resources/readXMLdata.xml");
		 doc.getDocumentElement().normalize();
		 String username = doc.getElementsByTagName("username").item(0).getTextContent();
		 String password1 = doc.getElementsByTagName("password").item(0).getTextContent();
		 System.out.println("I am before objects");
		 Thread.sleep(5000);
	       // Switch to iframe by index (e.g., first iframe on the page)
         driver.switchTo().frame(0);
         
		 login.sendKeys(username);
		 password.sendKeys(password1);
		 LoginButton.click();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}

public void LaunchAppUrl() throws Exception
{
	try {
	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	DocumentBuilder builder = factory.newDocumentBuilder();
	Document doc = builder.parse("src/test/resources/readXMLdata.xml");
	doc.getDocumentElement().normalize();
	String AppURL = doc.getElementsByTagName("appUrl").item(0).getTextContent();
	System.out.println(AppURL);
	driver.get(AppURL);
	}
	catch (Exception e) {
		e.printStackTrace();
		}
	 
}
	



public void LoginSuccessful()throws Exception
{
	System.out.println("Success");
}
}
