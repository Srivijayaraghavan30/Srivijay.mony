package matimony.matrimony.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.util.Set;

import org.apache.commons.collections.set.SynchronizedSortedSet;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class searchnepali extends BaseTest {
	
	WebDriver driver;
	@BeforeMethod
	public void setup() throws MalformedURLException {
	

		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vijay\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);

		}
	
	
	
	
	@Test
	public void setup6() throws Throwable {
		
		searchPOM g = new searchPOM(driver);
		Actions acc = new Actions(driver);
		//Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js  = (JavascriptExecutor)driver;

			
		Thread.sleep(3000);
		driver.get("https://www.nepalimatrimony.com");

		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		BaseTest.click(g.getMatriID());
		BaseTest.typeData(g.getMatriID(), "nep140707");
		
		Thread.sleep(1000);
		BaseTest.click(g.getPasswordClear());
		BaseTest.typeData(g.getPassword(), "cbstest");
		
		Thread.sleep(3000);
		BaseTest.click(g.getLogin_btn());
		
		try {
			Thread.sleep(3000);
			BaseTest.click(g.getInterMediate_page());
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
				BaseTest.click(g.getInterMediate_page1());
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
			Thread.sleep(3000);
			BaseTest.click(driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")));
			} catch (Exception e) {
				
			}
			
			Thread.sleep(10000);

			
			try {
				Robot robot = new Robot();
				robot.delay(5000);
				robot.keyPress(KeyEvent.VK_ESCAPE);
				robot.keyRelease(KeyEvent.VK_ESCAPE);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			Thread.sleep(1000);
			try {
			acc.moveToElement(g.getMenu_btn()).build().perform();
			} catch (Exception e) {
				acc.moveToElement(g.getMenu_btn1()).build().perform();
			}
			
			
			Thread.sleep(5000);

			driver.findElement(By.xpath("(//a[@class='active'])[1]")).click();
			Thread.sleep(5000);
			// age///
			BaseTest.select_text(g.getageFrom(), BaseTest.getExcelData("Sheet1", 1, 1));
			Thread.sleep(5000);
			BaseTest.select_text(g.getageTo(), BaseTest.getExcelData("Sheet1", 1, 2));
			Thread.sleep(5000);
			BaseTest.select_text(driver.findElement(By.id("heightFrom")), BaseTest.getExcelData("Sheet1", 1, 3));
			Thread.sleep(5000);
			BaseTest.select_text(driver.findElement(By.id("heightTo")), BaseTest.getExcelData("Sheet1", 1, 3));
			Thread.sleep(5000);
			
			///marital status//
			String marital_status = BaseTest.getExcelData("Sheet1", 1, 0);
			if (marital_status.contains("Unmarried")&&!g.getunmarried().isSelected()) {
				 BaseTest.click(g.getunmarried());
				 System.out.println("unmarried selected");
				 
					
				}else if (marital_status.contains("Widow / Widower")&&!g.getwidow().isSelected()) {
					 BaseTest.click(g.getwidow());
					 System.out.println("widow selected");
					 
				}else if (marital_status.contains("Divorced")&&!g.getdivorced().isSelected()) {
					 BaseTest.click(g.getdivorced());
					 System.out.println("divorced selected");
					 
				}else if (marital_status.contains("Any")&&!g.getany().isSelected()) {
					 BaseTest.click(g.getany());
					 System.out.println("Any selected");
				}else if (marital_status.contains("Seprate")&&!g.getseprated().isSelected()) {
					 BaseTest.click(g.getseprated());
					 System.out.println("seprated selected");
				}else {
					
				}				
			
//////// mother tounge////////////
			//WebElement menu = driver.findElement(By.id("motherTongueTemp"));
				//WebElement	option = menu.findElement(By.xpath("//option[@title='Hindi']"));

					//acc.doubleClick(option).perform();
					
		acc.doubleClick(driver.findElement(By.xpath("//option[contains(text(),'"+getExcelData("Sheet1", 1, 6)+"')]")));
					
		acc.doubleClick(driver.findElement(By.xpath("//option[contains(text(),'"+getExcelData("Sheet1", 1, 11 )+"')]")));
			
		acc.doubleClick(driver.findElement(By.xpath("//option[contains(text(),'"+getExcelData("Sheet1", 1, 9 )+"')]")));			

		
		String shwoprofilewith = BaseTest.getExcelData("Sheet1", 11, 0);
		if (shwoprofilewith.contains("photo")&&!g.getphotoOpt().isSelected()) {
			 BaseTest.click(g.getphotoOpt());
			 System.out.println("photo selected");
			 
				
			}else if (shwoprofilewith.contains("Horoscope")&&!g.gethoroscopeOpt().isSelected()) {
				 BaseTest.click(g.gethoroscopeOpt());
				 System.out.println("horoscope selected");
				 
			}else {
				
			}
		
		////dont show///
		String dnotshow = BaseTest.getExcelData("Sheet1", 12, 0);
		if (dnotshow.contains("Profiles already contacted")&&!g.getalreadyContOpt().isSelected()) {
			 BaseTest.click(g.getalreadyContOpt());
			 System.out.println("profile already contacted selected");
			 
				
			}else if (dnotshow.contains("Profiles already viewed")&&!g.getalreadyViewedOpt().isSelected()) {
				 BaseTest.click(g.getalreadyViewedOpt());
				 System.out.println("Profiles already viewed selected");
				 
			}else if (dnotshow.contains("Shortlisted profiles ")&&!g.getshortlistOpt().isSelected()) {
				 BaseTest.click(g.getshortlistOpt());
				 System.out.println("Shortlisted profiles  selected");
				 
			}else if (dnotshow.contains("Profiles i have blocked")&&!g.getignoredOpt().isSelected()) {
				 BaseTest.click(g.getignoredOpt());
				 System.out.println("Profiles i have blocked selected");
			}else if (dnotshow.contains("Profiles i have ignored")&&!g.getigOpt().isSelected()) {
				 BaseTest.click(g.getigOpt());
				 System.out.println("Profiles i have ignored selected");
			}else {
				
			}				
		
		
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		
		
		
		
		
		
		
	}




	
}