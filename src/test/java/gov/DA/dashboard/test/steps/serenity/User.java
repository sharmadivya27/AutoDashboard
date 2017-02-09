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

	public void fillInForm(String user, String password) {
		if ((user.equals("158338199") || (user.equals("049828525")))) {
			daPage.logIntoDashboard(user, password);
			daPage.pause(9000);
		} else {
			daPage.logIntoDashboard(user, password);
			daPage.pause(6000);
		}
	}

	public void onSummaryPage(String user) {
			daPage.openAt("https://staging.disasterassistance.gov/ca-dashboard/summary");
			daPage.pause(4000);
	}

	public void notificationDisplayed(String user) {
		if ((user.equals("158338199")) || (user.equals("049828525"))) {
			daPage.pause(3000);
			Assert.assertEquals(true, daPage.notificationIsDisplayed());
		} else {
			Assert.assertEquals(true, daPage.notificationIsDisplayed());
		}
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
		} else if ((user.equals("735213161")) || (user.equals("265798306"))) {
			Assert.assertEquals(5, daPage.getNumFoaResults());
		} else if ((user.equals("594575741")) || (user.equals("333011005")) || (user.equals("333011006"))) {
			Assert.assertEquals(1, daPage.getNumFoaResults());
		} else if ((user.equals("333011003")) || (user.equals("333011004"))) {
			Assert.assertEquals(3, daPage.getNumFoaResults());
		} else {
			Assert.assertEquals(78, daPage.getNumFoaResults());
		}
	}

	public void reviewApplicationPage(String user) {
		daPage.pause(7000);
		if ((user.equals("049828525")) || (user.equals("430991038"))) {
			daPage.clickReviewApplication2();
		} else if (!(user.equals("333011007"))) {
			daPage.clickReviewApplication();
		}
		daPage.pause(8000);
	}

	public void viewMailingAddress(String user) {
		goToApplicantTab();
		boolean address = daPage.addressBoxIsDisplayed();
		Assert.assertEquals(true, address);
	}

	public void updateMailingInfo() {
		goToApplicantTab();
		Assert.assertEquals("UPDATE SUCCESS", daPage.updateMailingAddress());
		daPage.pause(4000);
	}

	public void mailingInfoSaved() {
		goToApplicantTab();
		daPage.pause(2000);
		Assert.assertEquals("430 MARKET ST", daPage.mailingStreetMatches());
		Assert.assertEquals("WINCHESTER", daPage.mailingCityMatches());
		Assert.assertEquals("22603", daPage.mailingZipcodeMatches());
	}

	public void viewPhoneNumber(String user) {
		boolean phoneNumber = daPage.phoneNumberIsDisplayed();
		Assert.assertEquals(true, phoneNumber);
	}

	public void updatePhoneInfo(String user) {
		Assert.assertEquals("UPDATE SUCCESS", daPage.updatePhoneInformation());
		daPage.pause(4000);
	}

	public void phoneInfoSaved() {
		daPage.pause(4000);
		Assert.assertEquals("(222) 222-2222", daPage.damagedPhoneMatches());
		Assert.assertEquals("(333) 333-3333", daPage.currentPhoneMatches());
	}

	public void viewBankInformation(String user) {
		if ((user.equals("430993352")) || (user.equals("786787687")) || (user.equals("158338199"))) {
			Assert.assertEquals(true, daPage.bank2IsDisplayed());
		} else if ((user.equals("735151123")) || (user.equals("265798306"))) {
			Assert.assertEquals(true, daPage.bank3IsDisplayed());
		} else {
			Assert.assertEquals(true, daPage.bankIsDisplayed());
		}
	}

	public void updateBankInfo(String user) {
		Assert.assertEquals("UPDATE SUCCESS", daPage.updateBankInformation());
		daPage.pause(3000);
	}

	public void bankInfoSaved() {
		daPage.pause(2000);
		Assert.assertEquals("BBT", daPage.bankInstitutionMatches());
		Assert.assertEquals("Checking", daPage.bankAccountMatches());
		Assert.assertEquals("*****3123", daPage.bankRoutingMatches());
		Assert.assertEquals("*************2312", daPage.bankAccountNumber());
	}

	public void viewInsuranceInformation(String user) {
		//daPage.pause(3000);
		boolean insurance = daPage.insuranceIsDisplayed();
		Assert.assertEquals(true, insurance);
	}

	public void updateInsuranceInfo(String user) {
		daPage.pause(4000);
		if (!(user.equals("875473101"))) {
			Assert.assertEquals("UPDATE SUCCESS", daPage.updateInsuranceInformation());
		}
		daPage.pause(3000);
	}

	public void insuranceInfoSaved(String user) {
		daPage.pause(2000);
		if (!(user.equals("875473101"))) {
			Assert.assertEquals("ALLSTATE", daPage.insuranceCompanyMatches());
			Assert.assertEquals("123123123", daPage.policyNumberMatches());
			Assert.assertEquals("(222) 222-2222", daPage.insurancePhoneNumberMatches());
		}
	}

	public void onSummaryPage() {
		daPage.openAt("https://staging.disasterassistance.gov/ca-dashboard/summary");
		daPage.pause(4000);
	}

	public void logOutDashboard() {
		daPage.logout();
	}

	public void getCurrentUrl() {
		String url = daPage.getUrl();
		Assert.assertEquals("https://staging.disasterassistance.gov/dare", url);
	}

	public void goToApplicantTab() {
		daPage.clickApplicantTab();
		daPage.pause(3000);
	}
}