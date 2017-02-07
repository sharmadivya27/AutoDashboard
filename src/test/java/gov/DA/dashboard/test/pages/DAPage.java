package gov.DA.dashboard.test.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.interactions.Actions;

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

	@FindBy(xpath = "//*[@id='status-view']/div/div[3]/div/div/div/div[3]/form/div[1]/div/div[1]")
	private WebElementFacade bankBox;

	@FindBy(xpath = "//*[@id='status-view']/div/div[3]/div/div/div/div[3]/form/div[1]/div")
	private WebElementFacade bankBox2;

	@FindBy(xpath = "//*[@id='status-view']/div/div[3]/div/div/div/div[3]/form/div[1]/div/div[2]")
	private WebElementFacade bankBox3;

	@FindBy(xpath = "//*[@id='status-view']/div/div[3]/div/div/div/div[4]/form/div[1]/div")
	private WebElementFacade insuranceBox;

	@FindBy(xpath = "//*[@id='status-section']/div[2]/div/div[1]/span[2]/a")
	private WebElementFacade additionalResources;

	@FindBy(xpath = "//*[@id='additional-view']/div/div[2]/div")
	private List<WebElementFacade> foas;

	@FindBy(xpath = "//*[@id='dashboard-login-link']/span")
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

	@FindBy(xpath = "//*[@id='status-view']/div/div[3]/div/div/div/div[2]/form/div[1]/div/div[3]/div[1]/div/div[3]/input")
	private WebElementFacade damagedPhoneNumber;

	@FindBy(xpath = "//*[@id='status-view']/div/div[3]/div/div/div/div[2]/form/div[1]/div/div[3]/div[2]/div/div[3]/input")
	private WebElementFacade currentPhoneNumber;

	@FindBy(xpath = "//*[@id='status-view']/div/div[3]/div/div/div/div[2]/form/div[2]/button")
	private WebElementFacade phoneSaveButton;

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

	@FindBy(xpath = "//*[@id='insurance-company']")
	private WebElementFacade insuranceCompany;

	@FindBy(xpath = "//*[@id='insurance-type']")
	private WebElementFacade insuranceType;

	@FindBy(xpath = "//*[@id='insurance-policyNumber']")
	private WebElementFacade policyNumber;

	@FindBy(xpath = "//*[@id='insurance-phoneNumber-0']")
	private WebElementFacade insurancePhoneNumber;

	@FindBy(xpath = "//*[@id='status-view']/div/div[3]/div/div/div/div[4]/form/div[2]/button[2]")
	private WebElementFacade insuranceSaveButton;

	@FindBy(xpath = "//*[@id='updateResultModal']")
	private WebElementFacade updateModal;

	@FindBy(xpath = "//*[@id='dashboard-login-link']/span[2]")
	private WebElementFacade myDAButton;

	// *************************************************************************************

	public void logIntoDashboard(String user, String password) {
		getDriver().manage().window().maximize();
		emailEntry.type(user);
		passwordEntry.type(password);
		submitButton.click();
	}

	public boolean notificationIsDisplayed() {
		return notification.isDisplayed();
	}

	public void clickAdditionalResources() {
		additionalResources.click();
	}

	public int getNumFoaResults() {
		return foas.size();
	}

	public void clickReviewApplication() {
		reviewButton1.click();
	}

	public void clickReviewApplication2() {
		reviewButton2.click();
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
		damagedPhoneNumber.type("2222222222");
		currentPhoneNumber.click();
		currentPhoneNumber.type("3333333333");
		phoneSaveButton.click();
		return updatePopsUp();
	}

	public String damagedPhoneMatches() {
		return damagedPhoneNumber.getTextValue();
	}

	public String currentPhoneMatches() {
		return currentPhoneNumber.getTextValue();
	}

	public boolean bankIsDisplayed() {
		return bankBox.isDisplayed();
	}

	public boolean bank2IsDisplayed() {
		return bankBox2.isDisplayed();
	}

	public boolean bank3IsDisplayed() {
		return bankBox3.isDisplayed();
	}

	public String updateBankInformation() {
		bankEditButton.click();
		financialInstitutionName.clear();
		financialInstitutionName.type("BBT");
		accountType.sendKeys("Checking");
		routingNumber.type("123123123");
		accountNumber.type("12312312312312312");
		financialSaveButton.click();
		// pause(1000);
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
		insurancePhoneNumber.type("2222222222");
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

	public void logout() {
		/*Actions action = new Actions(getDriver());
		action.moveToElement(myDAButton).perform();*/
		String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
	    JavascriptExecutor js = (JavascriptExecutor) getDriver();
	    js.executeScript(mouseOverScript, myDAButton);
		pause(4000);
		logout.click();
	}

	public String getUrl() {
		String url = getDriver().getCurrentUrl();
		return url;
	}

	public void clickApplicantTab() {
		applicantTab.click();
	}

	public void pause(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}    

	public String updatePopsUp() {
		return updateModal.getText();
	}
}