package com.DEW.DEWAutomationSuite.atdd.Testpage1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class DriverFactory {
	
	  private static WebDriver driver;

	    /**
	     * Initializes the WebDriver instance based on the specified browser type.
	     *
	     * @param browser The name of the browser to initialize (e.g., "edge").
	     * @return The initialized WebDriver instance.
	     */
	    public static WebDriver initializeDriver(String browser) {
	        if (browser.equalsIgnoreCase("edge")) {
	            System.setProperty("webdriver.edge.driver", "C:/Users/SSingh2/Documents/eclipse-workspace/DewAutomationSuite/msedgedriver.exe");
	            EdgeOptions options = new EdgeOptions();
	            options.addArguments("--start-maximized");
	            driver = new EdgeDriver(options);
	        } else {
	            throw new IllegalArgumentException("Unsupported browser: " + browser);
	        }
	        return driver;
	        
	        
	    }

	    /**
	     * Returns the current WebDriver instance.
	     *
	     * @return The WebDriver instance.
	     */
	    public static WebDriver getDriver() {
	        if (driver == null) {
	            throw new IllegalStateException("Driver is not initialized. Call initializeDriver() first.");
	        }
	        return driver;
	    }

	    /**
	     * Closes and quits the WebDriver instance.
	     */
	    public static void quitDriver() {
	        if (driver != null) {
	            driver.quit();
	            driver = null;
	        }
	    }

}
