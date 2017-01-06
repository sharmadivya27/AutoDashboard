package gov.DA.dashboard.test.pages;

import java.util.List;

import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://staging.disasterassistance.gov/?mobile=unL9HuS")
public class DAPage extends PageObject {

	@FindBy(xpath = "//*[@id='login-form']/div[2]/div[1]/input")
	private WebElementFacade emailEntry;

	@FindBy(xpath = "//*[@id='login-form']/div[2]/div[2]/input")
	private WebElementFacade passwordEntry;

	@FindBy(xpath = "//*[@id='login-form']/div[2]/div[4]/div/button")
	private WebElementFacade submitButton;
	
	@FindBy(xpath = "//*[@id='status-section']/div[2]/div/div[2]")
	private WebElementFacade applications;
	
	@FindBy(xpath = "//*[@id='status-section']/div[3]/div")
	private WebElementFacade application2;
	
	@FindBy(xpath = "//*[@id='status-section']/div[2]/div")
	private WebElementFacade application3;
	
	@FindBy(xpath = "//*[@id='status-section']/div[3]/div/div[2]")
	private WebElementFacade application4;

	@FindBy(xpath = "//*[@id='status-section']/div[2]/div/div[2]/div[1]/div[3]/a")
	private WebElementFacade reviewButton1;

	@FindBy(xpath = "//*[@id='status-section']/div[3]/div/div[2]/div[1]/div[3]/a")
	private WebElementFacade reviewButton2;

	@FindBy(xpath = "//*[@id='status-view']/div/div[2]/ul/li[2]/a")
	private WebElementFacade applicantTab;

	@FindBy(xpath = "//*[@id='status-view']/div/div[3]/div/div/div/div[1]/form/div[1]/div")
	private WebElementFacade addressBox;

	@FindBy(xpath = "//*[@id='status-view']/div/div[3]/div/div/div/div[2]/form/div/div")
	private WebElementFacade phoneNumberBox;

	@FindBy(xpath = "//*[@id='status-view']/div/div[3]/div/div/div/div[2]/div[2]/form/div[1]/div/div[1]")
	private WebElementFacade bankBox;

	@FindBy(xpath = "//*[@id='status-view']/div/div[3]/div/div/div/div[2]/div[3]/form/div[1]/div")
	private WebElementFacade insuranceBox;

	@FindBy(xpath = "//*[@id='status-section']/div[2]/div/div[1]/span[2]/a")
	private WebElementFacade additionalResources;

	@FindBy(xpath = "//*[@id='additional-view']/div/div[2]/div")
	private List<WebElementFacade> foas;

	@FindBy(xpath = "//*[@id='dashboard-login-link']/span[3]")
	private WebElementFacade notification;

	@FindBy(xpath = "//*[@id='dashboard-logout-link']")
	private WebElementFacade logout;

	@FindBy(xpath = "//*[@name='address1_1']")
	private WebElementFacade street;

	@FindBy(xpath = "//*[@name='city_1']")
	private WebElementFacade city;

	@FindBy(xpath = "//*[@name='zip_1']")
	private WebElementFacade zipcode;

	@FindBy(xpath = "//*[@id='status-view']/div/div[3]/div/div/div/div[1]/form/div[2]/button")
	private WebElementFacade mailingSaveButton;

	@FindBy(xpath = "//*[@id='status-view']/div/div[3]/div/div/div/div[2]/form/div/div/div[4]/div/div[3]/input")
	private WebElementFacade damagedPhoneNumber;

	@FindBy(xpath = "//*[@id='status-view']/div/div[3]/div/div/div/div[2]/form/div/div/div[5]/div/div[3]/input")
	private WebElementFacade currentPhoneNumber;

	@FindBy(xpath = "//*[@id='status-view']/div/div[3]/div/div/div/div[2]/form/div/div/div[6]/div/div[3]/input")
	private WebElementFacade cellPhoneNumber;

	@FindBy(xpath = "//*[@id='status-view']/div/div[3]/div/div/div/div[2]/form/div/div/div[7]/div/div[3]/input")
	private WebElementFacade alternatePhoneNumber;

