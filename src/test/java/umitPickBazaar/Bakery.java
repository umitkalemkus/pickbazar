package umitPickBazaar;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class Bakery {

    @Test
    public void bakery() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));

        HomePage hp = new HomePage();
        hp.GroceryTab.click();
        hp.BakeryTab.click();
        System.out.println(hp.BakeryTab.getText());
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("url"));

    }

}