package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class Test01 extends TestBaseReports {

    WebDriver driver;

    @Test
    public void test01()  throws InterruptedException {
        // url ye gidecegiz
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest = extentReports.createTest("amazonTest");
      // WebDriverManager.chromedriver().setup();
      // driver = new ChromeDriver();
      // driver.manage().window().maximize();
      // driver.get("https://shop-pickbazar-rest.vercel.app/");

      // WebElement a = driver.findElement(By.partialLinkText("Become a Seller"));
      // a.click();




    }
}
