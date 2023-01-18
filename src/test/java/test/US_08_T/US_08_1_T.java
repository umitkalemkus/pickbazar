package test.US_08_T;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class US_08_1_T extends TestBaseReports {

    @Test
    public void grocery() {
        extentTest = extentReports.createTest("Grocery Test");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest = extentReports.createTest(" Kullanıcı URL ye gider ");
        HomePage hp = new HomePage();
        hp.GroceryTab.click();
        extentTest = extentReports.createTest(" Kullanici Grocery bolumunu tiklar. ");
        Assert.assertTrue(hp.GroceryTab.getText().contains("Grocery"));
        extentTest = extentReports.createTest(" Kullanici Grocery sayfasina giris yapilabildigini dogrular");



    }




}
