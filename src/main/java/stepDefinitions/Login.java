package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {

	
	public ChromeDriver driver;
	
	@Given("Open the browser")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Browser opened");
	}
	
	@And("Maximize the window")
	public void maximizeBrowser() {
		driver.manage().window().maximize();
		System.out.println("Browser maximized");
	}
	
	@And("Set implicit timeout")
	public void setImplicitTimeout() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Timeout added");
	}
	
	@And("Load the URL")
	public void loadURL() {
		driver.get("http://leaftaps.com/opentaps/control/main");
		System.out.println("URL loaded");
	}
	
	@And("Enter the username as (.*)")
	public void enterUserName(String userName) {
		driver.findElement(By.id("username")).clear();
	    driver.findElement(By.id("username")).sendKeys(userName);
	    System.out.println("Username entered as: "+userName);
	}
	
	@And("Enter the password as (.*)")
	public void enterPassWord(String passWord) {
		driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys(passWord);
	    System.out.println("Password entered as: "+passWord);
	}
	
	@When("Click the login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	    System.out.println("Login button clicked");
	}
	
	@Then("Verify the successful login")
	public void verifySuccessfulLogin() {
		String welcomeText = driver.findElement(By.xpath("//h2")).getText();
		System.out.println("WelcomeText: "+welcomeText);
		if(welcomeText.contains("Demo")) {
			System.out.println("Login successful");
		}
		else {
			System.out.println("Login not successful");
		}
	}
	
	@Then("Verify the unsuccessful login")
	public void verifyUnSuccessfulLogin() {
		String welcomeText = driver.findElement(By.xpath("//h2")).getText();
		System.out.println("WelcomeText: "+welcomeText);
		if(welcomeText.contains("Demo")) {
			System.out.println("Login successful");
		}
		else {
			System.out.println("Login not successful");
		}
	}
	
	
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
	}

	
	
}
