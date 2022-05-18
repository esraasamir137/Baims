package LoginTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.*;


@Test
public class loginTestCases {
	
	
	
	String driverPath = "C:\\\\Users\\\\marshmiloo\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe";
	public WebDriver driver ;
	
	@BeforeTest
	
	public void BeforeTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", driverPath);
		Reporter.log("=====Browser Session Started=====", true);
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.baims.com/");
		Reporter.log("=====Application Started=====", true);
		driver.findElement(By.xpath("//*[@id='app_login']/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'__next']/div/div[1]/main/main/div[1]/div[1]/div[2]/div/div[1]/p/a")).click();
        Thread.sleep(3000);
        
	}
	
//@BeforeMethod
//   public void BeforeMethod() throws InterruptedException {
//	  
//	}
//	 

//@AfterMethod
//	
//	public void closewindow() throws InterruptedException {
//		
//         
//	     Thread.sleep(2000);
//		
//	}

@AfterTest
public void closeApplication()
{
	driver.quit();
	Reporter.log("=====Browser Session End=====", true);
	
}
	

}
