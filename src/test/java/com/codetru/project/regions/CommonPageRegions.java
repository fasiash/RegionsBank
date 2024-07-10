package com.codetru.project.regions;

import static com.codetru.keywords.WebUI.clickElement;
import static com.codetru.keywords.WebUI.getTextElement;
import static com.codetru.keywords.WebUI.setText;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


//import com.codetru.project.regions.pages.LoginPage;

import com.codetru.project.regions.pages.FindAdvisorPage;
import com.codetru.project.regions.pages.MakeAppointmentPage;
import com.codetru.project.regions.pages.ManageMyWealth;
import com.codetru.project.regions.pages.TestMortgage;


public class CommonPageRegions {

//	private LoginPage loginCICA;
	private FindAdvisorPage AdvisorPage;
	private MakeAppointmentPage Make_appointment;
	private ManageMyWealth manage_wealth;
	private TestMortgage Loan_Mortgage;


//	public LoginPage getLoginPage() {
//		if (loginCICA == null) {
//			loginCICA = new LoginPage();
//		}
//		return loginCICA;
//	}
	
//	public HomePage getHomePage() {
//		if (homePage == null) {
//			homePage = new HomePage();
//		}
//		return homePage;
//	}

	public  FindAdvisorPage getFindAdvisorPage() {
		if (AdvisorPage == null) {
			AdvisorPage = new FindAdvisorPage();
		}
		return AdvisorPage;
	}

	public MakeAppointmentPage getMakeAppointmentPage() {
		if (Make_appointment == null) {
			Make_appointment = new MakeAppointmentPage();
		}
		return Make_appointment;
	}

	public ManageMyWealth getManageMyWealth() {
		if (manage_wealth == null) {
			manage_wealth = new ManageMyWealth();
		}
		return manage_wealth;
	}

	public TestMortgage TestMortgagePage() {
		if (Loan_Mortgage == null) {
			Loan_Mortgage = new TestMortgage();
		}
		return Loan_Mortgage;
	}
//
//	public Step_5Page getStep_5Page() {
//		if (step_5Page == null) {
//			step_5Page = new Step_5Page();
//		}
//		return step_5Page;
//	}
//
//	public Step_6Page getStep_6Page() {
//		if (step_6Page == null) {
//			step_6Page = new Step_6Page();
//		}
//		return step_6Page;
//	}
//	
//	public Step_7Page getStep_7Page() {
//		if (step_7Page == null) {
//			step_7Page = new Step_7Page();
//		}
//		return step_7Page;
//	}
//	
//	public Step_8Page getStep_8Page() {
//		if (step_8Page == null) {
//			step_8Page = new Step_8Page();
//		}
//		return step_8Page;
//	}
//
//	public Step_9Page getStep_9Page() {
//		if (step_9Page == null) {
//			step_9Page = new Step_9Page();
//		}
//		return step_9Page;
//	}
//	
//	public Step_10Page getStep_10Page() {
//		if (step_10Page == null) {
//			step_10Page = new Step_10Page();
//		}
//		return step_10Page;
//	}
//	
////  ------------------------------------------------------------------------------------------------------------------
//
//	private By menuProducts = By.xpath("//span[normalize-space()='Products']");
//	private By menuCategory = By.xpath("//span[normalize-space()='Category']");
//	private By menuBrand = By.xpath("//span[normalize-space()='Brand']");
//	private By menuAddNewProduct = By.xpath("//span[normalize-space()='Add New Product']");
//	private By menuAllProducts = By.xpath("//span[normalize-space()='All products']");
//	private By messageNotify = By.xpath("//span[@data-notify='message']");
//	private By buttonEdit = By.xpath("(//a[@title='Edit'])[1]");
//	private By buttonSave = By.xpath("//button[normalize-space()='Save']");
//	private By inputSearch = By.xpath("//input[@id='search']");
//	public By avatarProfile = By.xpath("//span[contains(@class,'avatar avatar-sm')]");
//	public By buttonCookies = By.xpath("//button[normalize-space()='Ok. I Understood']");
//
//	public void enterDataOnSearchDataTable(String value) {
//		setText(inputSearch, value, Keys.ENTER);
//	}
//
//	public void clickEditButton() {
//		clickElement(buttonEdit);
//	}
//
//	public void clickSaveButton() {
//		clickElement(buttonSave);
//	}
//
//	public String getMessageNotify() {
//		return getTextElement(messageNotify);
//	}
//
//	public CommonPageRegions clickMenuProducts() {
//		clickElement(menuProducts);
//		return this;
	}



