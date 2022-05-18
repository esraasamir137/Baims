package LoginTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class baseData extends loginTestCases {

	
	
	
	@Test (priority = 1 , description="This TC will perform valid login") 

	public void validEmailandPassword() throws InterruptedException {
		
		 driver.findElement(By.name("email")).sendKeys("esraasamir137@gmail.com");
	   	 driver.findElement(By.name("password")).sendKeys("Esr@@137");
	     driver.findElement(By.xpath("//*[@id='__next']/div/div[1]/main/main/div[1]/div[1]/div[2]/div/div[1]/div/div[2]/form/div[2]/button")).click();
	     String expectedResault = "http://www.baims.com/";
		 String actualResault = driver.getCurrentUrl();
		 Assert.assertEquals(actualResault, expectedResault);
		 driver.findElement(By.name("email")).clear();
         driver.findElement(By.name("password")).clear();
        
	}
	
	@Test (priority = 2 , description="This TC will perform invalid login")

	public void validEmailandInvalidPassword() throws InterruptedException {
		
		 driver.findElement(By.name("email")).sendKeys("esraasamir137@gmail.com");
	   	 driver.findElement(By.name("password")).sendKeys("asdfas");
	     driver.findElement(By.xpath("//*[@id='__next']/div/div[1]/main/main/div[1]/div[1]/div[2]/div/div[1]/div/div[2]/form/div[2]/button")).click();
	     String expectedResault = "The given data was invalid.";
		 WebElement errorMessage  = driver.findElement(By.xpath("//*[@id='__next']/div/div[1]/main/main/div[1]/div[1]/div[2]/div/div[1]/div/div[2]/form/p"));
		 String actualResault = errorMessage.getText();
		 Assert.assertEquals(actualResault, expectedResault);
		 driver.findElement(By.name("email")).clear();
         driver.findElement(By.name("password")).clear();
	}
	@Test (priority = 3, description="This TC will perform invalid login")

	public void INvalidEmailandPassword() throws InterruptedException {
		
		 driver.findElement(By.name("email")).sendKeys("asdf7@gmail.com");
	   	 driver.findElement(By.name("password")).sendKeys("asdf");
	     driver.findElement(By.xpath("//*[@id='__next']/div/div[1]/main/main/div[1]/div[1]/div[2]/div/div[1]/div/div[2]/form/div[2]/button")).click();
	     String expectedResault = "The given data was invalid.";
		 WebElement errorMessage  = driver.findElement(By.xpath("//*[@id='__next']/div/div[1]/main/main/div[1]/div[1]/div[2]/div/div[1]/div/div[2]/form/p"));
		 String actualResault = errorMessage.getText();
		 Assert.assertEquals(actualResault, expectedResault);
		 driver.findElement(By.name("email")).clear();
         driver.findElement(By.name("password")).clear();
	}
	@Test (priority = 4, description="This TC will perform invalid login")

	public void EmptyEmailandPassword() throws InterruptedException   {
		
		 driver.findElement(By.name("email")).sendKeys("");
	   	 driver.findElement(By.name("password")).sendKeys("");
	     driver.findElement(By.xpath("//*[@id='__next']/div/div[1]/main/main/div[1]/div[1]/div[2]/div/div[1]/div/div[2]/form/div[2]/button")).click();
	     String expectedResault = "The given data was invalid.";
		 WebElement errorMessage  = driver.findElement(By.xpath("//*[@id='__next']/div/div[1]/main/main/div[1]/div[1]/div[2]/div/div[1]/div/div[2]/form/p"));
		 String actualResault = errorMessage.getText();
		 Assert.assertEquals(actualResault, expectedResault);
		 driver.findElement(By.name("email")).clear();
         driver.findElement(By.name("password")).clear();
	}
	@Test (priority = 5, description="This TC will perform invalid login")

	public void validEmailandEmptyPassword() throws InterruptedException   {
		
		 driver.findElement(By.name("email")).sendKeys("esraasamir137@gmail.com");
	   	 driver.findElement(By.name("password")).sendKeys("");
	     driver.findElement(By.xpath("//*[@id='__next']/div/div[1]/main/main/div[1]/div[1]/div[2]/div/div[1]/div/div[2]/form/div[2]/button")).click();
	     String expectedResault = "The given data was invalid.";
		 WebElement errorMessage  = driver.findElement(By.xpath("//*[@id='__next']/div/div[1]/main/main/div[1]/div[1]/div[2]/div/div[1]/div/div[2]/form/p"));
		 String actualResault = errorMessage.getText();
		 Assert.assertEquals(actualResault, expectedResault);
		 driver.findElement(By.name("email")).clear();
         driver.findElement(By.name("password")).clear();
	}
	@Test (priority = 6, description="This TC will perform invalid login")

	public void EmptyEmailandvalidPassword() throws InterruptedException   {
		
		 driver.findElement(By.name("email")).sendKeys("");
	   	 driver.findElement(By.name("password")).sendKeys("Esr@@137");
	     driver.findElement(By.xpath("//*[@id='__next']/div/div[1]/main/main/div[1]/div[1]/div[2]/div/div[1]/div/div[2]/form/div[2]/button")).click();
	     String expectedResault = "The given data was invalid.";
		 WebElement errorMessage  = driver.findElement(By.xpath("//*[@id='__next']/div/div[1]/main/main/div[1]/div[1]/div[2]/div/div[1]/div/div[2]/form/p"));
		 String actualResault = errorMessage.getText();
		 Assert.assertEquals(actualResault, expectedResault);
		 driver.findElement(By.name("email")).clear();
         driver.findElement(By.name("password")).clear();
		
	}
	


  

}
