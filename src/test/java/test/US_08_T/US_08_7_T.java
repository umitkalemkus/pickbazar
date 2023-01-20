package test.US_08_T;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_008_009_P.US_08_09_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class US_08_7_T extends TestBaseReports {

    @Test
    public void dailyNeeds() {
        extentTest = extentReports.createTest("Daily Needs Test");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest = extentReports.createTest("1- Kullanıcı URL ye gider ");
        US_08_09_P hp = new US_08_09_P();
        hp.GroceryTab.click();
        extentTest = extentReports.createTest("Kullanici urun kategorisi secer.");
        hp.DailyNeedsTab.click();
        extentTest = extentReports.createTest("Kullanici Daily Needs bolumunu tiklar.");
        Assert.assertTrue(hp.DailyNeedsTab.getText().contains("Daily Needs"));
        extentTest = extentReports.createTest("Kullanici Daily Needs sayfasina giris yapilabildigini dogrular");

    }


}
