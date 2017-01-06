package gov.DA.dashboard.test.steps.serenity;

import org.junit.Assert;

import gov.DA.dashboard.test.pages.DAPage;
import net.thucydides.core.annotations.Step;

public class User {

	DAPage daPage;

	@Step
	public void onDashboardLoginPage() {
		daPage.open();
		daPage.openAt("https://staging.disasterassistance.gov/ca-dashboard/login");
	}

	public void onDashboardHomePage() {
		daPage.openAt("https://staging.disasterassistance.gov/ca-dashboard/login");
	}

	public void onSummaryPage(String user) {
		daPage.openAt("https://staging.disasterassistance.gov/ca-dashboard/summary");
		daPage.pause(4000);
	}

	public void fillInForm(String user, String password) {
		daPage.logIntoDashboard(user, password);
		daPage.pause(4000);
	}

	//***********************************************
	public void fillInForm() {
		 daPage.logIntoDashboard();
		 daPage.pause(4000);
	}
	
	public void reviewApplicationPage(String user) {
		daPage.pause(7000);
		if (user.equals("049828525")) {
			daPage.clickReviewApplication2();
		} else if (user.equals("735251523")) {
			daPage.clickReviewApplication();
			daPage.pause(5000);
		} else {
			daPage.clickReviewApplication();
		}
		daPage.pause(8000);
	}
	
	//**************************************************
	public void reviewApplicationPage() {
		daPage.pause(3000);
		daPage.clickReviewApplication();
		daPage.pause(8000);
	}

	public void logOutDashboard() {
		daPage.pause(7000);
		daPage.logout();
		daPage.pause(7000);
	}

	public void getCurrentUrl() {
		String url = daPage.getUrl();
		Assert.assertEquals("https://staging.disasterassistance.gov/dare", url);
	}

	public void goToApplicantTab() {
		daPage.clickApplicantTab();
		daPage.pause(3000);
	}

	public void viewMailingAddress() {
		goToApplicantTab();
		boolean address = daPage.addressBoxIsDisplayed();
		Assert.assertEquals(true, address);
	}

	public void updateMailingInfo() {
		goToApplicantTab();
		Assert.assertEquals("UPDATE SUCCESS", daPage.updateMailingAddress());
	}

	public void mailingInfoSaved() {
		goToApplicantTab();
		daPage.pause(2000);
		Assert.assertEquals("430 MARKET ST", daPage.mailingStreetMatches());
		Assert.assertEquals("WINCHESTER", daPage.mailingCityMatches());
		Assert.assertEquals("22603", daPage.mailingZipcodeMatches());
	}

	public void viewPhoneNumber() {
		goToApplicantTab();
		boolean phoneNumber = daPage.phoneNumberIsDisplayed();
		Assert.assertEquals(true, phoneNumber);
	}

	public void updatePhoneInfo(String user) {
		goToApplicantTab();
		if (user.equals("049828525")) {
			Assert.assertEquals("UPDATE SUCCESS", daPage.updatePhoneInformation());
		} else {
			Assert.assertEquals("UPDATE SUCCESS", daPage.updatePhoneInformation2());
		}
	}

	public void phoneInfoSaved() {
		daPage.pause(4000);
		goToApplicantTab();
		daPage.pause(2000);
		Assert.assertEquals("(221) 231-2452", daPage.altPhoneMatches());
	}

	public void viewBankInformation() {
		goToApplicantTab();
		boolean financial = daPage.bankIsDisplayed();
		Assert.assertEquals(true, financial);
	}

	public void updateBankInfo() {
		goToApplicantTab();
		Assert.assertEquals("UPDATE SUCCESS", daPage.updateBankInformation());
	}

	public void bankInfoSaved() {
		goToApplicantTab();
		daPage.pause(2000);
		Assert.assertEquals("BBT", daPage.bankInstitutionMatches());
		Assert.assertEquals("Checking", daPage.bankAccountMatches());
		Assert.assertEquals("*****3123", daPage.bankRoutingMatches());
		Assert.assertEquals("*************2312", daPage.bankAccountNumber());
	}

	public void viewInsuranceInformation() {
		goToApplicantTab();
		boolean insurance = daPage.insuranceIsDisplayed();
		Assert.assertEquals(true, insurance);
	}

	public void updateInsuranceInfo() {
		goToApplicantTab();
		Assert.assertEquals("UPDATE SUCCESS", daPage.updateInsuranceInformation());
	}

	public void insuranceInfoSaved() {
		goToApplicantTab();
		daPage.pause(2000);
		Assert.assertEquals("ALLSTATE", daPage.insuranceCompanyMatches());
		Assert.assertEquals("123123123", daPage.policyNumberMatches());
		Assert.assertEquals("(022) 021-8292", daPage.insurancePhoneNumberMatches());
	}

	public void goToAdditionalResources(String user) {
		daPage.pause(5000);
		daPage.clickAdditionalResources();
		daPage.pause(8000);
	}

	public void getFoaResults(String user) {
		daPage.pause(2000);
		if (user.equals("786787687")) {
			Assert.assertEquals(6, daPage.getNumFoaResults());
		} else {
			Assert.assertEquals(78, daPage.getNumFoaResults());
		} 
	}

	public void notificationDisplayed() {
		boolean notification = daPage.notificationIsDisplayed();
		Assert.assertEquals(true, notification);
	}

	public void shouldSeePage(String user) {
		if (user.equals("001010001")) {
			Assert.assertEquals(true, daPage.application3IsDisplayed());
		} else if (user.equals("430991038")) {
			Assert.assertEquals(true, daPage.application4IsDisplayed());
		} else {
			Assert.assertEquals(true, daPage.applicationIsDisplayed());
		}
	}
	
	//***********************************************
	public void shouldSeePage() {
		daPage.pause(2000);
		Assert.assertEquals(true, daPage.applicationIsDisplayed());
	}

	public void backToSummaryPage() {
		daPage.pause(6000);
		daPage.backToSummaryPage();
		daPage.pause(5000);
	}
	
	public void pause() {
		daPage.pause(5000);
	}
}