package com.codetru.project.regions.pages;

import static com.codetru.keywords.WebUI.getAttributeElement;
import static com.codetru.keywords.WebUI.getTextElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.codetru.helpers.PropertiesHelpers;
import com.codetru.keywords.WebUI;
import com.codetru.project.regions.CommonPageRegions;
import com.codetru.utils.DataGenerateUtils;


public class TestMortgage extends CommonPageRegions {

	private By linkMenuPersonal = By.xpath("//a[@id='link-menu-personal']");
    private By subNavLinkMortgage = By.xpath("//a[@class='sub-nav-link'][normalize-space()='Mortgage']");
    private By navMortgage = By.xpath("//nav[@class='dynamic-menu menu-center']//a[normalize-space()='Mortgage']");
    private By applyNowMortgage = By.xpath("//p[normalize-space()='Apply Now for a Mortgage']");
    private By getStartedButton = By.xpath("//a[normalize-space()='Get Started!']");
    private By acknowledgeButton = By.xpath("//button[normalize-space()='Acknowledge']");
    private By newCustomerButton = By.xpath("//p[normalize-space()='New Customer']");
    private By firstNameInput = By.xpath("//input[@id='first-name']");
    private By lastNameInput = By.xpath("//input[@id='last-name']");
    private By nextButton = By.xpath("//button[normalize-space()='Next']");
    private By phoneNumberInput = By.xpath("//input[@id='number']");
    private By numberTypeSelect = By.xpath("//select[@id='type']");
    private By emailInput = By.xpath("//input[@id='email']");
    private By dobInput = By.xpath("//input[@id='dob']");
    private By ssnInput = By.xpath("//input[@id='ssn']");
    private By preferredLanguageSelect = By.xpath("//select[@id='option']");
    private By streetAddressInput = By.xpath("//input[@id='street']");
    private By cityInput = By.xpath("//input[@id='city']");
    private By stateSelect = By.xpath("//select[@id='state']");
    private By zipCodeInput = By.xpath("//input[@id='zip']");
    private By startDateInput = By.xpath("//input[@id='start-date']");
    private By maritalStatusUnmarried = By.xpath("//label[@for='unmarried']");
    private By mortgageLoanOfficerNo = By.xpath("//label[@for='no']");
    private By confirmContinueButton = By.xpath("//button[normalize-space()='Confirm & Continue']");
    private By buyOption = By.xpath("//label[@class='radio' and @for='buy']");
    private By signedSalesNo = By.xpath("//label[@class='radio' and @for='no']");
    private By costInput = By.xpath("//input[@id='cost' and @name='cost']");
    private By downPaymentInput = By.xpath("//input[@id='downPaymentAmount']");
    private By isThisCorrectButton_yes = By.xpath("(//button[text()='Yes'])[1]");
    private By primaryResidenceYes = By.xpath("//label[@class='radio' and @for='yes']");
    private By notEmployedOption = By.xpath("//span[normalize-space()='I am not currently employed.']");
    private By noEmploymentHistory = By.xpath("//label[normalize-space()='I have no employment history.']");
    private By noOtherIncome = By.xpath("//label[normalize-space()='I have no other income.']");
    private By noBankAccounts = By.xpath("//label[normalize-space()='I do not have any bank accounts.']");
    private By outstandingJudgmentsNo = By.xpath("//label[@for='no']");
    private By bankruptNo = By.xpath("//label[@for='no']");
    private By foreclosedPropertyNo = By.xpath("//label[@for='no']");
    private By lawsuitNo = By.xpath("//label[@for='no']");
    private By loanForeclosureNo = By.xpath("//label[@for='no']");
    private By delinquentLoanNo = By.xpath("//label[@for='no']");
    private By alimonyNo = By.xpath("//label[@for='no']");
    private By borrowedDownPaymentNo = By.xpath("//label[@for='no']");
    private By coMakerNo = By.xpath("//label[@for='no']");
    private By usCitizenYes = By.xpath("//label[@for='yes']");
    private By ownershipInterestNo = By.xpath("//label[@for='no']");
    private By Acknowledgment = By.xpath("//button[.='Acknowledge']");
    private By ethnicityMexican = By.xpath("//label[normalize-space()='Mexican']");
    private By raceAmericanIndian = By.xpath("//label[@for='americanIndian-selected']");
    private By tribeInput = By.xpath("//input[@id='americanIndian-tribe']");
    private By genderMale = By.xpath("//label[normalize-space()='Male']");
    private By coBorrowerNo = By.xpath("//label[normalize-space()='No, I am applying individually']");
    private By submitButton = By.xpath("//button[@type='submit']");


