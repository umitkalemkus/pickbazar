package US_08_09_P;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_08_5_P {

    @Test
    public void Clothing() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));

        HomePage hp = new HomePage();
        hp.GroceryTab.click();
        hp.ClothingTab.click();
        System.out.println(hp.ClothingTab.getText());
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("url"));

    }
}
