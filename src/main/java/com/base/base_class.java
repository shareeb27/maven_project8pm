package com.base;

import java.awt.Checkbox;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class base_class {

	public static WebDriver driver ;
	
//WEB DRIVER	
	public static WebDriver  browser_launch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\driver1\\chromedriver.exe");
			
			driver = new ChromeDriver();

	}
		else if (browser.equalsIgnoreCase("gecko")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\driver\\geckodriver.exe");
		}
		return driver;
	}

//REFRESH,TITLE,URL
			public static void refresh() {
					driver.navigate().refresh();
			}
			public static void gettitle() {
					driver.getTitle();
			}
			public static void currenturl() {
					driver.getCurrentUrl();
}
		

//PASS INPUT,AND URL
			
          public static void passurl(String url) {
	        driver.get(url);
}
	      public static void passinput(WebElement element,String value) {
	       	element.sendKeys(value);
}
	
//IMPLICITILY WAIT	      
	      public static void iwait(int a) {
	    	  driver.manage().timeouts().implicitlyWait(a,TimeUnit.SECONDS);
}

//CLOSE AND BACK
	      public static void click(WebElement element) {
	  		element.click();
	    }
	      public static void close() {
	  		driver.close();
	  	}
	  	public static void back() {
	  		driver.navigate().back();
		}
	  	

//IS DISPLAYED,ENABLED,SELECTED
	  	
	  	public static void isenabled(WebElement ie) {
	  		boolean enabled = ie.isEnabled();
	  		System.out.println(enabled);
		}
	  	public static void isselected(WebElement is) {
	  		boolean selected = is.isSelected();
	  		System.out.println(selected);
		}
	  	public static void isdisplayed(WebElement id) {
	  		boolean displayed = id.isDisplayed();
	  		System.out.println(displayed);
	  	}

	  	
//ATTRIBUTEVALUE	  	
	  	public static void getattribute(WebElement atr ,String value) {
	  		atr.getAttribute(value);
		}
	  	
//SCREENSHOT	  	
	  	public static void ss(String name) throws IOException {
	    	  TakesScreenshot ts = (TakesScreenshot) driver;
	    	  File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
	    	  File dest = new File("C:\\Maven_project8pm\\screenshot\\"+name+".png");
	    	  FileUtils.copyFile(screenshotAs, dest);
	      
	      }
//THREADSLEEP	      
	      public static void threadsleep(int a) throws InterruptedException {
	    	  Thread.sleep(a);
		} 
	     
//CHECKBOX	      
	     public static void Checkbox(WebElement refname) {
	    	 refname.click();
		} 

	     
//SINGLE DROPDOWN	     
	     public static void dropdown(WebElement ref, String type, String value) {
	 		Select s = new Select(ref);
	 		if (type.equalsIgnoreCase("index")) {
	 			int parseInt = Integer.parseInt(value);
	 			s.selectByIndex(parseInt);
	 		} else if (type.equalsIgnoreCase("values")) {
	 			s.selectByValue(value);
	 		} else if (type.equalsIgnoreCase("vtext")) {
	 			s.selectByVisibleText(value);
	 		} else {
	 			System.out.println("Invalid selection of dropdown");
	 		}
	 	}

	     
//MULTI DROPDOWN	     
	     public static void multidropdown(WebElement ref, String type, String value) {
	 		Select s = new Select(ref);
	 		if (s.isMultiple() == true) {
	 			if (type.equalsIgnoreCase("index")) {
	 				int parseInt = Integer.parseInt(value);
	 				s.selectByIndex(parseInt);
	 			} else if (type.equalsIgnoreCase("values")) {
	 				s.selectByValue(value);
	 			} else if (type.equalsIgnoreCase("vtext")) {
	 				s.selectByVisibleText(value);
	 			}
	 		} else {
	 			System.out.println("This is not multiple dropdown");
	 		}
	 	}
	     
	     
//MULTIDROP OPTIONS	     
	     public static void multidropoption(WebElement element,String Option) {
	      		Select s = new Select(element);
	      		if (Option.equalsIgnoreCase("getoptions")) {
	      			List<WebElement> options = s.getOptions();
	      			System.out.println("web.getText()");
				}
	      		else if (Option.equalsIgnoreCase("getAllselectedoption")) {
					List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
					for(WebElement webElement : allSelectedOptions) {
						System.out.println(webElement.getText());
					}
	      		}
					else if (Option.equalsIgnoreCase("getFirstelectedoption")) {
					}
					else {
						System.out.println("NO OPTION FOUND");
					}
	}
	     
