package com.ohrm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ohrm.pages.DashboardPage;
import com.ohrm.pages.LoginPage;

public class DashboardPageTest {
	DashboardPage dp;
	LoginPage lp;
	@BeforeMethod
	public void browserSetup() {
		lp =new LoginPage();
		lp.initialisation();
	}
	@Test
	public void validateTimeWorkSectionTest() {
		dp=lp.login();
		Assert.assertTrue(dp.getTimeWorkSection());
	}
	@Test
	public void validateQuickLaunch() {
		dp=lp.login();
		Assert.assertTrue(dp.getQuickLaunch());
	}
	@Test
	public void validateBuzzLatestPostss() {
		dp=lp.login();
		Assert.assertTrue(dp.getBuzzLatestPosts());
	}
	@Test
	public void validateEmployeesOnLeaveToday() {
		dp=lp.login();
		Assert.assertTrue(dp.getEmployeesOnLeaveToday());
	}
	@Test
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Test
	public void validateEmployeeDistributionBySubUnit() {
		dp=lp.login();
		Assert.assertTrue(dp.getEmployeeDistributionBySubUnit());
	}
	@Test
	public void validateEmployeeDistributionByLocation() {
		dp=lp.login();
		Assert.assertTrue(dp.getEmployeeDistributionByLocation());
	}
	
	@AfterMethod
	public void closeBrowser() {
		dp.tearDown();
	}
}
