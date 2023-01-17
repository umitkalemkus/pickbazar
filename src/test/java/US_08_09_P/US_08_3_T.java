package US_08_09_P;

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

        System.out.println(Driver.getDriver().getCurrentUrl());
        System.out.println(hp.MakeupTab.getText());
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("url"));
        extentTest = extentReports.createTest(" Kullanici Make up bolumunu tiklar.");


    }



}
