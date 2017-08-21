package quality.serenity.wikipedia.steps;

import net.thucydides.core.annotations.Step;
import quality.serenity.wikipedia.pages.HomePage;
import quality.serenity.wikipedia.pages.LoginPage;

public class LoginSteps {
	HomePage homePage;
	LoginPage loginPage;
	
	@Step("go to Wiki")
	public void goToWiki(){
		homePage.goWiki();
		homePage.clickAcceder();
	}
	
	@Step("put User")
	public void putNameUser(String sUser){
		loginPage.putUser(sUser);
		
	}
	
	@Step("put Password")
	public void putPassUser(String sPass){
		loginPage.putPass(sPass);
	}
	
	@Step("click on Acceder")
	public void clickOnAcceder(){
		loginPage.clickAcceder();
	}
	
	@Step("Verify Login")
	public void verifyLoginOk(String sUser){
		loginPage.verifyLogin(sUser);
	}
	
}
