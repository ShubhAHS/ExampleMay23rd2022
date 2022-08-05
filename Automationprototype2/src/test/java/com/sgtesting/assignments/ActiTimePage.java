package com.sgtesting.assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	//WebElement for login Page UserName text field
		private WebElement username;
		public WebElement getUsername() {
			return username;
		}
		//WebElement for login Page password text field
		private WebElement pwd;
		public WebElement getPwd() {
			return pwd;
		}
		
		//WebElement for login Page login button field
		@FindBy(xpath="//div[text()='Login ']")
		private WebElement oLogin;
		public WebElement getoLogin() {
			return oLogin;
		}
		//WebElement for Homepage FlyOut Window
		private WebElement gettingStartedShortcutsPanelId;
		public WebElement getGettingStartedShortcutsPanelId() {
			return gettingStartedShortcutsPanelId;
		}
		//WebElement for HomePage Logout Button
		@FindBy(linkText="Logout")
		private WebElement oLogout;
		public WebElement getoLogout() {
			return oLogout;
		}
		//WebElement for Home Page to CreateUser
		@FindBy(xpath ="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")
		private WebElement oCreate;
		public WebElement getoCreate() {
			return oCreate;
		}
		@FindBy(xpath="//*[@id=\'createUserDiv\']/div/div[2]")
		private WebElement oAdduser;
     	public WebElement getoAdduser() {
			return oAdduser;
     	}
     	private WebElement firstName;
    	public WebElement getFirstName() {
    		return firstName;
    	}
    	private WebElement lastName;
    	public WebElement getLastName() {
    		return lastName;
    	}
    	private WebElement email;
    	public WebElement getEmail() {
    		return email;
    	}
    	private WebElement userDataLightBox_usernameField;
    	public WebElement getuserDataLightBox_usernameField() {
    		return userDataLightBox_usernameField;
    	}
    	private WebElement password;
    	public WebElement getpassword() {
    		return password;
    	}
    	private WebElement passwordCopy;
    	public WebElement getpasswordCopy() {
    		return passwordCopy;
    	}
    	
    	@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
    	private WebElement CreateUser;
    	public WebElement getCreateUser() {
    		return CreateUser;
    	}
    	
    	
        //WebElement for Home Page ToModify User Window
    	@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")
    	private WebElement Modify;
    	public WebElement getModify() {
    		return Modify;//*[@id=\"userDataLightBox_firstNameField\"
    	}
    		//WebElement for Home Page To Modify User Window
        	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
        	private WebElement ModifyS;
        	public WebElement getModifyS() {
        		return ModifyS;
        	}
        	
        	//WebElement for Home Page To Modify User Window
        	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div")  
        	private WebElement Modifycomplete;
			public Object findElement;
        	public WebElement getModifycomplete() {
        		return Modifycomplete;
        	}
        	
        		//WebElement to getdelete
        	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
        	private WebElement Delete;
        	public WebElement getDelete() {
        		return Delete;
        	}
        	
        	
        	//WebElement for Home Page To Delete User Window
        	@FindBy(xpath="//*[@id=\'userDataLightBox_deleteBtn\']")
        	private WebElement DeleteUser;
        	public WebElement getDeleteUser() {
        		return DeleteUser;
        	}
        	//WebElement for Home page to Create Customer
        	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr/td[3]/a")
        	private WebElement CreateCustomer;
        	public WebElement getCreateCustomer() {
        		return CreateCustomer;
        	}
        	
        	@FindBy(xpath="//div[text()='Add New']")
        	private WebElement AddCutomer;
        	public WebElement getAddCutomer() {
        		return AddCutomer;
        	}
        	
        	@FindBy(xpath="/html/body/div[14]/div[1]")
        	private WebElement CreateC;
        	public WebElement getCreateC() {
        		return CreateC;
        	}
        	
        	@FindBy(xpath="//*[@id=\'customerLightBox_nameField\']")
        	private WebElement CustName;
        	public WebElement getCustName() {
        		return CustName;
        	}
        	
        	@FindBy(xpath="//*[@id=\'customerLightBox_descriptionField\']")
        	private WebElement CustDesc;
        	public WebElement getCustDesc() {
        		return CustDesc;
        	}
        	
        	
        	@FindBy(xpath="//span[text()='Create Customer']")
        	private WebElement CreateCBtn;
        	public WebElement getCreateCBtn() {
        		return CreateCBtn;
        	}
        	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
        	private WebElement DeleteC;
        	public WebElement getDeleteC() {
        		return DeleteC;
        	}
        	
        	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")
        	private WebElement DeleteAction;
        	public WebElement getDeleteAction() {
        		return DeleteAction;
        	}
        	
        	@FindBy(xpath="//div[text()='Delete']")
        	private WebElement Deletes;
        	public WebElement getDeletes() {
        		return Deletes;
        	}
        	
        	private WebElement customerPanel_deleteConfirm_submitTitle;
        	public WebElement getCustomerPanel_deleteConfirm_submitTitle() {
        		return customerPanel_deleteConfirm_submitTitle;
        	}
        	//WebElement for Home Page To Create Project Window
        	
        	@FindBy(xpath="//div[text()='Add New']")
        	private WebElement AddProj;
        	public WebElement getAddProj() {
        		return AddProj;
        	}
        	
        	@FindBy(xpath="/html/body/div[14]/div[2]")
        	private WebElement NewProj;
        	public WebElement getNewProj() {
        		return NewProj;
        	}
        	
        	private WebElement projectPopup_projectNameField;
        	public WebElement getProjectPopup_projectNameField() {
        		return projectPopup_projectNameField;
        	}
        	
        	private WebElement projectPopup_projectDescriptionField;
        	public WebElement getProjectPopup_projectDescriptionField() {
        		return projectPopup_projectDescriptionField;
        	}
        	@FindBy(xpath="//*[@id=\'projectPopup_commitBtn\']/div/span")
        	private WebElement CreateProj;
        	public WebElement getCreateProj() {
        		return CreateProj;
        	}
        	//WebElement For ModifyProject
        	@FindBy(xpath=" //*[@id=\\\"cpTreeBlock\\\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[2]")
        	private WebElement Modify1;
        	public WebElement getModify1() {
        		return  Modify1;	
        	}
        	@FindBy(xpath="//*[@id=\\\"taskListBlock\\\"]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea ")
        	private WebElement Modify2;
        	public WebElement getModify2() {
        		return  Modify2;	
        	}
        	@FindBy(xpath="//*[@id=\\\"taskListBlock\\\"]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea ")
        	private WebElement Modify3;
        	public WebElement getModify3() {
        		return  Modify3;	
        	}
        	@FindBy(xpath="//*[@id=\\\"taskListBlock\\\"]/div[4]/div[1]/div[1]")
        	private WebElement Modify4;
        	public WebElement getModify4() {
        		return  Modify4;	
        	}
        	//WebElement for Home Page To Delete Project Window
        	@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
        	private WebElement EditBtn;
        	public WebElement getEditBtn() {
        		return EditBtn;
        	}
        	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
        	private WebElement PDAction;
        	public WebElement getPDAction() {
        		return PDAction;
        	}
        	
        	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")
        	private WebElement ProjD;
        	public WebElement getProjD() {
        		return ProjD;
        	}
        	private WebElement projectPanel_deleteConfirm_submitTitle;
        	public WebElement getProjectPanel_deleteConfirm_submitTitle() {
        		return projectPanel_deleteConfirm_submitTitle;
        	}
        	//WebElement for Home Page To Create Task Window
        	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")
        	private WebElement AddTask;
        	public WebElement getAddTask() {
        		return AddTask;
        	}
        	
        	@FindBy(xpath="/html/body/div[13]/div[1]")
        	private WebElement CreateTask;
        	public WebElement getCreateTask() {
        		return CreateTask;
        	}
        	
        	@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
        	private WebElement Task;
        	public WebElement getTask() {
        		return Task;
        	}
        	
        	@FindBy(xpath="//*[@id=\'createTasksPopup_commitBtn\']/div/span")
        	private WebElement CreateTaskBtn;
        	public WebElement getCreateTaskBtn() {
        		return CreateTaskBtn;
        	}
        	//WebElement for Home Page To Delete Task Window
        	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]")
        	private WebElement DeleteClick;
        	public WebElement getDeleteClick() {
        		return DeleteClick;
        	}
        	@FindBy(xpath="//*[@id=\"taskPanel_deleteConfirm_submitBtn\"]/div")
        	private WebElement TaskDelete;
        	public WebElement getTaskDelete() {
        		return TaskDelete;
        	}}        	