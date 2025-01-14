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

public class GoogleloginTestonly extends Selenium_Utils {

	
	 @FindBy(how = How.XPATH ,using = "//*[@aria-label='Search']")
	 private WebElement Search;
	 @FindBy(how = How.XPATH,using = "//*[@aria-label='Google Search']")
	 private WebElement SearchButton;
	 @FindBy(how = How.XPATH,using = "//*[contains(text(),'Log in')]")
	 private WebElement LoginButton;
	 
	 @FindBy(how = How.XPATH,using = "//*[@alt='Google']")
	 private WebElement GoogleLogo;
	 

	 
	WebDriver driver = DriverFactory.getDriver();
	
	
	
	public GoogleloginTestonly()
	{
		PageFactory.initElements(driver,this);
	}



public void LaunchAppUrl() throws Exception
{
	try {
	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	DocumentBuilder builder = factory.newDocumentBuilder();
	Document doc = builder.parse("src/test/resources/readXMLdata.xml");
	doc.getDocumentElement().normalize();
	String AppURL = doc.getElementsByTagName("Urlnew").item(0).getTextContent();
	System.out.println(AppURL);
	driver.get(AppURL);
	}
	catch (Exception e) {
		e.printStackTrace();
		}
	 
}
	



public void LoginSuccessful()throws Exception
{
	Thread.sleep(8000);
	waitForJSandJQueryToLoad(driver);
	waitForPageLoad(driver);
	highlightElement(GoogleLogo);
	
}

public void SearchKeyword() throws Exception{
	// TODO Auto-generated method stub
	Thread.sleep(8000);
	waitForJSandJQueryToLoad(driver);
	waitForPageLoad(driver);
	Search.sendKeys("Apple");
	safeJavaScriptClick(SearchButton);
	
	
}
}
