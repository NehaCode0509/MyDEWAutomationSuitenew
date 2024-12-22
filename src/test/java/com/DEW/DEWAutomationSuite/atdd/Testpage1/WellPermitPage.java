package com.DEW.DEWAutomationSuite.atdd.Testpage1;
import com.DEW.DEWAutomationSuite.atdd.Testpage1.Selenium_Utils.*;
import org.openqa.selenium.By;
import com.DEW.DEWAutomationSuite.atdd.Testpage1.DriverFactory;
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

public class WellPermitPage {

	
	 @FindBy(how = How.XPATH ,using = "//*[contains(text(),'Start New Application')]")
	 private WebElement StartNewApplication;
	 
	 @FindBy(how = How.XPATH,using = "(//a[contains(@href, './Cap/CapApplyDisclaimer.aspx?module=WaterPermits')])[3")
	 private WebElement WellConstructionPermit;
	 
	 @FindBy(how = How.XPATH,using = "//*[contains(text(),' Water Affecting Activity Permits')]")
	 private WebElement WaterAffectingActivityPermits;
			 
	 
	 @FindBy(how = How.XPATH,using = "//*[@id='ctl00_PlaceHolderMain_termAccept']")
	 private WebElement TermandConditionCheckbox;
	 
	 @FindBy(how = How.XPATH,using = "//span[contains(text(),'Continue Application')]")
	 private WebElement ContinueApplication;
	 
	 @FindBy(how = How.XPATH,using = "//a[@title='Add New']")
	 private WebElement AddNew;
	 
	 @FindBy(how = How.XPATH,using = "//*[@id='ACADialogFrame']")
	 private WebElement  ACAFrame ;
	 
 	 @FindBy(how = How.XPATH,using = "//*[@title='Individual']")
 private WebElement  Type ;
 
 	 @FindBy(how = How.XPATH,using = "//*[@id='ctl00_phPopup_ucContactInfo_txtAppFirstName']")
 private WebElement  GivenName ;
 
 	 @FindBy(how = How.XPATH,using = "//*[@id='ctl00$phPopup$ucContactInfo$txtAppLastName']")
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
	 
	 	 @FindBy(how = How.XPATH,using = "//*[@id='ctl00_PlaceHolderMain_capReviewCertification1_termReviewAccepty']")
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
 
	 
	WebDriver driver = DriverFactory.initializeDriver("edge");
	

	
	public WellPermitPage()
	{
		PageFactory.initElements(driver,this);
	}





public void ClickOnStartNewApplication() throws Exception {
	
	StartNewApplication.click();
	
}

public void ClickOnWaterAffectingActivityPermits()  throws Exception {
	
	WaterAffectingActivityPermits.click();
	
	
}

public void user_click_on_well_construction_permit_applications()  throws Exception {
	// TODO Auto-generated method stub
	WellConstructionPermit.click();
	
}

public void ClickonContinueApplication()  throws Exception {
	TermandConditionCheckbox.click();
	ContinueApplication.click();
	Thread.sleep(3000);
}

public void ClickOnAddNewButton()  throws Exception {
	Thread.sleep(3000);
	ContinueApplication.click();
	AddNew.click();
	
}

public void FillTheContactInformationPage()  throws Exception {
	
	Thread.sleep(8000);
    // Switch to iframe by index (e.g., first iframe on the page)
    driver.switchTo().frame(ACAFrame);
    Type.click();
    GivenName.sendKeys("Test First Name");
    LastName.sendKeys("Test Last Name");
    MobileNumber.sendKeys("0466171223");
    ContactAddress.click();
    driver.switchTo().frame(ACAFrame);
    selectByVisibleText(Addresstype, "Postal");
    selectByVisibleText(Addresstype, "Street adress");
    selectByVisibleText(Addresstype, "Australia");
    
}


private void selectByVisibleText(WebElement addresstype2, String string) {
	// TODO Auto-generated method stub
	
}





public void SelectTheProsedWork() {
	// TODO Auto-generated method stub
	
}

public void SelectLocation_details_water_supply() {
	// TODO Auto-generated method stub
	
}

public void add_attachment_and_reviews_to_record_type() {
	// TODO Auto-generated method stub
	
}

public void PayFees() {
	// TODO Auto-generated method stub
	
}

public void SuccessfullySubmitApplication() {
	// TODO Auto-generated method stub
	
}
}
