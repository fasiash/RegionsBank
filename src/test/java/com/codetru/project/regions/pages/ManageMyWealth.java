package com.codetru.project.regions.pages;

import static com.codetru.keywords.WebUI.getAttributeElement;
import static com.codetru.keywords.WebUI.getTextElement;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.codetru.helpers.PropertiesHelpers;
import com.codetru.keywords.WebUI;
import com.codetru.project.regions.CommonPageRegions;

public class ManageMyWealth extends CommonPageRegions {
	
private By personalMenuLink = By.xpath("//a[@id='link-menu-personal']");
private By investmentsLink = By.xpath("//a[normalize-space()='Investments']");
private By managingMyWealthLink = By.xpath("//nav[@class='dynamic-menu menu-center']//a[normalize-space()='Managing My Wealth']");
private By helpUsUnderstandLink = By.xpath("//a[normalize-space()='Help us understand your needs']");
private By getStartedButton = By.xpath("//button[normalize-space()='Get started']");
private By workingWithProfessionalOption = By.xpath("//div[5]//label[1]");
private By nextButton1 = By.xpath("//button[normalize-space()='Next']");
private By personalCPAOption = By.xpath("//span[normalize-space()='Personal CPA']");
private By familyMemberOption = By.xpath("//span[normalize-space()='Family member / close friend']");
private By bankerOption = By.xpath("//span[normalize-space()='Banker']");
private By neverReviewOption = By.xpath("//span[normalize-space()='Never']");
private By investableAssetsOption = By.xpath("//span[normalize-space()='$250,000 to $499,000']");
private By financialLifeStageOption = By.xpath("//span[normalize-space()='Growing personal wealth']");
private By noInvestingOption = By.xpath("//span[normalize-space()='No, I am just getting started']");
private By createPlanOption = By.xpath("//span[normalize-space()='Create my plan for the first time']");
private By incomeSolutionsOption = By.xpath("//span[normalize-space()='Income Solutions']");
private By investmentPerformanceOption = By.xpath("//span[normalize-space()='My investment performance']");
private By estatePlanOption = By.xpath("//span[normalize-space()='My estate/business succession plan']");
private By lifeInsuranceOption = By.xpath("//span[normalize-space()='My life insurance and / or annuity contracts']");
private By futureIncomeStrategyOption = By.xpath("//span[normalize-space()='My future income strategy']");
private By zipCodeInput = By.xpath("//input[@type='text']");
private By firstNameInput = By.xpath("//input[@id='contactMeForm.firstName']");
private By lastNameInput = By.xpath("//input[@id='contactMeForm.lastName']");
private By emailInput = By.xpath("//input[@id='contactMeForm.email']");
private By phoneInput = By.xpath("//input[@id='contactMeForm.phone']");
private By submitButton = By.xpath("//form[@class='contactMe__form neuroForm']//button[@type='submit'][normalize-space()='Submit']");


	public void manage_wealth() throws Exception {
		
		WebUI.openWebsite("https://www.regions.com/personal-banking");
		WebUI.clickElement(personalMenuLink);
		WebUI.clickElement(investmentsLink);
		WebUI.clickElement(managingMyWealthLink);
		WebUI.clickElement(helpUsUnderstandLink);
		WebUI.clickElement(getStartedButton);
        // Are you already working with a Wealth Management Professional?
		WebUI.clickElement(workingWithProfessionalOption);
		WebUI.sleep(1);
        // Next
		WebUI.clickElementWithJs(nextButton1);
		WebUI.sleep(2);
        // Which Advisors do you rely on today?
		WebUI.clickElement(personalCPAOption);
		WebUI.sleep(0.5);
		WebUI.clickElement(familyMemberOption);
		WebUI.sleep(0.5);
		WebUI.clickElement(bankerOption);
		WebUI.sleep(0.5);
       // Next
		WebUI.clickElement(nextButton1);
		WebUI.sleep(0.5);
		 // When was your last review of your financial strategy
		WebUI.clickElement(neverReviewOption);
		WebUI.sleep(0.5);
        // Next
		WebUI.clickElement(nextButton1);
		WebUI.sleep(2);
        // Which of these describes your investable assets?
		WebUI.clickElement(investableAssetsOption);
		WebUI.sleep(0.5);
//        // Next
		WebUI.clickElement(nextButton1);
		WebUI.sleep(2);
//        
		WebUI.clickElement(financialLifeStageOption);
		WebUI.sleep(0.5);
//        
        // Next
		WebUI.clickElement(nextButton1);
		WebUI.sleep(2);
//        
//        // Do you currently invest today?
		WebUI.clickElement(noInvestingOption);
//        Thread.sleep(500);
		WebUI.sleep(0.5);
//        
//        // Next
		WebUI.clickElement(nextButton1);
		WebUI.sleep(1.5);      
//        // Where could you use help managing your financial assets?
//        // Planning
		WebUI.clickElement(createPlanOption);
		WebUI.sleep(0.5);
//        
		WebUI.clickElement(incomeSolutionsOption);
		WebUI.sleep(0.5);
//        
//        // Understanding
		WebUI.clickElement(investmentPerformanceOption);
		WebUI.sleep(0.5);
//        
//        // Updating
		WebUI.clickElement(estatePlanOption);
		WebUI.sleep(0.5);
//        
		WebUI.clickElement(lifeInsuranceOption);
		// Analyzing & Forecasting
		WebUI.clickElement(futureIncomeStrategyOption);
//        
        // Next
		WebUI.clickElement(nextButton1);
//        
        // Zip Code
		WebUI.setText(zipCodeInput,"10036");//        
//        // Next
		WebUI.sleep(2);
		WebUI.clickElement(nextButton1);
		WebUI.sleep(2);
		WebUI.clickElement(submitButton);
//        
//        // First Name
//        wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameInput)).sendKeys("Tim");
		WebUI.setText(firstNameInput,"Tim");
		WebUI.sleep(0.5);
//        Thread.sleep(500);
//        
//        wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameInput)).sendKeys("David");
		WebUI.setText(lastNameInput,"David");
		WebUI.sleep(0.5);
//        Thread.sleep(500);
//        
//        wait.until(ExpectedConditions.visibilityOfElementLocated(emailInput)).sendKeys("qwertyu@gmail.com");
		WebUI.setText(emailInput,"asas");
		WebUI.sleep(0.5);
		WebUI.clearAndFillText(emailInput,"12345");
		WebUI.sleep(0.5);
		WebUI.clearAndFillText(emailInput,"asas@asas.com");
		WebUI.sleep(0.5);
		WebUI.clearAndFillText(phoneInput,"asas");
		WebUI.sleep(0.5);
		WebUI.clearAndFillText(phoneInput,"1265874841");
		WebUI.sleep(0.5);
//		WebUI.clickElement(submitButton);
        
//        driver.findElement(submitButton).click();
	}

}
