package umitPickBazaar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.Driver;

public class Grocery {


    @Test
    public void grocery(){

        Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");

        HomePage hp = new HomePage();
        hp.GroceryTab.click();

        /*WebElement button = Driver.getDriver().findElement(By.id("headlessui-menu-button-2"));
        Select select =new Select(button);
        select.
*/




    }


}
