package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*Write down the following test into ‘RegisterTest’ class
1. userShouldNavigateToRegisterPageSuccessfully
* click on the ‘Register’ link
* Verify the text ‘Register’
2. userSholdRegisterAccountSuccessfully
* click on the ‘Register’ link
* Select gender radio button
* Enter First name
* Enter Last name
* Select Day Month and Year
* Enter Email address
* Enter Password
* Enter Confirm password
* Click on REGISTER button
* Verify the text 'Your registration completed*/
public class RegisterTest extends BaseTest {
      String baseUrl = "https://demo.nopcommerce.com/";
      //for open the browser
      @Before
      public void setup(){
          openBrowser(baseUrl);
      }
      @Test
      //click on the ‘Register’ link
      public void userShouldNavigateToRegisterPageSuccessfully(){
          WebElement registerLink = driver.findElement(By.linkText("Register"));
          registerLink.click();

          //Verify the text ‘Register’
          String expectedMessage = "Register";
          //find the register text element and get the text
          WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Register')]"));
          String actualMessage = actualMessageElement.getText();
          //validating actual and expected message
          Assert.assertEquals("Not navigate to login page",expectedMessage,actualMessage);
      }
//    @After
//    public void tearDown(){
//        closeBrowser();
  //  }
    @Test
    //userSholdRegisterAccountSuccessfully
      public void userSholdRegisterAccountSuccessfully(){
          //click on the ‘Register’ link
       WebElement registerLink = driver.findElement(By.linkText("Register"));
       registerLink.click();

       //Select gender radio button
        WebElement genderButton = driver.findElement(By.cssSelector("input#gender-female"));
        genderButton.click();

       //Enter First name
        //to find the element give the value of id
        WebElement firstName = driver.findElement(By.id("FirstName"));
        //sending firstname  to firstname field element
        firstName.sendKeys("Palak");

        // Enter Last name
        //to find the element give the value of name
        WebElement lastName = driver.findElement(By.name("LastName"));
        //sending lastName  to lastname field element
        lastName.sendKeys("Patel");

        //Select Day Month and Year
        //for day
        WebElement day = driver.findElement(By.name("DateOfBirthDay"));
        //sending day  to dayfield element
       day.sendKeys("16");

        //for Month
        WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
        //sending Month to monthfield element
        month.sendKeys("december");

        //for year
        WebElement year = driver.findElement(By.name("DateOfBirthYear"));
        //sending year  to yearfield element
        year.sendKeys("1992");

        // Enter Email address
        //to find the element give the value of id
        WebElement emailField = driver.findElement(By.id("Email"));
        //sending email to email field element
        emailField.sendKeys("prime565@gmail.com");

        //Enter Password
        //find the password field element
        WebElement passwordField = driver.findElement(By.name("Password"));
        //sending password to password field element
        passwordField.sendKeys("patel123");

        //Enter confirm Password
        //find the password field element
        WebElement confirmpasswordField = driver.findElement(By.name("ConfirmPassword"));
        //sending password to password field element
        confirmpasswordField.sendKeys("patel123");

        //Click on REGISTER button
        WebElement registerButton = driver.findElement(By.name("register-button"));
        registerButton.click();

        //Verify the text 'Your registration completed
        String expectedMessage = "Your registration completed";

        //String actualMessage = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]")).getText();
        String actualMessage = driver.findElement(By.xpath("//div[@class='result']")).getText();
        //String actualMessage = actualMessageElement.getText();
        Assert.assertEquals("Can not verify Message : ", expectedMessage, actualMessage);

    }
    @After
    public void tearDown() {
        closeBrowser();
    }
}
