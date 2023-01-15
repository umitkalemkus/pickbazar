package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(className = "flex pt-1 ltr:ml-auto ltr:pl-2.5 rtl:mr-auto rtl:pr-2.5")
    public WebElement GroceryTab;




}
