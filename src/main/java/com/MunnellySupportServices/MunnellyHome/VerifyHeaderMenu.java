package com.MunnellySupportServices.MunnellyHome;

import com.MunnellySupportServices.BaseMethod.BaseMain;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyHeaderMenu extends BaseMain {

    public VerifyHeaderMenu(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[contains(@class,'medium-2 small-12 cell logo')]//a//img")
    private WebElement munnellys_LOGO;
    @FindBy(xpath = "//ul[@id='menu-primary-menu-1']//a[contains(text(),'About')]")
    private WebElement linkAbout;
    @FindBy(xpath = "//h1[contains(text(),'Who we are')]")
    private WebElement text_Whoweare;
    @FindBy(xpath = "//ul[@id='menu-primary-menu-1']//a[contains(text(),'Services')]")
    private WebElement linkServices;
    @FindBy(xpath = "//h1[contains(text(),'Logistics Management')]")
    private WebElement text_LogisticManagement;
    @FindBy(xpath = "//ul[@id='menu-primary-menu-1']//a[contains(text(),'Projects')]")
    private WebElement linkProjects;
    @FindBy(xpath = "//h1[contains(text(),'Projects')]")
    private WebElement text_Projects;
    @FindBy(xpath = "//ul[@id='menu-primary-menu-1']//a[contains(text(),'Blog')]")
    private WebElement linkBlog;
    @FindBy(xpath = "//h1[contains(text(),'News and Articles')]")
    private WebElement text_NewsArticles;
    @FindBy(xpath = "//ul[@id='menu-primary-menu-1']//a[contains(text(),'Commitments')]")
    private WebElement linkCommitments;
    @FindBy(xpath = "//h1[contains(text(),'Our Commitments')]")
    private WebElement text_OurCommitments;
    @FindBy(xpath = "//ul[@id='menu-primary-menu-1']//a[contains(text(),'Contact')]")
    private WebElement linkContacts;
    @FindBy(xpath = "//h1[contains(text(),'Contact Munnelly Support Services')]")
    private WebElement text_ContactMunnellySupportServices;
    @FindBy(xpath = "//ul[@id='menu-primary-menu-1']//a[contains(text(),'Home')]")
    private WebElement linkHome;
    @FindBy(xpath = "//video[contains(@class,'front-video')]")
    private WebElement videoDisplayed;
    @FindBy(xpath = "//h1[contains(text(),'UK Leading Construction Site Solutions')]")
    private WebElement text_OnVideo1;
    @FindBy(xpath = "//p[contains(text(),'s leading provider of construction site logisti')]")
    private WebElement text_onVideo2;
    @FindBy(xpath = "//div[@class='scroll-down']//a//img")
    private WebElement scrollArrow;
    @FindBy(xpath = "//h2[contains(text(),'Our Services')]")
    private WebElement text_Ourservices;


    public void navigateTo(){
        driver.get("https://munnellys.com/");
        driver.manage().window().maximize();
    }
    public void verifyLOGO(){
        Assert.assertTrue(munnellys_LOGO.isDisplayed());
    }
    public void verifyHeaderLink(){
        linkAbout.click();
        Assert.assertTrue(text_Whoweare.isDisplayed());
        driver.navigate().back();
        linkServices.click();
        Assert.assertTrue(text_LogisticManagement.isDisplayed());
        driver.navigate().back();
        linkProjects.click();
        Assert.assertTrue(text_Projects.isDisplayed());
        driver.navigate().back();
        linkBlog.click();
        Assert.assertTrue(text_NewsArticles.isDisplayed());
        driver.navigate().back();
        linkCommitments.click();
        Assert.assertTrue(text_OurCommitments.isDisplayed());
        linkContacts.click();
        Assert.assertTrue(text_ContactMunnellySupportServices.isDisplayed());
        linkHome.click();
        Assert.assertTrue(videoDisplayed.isDisplayed());

    }
    public void verifyVideo(){
        linkHome.click();
        Assert.assertTrue(videoDisplayed.isDisplayed());
    }
    public void verifyTextONVideo(){
        Assert.assertTrue(text_OnVideo1.isDisplayed());
        Assert.assertTrue(text_onVideo2.isDisplayed());
    }
    public void clickScrollArrow(){
        scrollArrow.click();

    }
    public void ourServicesDisplayed(){
        Assert.assertTrue(text_Ourservices.isDisplayed());
    }


}
