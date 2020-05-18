package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import handlesleep.Pageutility;

public class ClientDetails extends ClientModule{
	
	public ClientDetails(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//*[@href='/payrollapp/client/create']")
	WebElement CreateClientModule;
	@FindBy(xpath="//*[@id='clientsearch-client_name']")
	WebElement clientsearch;
	@FindBy(xpath="//*[@id='clientsearch-id']")
	WebElement clientid;
	@FindBys(@FindBy(xpath="//*[@class='glyphicon glyphicon-eye-open']"))
	private List<WebElement> AllData;

    public List<WebElement> getAllData() {
        return AllData;
    }
    @FindBys(@FindBy(xpath="//*[@class='glyphicon glyphicon-eye-open']"))
	private List<WebElement> AllPencilData;
    public List<WebElement> getAllPencilData() {
        return AllPencilData;
        
       
}
    
    public void ClientDetailsoneclick(String clientname, String ID ) {
    	Pageutility.waitforelementtobeclickable(driver, CreateClientModule, 3);
    	CreateClientModule.click();
Pageutility.isElementLoaded(driver, clientsearch, 3);
    	clientsearch.sendKeys(clientname);
    	Pageutility.isElementLoaded(driver, clientid, 3);
    	clientid.sendKeys(ID);
    	Pageutility.waitforlistofelementtobeclickable(driver, AllData, 3);
    	AllData.get(0).click();
    	Pageutility.waitforlistofelementtobeclickable(driver, AllPencilData, 3);
    	AllPencilData.get(0).click();
    }
    

    
    
}