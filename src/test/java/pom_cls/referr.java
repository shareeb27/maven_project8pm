package pom_cls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;


public class referr {
	public static WebDriver driver;
	//HOW TO CREATE POM
	
	@FindBy(xpath="//a[text()='Pop Ups']")
	private WebElement popups;
	
    private WebElement headphones;
	
	private WebElement boult;
	
	private WebElement add2cart;
	
	public WebElement getPopups() {
		return popups;
	}

	public WebElement getHeadphones() {
		return headphones;
	}

	public WebElement getBoult() {
		return boult;
	}

	public WebElement getAdd2cart() {
		return add2cart;
	}

	public referr(WebDriver dri) {
		
		driver=dri;
		PageFactory.initElements(driver,this);
	}
		
	}

