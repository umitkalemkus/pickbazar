package test.US_08_T;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class US_08_2_T extends TestBaseReports {

    @Test
    public void bakery() {
        extentTest = extentReports.createTest("Bakery Test");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest = extentReports.createTest(" Kullanıcı URL ye gider ");
        HomePage hp = new HomePage();
        hp.GroceryTab.click();
        extentTest = extentReports.createTest(" Kullanici urun kategorisi secer. ");
        hp.BakeryTab.click();
        extentTest = extentReports.createTest(" Kullanici Bakery bolumunu tiklar. ");
        System.out.println(hp.BakeryTab.getText());
        Assert.assertTrue(hp.BakeryTab.getText().contains("Bakery"));
        extentTest = extentReports.createTest(" Kullanici Bakery sayfasina giris yapilabildigini dogrular");



    }

}