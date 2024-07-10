/*
 * Copyright (c) 2022.
 * Automation Framework Selenium - Anh Tester
 */

package com.codetru.mail;

import static com.codetru.constants.FrameworkConstants.REPORT_TITLE;

/**
 * Data for Sending email after execution
 */
public class EmailConfig {

    //Remember to create an app password (App Password) for Gmail before sending
    //If you use Hosting's email, it's normal
    //Enable Override Report and Send mail in config file => src/test/resources/config/config.properties
    //OVERRIDE_REPORTS=yes
    //send_email_to_users=yes

    public static final String SERVER = "smtp.gmail.com";
    public static final String PORT = "587";

    public static final String FROM = "codetruteamlead@gmail.com";
    public static final String PASSWORD = "siye reij yhec cgwo";

    public static final String[] TO = {"codetrutest@gmail.com"};
    public static final String SUBJECT = REPORT_TITLE;
}