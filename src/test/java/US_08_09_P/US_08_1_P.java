package US_08_09_P;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class US_08_1_P extends TestBaseReports {


    @Test
    public void grocery(){

        Driver.getDriver().get(ConfigReader.getProperty("url"));

        HomePage hp = new HomePage();
        hp.GroceryTab.click();

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("url"));




        /*WebElement button = Driver.getDriver().findElement(By.id("headlessui-menu-button-2"));
        Select select =new Select(button);
        select.
*/}







}
