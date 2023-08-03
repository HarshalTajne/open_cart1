package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{


    public AccountRegistrationPage(WebDriver driver)
    {
    	
    	super(driver);
    
    }


    //Elements
    
    @FindBy(xpath="//input[@id='input-firstname']") WebElement txtFirstname;

    @FindBy(xpath="//input[@name='lastname']")WebElement txtLastname;
    
    @FindBy(xpath="//input[@id='input-email']")WebElement txtEmail;

    @FindBy(xpath="//input[@name='telephone']")WebElement txtTelephone;

    @FindBy(xpath="//input[@id='input-password']")WebElement txtPassword;

    @FindBy(xpath="//input[@name='confirm']")WebElement txtconfirmPassword;

    @FindBy(xpath="//input[@name='agree']")WebElement chkPolicy;
  
    @FindBy(xpath="//input[@value='Continue']")WebElement btnContinue;

    @FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")WebElement msgConfirmation;


   
    
    //Action method
   
    public void setFirstName(String fname) {
    	txtFirstname.sendKeys(fname);
    }

    public void setLastName(String lname){
    	txtLastname.sendKeys(lname);
    	
    }
    
    public void setEmail(String email) {
    	txtEmail.sendKeys(email);
    }
    
    public void setTelephone(String tel) {
    	txtTelephone.sendKeys(tel);
    }

    public void setPassword(String pwd) {
    	txtPassword.sendKeys(pwd);
    }
    
    public void setConfirmPassword(String pwd) {
    	txtconfirmPassword.sendKeys();
    }

    public void setPrivacyPolicy() {
    	chkPolicy.click();
    }
    
    public void clickContinue() {
    	
    	btnContinue.click();
    }
    
    public String getConfirmationMsg() {
    	
    	try {
    		return(msgConfirmation.getText());
    	} catch(Exception e) {
    	  
    	  return(e.getMessage());
    }


    }

}
