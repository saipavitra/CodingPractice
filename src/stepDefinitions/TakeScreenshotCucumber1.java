package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;

public class TakeScreenshotCucumber1 {
	//private static final Scenario ScenarioName = null;
	public static WebDriver driver;
	
	@Given("RunnerClass {string}")
		public static void screenshot(String User)
		{
			String browserType = "chrome";
			// WebDriver driver = null;
			if (browserType.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			} else if (browserType.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			} else if (browserType.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			}
			driver.manage().window().maximize();
			driver.get("https://www.guru99.com/chrome-options-desiredcapabilities.html");
			System.out.println("********"+User);

		}
	@AfterClass
	public void display(Scenario scenario) {
		// TODO Auto-generated method stub
		if(scenario.isFailed()==true)
		{
		TakesScreenshot scr=(TakesScreenshot)driver;
		byte[] screenshotAs = scr.getScreenshotAs(OutputType.BYTES);
		System.out.println("Screenshot Functionality........");
		scenario.attach(screenshotAs, "image/png", "ScenarioName");
		}
	}
		
	}

//reports will be stored under test/resource folder -> under reports folder -> under embed folder


