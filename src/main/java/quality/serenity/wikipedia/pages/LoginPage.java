package quality.serenity.wikipedia.pages;

import org.openqa.selenium.WebElement;

import static org.junit.Assert.*;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class LoginPage extends PageObject{
	@FindBy(xpath = ".//*[@id='wpName1']")
	WebElement inpUser;	
	@FindBy(xpath = ".//*[@id='wpPassword1']")
	WebElement inpPass;
	@FindBy(xpath = ".//*[@id='wpLoginAttempt']")
	WebElement btnAcceder;
	@FindBy(xpath = ".//*[@id='pt-userpage']/a")
	WebElement linkUser;
	
	public void putUser(String sUser){
		inpUser.sendKeys(sUser);
	}
	
	public void putPass(String sPass){
		inpPass.sendKeys(sPass);
	}
	
	public void clickAcceder(){
		btnAcceder.click();
	}
	
	public void verifyLogin(String sUser){
		assertEquals(sUser.toUpperCase(),linkUser.getText().toUpperCase());
	}
	
}
