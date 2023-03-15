package pom_cls;

import org.openqa.selenium.WebDriver;

import com.base.base_class;

public class pom_Runner extends base_class {

	public static WebDriver driver;
	
	public static void main(String[] args) throws Throwable {
		
		driver=browser_launch("chrome");
		
		iwait(2000);
	
		passurl("https://adactinhotelapp.com/");
		
		threadsleep(3000);
		
		login_page l = new login_page(driver);
		 
		passinput(l.getUser(), "shareeb27");
		
		passinput(l.getPass(), "shareeb123");
		
		l.getLogin_btn().click();
		
		
		
		System.out.println("Done...");
	}	
	
	
	
	
	
	
	
	
}
