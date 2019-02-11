package com.myprojectmaven.MyProjectMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
	 @Test
	    public void verifytestApp()
	    {
	    	System.setProperty("webdriver.gecko.driver",
	    			"C:\\Users\\Administrator\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	    			WebDriver driver = new FirefoxDriver();
	    			//comment the above 2 lines and uncomment below 2 lines to use Chrome
	    			//System.setProperty("webdriver.chrome.driver",
	    					//"C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    		//	WebDriver driver = new ChromeDriver();
	    	    	
	    	        String baseUrl = "http://demo.guru99.com/test/newtours/";
	    	        String expectedTitle = "Welcome: Mercury Tours";
	    	        String actualTitle = "";

	    	        // launch Fire fox and direct it to the Base URL
	    	        driver.get(baseUrl);

	    	        // get the actual value of the title
	    	        actualTitle = driver.getTitle();

	    	        /*
	    	         * compare the actual title of the page with the expected one and print
	    	         * the result as "Passed" or "Failed"
	    	         */
	    	        if (actualTitle.contentEquals(expectedTitle)){
	    	            System.out.println("Test Passed by laxman Binawade!");
	    	        } else {
	    	            System.out.println("Test Failed by laxman binawade");
	    	        }
	    	       
	    	        //close Fire fox
	    	        driver.close();
  }
}
