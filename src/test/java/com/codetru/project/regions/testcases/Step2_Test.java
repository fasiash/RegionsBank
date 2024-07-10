package com.codetru.project.regions.testcases;

import org.testng.annotations.Test;

import com.codetru.common.BaseTest;
import com.codetru.constants.FrameworkConstants;
import com.codetru.helpers.ExcelHelpers;

public class Step2_Test extends BaseTest {
	
	 @Test
    public void TC_MakeAppointment() throws Exception {
        ExcelHelpers excel = new ExcelHelpers();
        getMakeAppointmentPage().Make_appointment();
    }
}
