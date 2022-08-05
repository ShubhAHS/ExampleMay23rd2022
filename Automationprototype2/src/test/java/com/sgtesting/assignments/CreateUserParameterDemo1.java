
package com.sgtesting.assignments;

import org.openqa.selenium.Alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateUserParameterDemo1 {
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
	public Object[][] getUser()
	{
		return new Object[][] {{"demo","User1","hi@gmail.com","shalini","1234","1234"}};
	}
	@Test(priority=5,dataProvider="getUser")
	
	private static void createUser(String fn,String ln,String email,String un,String pwd,String pwdcopy)
	{
		try
		{
			oPage.getoCreate().click();
			Thread.sleep(2000);
			oPage.getoAdduser().click();
			Thread.sleep(2000);
			oPage.getFirstName().sendKeys(fn);
			oPage.getLastName().sendKeys(ln);
			oPage.getEmail().sendKeys(email);
			oPage.getuserDataLightBox_usernameField().sendKeys(un);
			oPage.getpassword().sendKeys(pwd);
			oPage.getpasswordCopy().sendKeys(pwdcopy);
			Thread.sleep(2000);
			oPage.getCreateUser().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	private static void deleteUser()
	{
		try
		{
			oPage.getDelete().click();
			Thread.sleep(2000);

			oPage.getDeleteUser().click();
			Thread.sleep(2000);

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
	@Test(priority=7)
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
	@Test(priority=8)
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

