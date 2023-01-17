package US_08_09_P;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class US_08_7_T extends TestBaseReports {

    @Test
    public void dailyNeeds() {
        extentTest = extentReports.createTest("Furniture Test");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest = extentReports.createTest("1- Kullanıcı URL ye gider ");
        HomePage hp = new HomePage();
        hp.GroceryTab.click();
        extentTest = extentReports.createTest("Kullanici urun kategorisi secer.");
        hp.DailyNeedsTab.click();
        extentTest = extentReports.createTest("Kullanici Furniture bolumunu tiklar.");
        System.out.println(hp.DailyNeedsTab.getText());
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("url"));

    }


}
