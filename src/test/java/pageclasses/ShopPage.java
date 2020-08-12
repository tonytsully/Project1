package pageclasses;

import com.sun.xml.internal.bind.v2.TODO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopPage {
    public static WebElement element = null;

    //login elements

    public static WebElement singInSignUpButton(WebDriver driver){
        element = driver.findElement(By.xpath("//span[contains(text(), 'Sign In | Sign Up')]"));
        return element;
    }

    public static WebElement accountModal(WebDriver driver){
        element = driver.findElement(By.id("disneyid-iframe"));
        return element;

    }

    public static WebElement emailTextField(WebDriver driver){
        element = driver.findElement(By.xpath("//input[@type='email']"));
        return element;

    }

    public static WebElement passwordTextField(WebDriver driver){
        element = driver.findElement(By.xpath("//input[@type='password']"));
        return element;

    }

    public static WebElement signInButton(WebDriver driver){
        element = driver.findElement(By.xpath("//button[contains(text(), 'Sign In')]"));
        return element;

    }

    //logout elements

    public static WebElement userIcon(WebDriver driver){
        element = driver.findElement(By.cssSelector("[aria-label='User Icon']"));
        return element;
    }

    public static WebElement signOutLink(WebDriver driver){
        element = driver.findElement(By.xpath("//a[contains(text(), 'Sign Out')]"));
        return element;

    }

    public static WebElement welcomeMessage(WebDriver driver){
        element = driver.findElement(By.xpath("//button[contains(text(), 'Hi')]"));
        return element;
    }

    //Create account elements

    public static WebElement createAccountLink(WebDriver driver){
        element = driver.findElement(By.xpath("//a[contains(text(), 'Create an Account')]"));
        return element;

    }

    public static WebElement firstNameTextField(WebDriver driver){
        element = driver.findElement(By.name("firstName"));
        return element;
    }

    public static WebElement lastNameTextField(WebDriver driver){
        element = driver.findElement(By.name("lastName"));
        return element;
    }

    public static WebElement emailAddressTextField(WebDriver driver){
        element = driver.findElement(By.name("email"));
        return element;
    }

    public static WebElement createPasswordTextField(WebDriver driver){
        element = driver.findElement(By.name("newPassword"));
        return element;
    }

    public static WebElement verifyPasswordTextField(WebDriver driver){
        element = driver.findElement(By.name("verifyPassword"));
        return element;
    }

    public static WebElement dateOfBirthTextField(WebDriver driver){
        element = driver.findElement(By.name("dateOfBirth"));
        return element;
    }

    public static WebElement createAccountButton(WebDriver driver){
        element = driver.findElement(By.xpath("//button[contains(text(), 'Create Account')]"));
        return element;
    }

    public static WebElement continueButton(WebDriver driver){
        element = driver.findElement(By.xpath("//button[contains(text(), 'Continue')]"));
        return element;
    }


   //sign in actions
    public static void clickOnSignInSignUpButton(WebDriver driver){
        element = singInSignUpButton(driver);
        element.click();
       // element.click();
    }

    public static void moveToSignInWindow(WebDriver driver){
        element = accountModal(driver);
        //TODO find switch to frame
        element.submit();
    }

    public static void emailFieldEnterText(WebDriver driver, String email){
        element = emailTextField(driver);
        element.sendKeys(email);
    }

    public static void passwordFieldEnterText(WebDriver driver, String password){
        element = passwordTextField(driver);
        element.clear();
        element.sendKeys(password);
    }

    public static void clickOnSignInButton(WebDriver driver){
        element = signInButton(driver);
        element.click();
    }

    public static void clickOnCreateAccountLink(WebDriver driver){
        element = createAccountLink(driver);
        element.click();
    }

    // Create account actions

    public static void firstNameFieldEnterText(WebDriver driver, String firstName){
        element = firstNameTextField(driver);
        element.clear();
        element.sendKeys(firstName);
    }

    public static void lastNameFieldEnterText(WebDriver driver, String lastName){
        element = lastNameTextField(driver);
        element.clear();
        element.sendKeys(lastName);
    }

    public static void newEmailAddressFieldEnterText(WebDriver driver, String emailAddress){
        element = emailAddressTextField(driver);
        element.clear();
        element.sendKeys(emailAddress);
    }

    public static void createPasswordFieldEnterText(WebDriver driver, String password){
        element = passwordTextField(driver);
        element.clear();
        element.sendKeys(password);
    }

    public static void verifyPasswordFieldEnterText(WebDriver driver, String pwVerify){
        element = verifyPasswordTextField(driver);
        element.clear();
        element.sendKeys(pwVerify);
    }

    public static void dataOfBirthFieldEnterText(WebDriver driver, String dob){
        element = dateOfBirthTextField(driver);
        element.clear();
        element.sendKeys(dob);
    }

    public static void clickOnCreateAccountButton(WebDriver driver){
        element = createAccountButton(driver);
        element.click();
        if (element.isDisplayed()){
            element.isDisplayed();
        }
    }

    public static void clickOnContinueButton(WebDriver driver){
        element = continueButton(driver);
        element.click();
    }

    //sign out actions
    public static void clickOnUserIcon(WebDriver driver){
        element = userIcon(driver);
        element.click();
    }

    public static void clickOnSignOutLink(WebDriver driver){
        element = signOutLink(driver);
        element.click();
    }

    public static void clickOnSignInWelcomeMessage(WebDriver driver){
        element = welcomeMessage(driver);
        element.click();
    }

    public static void switchToFrame(WebDriver driver){
        element = accountModal(driver);
        driver.switchTo().frame(element);
    }

    public static void switchToMainPage(WebDriver driver){
        driver.switchTo().defaultContent();
    }











}
