package quality.serenity.wikipedia.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import quality.serenity.wikipedia.steps.LoginSteps;

@RunWith(SerenityRunner.class)
public class LoginTest {
	@Managed
	WebDriver webDriver;
	
	@Steps
	LoginSteps stepsLogin;
	
	@Test
	@Title("Test login wiki")
	public void loginWikiTest(){
		stepsLogin.goToWiki();
		stepsLogin.putNameUser("pilar07");
		stepsLogin.putPassUser("123456");
		stepsLogin.clickOnAcceder();
		stepsLogin.verifyLoginOk("pilar07");
	}
}
