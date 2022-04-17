package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
/*Write down the following test into ‘LoginTest’ class
 userShouldNavigateToLoginPageSuccessfully
        * click on the ‘Login’ link
        * Verify the text ‘Welcome, Please Sign
        In!’
        2. userShouldLoginSuccessfullyWithValidCredentials
        * click on the ‘Login’ link
        * Enter valid username
        * Enter valid password
        * Click on ‘LOGIN’ button
        * Verify the ‘Log out’ text is display
        3. verifyTheErrorMessage
        * click on the ‘Login’ link
        * Enter invalid username
        * Enter invalid password
        * Click on Login button
        * Verify the error message ‘Login was unsuccessful.
        Please correct the errors and try again. No customer account found’*/

public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup(){
        openBrowser(baseUrl);
    }
    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        //find log in link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        //this is from requirement
        //for pass
        String expectedMessage = "Welcome, Please Sign In!";
        //for fail
       // String expectedMessage = "Welcome Please Sign In!";
        //find the welcome text element and get the text
        WebElement actualMessageElement = driver.findElement(By.className("page-title"));
        String actualMessage = actualMessageElement.getText();
        //validating actual and expected message
        Assert.assertEquals("Not navigate to login page",expectedMessage,actualMessage);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){

       //click on the ‘Login’ link
        //find log in link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        // Enter Email address
        //to find the element give the value of id
        WebElement emailField = driver.findElement(By.id("Email"));
        //sending email to email field element
        emailField.sendKeys("prime333@gmail.com");

        //Enter Password
        //find the password field element
        WebElement passwordField = driver.findElement(By.name("Password"));
        //sending password to password field element
        passwordField.sendKeys("patel123");

       // Click on ‘LOGIN’ button
        WebElement loginButton = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));

        //sending password to password field element
        loginButton.click();

        // Verify the ‘Log out’ text is display
        String expectedMessage = "Log out";

        String actualMessage = driver.findElement(By.className("ico-logout")).getText();
        //String actualMessage = actualMessageElement.getText();
        Assert.assertEquals("Can not verify Message : ", expectedMessage, actualMessage);

    }

    @Test
    public void verifyTheErrorMessage(){
        //click on the ‘Login’ link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        //Enter invalid username
        //to find the element give the value of id
        WebElement emailField = driver.findElement(By.id("Email"));
        //sending email to email field element
        emailField.sendKeys("prime133@gmail.com");

        //Enter invalid password
        WebElement passwordField = driver.findElement(By.name("Password"));
        //sending password to password field element
        passwordField.sendKeys("patel123");

        //Click on Login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        loginButton.click();

        // Verify the error message ‘Login was unsuccessful.
        //        Please correct the errors and try again. No customer account found’
        WebElement loginerrormsg = driver.findElement(By.xpath("//button[normalize-space()='Log in']\n"));
        loginerrormsg.click();
        //check actual and excepted
        String expectedErrorMessage  = "Login was unsuccessful. Please correct the errors and try again.\n"
                +"No customer account found";
        String actualErrorMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']\n")).getText();
        Assert.assertEquals("Error message not display", expectedErrorMessage,actualErrorMessage);
    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
