package com.codetru.project.regions.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import com.codetru.keywords.WebUI;
import com.codetru.project.regions.CommonPageRegions;

public class FindAdvisorPage extends CommonPageRegions{

	 	private By WaitWealthElement = By.id("link-menu-wealth");
	    private By InvestingAndRetirement = By.xpath("//a[normalize-space()='Investing & Retirement']");
	    private By DigitalInvesting = By.xpath("(//a[text()='Digital Investing'])[2]");
	    private By SeeHowToGetStartedWithInvestPath = By.xpath("//a[contains(text(), 'See how to get started with InvestPath')]");
	    private By FindAdvisorButton = By.xpath("//a[@class='btn'][normalize-space()='Find a Financial Advisor']");
	    private By GeoLocationInput = By.xpath("//input[@id='geoLocation']");
	    private By LocatorSearchButton = By.xpath("//button[@id='input-field-input-label-button-input-locator-search']");
	    private By SecondListItem = By.xpath("//ol/li[1]");
	    private By ModalToggleLink = By.xpath("(//a[@data-toggle='modal'])[9]");
	    private By ContinueButton = By.xpath("(//a[text()='Continue'])[1]");
	    private By SomeButton = By.xpath("//button[@class='yHc72 qk5Wte']");
	    private By DirectionsDiv = By.xpath("//div[text()='Directions']");
	    private By TactileSearchboxInput = By.xpath("//input[@class='tactile-searchbox-input']");

	public void Advisor_Page() {
		
		WebUI.openWebsite("https://www.regions.com/personal-banking");
		WebUI.verifyElementVisible(WaitWealthElement);
		WebUI.clickElement(WaitWealthElement);
		WebUI.clickElement(InvestingAndRetirement);
		WebUI.clickElement(DigitalInvesting);
		WebUI.clickElement(SeeHowToGetStartedWithInvestPath);
		WebUI.clickElementsWithJs(FindAdvisorButton);
		WebUI.setText(GeoLocationInput, "46953");
		WebUI.clickElement(LocatorSearchButton);
		 WebUI.clickElement(SecondListItem);
		 WebUI.clickElement(ModalToggleLink);
		 WebUI.clickElement(ContinueButton);
		 WebUI.clickElement(SomeButton);
		 WebUI.clickElement(DirectionsDiv);
		 WebUI.setText(TactileSearchboxInput, "S Poplar St, Marion, IN 46953, USA",Keys.ENTER);
		 WebUI.sleep(3);
		 
		

	}
}



