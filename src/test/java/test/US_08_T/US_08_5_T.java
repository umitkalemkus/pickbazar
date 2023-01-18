package test.US_08_T;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class US_08_5_T extends TestBaseReports {

    @Test
    public void Clothing() {
        extentTest = extentReports.createTest("Clothing Test");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest = extentReports.createTest("1- Kullanıcı URL ye gider ");
        HomePage hp = new HomePage();
        hp.GroceryTab.click();
        extentTest = extentReports.createTest("Kullanici urun kategorisi secer.");
        hp.ClothingTab.click();
        extentTest = extentReports.createTest("Kullanici Clothing bolumunu tiklar.");
        Assert.assertTrue(hp.ClothingTab.getText().contains("Clothing"));
        extentTest = extentReports.createTest("Kullanici Clothing sayfasina giris yapilabildigini dogrular");

    }
}
