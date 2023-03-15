package pom_cls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {

	public static WebDriver driver;
	
	@FindBy(id= "username")
	private WebElement user;
	
	@FindBy(id= "password")
	private WebElement pass;
	
	
	@FindBy(id= "login")
	private WebElement login_btn;
	
	
	
	public WebElement getUser() {
		return user;
	}


	public WebElement getPass() {
		return pass;
	}


	public WebElement getLogin_btn() {
		return login_btn;
	}

		public login_page(WebDriver dri) {
			
			driver=dri;
			PageFactory.initElements(driver, this);
		}
	
	
	
	
	
}
