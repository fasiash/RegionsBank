package com.codetru.project.regions.testcases;

import org.testng.annotations.Test;

import com.codetru.common.BaseTest;
import com.codetru.constants.FrameworkConstants;
import com.codetru.helpers.ExcelHelpers;

public class Step3_Test extends BaseTest {
	
	 @Test
    public void TC_ManagemyWealth() throws Exception {
        ExcelHelpers excel = new ExcelHelpers();
        excel.setExcelFile(FrameworkConstants.EXCEL_CMS_LOGIN, "Login");
        getManageMyWealth().manage_wealth();
        
    }
}
