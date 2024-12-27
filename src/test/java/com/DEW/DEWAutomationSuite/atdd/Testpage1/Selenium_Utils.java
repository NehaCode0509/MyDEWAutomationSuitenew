package com.DEW.DEWAutomationSuite.atdd.Testpage1;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.DEW.DEWAutomationSuite.atdd.Testpage1.DriverFactory;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Selenium_Utils extends DriverFactory {
	
	private static WebDriverWait wait;
	 static WebDriver driver = DriverFactory.getDriver();
	
	public Selenium_Utils()
	{
		driver = DriverFactory.getDriver();
	
	}



	public  static void  waitForJSandJQueryToLoad(WebDriver driver) {
	    // Use Duration to specify timeout
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	    // Wait for JavaScript to load
	    ExpectedCondition<Boolean> jsLoad = drv -> 
	        ((JavascriptExecutor) drv).executeScript("return document.readyState").equals("complete");

	    // Wait for jQuery to load
	    ExpectedCondition<Boolean> jQueryLoad = drv -> {
	        try {
	            return (Boolean) ((JavascriptExecutor) drv).executeScript("return jQuery.active == 0");
	        } catch (Exception e) {
	            // jQuery is not present
	            return true;
	        }
	    };

	    // Wait for both JavaScript and jQuery
	    wait.until(jsLoad);
	    wait.until(jQueryLoad);
	}
	 // Method to wait for an element to be visible
    public static WebElement waitForElementToBeVisible(By locator) throws Exception {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    
    // Method to wait for an element to be clickable
    public static WebElement waitForElementToBeClickable(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    // Method to wait for JavaScript and jQuery to load
    public static void waitForJSandJQueryToLoad() {
        // Wait for JavaScript to load
        ExpectedCondition<Boolean> jsLoad = drv -> 
            ((JavascriptExecutor) drv).executeScript("return document.readyState").equals("complete");

        // Wait for jQuery to load
        ExpectedCondition<Boolean> jQueryLoad = drv -> {
            try {
                return (Boolean) ((JavascriptExecutor) drv).executeScript("return jQuery.active == 0");
            } catch (Exception e) {
                // jQuery is not present
                return true;
            }
        };

        wait.until(jsLoad);
        wait.until(jQueryLoad);
    }

    // Method to take a screenshot and save it to a specified location
    public static  void takeScreenshot(String fileName,WebDriver driver) {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            File destFile = new File(fileName);
            ImageIO.write(ImageIO.read(screenshot), "PNG", destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to close the browser
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static void waitForPageLoad(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(webDriver -> ((org.openqa.selenium.JavascriptExecutor) webDriver)
                .executeScript("return document.readyState").equals("complete"));
    }

    // Method to select value by visible text
    public static void selectByVisibleText(WebElement dropdownElement, String Visibletext) {
    	 try {
             // Initialize the Select class
             Select dropdown = new Select(dropdownElement);

             // Select by visible text
             dropdown.selectByVisibleText(Visibletext);

             System.out.println("Option selected: " + Visibletext);
         } catch (Exception e) {
             System.err.println("Unable to select the option: " + Visibletext);
             e.printStackTrace();
         }
    	 
    }
    	 //Method for Safe Java Script click
    	 public static void safeJavaScriptClick(WebElement element) {
    	        try {
    	        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	            wait.until(ExpectedConditions.elementToBeClickable(element));

    	            // Scroll the element into view if needed
    	            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

    	            // Click the element using JavaScript
    	            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    	        } catch (Exception e) {
    	            System.out.println("Unable to perform JavaScript click: " + e.getMessage());
    	        }
    	 
     }
    	 
    	 public static void safeJavaScriptSendKeys(WebElement element, String value) {
    	        try {
    	            // Wait until the element is present and interactable
    	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	            wait.until(ExpectedConditions.visibilityOf(element));
    	            wait.until(ExpectedConditions.elementToBeClickable(element));

    	            // Scroll the element into view if needed
    	            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

    	            // Clear the existing value (if necessary)
    	            ((JavascriptExecutor) driver).executeScript("arguments[0].value = '';", element);

    	            // Set the value using JavaScript
    	            ((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1];", element, value);

    	        } catch (Exception e) {
    	            System.out.println("Unable to perform JavaScript sendKeys: " + e.getMessage());
    	        }
    	    }
    	 //Highlights an element by changing its border or background color.
    	 public static void highlightElement(WebElement element) {
    		    try {
    		        ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red';", element);
    		    } catch (Exception e) {
    		        System.out.println("Failed to highlight element: " + e.getMessage());
    		    }
    		}
    	 
    	 //Waits for an element to become visible using JavaScript.
    	 public static void safeWaitForVisibility(WebElement element, int timeoutInSeconds) {
    		    try {
    		        new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds)).until(webDriver ->
    		            (Boolean) ((JavascriptExecutor) webDriver).executeScript("return arguments[0].offsetParent !== null;", element)
    		        );
    		    } catch (Exception e) {
    		        System.out.println("Element not visible within timeout: " + e.getMessage());
    		    }
    		}
    	 
    	 //Method Safe JavaScript Scroll
    	 
    	 public static void SafeJavasafeScrollToElement(WebElement element) {
    	    try {
    	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", element);
    	    } catch (Exception e) {
    	        System.out.println("Failed to scroll to element: " + e.getMessage());
    	    }
    	}
    }



