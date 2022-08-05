package com.sgtesting.assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateCustomerParameterize {
	private static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	@Test(priority=1)
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "F:\\ExampleAutomation\\Automation\\Automationprototype2\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@DataProvider
	public Object[][] getLogin()
	{
		return new Object[][] {{"admin","manager"}};
	}
	@Test(priority=3, dataProvider="getLogin")
	
	private static void login(String name,String pwd)
	{
		try
		{
			oPage.getUsername().sendKeys("admin");
			oPage.getPwd().sendKeys("manager");
			oPage.getoLogin().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	private static void minimizFlyoutWindow()
	{
		try
		{
			oPage.getGettingStartedShortcutsPanelId().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	 @DataProvider
     public Object[][] getCustomer()
     {
    	 return new Object[][] {{"Sharadbaai","The god ofEducation"}};
     }
     @Test(priority=5,dataProvider = "getCustomer")
     private static void createcustomer(String name,String ds)
     {
    	 try
    	 {
    	 oPage.getCreateCustomer().click();
    	 Thread.sleep(1000);
    	 oPage.getAddCutomer().click();
    	 Thread.sleep(1000);
    	 oPage.getCreateC().click();
    	 Thread.sleep(1000);
    	 oPage.getCustName().sendKeys(name);
    	 Thread.sleep(1000);
    	 oPage.getCustDesc().sendKeys(ds);
    	 Thread.sleep(1000);
    	 oPage.getCreateCBtn().click();
    	 Thread.sleep(1000);
    	 }catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
     }
    @Test(priority=6)
     private static void deletecustomer()
     {
    	 try
    	 {
    		  oPage. getDeleteC().click();
    	 Thread.sleep(1000);
    	 oPage.getDeleteAction().click();
    	 Thread.sleep(1000);
    	 oPage.getDeletes().click();
    	 Thread.sleep(1000);
    	 oPage.getCustomerPanel_deleteConfirm_submitTitle().click();
    	 Thread.sleep(1000);
    	 
    	 
    	     Alert oAlert=oBrowser.switchTo().alert();
    	     String content=oAlert.getText();
    	     System.out.println(content);
    	     oAlert.accept();
    	     Thread.sleep(2000);
    	    
    	 }catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
     }
	@Test(priority=8)
	private static void Logout()
	{
		try
		{
			oPage.getoLogout().click();;
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=9)
	private static void CloseApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

 