package testNg;

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

public class TakeScreenshotCucumber {
	//private static final Scenario ScenarioName = null;
	public static WebDriver driver;
	
	@Given("RunnerClass")
		public static void screenshot(Scenario scenario)
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
			TakesScreenshot scr=(TakesScreenshot)driver;
			byte[] screenshotAs = scr.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshotAs, "image/png", "ScenarioName");
			if(scenario.isFailed())//to take the screenshot if it is failed
			{
				
			}
			}

		}
		
	}

//reports will be stored under test/resource folder -> under reports folder -> under embed folder


