import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.reporter.FileUtil;

public class TakesScreenshotSelenium {
	public static WebDriver driver;
	@FindBy(id="id")
	private List<WebElement> text;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
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
		org.openqa.selenium.TakesScreenshot t= (org.openqa.selenium.TakesScreenshot)driver;
		//org.openqa.selenium.TakesScreenshot t1=new ChromeDriver();
		File screenshotAs = t.getScreenshotAs(OutputType.FILE);
		File screenshotAsd= new File("C:\\Users\\916926\\eclipse-workspace\\TakesScreenshot\\Screenshots\\image.png");
		
		//package used for FileUtils->org.apache.commons.io.FileUtils
		FileUtils.copyFile(screenshotAs, screenshotAsd);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		//driver.navigate().to(url);
		
		//File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	

	}

}
