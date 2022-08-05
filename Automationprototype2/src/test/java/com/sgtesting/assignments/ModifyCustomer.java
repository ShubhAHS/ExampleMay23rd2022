package com.sgtesting.assignments;

import org.openqa.selenium.Alert;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ModifyCustomer{
	public static WebDriver oBrowser=null;
         
	     @Test(priority=1)
         private static void launchbrowser()
         {
        	 try
        	 {
        		 System.setProperty("webdriver.chrome.driver", "F:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
        		 oBrowser=new ChromeDriver();
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
	     public Object[][] getCredentials()
	     {
	    	 return new Object[][] {{"admin","manager"}};
	     }
	     @Test(priority=3,dataProvider = "getCredentials")	 
         public  void login(String username,String pwd)
         {
        	 try
        	 {
        		 oBrowser.findElement(By.id("username")).sendKeys(username);
        		 Thread.sleep(1000);
        		 oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
        		 Thread.sleep(1000);
        		oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
        		 Thread.sleep(1000);
        	 }catch(Exception e)
        	 {
        		 e.printStackTrace();
        	 }
         }
	     @Test(priority=4)
         private static void minimizeflyoutwindow()
    	 {
    		 try
    		 {
    			 oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
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
	    	 oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a")).click();
	    	 Thread.sleep(1000);
	    	 oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
	    	 Thread.sleep(1000);
	    	 oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
	    	 Thread.sleep(1000);
	    	 oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys(name);
	    	 Thread.sleep(1000);
	    	 oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys(ds );
	    	 Thread.sleep(1000);
	    	 oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click();
	    	 Thread.sleep(1000);
	    	 }catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    	 }
	     }
	    @DataProvider
	     public Object[][] getModify()
	     {
	    	 return new Object[][] {{"It is a babygirl "}};
	     }
	     @Test(priority=6,dataProvider="getModify")
	     private static void modifycustomer(String ds)
	     {
	     	try
	     	{
	     		oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
	     		Thread.sleep(4000);
	     		oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")).clear();
	     		Thread.sleep(2000);
	     		oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")).sendKeys(ds);
	     		Thread.sleep(2000);
	     	}	catch(Exception e)
	       	 {
	       		 e.printStackTrace();
	       	 }
	        }
	     @Test(priority=7)
	     private static void deletecustomer()
	     {
	    	 try
	    	 {
	    		 oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
		 			Thread.sleep(2000);
		 			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
		 			Thread.sleep(2000);
		 			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
		 			Thread.sleep(2000);
		 			oBrowser.findElement(By.xpath("//*[@id=\'customerPanel_deleteConfirm_submitTitle\']")).click();
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
		    private static void logout()
		     {
		    	 try
		    	 {
		    		 oBrowser.findElement(By.linkText("Logout")).click();
		    		 Thread.sleep(2000);
		    	 }catch(Exception e)
		    	 {
		    		 e.printStackTrace();
		    	 }
		    	 }
		 	@Test(priority=9)
		 	private static void closeApplicatin()
		 	{
		 		try
		 		{
		 			oBrowser.close();

		 		}catch(Exception e)
		 		{
		 			e.printStackTrace();
		 		}
		 	}
		 }

		    

