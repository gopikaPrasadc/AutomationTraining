package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import handlesleep.Pageutility;

public class CompanyModule {
	WebDriver driver;
	JavascriptExecutor j;
	@FindBy(xpath = "//*[text()='Company']")
	WebElement companyhead;
	@FindBy(xpath = "//*[@name='Company[company_name]']")
	WebElement companymainname;
	@FindBy(xpath = "//*[@name='Company[company_email]']")
	WebElement emailid;
	@FindBy(xpath = "//*[@name='Company[company_address]']")
	WebElement address;
	@FindBy(xpath = "//*[@class='glyphicon glyphicon-remove']")
	WebElement datecross;
	@FindBy(xpath="//*[@class='glyphicon glyphicon-remove']")
	public List<WebElement> datebox;
	@FindBy(xpath = "//*[@class='btn btn-success']")
	WebElement save;
	
	
	
	public CompanyModule(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	public void companyName(String companyname, String mailid, String companyaddress) {
		companyhead.click();
		companymainname.sendKeys(companyname);
		emailid.sendKeys(mailid);
		address.sendKeys(companyaddress);
		datecross.click();
		//datebox.addAll(0, 13);
		save.click();
	}
	
}