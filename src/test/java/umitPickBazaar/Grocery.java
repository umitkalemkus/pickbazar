package umitPickBazaar;

import org.testng.annotations.Test;
import pages.HomePage;
import utilities.Driver;

public class Grocery {


    @Test
    public void grocery(){

        Driver.getDriver().get("https://shop-pickbazar-rest.vercel.app/");

        HomePage hp = new HomePage();
        hp.GroceryTab.click();





    }


}