//ALERT AND PRO ALERT
	     
	     public static void alert(String value) {
	    	 	if (value.equals("ok")) {
	    	 		driver.switchTo().alert().accept();
				}
	    	 	else if (value.equalsIgnoreCase("cancel")) {
	    	 		driver.switchTo().alert().dismiss();
				}
	    	 	else {
					System.out.println("NO ALERT PRESENT");
				}
		}
	      public static void proalert(String input, String value) {
	    	  driver.switchTo().alert().sendKeys(input);
	    	  if (value.equals("ok")) {
	    		  driver.switchTo().alert().accept();
	    	  }	  
	         else if (value.equals("cancel")){
	        	 driver.switchTo().alert().dismiss();
				}
	         else {
				System.out.println("NO ALERT PRESENT");
			}
		}
	     
//ACTOIONS	      
	      public static void actions(String type, WebElement refname) {
	  		Actions act = new Actions(driver);

	  		if (type.equalsIgnoreCase("click")) {
	  			act.click(refname).build().perform();
	  		
	  		} else if (type.equalsIgnoreCase("moveelement")) {
	  			act.moveToElement(refname).build().perform();
	  		
	  		} else if (type.equalsIgnoreCase("clickhold")) {
	  			act.clickAndHold().build().perform();
	  		
	  		} else if (type.equalsIgnoreCase("release")) {
	  			act.release(refname).build().perform();
	  		
	  		} else if (type.equalsIgnoreCase("rightclick")) {
	  			act.contextClick(refname).build().perform();
	  		
	  		} else if (type.equalsIgnoreCase("doubleclick")) {
	  			act.contextClick(refname).build().perform();
	  		}
	  	}

//DROPDOWN	     
	     public static void dragdrop(WebElement src , WebElement dest) {
	    	 	
	    	 Actions a = new Actions(driver);
	    	 a.dragAndDrop(src, dest);
	     }
	     
//JAVASCRIPT
	     
	     public static void scrollupdown(String type ,WebElement refname) {
	    	 
	    	 JavascriptExecutor js = (JavascriptExecutor) driver;
	    	 
	    	 if (type.equalsIgnoreCase("down")) {
	    		 js.executeScript("Window.scrollby(0,1000);");
	    	 }
	    	 else if (type.equalsIgnoreCase("up")) {
				js.executeScript("window.scrollBy(0,-4500);");
			}
	    	 else if(type.equalsIgnoreCase("intoview")) {
	    		 js.executeScript("argument[0].scrollIntoView();",refname);
	    	 }
	    		 
		}
//FRAMES	     
	     public static void frames(String type, String value, WebElement refname) {
	 		if (type.equalsIgnoreCase("index")) {
	 			driver.switchTo().frame(value);
	 		
	 		} else if (type.equalsIgnoreCase("id")) {
	 			driver.switchTo().frame(value);
	 		
	 		} else if (type.equalsIgnoreCase("Webframe")) {
	 			driver.switchTo().frame(refname);
	 		} else {
	 			driver.switchTo().defaultContent();
	 		}
	 	}
//SCANNER 	     
	     public static  void scannermethod(WebElement element) {
	    	 Scanner scan1 = new Scanner(System.in);
	    	String nextIn = scan1.next();
	    	 element.sendKeys(nextIn);
		}
	     
//WINDOW HANDLES	     
	     public static void windowhandle(String type) {
	 		if (type.equalsIgnoreCase("single")) {
	 			String wh = driver.getWindowHandle();
	 			String title = driver.switchTo().window(wh).getTitle();
	 			System.out.println("Currently in a window " + title);
	 		
	 		} else if (type.equalsIgnoreCase("multiple")) {
	 			Set<String> whs = driver.getWindowHandles();
	 			for (String windows : whs) {
	 				String title1 = driver.switchTo().window(windows).getTitle();
	 				System.out.println("Title of the Window " + title1);
	 			}
	 		}
	 	}
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     			
	     
	     
	      	
	      	
	      	
	      	
	      	
	      	
	      		
			}
	      
	      
	      
	      
		
		



	

	
	
	
		


	

