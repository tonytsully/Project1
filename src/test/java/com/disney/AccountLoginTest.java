package com.disney;

import basedriver.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageclasses.LandingPage;
import pageclasses.ShopPage;
import utilities.ExcelUtility;

public class AccountLoginTest extends BaseClass {

    @Test
    public void logIntoAccount() throws Exception {
        String username = ExcelUtility.getCellData(0, 0);
        String password = ExcelUtility.getCellData(1, 0);
        LandingPage.clickOnShopDropdown(driver);
        getWaitTime(BaseClass.shortWait);
        ShopPage.clickOnSignInSignUpButton(driver);
        getWaitTime(BaseClass.shortWait);
        ShopPage.switchToFrame(driver);
        ShopPage.emailFieldEnterText(driver, username);
        ShopPage.passwordFieldEnterText(driver, password);
        getWaitTime(BaseClass.shortWait);
        ShopPage.clickOnSignInButton(driver);
        getWaitTime(BaseClass.longWait);
        ShopPage.switchToMainPage(driver);
        getWaitTime(BaseClass.shortWait);
        ShopPage.clickOnSignOutLink(driver);
        getWaitTime(BaseClass.shortWait);


    }

}
