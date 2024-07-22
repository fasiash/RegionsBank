package com.codetru.project.regions.pages;

import static com.codetru.keywords.WebUI.getAttributeElement;
import static com.codetru.keywords.WebUI.getTextElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.codetru.constants.FrameworkConstants;
import com.codetru.driver.DriverManager;
import com.codetru.helpers.PropertiesHelpers;
import com.codetru.keywords.WebUI;
import com.codetru.project.regions.CommonPageRegions;
import com.codetru.utils.DataGenerateUtils;

public class MakeAppointmentPage extends CommonPageRegions {

	WebDriverWait wait2;
		private By makeAppointmentLink = By.xpath("//a[@title='make-an-appointment']");
	    private By continueButton = By.xpath("//a[@href='https://timetrade.com/app/regions/workflows/REGPHONE/schedule/?campaignId=website&view=embed'][normalize-space()='Continue']");
	    private By personalBankingOption = By.xpath("//div[text()='Personal Banking']");
	    private By nextButton1 = By.xpath("//input[@id='nextBtn']");
	    private By newAccountPersonalOption = By.xpath("//div[@for='newaccount-personal']");
	    private By choiceButton1 = By.id("tt_form_ChoiceButton_1");
	    private By nextButton2 = By.xpath("//input[@id='nextBtn']");
	    private By nextMonthButton = By.xpath("//button[@aria-label='Next Month']");
	    private By timeSlotDropdown = By.xpath("//select[@data-dojo-attach-event='onchange:_onValNodeChange'][1]");
	    private By nextButton3 = By.xpath("//input[@id='nextBtn']");
	    private By firstNameInput = By.xpath("//input[@id='attendee_person_firstName']");
	    private By lastNameInput = By.xpath("//input[@id='attendee_person_lastName']");
	    private By emailInput = By.xpath("//input[@id='attendee_email']");
	    private By phoneNumberInput = By.xpath("//input[@id='attendee_phone_phoneNumber']");
	    private By inPersonDropdown = By.xpath("//select[@id='questionId__inpersonphone']");
	    private By nextButton4 = By.xpath("//input[@id='nextBtn']");
	    
	public void Make_appointment() throws Exception {
		
		WebUI.openNewTab();
		WebUI.openWebsite("https://www.regions.com/personal-banking");
		wait2 = new WebDriverWait(DriverManager.getDriver(), Duration. ofSeconds (60));
		WebUI.clickElement(makeAppointmentLink);

		WebUI.clickElement(continueButton);

		WebUI.clickElement(personalBankingOption);
		WebUI.clickElement(nextButton1);

		WebUI.clickElement(newAccountPersonalOption);
		WebUI.clickElement(nextButton1);
		WebUI.sleep(4);
		WebUI.clickElement(choiceButton1);
		WebUI.clickElement(nextButton1);
		WebUI.sleep(10); 
		WebUI.clickElement(nextMonthButton);
		WebUI.sleep(05);      
		WebUI.selectOptionByText(timeSlotDropdown, "8:30 PM");
		WebUI.clickElement(nextButton1);
		WebUI.sleep(2);
		WebUI.clickElement(nextButton1);
		WebUI.setText(firstNameInput, "John");

		WebUI.setText(lastNameInput, " Lincon");

		WebUI.setText(emailInput, "nancy");
		WebUI.sleep(2);
		WebUI.clearAndFillText(emailInput, "Johcon12@hotmail.com");

		WebUI.setText(phoneNumberInput, "martin");
		WebUI.clearAndFillText(phoneNumberInput, "8784517412");

		WebUI.selectOptionByText(inPersonDropdown, "In-Person");
		WebUI.clickElement(nextButton1);
		WebUI.sleep(2);
//       WebUI.clickElement(nextButton1);
	}

}
