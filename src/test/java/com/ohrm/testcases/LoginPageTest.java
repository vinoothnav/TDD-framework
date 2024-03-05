package com.ohrm.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ohrm.pages.DashboardPage;
import com.ohrm.pages.LoginPage;

public class LoginPageTest {
	WebDriver driver;
	//write 2 TC
	//TC 1 :validate title
	LoginPage lp;
	DashboardPage dp;
	@BeforeMethod
	public void browserSetup() {
		lp =new LoginPage();
		lp.initialisation();
	}
	@Test
	public void validateTitleTest() {
		
		String expTitle = "OrangeHRM";
		String actTitle = lp.getTitle();
		Assert.assertEquals(actTitle,expTitle);
		//driver.close();
		
	}
	//Tc 2 :validate login
	@Test
	public void validateLoginTest() {
	
		dp=lp.login();
		
		
		Assert.assertTrue(dp.getDashboardLabel());
		
		
	}
	@Test
	public void validateForgotPasswordTest() {
		lp.getResetPassword();
	}
	@AfterMethod
	public void closeBrowser() {
		lp.tearDown();
	}
}
