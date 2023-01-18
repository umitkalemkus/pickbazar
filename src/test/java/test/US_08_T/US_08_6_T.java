package test.US_08_T;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class US_08_6_T extends TestBaseReports {

    @Test
    public void furniture() {
        extentTest = extentReports.createTest("Furniture Test");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest = extentReports.createTest("1- Kullanıcı URL ye gider ");
        HomePage hp = new HomePage();
        hp.GroceryTab.click();
        extentTest = extentReports.createTest("Kullanici urun kategorisi secer.");
        hp.FurnitureTab.click();
        extentTest = extentReports.createTest("Kullanici Furniture bolumunu tiklar.");
        Assert.assertTrue(hp.FurnitureTab.getText().contains("Furniture"));
        extentTest = extentReports.createTest("Kullanici Furniture sayfasina giris yapilabildigini dogrular");

    }



}
