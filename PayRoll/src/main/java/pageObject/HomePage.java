package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import handlesleep.Pageutility;

public class HomePage {
	WebDriver driver;
	@FindBy(xpath="//*[@class='dropdown-toggle']")
	WebElement username;
	@FindBy(xpath="//*[@class='logout-btn']")
	WebElement logout_button;
	@FindBy(xpath="//*[@class='col-lg-12 col-sm-12']")
	WebElement dashboardmessage;
	@FindBy(xpath="//*[text()='view full profile']")
	WebElement viewprofile;
	
	public HomePage(WebDriver driver) {

	this.driver=driver;
	   PageFactory.initElements(driver, this);
	}

	public void logout() {

	Pageutility.isElementLoaded(driver,username,3);
	Select usernamedropdown = new Select(username);
	usernamedropdown.getOptions().get(0);
	Pageutility.isElementLoaded(driver,username,3);
	viewprofile.click();
	Pageutility.isElementLoaded(driver,username,3);
	username.click();
	Pageutility.waitforelementtobeclickable(driver, logout_button, 3);
	logout_button.click();

	}


	public String getTextofWelcomeText() {

	Pageutility.isElementLoaded(driver,dashboardmessage,3);
	String dashboardwelcomemessage=dashboardmessage.getText();
	return dashboardwelcomemessage;
	}}


