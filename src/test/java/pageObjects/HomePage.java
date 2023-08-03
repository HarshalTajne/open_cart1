package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	
	//Constructer
public HomePage(WebDriver driver) {
	
	super(driver);//invoke parent class constructer
}

  //Elements

@FindBy(xpath="//span[text()='My Account']") WebElement lnkMyaccount;

@FindBy(xpath="Register") WebElement lnkRegister;


//Action Methods

public void clickMyAccount() {
	
	lnkMyaccount.click();
	
}

public void clickRegister() {
	
	lnkRegister.click();
}

}
