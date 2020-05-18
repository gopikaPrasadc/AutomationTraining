package testclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.ClientDetails;
import pageObject.ClientModule;
import pageObject.CompanyBranch;
import pageObject.CompanyModule;
import pageObject.CreateClient;
import pageObject.HomePage;
import pageObject.LoginPage;
import utilities.BaseClass;

public class RegressionTest extends BaseClass {
	@Test(priority = 1, enabled = false)
	public void invalidpassword() throws InterruptedException {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.login("carol", "1q2sedrf");
		String actual = "";
		 Assert.assertEquals(actual,driver.findElement(By.xpath("//*[text()='Login']")).getText());

	}

	@Test(priority = 2, enabled = false)
	public void invalidusername() throws InterruptedException {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.login("carol12", "1q2w3e4r");
		String actual = "";
		 Assert.assertEquals(actual,driver.findElement(By.xpath("//*[text()='Login']")).getText());
	}

	@Test(priority = 0)
	public void invalidpasswordinvalidusername() throws InterruptedException {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.login("carol123", "1q2w3e4r5t");
	      Assert.assertEquals(loginpage.inCorrectLoginMessage(), "Incorrect username or password.");

	}

	@Test(priority = 1)
	public void allvalid() throws InterruptedException {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.login("carol", "1q2w3e4r");
		HomePage homePage=new HomePage(driver);
	     Assert.assertEquals(homePage.getTextofWelcomeText(), "Welcome to Payroll Application");

	}
		
		
	@Test(priority =2)
	public void companyup() throws InterruptedException {
		CompanyModule companymodule = new CompanyModule(driver);
		companymodule.companyName("obsqura123", "gopikacek14@gmail.com", "kannur");

	}
	
	@Test(priority =3  )
	public void clientModule() {
		ClientDetails clientdetails = new ClientDetails(driver);
		clientdetails.ClientDetailsoneclick("oeWorld", "5755");
	}
	
	@Test(priority =4)
	public void clientcreate() {
		CreateClient createclient = new CreateClient(driver);
		createclient.Create("newclient", "kochi", "clienttest@gmail.com");
	}
	
	@Test(priority =5 )
	
	public void branchofcompany() {
	CompanyBranch companybranch	= new CompanyBranch(driver);
	companybranch.companybranchedit("obsqura123", "east", "delhi");
	}

	@Test(priority =6 )
	
	public String getfWelcomeText() {
		HomePage homepage0 = new HomePage(driver);
		return homepage0.getTextofWelcomeText();

}
	
	@Test(priority =7 )
	public void outlog() {
		HomePage homepage = new HomePage(driver);
		homepage.logout();
	}
	
}
