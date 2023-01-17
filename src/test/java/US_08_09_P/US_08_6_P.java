package US_08_09_P;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_08_6_P {

    @Test
    public void furniture() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        HomePage hp = new HomePage();
        hp.GroceryTab.click();
        hp.FurnitureTab.click();
        System.out.println(hp.FurnitureTab.getText());
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("url"));

    }



}
