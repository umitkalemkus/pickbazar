package test.US_08_T;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class US_08_3_T extends TestBaseReports {

    @Test
    public void makeup() {
        extentTest = extentReports.createTest("Make Up Test");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest = extentReports.createTest(" Kullanıcı URL ye gider ");
        HomePage hp = new HomePage();
        hp.GroceryTab.click();
        extentTest = extentReports.createTest(" Kullanici urun kategorisi secer. ");
        hp.MakeupTab.click();
        extentTest = extentReports.createTest(" Kullanici Make up bolumunu tiklar.");
        Assert.assertTrue(hp.MakeupTab.getText().contains("Makeup"));
        extentTest = extentReports.createTest(" Kullanici Make up bolumunu tiklar.");


    }



}
