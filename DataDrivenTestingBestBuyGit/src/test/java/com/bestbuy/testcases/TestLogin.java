package com.bestbuy.testcases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.bestbuy.base.TestBase;

public class TestLogin extends TestBase {

	@Test(dataProvider="getData")
	public void loginOperations(String id, String password) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath(OR.getProperty("accountButton"))).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(OR.getProperty("welcomeSignin"))).click();
		//click("welcomeSignin");
		
		driver.findElement(By.xpath(OR.getProperty("emailTestBox"))).sendKeys(id);
		//type("emailTestBox",id);
		
		driver.findElement(By.xpath(OR.getProperty("passwordTextBox"))).sendKeys(password);
		driver.findElement(By.xpath(OR.getProperty("signInButton"))).click();
		
		Reporter.log("Login Successfully Done");	
	}
	
}// class

