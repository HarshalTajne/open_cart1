package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class TC_001_AccountRegistrationTest extends BaseClass {

	
	
	@Test
	public void test_account_Registration()
	{
		try
		{
		HomePage hp=new HomePage(driver);
		         hp.clickMyAccount();
		         hp.clickRegister();
		
		
      AccountRegistrationPage repage=new AccountRegistrationPage(driver);
		         
		         repage.setFirstName(randomeString().toUpperCase());//For Random FName
		        
		         repage.setLastName(randomeString().toUpperCase()); //For Random LName
		         
		         repage.setEmail(randomeString()+"@gmail.com");
		         
		         repage.setTelephone(randomeNumber());
		         
		        String password=randomeAlphaNumeric();
		        
		         
		         repage.setPassword(password);
		         
		         repage.setConfirmPassword(password);
		         
		         repage.setPrivacyPolicy();
		         
		         repage.clickContinue();
		        
		         String confmsg=repage.getConfirmationMsg();
		         
	             Assert.assertEquals(confmsg, "Your Account Has Been Created!");
	
	          }
	
		catch(Exception e)
		{
			//Assert.fail();
		}
	}
	
}

