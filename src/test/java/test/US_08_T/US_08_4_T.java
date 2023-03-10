package test.US_08_T;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_008_009_P.US_08_09_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class US_08_4_T extends TestBaseReports {

    @Test
    public void Bags() {
        extentTest = extentReports.createTest("Bags Test");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest = extentReports.createTest("1- Kullanıcı URL ye gider ");
        extentTest.info("1- Kullanıcı URL ye gider ");
        US_08_09_P hp = new US_08_09_P();
        hp.GroceryTab.click();
        extentTest = extentReports.createTest("Kullanici urun kategorisi secer.");
        hp.BagsTab.click();
        System.out.println(hp.BagsTab.getText());
        extentTest = extentReports.createTest("Kullanici Bags bolumunu tiklar.");
        Assert.assertTrue(hp.BagsTab.getText().contains("Bags"));
        extentTest = extentReports.createTest("Kullanici Bags  sayfasina giris yapilabildigini dogrular");

    }


}
