import java.util.List;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FindByClass {
	

	private WebDriver driver;
	//private SearchContext driver; -> parent of webDriver 

	public FindByClass()
	{
     PageFactory.initElements(driver, this); //captures all the DOM elements and provide access to this class //to avoid stale element exception we can this concept // use FindBy annotation will call this class to use only the available elements in the dom
	}
	//page Factory
	//maven concept
	//alterate approach to find the element in UI i.e (object Repository)
	//problem statement in object Repository :if that particular xpath or id fails to find the element in the UI 
	//solution: by using this way we can take either id or xpath attribute to locate the elements in UI
	@CacheLookup//-> stores temporary memory like for example if the frequently used webElement is used throughout the program and wanted to use throughout the program without any blockage this method can be used , and for example if the login user field has two field i.e xpath and id , and xpath given by the user is incorrect and id is correct next time this cache will identify the correct locator and run perfectly throughtout the program without any errors
	@FindBy(id="id")
	private static List<WebElement> text;
	
	@FindBy(name="name")
	private static List<WebElement> text1;
	
	@FindBy(xpath="xpath")
	private static List<WebElement> text2;
	
	@FindBys({@FindBy(xpath="xpath"),@FindBy(id="id")})// if xpath and id are having many elements located at the UI , this function will point to the element which has same Id and Xpath attribute 
	private static List<WebElement> text4;
	
	@FindAll({@FindBy(xpath="xpath"),@FindBy(id="id")})// if webelement is not having the xpath which is mentioned , then the secondary attribute i.e id will be checked if it exists or not 
	private static List<WebElement> text3;
	
	public static List<WebElement> getText() {
		return text;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getText().get(0).sendKeys("word");// used to get list of webElement and send the keys using 1st element   
	}

	public static List<WebElement> getText1() {
		return text1;
	}

	public static void setText1(List<WebElement> text1) {
		FindByClass.text1 = text1;
	}

	public static void setText(List<WebElement> text) {
		FindByClass.text = text;
	}

}

//pom vs page factory -> https://www.browserstack.com/guide/page-object-model-in-selenium
//selenium 4 loactors ->https://www.browserstack.com/guide/relative-locators-in-selenium
