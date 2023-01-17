package US_08_09_P;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class US_08_2_P extends TestBaseReports {

    @Test
    public void bakery() {
        extentTest = extentReports.createTest("US_08_2_P Test");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest = extentReports.createTest(" Kullanıcı URL ye gider ");
        HomePage hp = new HomePage();
        hp.GroceryTab.click();
        extentTest = extentReports.createTest(" Kullanici urun kategorisi secer. ");
        hp.BakeryTab.click();
        extentTest = extentReports.createTest(" Kullanici US_08_2_P bolumunu tiklar. ");
        System.out.println(Driver.getDriver().getCurrentUrl());
        System.out.println(hp.BakeryTab.getText());
        Assert.assertTrue(hp.BakeryTab.getText().contains("US_08_2_P"));
        extentTest = extentReports.createTest(" Kullanici US_08_2_P sayfasina giris yapilabildigini dogrular");



    }

}