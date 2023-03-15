package com.Runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.base.base_class;

public class Adactin_Runner_cls extends base_class {

	public static void main(String[] args) throws Exception {
		
		browser_launch("chrome");
			
			passurl("http://adactinhotelapp.com/");
			
			iwait(3000);
			
			
			
			WebElement username = driver.findElement(By.id("username"));	
			passinput(username, "shareeb27");
			
			WebElement pswrd = driver.findElement(By.id("password"));
			passinput(pswrd, "shareeb123");
			
			threadsleep(2000);
			
			WebElement login = driver.findElement(By.id("login"));
			login.click();
			
			ss("Adactinhotel");
			
			System.out.println("Logging into AdactinHotel");
		}
	
}
