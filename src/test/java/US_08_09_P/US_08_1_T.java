package US_08_09_P;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class US_08_1_T extends TestBaseReports {


    @Test
    public void grocery(){
        extentTest = extentReports.createTest("Grocery Test");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest = extentReports.createTest(" Kullanıcı URL ye gider ");
        HomePage hp = new HomePage();
        hp.GroceryTab.click();
        extentTest = extentReports.createTest(" Kullanici Grocery bolumunu tiklar. ");

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("url"));
        extentTest = extentReports.createTest(" Kullanici Grocery sayfasina giris yapilabildigini dogrular ");




        /*WebElement button = Driver.getDriver().findElement(By.id("headlessui-menu-button-2"));
        Select select =new Select(button);
        select.
*/}







}
