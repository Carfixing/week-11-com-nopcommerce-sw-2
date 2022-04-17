package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/* Write down the following test into ‘TopMenuTest’ class
1. userShouldNavigateToComputerPageSuccessfully
        * click on the ‘Computers’ Tab
        * Verify the text ‘Computers’
        2. userShouldNavigateToElectronicsPageSuccessfully
        * click on the ‘Electronics’ Tab
        * Verify the text ‘Electronics’
        3. userShouldNavigateToApparelPageSuccessfully
        * click on the ‘Apparel’ Tab
        * Verify the text ‘Apparel’
        4.
        userShouldNavigateToDigitalDownloadsPageSuccessfully
        * click on the ‘Digital downloads’ Tab
        * Verify the text ‘Digital downloads’
        5. userShouldNavigateToBooksPageSuccessfully
        * click on the ‘Books’ Tab
        * Verify the text ‘Books’
        6. userShouldNavigateToJewelryPageSuccessfully
        * click on the ‘Jewelry’ Tab
        * Verify the text ‘Jewelry’
        7. userShouldNavigateToGiftCardsPageSuccessfully
        * click on the ‘Gift Cards’ Tab
        * Verify the text ‘Gift Cards’*/
public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup(){
        openBrowser(baseUrl);
    }
    @Test
    //userShouldNavigateToComputerPageSuccessfully
            public void userShouldNavigateToComputerPageSuccessfully() {
        //click on computer tab
        WebElement computertab = driver.findElement(By.linkText("Computers"));
        computertab.click();
        //verify  the text ‘Computers'
        String expectedMessage = "Computers";
        String actualMessage = driver.findElement(By.linkText("Computers")).getText();
        //Validate actual and expected message
        Assert.assertEquals("Can not verify Message : ", expectedMessage, actualMessage);
    }
        @Test
        // userShouldNavigateToElectronicsPageSuccessfully
        public void  userShouldNavigateToElectronicsPageSuccessfully(){
        //click on the ‘Electronics’ Tab
        WebElement electronicstab = driver.findElement(By.linkText("Electronics"));
         electronicstab.click();
            //verify  the text ‘Electronics'
        String expectedMessage = "Electronics";
        String actualMessage = driver.findElement(By.linkText("Electronics")).getText();
            //Validate actual and expected message
         Assert.assertEquals("Can not verify Message : ", expectedMessage, actualMessage);
        }
        @Test
        public void userShouldNavigateToApparelPageSuccessfully(){
            //click on the ‘Apparel’ Tab
            WebElement apparelTab = driver.findElement(By.linkText("Apparel"));
            apparelTab.click();
            //verify  the text ‘Apparel'
            String expectedMessage = "Apparel";
            String actualMessage = driver.findElement(By.linkText("Apparel")).getText();
            //Validate actual and expected message
            Assert.assertEquals("Can not verify Message : ", expectedMessage, actualMessage);
        }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        //click on the ‘Digital downloads’ Tab
        WebElement digitalDownloadstab = driver.findElement(By.linkText("Digital downloads"));
        digitalDownloadstab.click();
        //verify  the text ‘Digital downloads'
        String expectedMessage = "Digital downloads";
        String actualMessage = driver.findElement(By.linkText("Digital downloads")).getText();
        //Validate actual and expected message
        Assert.assertEquals("Can not verify Message : ", expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        //click on the 'Books' Tab
        WebElement booksTab = driver.findElement(By.linkText("Books"));
        booksTab.click();
        //verify  the text ‘Books'
        String expectedMessage = "Books";
        String actualMessage = driver.findElement(By.linkText("Books")).getText();
        //Validate actual and expected message
        Assert.assertEquals("Can not Verify Message : ", expectedMessage, actualMessage);
    }
    @Test
   public void userShouldNavigateToJewelryPageSuccessfully(){
       //click on the ‘Jewelry’ Tab
       WebElement jewelrytab = driver.findElement(By.linkText("Jewelry"));
        jewelrytab.click();
       //verify  the text ‘Jewelry'
       String expectedMessage = "Jewelry";
       String actualMessage = driver.findElement(By.linkText("Jewelry")).getText();
        //Validate actual and expected message
       Assert.assertEquals("Can not verify Message : ", expectedMessage, actualMessage);
   }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        // Find Gift Cards tab and click on Gift Cards tab
        WebElement giftCardsTab = driver.findElement(By.linkText("Gift Cards"));
        giftCardsTab.click();
        //verify  the text ‘ Gift Cards'
        String expectedMessage = "Gift Cards";
        String actualMessage = driver.findElement(By.linkText("Gift Cards")).getText();
        //Validate actual and expected message
        Assert.assertEquals("Can not Verify Message : ", expectedMessage, actualMessage);
    }
    @After
    public void tearDown() {
        closeBrowser();
    }
}

