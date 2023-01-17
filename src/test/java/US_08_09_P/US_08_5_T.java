package US_08_09_P;

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
        System.out.println(hp.ClothingTab.getText());
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("url"));
        extentTest = extentReports.createTest("Kullanici Clothing up sayfasina giris yapilabildigini dogrular");

    }
}