	@FindBy(xpath = "//*[@id='status-view']/div/div[3]/div/div/div/div[2]/form/div/div/div[6]/button[3]")
	private WebElementFacade phoneSaveButton;

	@FindBy(xpath = "//*[@id='status-view']/div/div[3]/div/div/div/div[2]/form/div/div/div[8]/button[3]")
	private WebElementFacade phoneSaveButton2;

	@FindBy(xpath = "//*[@id='status-view']/div/div[3]/div/div/div/div[2]/div[2]/form/div[2]/button[1]")
	private WebElementFacade bankEditButton;

	@FindBy(xpath = "//*[@id='bank-name']")
	private WebElementFacade financialInstitutionName;

	@FindBy(xpath = "//*[@id='status-view']/div/div[3]/div/div/div/div[2]/div[2]/form/div[1]/div/div[1]/div[1]/div[1]/label[2]")
	private WebElementFacade savedFinancialInstitutionName;

	@FindBy(xpath = "//*[@id='bank-account-type']")
	private WebElementFacade accountType;

	@FindBy(xpath = "//*[@id='status-view']/div/div[3]/div/div/div/div[2]/div[2]/form/div[1]/div/div[1]/div[1]/div[2]/label[2]")
	private WebElementFacade savedAccountType;

	@FindBy(xpath = "//*[@id='routing-number']")
	private WebElementFacade routingNumber;

	@FindBy(xpath = "//*[@id='status-view']/div/div[3]/div/div/div/div[2]/div[2]/form/div[1]/div/div[1]/div[2]/div[1]/label[2]")
	private WebElementFacade savedRoutingNumber;

	@FindBy(xpath = "//*[@id='account-number']")
	private WebElementFacade accountNumber;

	@FindBy(xpath = "//*[@id='status-view']/div/div[3]/div/div/div/div[2]/div[2]/form/div[1]/div/div[1]/div[2]/div[2]/label[2]")
	private WebElementFacade savedAccountNumber;

	@FindBy(xpath = "//*[@id='status-view']/div/div[3]/div/div/div/div[2]/div[2]/form/div[2]/button[2]")
	private WebElementFacade financialSaveButton;

	@FindBy(xpath = "//*[@id='status-view']/div/div[3]/div/div/div/div[2]/div[3]/form/div[2]/button[1]")
	private WebElementFacade addInsuranceButton;

	@FindBy(xpath = "//*[@id='insurance-company']")
	private WebElementFacade insuranceCompany;

	@FindBy(xpath = "//*[@id='insurance-type']")
	private WebElementFacade insuranceType;

	@FindBy(xpath = "//*[@id='insurance-policyNumber']")
	private WebElementFacade policyNumber;

	@FindBy(xpath = "//*[@id='insurance-phoneNumber-0']")
	private WebElementFacade insurancePhoneNumber;

	@FindBy(xpath = "//*[@id='status-view']/div/div[3]/div/div/div/div[2]/div[3]/form/div[2]/button[2]")
	private WebElementFacade insuranceSaveButton;

	@FindBy(xpath = "//*[@id='updateResultModal']")
	private WebElementFacade updateModal;

	@FindBy(xpath = "//*[@id='dashboard-login-link']/span[2]")
	private WebElementFacade myDAButton;

	@FindBy(xpath = "//*[@id='menu-my-da']/ul/li[1]/a")
	private WebElementFacade dashboardSummary;

	// *************************************************************************************

	public void logIntoDashboard(String user, String password) {
		getDriver().manage().window().maximize();
		emailEntry.type(user);
		passwordEntry.type(password);
		submitButton.click();
		pause(9000);
	}
	
	public void logIntoDashboard() {
		getDriver().manage().window().maximize();
		emailEntry.type("430990610");
		passwordEntry.type("1960-9-15");
		submitButton.click();
		pause(9000);
	}

	public void logout() {
		Actions action = new Actions(getDriver());
		action.moveToElement(myDAButton).perform();
		pause(4000);
		logout.click();
	}

	public String getUrl() {
		String url = getDriver().getCurrentUrl();
		return url;
	}

	public int getNumFoaResults() {
		return foas.size();
	}

