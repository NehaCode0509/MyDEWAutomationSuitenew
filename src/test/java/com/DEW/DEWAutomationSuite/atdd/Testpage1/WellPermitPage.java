package com.DEW.DEWAutomationSuite.atdd.Testpage1;
import com.DEW.DEWAutomationSuite.atdd.Testpage1.Selenium_Utils.*;
import org.openqa.selenium.By;
import com.DEW.DEWAutomationSuite.atdd.Testpage1.DriverFactory.*;
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
import org.openqa.selenium.support.ui.Select;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WellPermitPage extends Selenium_Utils {

	
	 @FindBy(how = How.XPATH ,using = "//*[contains(text(),'Start New Application')]")
	 private WebElement StartNewApplication;
	 
	 @FindBy(how = How.XPATH ,using = "//*[@class='loggedin dashboard]")
	 private WebElement DashboardBody;
	
	 
	 @FindBy(how = How.XPATH,using = "(//a[contains(@href, './Cap/CapApplyDisclaimer.aspx?module=WaterPermits')])[3]")
	 private WebElement WellConstructionPermit;
	 
	 @FindBy(how = How.XPATH,using = "//*[contains(text(),' Water Affecting Activity Permits')]")
	 private WebElement WaterAffectingActivityPermits;
			 
	 
	 @FindBy(how = How.XPATH,using = "//*[@id='ctl00_PlaceHolderMain_termAccept']")
	 private WebElement TermandConditionCheckbox;
	 
	 @FindBy(how = How.XPATH,using = "//span[contains(text(),'Continue Application')]")
	 private WebElement ContinueApplication;
	 
	 @FindBy(how = How.XPATH,using = "//span[contains(text(),'Continue')]")
	 private WebElement Continue;
	 
	 @FindBy(how = How.XPATH,using = " //a[@id='ctl00_phPopup_btnSave']")
	 private WebElement ContinueNew;
	 
	 
	
	 @FindBy(how = How.XPATH,using = "//a[@title='Add New']")
	 private WebElement AddNew;
	 
	 @FindBy(how = How.XPATH,using = "//*[@id='ACADialogFrame']")
	 private WebElement  ACAFrame ;
	 
 	 @FindBy(how = How.XPATH,using = "//*[@title='Individual']")
 private WebElement  Type ;
 
 	 @FindBy(how = How.XPATH,using = "//*[@id='ctl00_phPopup_ucContactInfo_txtAppFirstName']")
 private WebElement  GivenName ;
 
 	 @FindBy(how = How.XPATH,using = "//*[@id='ctl00_phPopup_ucContactInfo_txtAppLastName']")
 private WebElement  LastName ;
 
 	 @FindBy(how = How.XPATH,using = "//*[@id='ctl00_phPopup_ucContactInfo_txtAppPhone1']")
 private WebElement  MobileNumber ;
 
 	 @FindBy(how = How.XPATH,using = "//*[contains(text(),'Add Contact Address')]")
 private WebElement  ContactAddress ;
 
 
 	 @FindBy(how = How.XPATH,using = "//*[@id='ctl00_phPopup_ucContactAddressEdit_ddlAddressType']")
 private WebElement  Addresstype ;
 
 
 	 @FindBy(how = How.XPATH,using = "//*[@id='ctl00_phPopup_ucContactAddressEdit_ddlStreetDirection']")
 private WebElement  Addresstypesecond ;
 
 	 @FindBy(how = How.XPATH,using = "//*[@id='ctl00$phPopup$ucContactAddressEdit$ddlCountry']")
 private WebElement  Country ;
 
  	 @FindBy(how = How.XPATH,using = "//*[@id='ctl00_phPopup_ucContactAddressEdit_txtHouseAlphaStart']")
 private WebElement  StreetNumber ;
 
  	 @FindBy(how = How.XPATH,using = "//*[@id='ctl00_phPopup_ucContactAddressEdit_txtStreetName']")
 private WebElement  StreetName ;
 
  	 @FindBy(how = How.XPATH,using = "//*[@id='ctl00_phPopup_ucContactAddressEdit_txtCity']")
 private WebElement  Suburb ;
 
  	 @FindBy(how = How.XPATH,using = "//*[@id='ctl00_phPopup_ucContactAddressEdit_txtState_State1']")
 private WebElement  State ;
  	 
  	 
  	 @FindBy(how = How.XPATH,using = "//*[@id='ctl00_phPopup_ucContactAddressEdit_txtZip']")
 private WebElement  PostCode ;
 
  	 @FindBy(how = How.XPATH,using = "//span[contains(text(),'Save and Close')]")
 private WebElement  SaveCloseBtton ;
 
 
  	 @FindBy(how = How.XPATH,using = "//span[contains(text(),'Continue Application')]")
 private WebElement  ContinueApplicationNew  ;
 
  	@FindBy(how = How.XPATH,using = "//*[@title='Skip Challenge']")
	 private WebElement  Skipchallenge ;
	 
	 	 @FindBy(how = How.XPATH,using = "//*[@id='btnProcessPayment']")
	 private WebElement  Pay ;
	 
	 	 @FindBy(how = How.XPATH,using = "//*[@id='checkbox']")
	 private WebElement  Captcha ;
	 
	 	 @FindBy(how = How.XPATH,using = "//*[@id='CVN']")
	 private WebElement  CVN ;
	 
	 	 @FindBy(how = How.XPATH,using = "//*[@id='ExpiryYear']")
	 private WebElement  ExpiryYear ;
	 
	 
	 	 @FindBy(how = How.XPATH,using = "//*[@id='ExpiryMonth']")
	 private WebElement  ExpiryMonth ;
	 
	 
	 	 @FindBy(how = How.XPATH,using = "//*[@id='CardNumber']")
	 private WebElement  VisaCardNumber ;
	 
	 	 @FindBy(how = How.XPATH,using = "//*[@id='ctl00_PlaceHolderMain_capReviewCertification1_termReviewAccept']")
	 private WebElement  TermReviewAccept ;
	 
	  	 @FindBy(how = How.XPATH,using = "//*[@id='ctl00_PlaceHolderMain_AppSpec67691E98Edit_DEW_chk_0_0']")
	 private WebElement  WaterSupplytypeCommercialIrrigation ;
	 
	  	 @FindBy(how = How.XPATH,using = "//*[@id='ctl00_PlaceHolderMain_AppSpec79B4EEBDEdit_DEW_ddl_0_9']")
	 private WebElement  ProposedConstructionMethod ;
	 
	  	 @FindBy(how = How.XPATH,using = "//*[@id='ctl00_PlaceHolderMain_AppSpec79B4EEBDEdit_DEW_txt_0_8']")
	 private WebElement  ProposedDepth ;
	 
	  	 @FindBy(how = How.XPATH,using = "//*[@id='btnReviewPayment']")
	 private WebElement NextButton   ;
	 
	  	 @FindBy(how = How.XPATH,using = "//*[@id='ctl00_PlaceHolderMain_AppSpec2515C39BEdit_DEW_chk_0_0']")
	 private WebElement  ProposedworkConstructanewWall ;
	 
	  	 @FindBy(how = How.XPATH,using = "//*[@id='ctl00_PlaceHolderMain_AppSpec79B4EEBDEdit_DEW_ddl_0_4']")
	 private WebElement  UseofProposedWell ;
	  	 
		 @FindBy(how = How.XPATH,using = "//a[@id='ctl00_PlaceHolderMain_lnkContinueApplication']")
		 private WebElement  ContinueApplicationButton ;
	  	 
	  	
 
	  	WebDriver driver = DriverFactory.getDriver() ; 
	  

	
	public WellPermitPage()
	{
		
		PageFactory.initElements(driver,this);
	}





public void ClickOnStartNewApplication() throws Exception {
	
	Thread.sleep(5000);
	waitForJSandJQueryToLoad(driver);
	waitForPageLoad(driver);
	safeJavaScriptClick(DashboardBody);
	highlightElement(StartNewApplication);
	safeJavaScriptClick(StartNewApplication);
	
	//driver.switchTo().frame(0);
	//StartNewApplication.click();
	
}

public void ClickOnWaterAffectingActivityPermits()  throws Exception {
	
	Thread.sleep(5000);
	waitForJSandJQueryToLoad(driver);
	waitForPageLoad(driver);
	highlightElement(WaterAffectingActivityPermits);
	safeJavaScriptClick(WaterAffectingActivityPermits);

	
}

public void user_click_on_well_construction_permit_applications()  throws Exception {


	waitForJSandJQueryToLoad(driver);
	waitForPageLoad(driver);
	System.out.println("I am before Safe java script in well construction permit");
	highlightElement(WellConstructionPermit);
	safeJavaScriptClick(WellConstructionPermit);
	//WellConstructionPermit.click();
	System.out.println("I am after well construction permit simple click");
	
}

public void ClickonContinueApplication()  throws Exception {
	
	Thread.sleep(5000);
	waitForJSandJQueryToLoad(driver);
	waitForPageLoad(driver);
//	System.out.println("I am before Safe java script in TermandConditionCheckbox");
	//safeJavaScriptClick(TermandConditionCheckbox);
	highlightElement(TermandConditionCheckbox);
	TermandConditionCheckbox.click();
	highlightElement(ContinueApplication);
	ContinueApplication.click();
	
//	System.out.println("I am after ContinueApplicationsimple click"); 
	Thread.sleep(3000);
}

public void ClickOnAddNewButton()  throws Exception {
	Thread.sleep(5000);
	waitForJSandJQueryToLoad(driver);
	waitForPageLoad(driver);
	highlightElement(ContinueApplication);
	ContinueApplication.click();
	highlightElement(AddNew);
	safeJavaScriptClick(AddNew);
	//AddNew.click();
	
}

public void FillTheContactInformationPage()  throws Exception {
	
	Thread.sleep(8000);
	waitForJSandJQueryToLoad(driver);
	waitForPageLoad(driver);
    // Switch to iframe by index (e.g., first iframe on the page)
    driver.switchTo().frame(ACAFrame);
    
	safeJavaScriptClick(Type);
	Thread.sleep(4000);
	highlightElement(GivenName);
	safeJavaScriptSendKeys(GivenName,"Test First Name");
	GivenName.sendKeys("Test First Name");
	Thread.sleep(4000);
	
	highlightElement(LastName);
   // LastName.sendKeys("Test Last Name");
    safeJavaScriptSendKeys(LastName,"Test Last Name");
    LastName.sendKeys("Test Last  Name");
	Thread.sleep(3000);
	highlightElement(MobileNumber);
    safeJavaScriptSendKeys(MobileNumber,"0465171327");
   // MobileNumber.sendKeys("0465171327");
	Thread.sleep(4000);
	highlightElement(ContactAddress);
    safeJavaScriptClick(ContactAddress);
    Thread.sleep(7000);
     driver.switchTo().frame(ACAFrame);
 	highlightElement(Addresstype);
    selectByVisibleText(Addresstype, "Postal");
    highlightElement(Addresstypesecond);
    selectByVisibleText(Addresstypesecond, "Street address");
    highlightElement(Country);
   // selectByVisibleText(Country, "Australia");
 	highlightElement(Suburb);
 	Suburb.click();
 	  safeJavaScriptSendKeys(Suburb,"Payneham");
 //	 Suburb.sendKeys("Payneham");
    highlightElement(PostCode);
    PostCode.click();
    safeJavaScriptSendKeys(PostCode, "5070");
 //   PostCode.sendKeys("5070");
    highlightElement(StreetNumber);
    StreetNumber.click();
    safeJavaScriptSendKeys(StreetNumber, "14");
 //   StreetNumber.sendKeys("14");
    highlightElement(StreetName);
    StreetName.click();
    safeJavaScriptSendKeys(StreetName, "John Street");
    //StreetName.sendKeys("John Street");
    highlightElement(State);
    selectByVisibleText(State, "SA");
    highlightElement(SaveCloseBtton);
    safeJavaScriptClick(SaveCloseBtton);
    
    Thread.sleep(8000);
 //   highlightElement(ContinueNew);
   // ContinueNew.click();
//   driver.switchTo().frame(ACAFrame);
    Thread.sleep(9000);
   /* SafeJavasafeScrollToElement(Continue);
    highlightElement(Continue);
    Continue.click();*/
}







public void SelectTheProsedWork() throws Exception {
	Thread.sleep(8000);
	waitForJSandJQueryToLoad(driver);
	waitForPageLoad(driver);
	highlightElement(ContinueApplication);
	ContinueApplication.click();
    highlightElement(ProposedworkConstructanewWall);
    safeJavaScriptClick(ProposedworkConstructanewWall);
  //  ProposedworkConstructanewWall.click();
    Thread.sleep(2500);
	highlightElement(ContinueApplication);
	ContinueApplication.click();
	
	
}

public void SelectLocation_details_water_supply()  throws Exception{
	Thread.sleep(8000);
	waitForJSandJQueryToLoad(driver);
	waitForPageLoad(driver);
	Thread.sleep(2500);
	highlightElement(UseofProposedWell);
    selectByVisibleText(UseofProposedWell, "Water supply");
	highlightElement(ProposedDepth);
	safeJavaScriptSendKeys(ProposedDepth,"100");
	highlightElement(ProposedConstructionMethod);
    selectByVisibleText(ProposedConstructionMethod, "Excavated");
    highlightElement(WaterSupplytypeCommercialIrrigation);
   // WaterSupplytypeCommercialIrrigation.click();
    safeJavaScriptClick(WaterSupplytypeCommercialIrrigation);
    Thread.sleep(3000);
    highlightElement(ContinueApplication);
	ContinueApplication.click();
	
}

public void add_attachment_and_reviews_to_record_type() throws Exception {
	Thread.sleep(8000);
	waitForJSandJQueryToLoad(driver);
	waitForPageLoad(driver);
	ContinueApplication.click();
	highlightElement(TermReviewAccept);
	safeJavaScriptClick(TermReviewAccept);
	//TermReviewAccept.click();
	Thread.sleep(3000);
	highlightElement(ContinueApplication);
	ContinueApplication.click();
	Thread.sleep(3000);
	highlightElement(ContinueApplicationButton);
	ContinueApplicationButton.click();
}

public void PayFees() throws Exception {
	Thread.sleep(8000);
	waitForJSandJQueryToLoad(driver);
	waitForPageLoad(driver);
	highlightElement(VisaCardNumber);
	VisaCardNumber.sendKeys("444444444441");
	highlightElement(ExpiryMonth);
	ExpiryMonth.sendKeys("11");
	highlightElement(ExpiryYear);
	ExpiryYear.sendKeys("34");
	highlightElement(CVN);
	CVN.sendKeys("999");
	Thread.sleep(3000);
	highlightElement(Pay);
	Pay.click();
}

public void SuccessfullySubmitApplication()throws Exception {
	Thread.sleep(8000);
	waitForJSandJQueryToLoad(driver);
	waitForPageLoad(driver);
	
	
}
}
