package com.disney;

import static org.junit.Assert.assertTrue;

import basedriver.BaseClass;
import org.testng.annotations.Test;
import pageclasses.LandingPage;
import pageclasses.ShopPage;
import utilities.ExcelUtility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */
public class CreateAccountTest extends BaseClass {


    @Test
    public void createAccount() throws Exception {
        LandingPage.clickOnShopDropdown(driver);
        getWaitTime(BaseClass.shortWait);
        ShopPage.clickOnSignInSignUpButton(driver);
        getWaitTime(BaseClass.shortWait);
        ShopPage.switchToFrame(driver);
        ShopPage.clickOnCreateAccountLink(driver);
        getWaitTime(BaseClass.shortWait);
        ShopPage.firstNameFieldEnterText(driver, "Jimmy");
        ShopPage.lastNameFieldEnterText(driver,"Smith");
        ShopPage.newEmailAddressFieldEnterText(driver, "jzsmith@mailinator.com");
        ShopPage.createPasswordFieldEnterText(driver, "account0984");
        ShopPage.verifyPasswordFieldEnterText(driver, "account0984");
        ShopPage.dataOfBirthFieldEnterText(driver, "06/23/1989");
        getWaitTime(BaseClass.shortWait);
        ShopPage.clickOnCreateAccountButton(driver);
        getWaitTime(BaseClass.longWait);
        ShopPage.clickOnContinueButton(driver);
        getWaitTime(BaseClass.longWait);
        ShopPage.switchToMainPage(driver);
        ShopPage.clickOnSignInWelcomeMessage(driver);
        getWaitTime(BaseClass.shortWait);
        ShopPage.clickOnSignOutLink(driver);
        getWaitTime(BaseClass.shortWait);
        ExcelUtility.setCellData("jzsmith@mailinator.com", 0, 0);
        ExcelUtility.setCellData("account0984", 1, 0);




    }

}
