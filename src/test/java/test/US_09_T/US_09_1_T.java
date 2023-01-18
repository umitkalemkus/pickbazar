package test.US_09_T;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class US_09_1_T {



     @Test
     public void grocery() {

          Driver.getDriver().get(ConfigReader.getProperty("url"));
          HomePage hp = new HomePage();
          hp.GroceryTab.click();
          Actions act = new Actions(Driver.getDriver());
          act.sendKeys(Keys.ESCAPE);
          hp.MakeupTab.click();
         hp.Search.sendKeys();





     }
}
