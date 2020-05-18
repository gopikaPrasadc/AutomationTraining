package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientModule {
	WebDriver driver;
	@FindBy(xpath="//*[@href='/payrollapp/client/index']")
    WebElement ClientModule;
    
	
public ClientModule(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


public void clientmoduleclick() {
	ClientModule.click();
}
}
