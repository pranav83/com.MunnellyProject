package com.MunnellySupportServices;

import com.MunnellySupportServices.BaseMethod.BaseMain;
import com.MunnellySupportServices.MunnellyHome.VerifyHeaderMenu;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Header_StepDefs extends BaseMain {
    VerifyHeaderMenu vhm = new VerifyHeaderMenu();

    @Given("^I open Munnellys homepage$")
    public void i_open_Munnellys_homepage() throws Throwable {

        vhm.navigateTo();
    }

    @Given("^I should verify logo present on page$")
    public void i_should_verify_logo_present_on_page() throws Throwable {
    vhm.verifyLOGO();
    }

    @When("^I click on the all links in Header Menu$")
    public void i_click_on_the_all_links_in_Header_Menu() throws Throwable {
        vhm.verifyHeaderLink();
    }

    @Then("^I should Navigate to relevant page$")
    public void i_should_Navigate_to_relevant_page() throws Throwable {

    }

    @Then("^I should verify video on homepage;$")
    public void i_should_verify_video_on_homepage() throws Throwable {
       vhm.verifyVideo();
    }

    @And("^I should verify text on video$")
    public void iShouldVerifyTextOnVideo() {
        vhm.verifyTextONVideo();
    }


    @When("^I click on scroll arrow$")
    public void iClickOnScrollArrow() {
        vhm.clickScrollArrow();
    }

    @Then("^page should scroll to our services$")
    public void pageShouldScrollToOurServices() {
        vhm.ourServicesDisplayed();
    }
}
