package test.US_08_T;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class US_08_8_T extends TestBaseReports {

    @Test
    public void books() {
        extentTest = extentReports.createTest("Books Test");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest = extentReports.createTest("1- Kullanıcı URL ye gider ");
        HomePage hp = new HomePage();
        hp.GroceryTab.click();
        extentTest = extentReports.createTest("Kullanici urun kategorisi secer.");
        hp.BooksTab.click();
        extentTest = extentReports.createTest("Kullanici Books bolumunu tiklar.");
        Assert.assertTrue(hp.BooksTab.getText().contains("Books"));
        extentTest = extentReports.createTest("Kullanici Books sayfasina giris yapilabildigini dogrular");

    }


}
