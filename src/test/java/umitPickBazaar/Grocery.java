package umitPickBazaar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class Grocery {


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
