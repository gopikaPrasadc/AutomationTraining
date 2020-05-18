package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import handlesleep.Pageutility;

public class LoginPage {
WebDriver driver;
@FindBy(xpath="//*[@id='loginform-username' and @value='asfsdfsd']")
WebElement login;
@FindBy(xpath="//*[@id='lloginform-password' and @value='sdacscsdc']")
WebElement pass;
@FindBy(xpath="//*[@class='btn btn-default']")
WebElement loginbutton;
@FindBy(xpath="//*[@class='help-block help-block-error' and text()='Incorrect username or password.']")
WebElement displayedmessage;
@FindBy(xpath="//div[@class='col-sm-4 form-area inner']/h1")
    WebElement loginTitle;

public String inCorrectLoginMessage() {

Pageutility.waitfortextpresentinElement(driver,displayedmessage,   null, 3); //textToBePresentInElement
String incorrectLoginMessage=displayedmessage.getText();
return incorrectLoginMessage;
}

public boolean isLoginPageTitleDisplayed() {

return loginTitle.isDisplayed();

}





public LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


public void login(String username, String password) throws InterruptedException {
	Pageutility.isElementLoaded(driver, login, 4);
	login.sendKeys(username);
	Pageutility.isElementLoaded(driver, pass, 3);
	pass.sendKeys(password);
	Pageutility.waitforelementtobeclickable(driver, loginbutton, 3);
	loginbutton.click();
	
	
}

}
