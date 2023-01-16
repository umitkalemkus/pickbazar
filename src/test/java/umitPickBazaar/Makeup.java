package umitPickBazaar;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class Makeup {

    @Test
    public void makeup() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));

        HomePage hp = new HomePage();
        hp.GroceryTab.click();
        hp.MakeupTab.click();
        System.out.println(Driver.getDriver().getCurrentUrl());
        System.out.println(hp.MakeupTab.getText());
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("url"));

    }



}