	public void Loan_Mortgage() throws Exception {


		WebUI.openWebsite("https://www.regions.com/personal-banking");		
		WebUI.clickElement(linkMenuPersonal);
		WebUI.sleep(1);
		WebUI.clickElement(subNavLinkMortgage);
		WebUI.sleep(2);
		WebUI.clickElement(navMortgage);
		WebUI.sleep(1);
		WebUI.clickElementsWithJs(applyNowMortgage);
		WebUI.sleep(2);
		DriverManager.getdriver().navigate().refresh();
		WebUI.sleep(2);
		WebUI.clickElement(getStartedButton);
		WebUI.sleep(.5);
		WebUI.clickElement(acknowledgeButton);
		WebUI.sleep(.5);
		WebUI.clickElement(newCustomerButton);
		WebUI.sleep(.5);
		WebUI.clickElement(nextButton);
		WebUI.setText(firstNameInput, "12345");
		WebUI.sleep(.5);
		WebUI.clearAndFillText(firstNameInput, "Steve");
		WebUI.sleep(.5);
		WebUI.setText(lastNameInput, "987451");
		WebUI.clearAndFillText(lastNameInput, "Roger");
		WebUI.sleep(.5);
		WebUI.clickElement(nextButton);
		WebUI.sleep(.5);
		WebUI.clickElement(nextButton);
		WebUI.sleep(.5);
		WebUI.setText(phoneNumberInput, "9638527410");
		WebUI.sleep(1);
		WebUI.clickElement(nextButton);
		WebUI.sleep(.5);
		WebUI.selectOptionByText(numberTypeSelect, "Mobile");
		WebUI.clickElement(nextButton);
		WebUI.sleep(.5);
		WebUI.clickElement(nextButton);
		WebUI.sleep(.5);
		WebUI.setText(emailInput, "1111");
		WebUI.sleep(.5);
		WebUI.clearAndFillText(emailInput, "peter_123@gmail.com");
		WebUI.sleep(.5);
		WebUI.clickElement(nextButton);
		WebUI.sleep(.5);
		WebUI.clickElement(nextButton);
		WebUI.sleep(.5);
		WebUI.setText(dobInput, "12/12/1999");
		WebUI.clickElement(nextButton);
		WebUI.sleep(1);
		WebUI.clickElement(nextButton);
		WebUI.sleep(1);
		WebUI.setText(ssnInput, "7410852963");
		WebUI.sleep(.5);
		WebUI.clickElement(nextButton);
		WebUI.sleep(1);
		WebUI.selectOptionByText(preferredLanguageSelect, "English");
		WebUI.sleep(1);
		WebUI.clickElement(nextButton);
		WebUI.sleep(1);
		WebUI.scrollToElementAtBottom(nextButton);
		WebUI.sleep(1);
		WebUI.scrollToElementAtTop(streetAddressInput);
		WebUI.setText(streetAddressInput, "108 East 29th Street");
		WebUI.sleep(1);
		WebUI.setText(cityInput, "Manhattan");
		WebUI.sleep(1);
		WebUI.selectOptionByText(stateSelect, "New York");
		WebUI.sleep(1);
		WebUI.setText(zipCodeInput, "10016");
		WebUI.sleep(1);

		WebUI.clickElement(nextButton);
		WebUI.sleep(1);
		WebUI.setText(startDateInput, "12/2020");
		WebUI.sleep(1);
		WebUI.clickElement(nextButton);
		WebUI.sleep(1);
		WebUI.clickElement(maritalStatusUnmarried);
		WebUI.sleep(1);
		WebUI.clickElement(nextButton);
		WebUI.sleep(1);
		WebUI.clickElement(mortgageLoanOfficerNo);
		WebUI.sleep(1);
		WebUI.clickElement(nextButton);
		WebUI.sleep(1);
		WebUI.scrollToElementAtBottom(confirmContinueButton);
		WebUI.clickElement(confirmContinueButton);
		WebUI.sleep(2);
		WebUI.clickElement(buyOption);
		WebUI.sleep(1);
		WebUI.clickElement(nextButton);
		WebUI.sleep(1);
		WebUI.clickElement(signedSalesNo);
		WebUI.sleep(1);
		WebUI.clickElement(nextButton);
		WebUI.sleep(1);
		WebUI.clickElement(nextButton);
		WebUI.sleep(1);
		WebUI.setText(costInput, "200000");
		WebUI.clickElement(nextButton);
		WebUI.sleep(1);
		WebUI.setText(downPaymentInput, "40000");
		WebUI.sleep(1);
		WebUI.clickElement(nextButton);
		WebUI.sleep(1);
		WebUI.clickElement(isThisCorrectButton_yes);
		WebUI.sleep(1);
		WebUI.clickElement(primaryResidenceYes);
		WebUI.sleep(1);
		WebUI.clickElement(nextButton);
		WebUI.sleep(1);
		WebUI.scrollToElementAtBottom(confirmContinueButton);
		WebUI.clickElement(confirmContinueButton);
		WebUI.sleep(4);
		WebUI.clickElement(notEmployedOption);
		WebUI.sleep(1);
		WebUI.clickElement(confirmContinueButton);
		WebUI.sleep(1);
		WebUI.clickElement(noEmploymentHistory);
		WebUI.sleep(1);
		WebUI.clickElement(confirmContinueButton);
		WebUI.sleep(1);
		WebUI.clickElement(noOtherIncome);
		WebUI.sleep(1);
		WebUI.clickElement(confirmContinueButton);
		WebUI.sleep(3);
		WebUI.clickElement(noBankAccounts);
		WebUI.sleep(1);
		WebUI.clickElement(confirmContinueButton);
		WebUI.sleep(1);
		WebUI.clickElement(nextButton);
		WebUI.sleep(1);
		WebUI.clickElement(outstandingJudgmentsNo);
		WebUI.sleep(1);
		WebUI.clickElement(nextButton);
		WebUI.sleep(1);
		WebUI.clickElement(bankruptNo);
		WebUI.sleep(1);
		WebUI.clickElement(nextButton);
		WebUI.sleep(1);
		WebUI.clickElement(foreclosedPropertyNo);
		WebUI.sleep(1);
		WebUI.clickElement(nextButton);
		WebUI.sleep(1);
		WebUI.clickElement(lawsuitNo);
		WebUI.sleep(1);
		WebUI.clickElement(nextButton);
		WebUI.sleep(1);
		WebUI.clickElement(loanForeclosureNo);
		WebUI.sleep(1);
		WebUI.clickElement(nextButton);
		WebUI.sleep(1);
		WebUI.clickElement(delinquentLoanNo);
		WebUI.sleep(1);
		WebUI.clickElement(nextButton);
		WebUI.sleep(1);
		WebUI.clickElement(alimonyNo);
		WebUI.sleep(1);
		WebUI.clickElement(nextButton);
		WebUI.sleep(1);
		WebUI.clickElement(borrowedDownPaymentNo);
		WebUI.sleep(1);
		WebUI.clickElement(nextButton);
		WebUI.sleep(1);
		WebUI.clickElement(coMakerNo);
		WebUI.sleep(1);
		WebUI.clickElement(nextButton);
		WebUI.sleep(1);
		WebUI.clickElement(usCitizenYes);
		WebUI.sleep(1);
		WebUI.clickElement(nextButton);
		WebUI.sleep(1);
		WebUI.clickElement(ownershipInterestNo);
		WebUI.sleep(1);
		WebUI.clickElement(nextButton);
		WebUI.sleep(1);
		WebUI.scrollToElementAtBottom(acknowledgeButton);
		WebUI.sleep(1);
		WebUI.clickElement(acknowledgeButton);
		WebUI.sleep(1);
		WebUI.clickElement(ethnicityMexican);
		WebUI.sleep(1);
		WebUI.clickElement(nextButton);
		WebUI.sleep(1);
		WebUI.clickElement(raceAmericanIndian);
		WebUI.sleep(1);
		WebUI.scrollToElementAtBottom(nextButton);
		WebUI.sleep(1);
		WebUI.setText(tribeInput,"North America");
		WebUI.sleep(1);
		WebUI.scrollToElementAtBottom(nextButton);
		WebUI.clickElement(nextButton);
		WebUI.sleep(1);
		WebUI.clickElement(genderMale);
		WebUI.sleep(1);
		WebUI.clickElement(nextButton);
		WebUI.sleep(1);
		WebUI.scrollToElementAtBottom(confirmContinueButton);
		WebUI.clickElement(confirmContinueButton);
		WebUI.clickElement(coBorrowerNo);
		WebUI.sleep(1);
		WebUI.clickElement(confirmContinueButton);
		WebUI.clickElement(confirmContinueButton);
		}


}
