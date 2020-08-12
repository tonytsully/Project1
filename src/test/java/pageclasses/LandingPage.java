package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
    public static WebElement element = null;

    public static WebElement disneyLogo(WebDriver driver){
        element = driver.findElement(By.id("#disney-image > img"));
        return element;
    }

    public static WebElement disneyPlusDropdownLink(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"goc-bar-left\"]/li/a/u[contains(text(), 'Disney+')]"));
        return element;
    }


    public static WebElement shopDropdownLink(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"goc-bar-left\"]/li/a/u[contains(text(), 'Shop')]"));
        return element;
    }

    public static WebElement parksAndTravelDropDownLink(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"goc-bar-left\"]/li/a/u[contains(text(), 'Parks & Travel')]"));
        return element;
    }

    public static WebElement moviesDropdownLink(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"goc-bar-left\"]/li/a/u[contains(text(), 'Movies')]"));
        return element;
    }

    public static WebElement moreDropdownLink(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"goc-bar-left\"]/li/a/u[contains(text(), 'More')]"));
        return element;
    }

    public static WebElement searchTextField(WebDriver driver){
        element = driver.findElement(By.id("goc-instant-search-input"));
        return element;
    }

    public static WebElement searchButton(WebDriver   driver){
        element = driver.findElement(By.cssSelector(".bar-search-icon-img"));
        return element;
    }


    public static void clickOnLogo(WebDriver driver){
        element = disneyLogo(driver);
        element.click();
    }

    public static void clickOnDisneyPlusDropdown(WebDriver driver){
        element = disneyPlusDropdownLink(driver);
        element.click();
    }

    public static void clickOnShopDropdown(WebDriver driver){
        element = shopDropdownLink(driver);
        element.click();
    }

    public static void ClickOnParksAndTravelDropdown(WebDriver driver){
        element = parksAndTravelDropDownLink(driver);
        element.click();
    }

    public static void clickOnMoviesDropdown(WebDriver driver){
        element = moviesDropdownLink(driver);
        element.click();
    }

    public static void ClickOnMoreDropdown(WebDriver driver){
        element = moreDropdownLink(driver);
        element.click();
    }

    public static void searchFieldEnterText(WebDriver driver, String text){
        element = searchTextField(driver);
        element.clear();
        element.sendKeys(text);
    }

    public static void clickOnSearchButton(WebDriver driver){
        element = searchButton(driver);
        element.click();
    }










}
