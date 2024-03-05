package com.ohrm.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import com.ohrm.base.OrangeHRMBase;

public class LoginPage extends OrangeHRMBase{
	
	public String getTitle() {
		return driver.getTitle();
	} 
	public DashboardPage login() {
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		captureScreenshot("login tc");
		return new DashboardPage();
	}
	public boolean getResetPassword() {
		driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).click();
		return driver.findElement(By.xpath("//h6[text()='Reset Password']")).isDisplayed();
	}
	
}