	public boolean applicationIsDisplayed() {
		pause(2000);
		return applications.isDisplayed();
	}
	
	public boolean application2IsDisplayed() {
		return application2.isDisplayed();
	}
	
	public boolean application3IsDisplayed() {
		return application3.isDisplayed();
	}
	
	public boolean application4IsDisplayed() {
		return application4.isDisplayed();
	}

	public void clickReviewApplication() {
		pause(3000);
		reviewButton1.click();
		pause(6000);
	}

	public void clickReviewApplication2() {
		pause(7000);
		reviewButton2.click();
	}

	public void clickApplicantTab() {
		applicantTab.click();
	}

	public void clickAdditionalResources() {
		additionalResources.click();
	}

	public String updatePopsUp() {
		return updateModal.getText();
	}

	public boolean addressBoxIsDisplayed() {
		return addressBox.isDisplayed();
	}

	public String updateMailingAddress() {
		street.type("430 Market St");
		city.type("Winchester");
		zipcode.type("22603");
		mailingSaveButton.click();
		return updatePopsUp();
	}

	public String mailingStreetMatches() {
		return street.getTextValue();
	}

	public String mailingCityMatches() {
		return city.getTextValue();
	}

	public String mailingZipcodeMatches() {
		return zipcode.getTextValue();
	}
 
	public boolean phoneNumberIsDisplayed() {
		return phoneNumberBox.isDisplayed();
	}

	public String updatePhoneInformation() {
		this.evaluateJavascript("window.scrollBy(0,50)", "");
		damagedPhoneNumber.clear();
		damagedPhoneNumber.type("2221231245");
		currentPhoneNumber.click();
		currentPhoneNumber.type("3333333333");
		cellPhoneNumber.click();
		cellPhoneNumber.type("2222222222");
		phoneSaveButton.click();
		return updatePopsUp();
	}

	public String updatePhoneInformation2() { 
		this.evaluateJavascript("window.scrollBy(0,50)", "");
		damagedPhoneNumber.clear();
		damagedPhoneNumber.type("2221231245");
		currentPhoneNumber.click();
		phoneSaveButton2.click();
		return updatePopsUp();
	}

	public String altPhoneMatches() {
		return damagedPhoneNumber.getTextValue();
	}

	public boolean bankIsDisplayed() {
		return bankBox.isDisplayed();
	}

	public String updateBankInformation() {
		bankEditButton.click();
		financialInstitutionName.clear();
		financialInstitutionName.type("BBT");
		accountType.sendKeys("Checking");
		routingNumber.type("123123123");
		accountNumber.type("12312312312312312");
		financialSaveButton.click();
		pause(1000);
		return updatePopsUp();
	}

	public String bankInstitutionMatches() {
		this.evaluateJavascript("window.scrollBy(0,50)", "");
		return savedFinancialInstitutionName.getText();
	}

	public String bankAccountMatches() {
		return savedAccountType.getText();
	}

	public String bankRoutingMatches() {
		return savedRoutingNumber.getText();
	}

	public String bankAccountNumber() {
		return savedAccountNumber.getText();
	}

	public boolean insuranceIsDisplayed() {
		return insuranceBox.isDisplayed();
	}

	public String updateInsuranceInformation() {
		insuranceCompany.type("ALLSTATE");
		insuranceType.sendKeys("Mobile Home (O/R)");
		policyNumber.type("123123123");
		insurancePhoneNumber.clear();
		insurancePhoneNumber.type("2022021829");
		insuranceSaveButton.click();
		return updatePopsUp();
	}

	public String insuranceCompanyMatches() {
		return insuranceCompany.getTextValue(); 
	}

	public String policyNumberMatches() {
		return policyNumber.getTextValue();
	}

	public String insurancePhoneNumberMatches() {
		return insurancePhoneNumber.getTextValue();
	}

	public boolean notificationIsDisplayed() {
		return notification.isDisplayed();
	}

	public void backToSummaryPage() {
		pause(3000);
		Actions action = new Actions(getDriver());
		action.moveToElement(myDAButton).perform();
		pause(4000);
		dashboardSummary.click();
		pause(5000);
	}

	public void pause(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}