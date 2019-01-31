package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead {

	
	/*public ChromeDriver driver;
	
	@When("Click crmsfa link")
	public void clickCRMSFALink() {
		driver.findElementByLinkText("CRM/SFA").click();
		System.out.println("CRM/SFA link clicked");
	}
	
	@And("Click create lead link")
	public void clickCreateLeadLink() {
		driver.findElementByLinkText("Create Lead").click();
		System.out.println("Create Lead link clicked");
	}
	
	@And("Enter company name as (.*)")
	public void enterCompanyName(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	    System.out.println("CompanyName entered as: "+cName);
	}
	
	@And("Enter first name as (.*)")
	public void enterFirstName(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
	    System.out.println("FirstName entered as: "+fName);
	}
	
	@And("Enter last name as (.*)")
	public void enterLastName(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).clear();
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	    System.out.println("LastName entered as: "+lName);
	}
	
	@And("Click submit button")
	public void clickSubmitButton() {
		driver.findElementByClassName("smallSubmit").click();
	    System.out.println("Submit button clicked");
	}
	
	@Then("Verify successful lead creation as (.*)")
	public void verifySuccessfulCreateLead(String cName) {
		String companyName = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println("CompanyName: "+companyName);
		if(companyName.contains(cName)) {
			System.out.println("Lead creation successful");
		}
		else {
			System.out.println("Lead creation not successful");
		}
	}	*/
}
