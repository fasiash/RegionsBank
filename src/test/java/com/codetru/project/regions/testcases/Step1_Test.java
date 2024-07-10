package com.codetru.project.regions.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.codetru.common.BaseTest;
import com.codetru.constants.FrameworkConstants;
import com.codetru.helpers.ExcelHelpers;
import com.codetru.project.regions.pages.FindAdvisorPage;

public class Step1_Test extends BaseTest {
	
	 @Test


    public void TC_FindAdvisor() throws Exception {
        ExcelHelpers excel = new ExcelHelpers();

        getFindAdvisorPage().Advisor_Page();
    }
}
