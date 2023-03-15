package nyka_runner;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.base.base_class;

public class nyka_implements extends base_class {
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		browser_launch("chrome");
		iwait(5000);
		passurl("https://www.nykaa.com/");
		
//LOGIN PROCESS		
		WebElement signup = driver.findElement(By.xpath("//button[text()='Sign in']"));
		signup.click();
		
		WebElement signin = driver.findElement(By.xpath("//button[text()='Sign in with Mobile / Email']"));
		signin.click();
		
		WebElement register = driver.findElement(By.xpath("//input[@name='emailMobile']"));
		passinput(register,"8610765217");
		threadsleep(2000);
		
		WebElement proceed = driver.findElement(By.xpath("//button[text()='proceed']"));
		proceed.click();
		System.out.println("sending otp");
		
		WebElement OTP = driver.findElement(By.xpath("//input[@type=\"number\"]"));
		scannermethod(OTP);
		threadsleep(3000);
		
		WebElement verify = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		verify.click();
		System.out.println("otp done...");
		
//FINDING ELEMENTS 		
		WebElement popups = driver.findElement(By.xpath("//a[text()='Pop Ups']"));
		actions("moveelement", popups);
		System.out.println("Done");
		
		WebElement headset = driver.findElement(By.xpath("//a[text()='Headphones  ']"));
		actions("moveelement", headset);
		actions("click", headset);
		System.out.println("Done...");
		
		windowhandle("multiple");
		threadsleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		threadsleep(500);
		
		WebElement boult = driver.findElement(By.xpath("//img[@alt=\"Boult Audio AirBass GearPods -Black\"]"));
		boult.click();
		System.out.println("done..");
		
		windowhandle("multiple");
		
		threadsleep(2000);
		
		WebElement add2bag = driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]"));
		actions("moveelement", add2bag);
		actions("click", add2bag);
		
//BAG PROCESS
		WebElement bag = driver.findElement(By.xpath("(//button[@type=\"button\"])[2]"));
		actions("moveelement", bag);
		actions("click", bag);
		
		WebElement cartframe = driver.findElement(By.xpath("//iframe[@src=\"/mobileCartIframe?ptype=customIframeCart\"]"));
		frames("webframe", null, cartframe);
		
		WebElement proceed1 = driver.findElement(By.xpath("//span[text()='Proceed']"));
		actions("moveelement", proceed1);
		actions("click", proceed1);
		
		WebElement addemail = driver.findElement(By.xpath("//p[text()='Add New Address']"));
		addemail.click();

//ADDRESS BAR		
		WebElement pincode = driver.findElement(By.xpath("(//input[@type=\"number\"])[1]"));
		passinput(pincode, "635802");
		threadsleep(10000);
		
		WebElement state = driver.findElement(By.xpath("//textarea[@placeholder=\"Road Name/ Area /Colony\"]"));
		passinput(state, "TAMILNADU");
		
		WebElement areaname = driver.findElement(By.xpath("//textarea[@class=\"input-element input-area \"]"));
		passinput(areaname, "MUHAMMMEDPURA/OPPOSITE/STREET");
		System.out.println("adress filled");	

//CONTACT
		WebElement name = driver.findElement(By.xpath("(//input[@type=\"text\"])[4]"));
		passinput(name, "shareeb");
		
		WebElement phonenumber = driver.findElement(By.xpath("(//input[@type=\"number\"])[2]"));
		passinput(phonenumber, "8610765217");
		
		WebElement houseno = driver.findElement(By.xpath("(//input[@type=\"text\"])[3]"));
		actions("click", name);
		passinput(houseno, "Number/17");
		threadsleep(3000);
		
		WebElement shiptoaddress = driver.findElement(By.xpath("//button[text()='Ship to this address']"));
		actions("moveelement", shiptoaddress);
		actions("click", shiptoaddress); 
		Thread.sleep(5000);
		
//PAYMENT PROCESS 		
		  	WebElement cashonDelivery = driver.findElement(By.xpath("//p[text()='Cash on delivery']"));
			cashonDelivery.click();
        
			WebElement placeorder = driver.findElement(By.xpath("//button[text()='Place order']"));
			placeorder.click();
			System.out.println("contact DONE...");
			        Thread.sleep(20000);
	}
}
