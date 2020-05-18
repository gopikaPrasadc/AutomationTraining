package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import handlesleep.Pageutility;

public class CompanyBranch extends CompanyModule {

	public CompanyBranch(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//*[@href='/payrollapp/branch/create']")
	WebElement CompanyBranch;
	@FindBy(xpath = "//*[@href='/payrollapp/branch/view?id=1']")
	WebElement view;
	@FindBy(xpath = "//*[@href='/payrollapp/branch/update?id=1']")
	WebElement edit;
	@FindBy(xpath = "//*[@id='branch-company_id']")
	WebElement editbranch;
	@FindBy(xpath = "//*[@id='branch-branch_name']")
	WebElement branchname;
	@FindBy(xpath = "branch-branch_address")
	WebElement branchaddress;
	@FindBy(xpath = "//*[@class='btn btn-success']")
	WebElement save;
	
	
	
public void companybranchedit(String name, String namebranch, String addressbranch ) {
	Pageutility.waitforelementtobeclickable(driver, CompanyBranch, 5);
	CompanyBranch.click();
	Pageutility.waitforelementtobeclickable(driver, view, 5);
	view.click();
	Pageutility.waitforelementtobeclickable(driver, edit, 5);
	edit.click();
	Pageutility.waitforelementtobeclickable(driver, editbranch, 5);
	editbranch.sendKeys(namebranch);
	branchaddress.sendKeys(addressbranch);
}

}
