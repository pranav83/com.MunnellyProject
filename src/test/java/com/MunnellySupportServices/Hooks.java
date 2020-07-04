package com.MunnellySupportServices;


import com.MunnellySupportServices.BaseMethod.BaseMain;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseMain
{


    @Before
    public void setUp()
    {
        openBrowser("Edge");
    }
    @After
    public void tearDown()
    {
        closeBrowser();
    }
}
