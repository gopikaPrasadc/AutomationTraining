package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.Select;

public class CreateClient extends ClientDetails {

	public CreateClient(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//*[@name='Client[branch_id]']")
	WebElement clientBranch;
	@FindBy(xpath="//*[@name='Client[your_ref]']")
	WebElement ClientReference;
	@FindBy(xpath="//*[@name='Client[invoice_order]']")
	WebElement ClientInvoiceOrder;
	@FindBy(xpath="//*[@name='Client[division_id]']")
	WebElement clientDivision;
	@FindBy(xpath="//*[@name='Client[invoice_contact]']")
	WebElement ClientInvoiceContact;
	@FindBy(xpath="//*[@name='Client[invoice_delivery_method]']")
	WebElement ClientDeliveryMethod;
	@FindBy(xpath="//*[@name='Client[client_name]']")
	WebElement clientName;
	@FindBy(xpath="//*[@name='Client[phone]']")
	WebElement clientContact;
	@FindBy(xpath="//*[@name='Client[master_document]']")
	WebElement clientMasterDocument;
	@FindBy(xpath="//*[@name='Client[client_address]']")
	WebElement clientAddress;
	@FindBy(xpath="//*[@name='Client[email]']")
	WebElement clientEmail;
	@FindBy(xpath="Client[settilement_days]")
	WebElement clientSettlementDays;
	@FindBy(xpath="//*[@name='Client[postcode]']")
	WebElement clientPostCode;
	@FindBy(xpath="//*[@name='Client[company_reg]']")
	WebElement clientRegisterNumber;
	@FindBy(xpath="//*[@name='Client[vat_rate]']")
	WebElement clientVatRate;
	@FindBys(@FindBy(xpath="//*[@name='Client[uk_public_sector_client]']"))
	private List<WebElement> RequirePO;
    public List<WebElement> getAllPO() {
        return RequirePO;
    }
	@FindBy(xpath="//*[@class='btn btn-success']")
	WebElement ClientCreateSaveButton;
	
	public void Create(String clientn, String Address, String mailid) {
		Select select = new Select(clientBranch);
		select.selectByIndex(0);
		ClientReference.sendKeys(String.valueOf(56464));
		Select selectinvoice = new Select(ClientInvoiceOrder);
		selectinvoice.selectByIndex(0);
		Select selectDivision = new Select(clientDivision);
		selectDivision.selectByIndex(0);
	    ClientInvoiceContact.sendKeys(String.valueOf(6867676587L));
		Select selectDeliveryMethod = new Select(ClientDeliveryMethod);
		selectDivision.selectByIndex(0);
		clientName.sendKeys(clientn);
		clientContact.sendKeys(String.valueOf(676567656788L));
		Select selectMasterDocument = new Select(clientMasterDocument);
		selectMasterDocument.selectByIndex(0);
		clientAddress.sendKeys(Address);
		clientAddress.sendKeys(mailid);
		clientSettlementDays.sendKeys(String.valueOf(10));
		clientPostCode.sendKeys(String.valueOf(686504L));
		clientRegisterNumber.sendKeys(String.valueOf(123242));
		Select selectVatRate = new Select(clientVatRate);
		selectVatRate.selectByIndex(0);
		RequirePO.get(0).click();
		ClientCreateSaveButton.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
}



