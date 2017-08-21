package quality.serenity.wikipedia.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class HomePage extends PageObject{
	String urlWiki = "https://es.wikipedia.org/wiki/Wikipedia:Portada";
	
	@FindBy(xpath = ".//*[@id='pt-login']/a")
	WebElement linkAcceder;
	
	public void goWiki(){
		getDriver().get(urlWiki);
	}
	
	public void clickAcceder(){
		linkAcceder.click();
	}
	
	public void class_test(){
		String sTest;
	}
	
}
