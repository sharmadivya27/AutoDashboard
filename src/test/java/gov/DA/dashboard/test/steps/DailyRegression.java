package gov.DA.dashboard.test.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import gov.DA.dashboard.test.steps.serenity.User;

public class DailyRegression {

	@Steps
	User user;

	// Scenario: Logging into Disaster Assistance dashboard
	@Given("the user is on the dashboard page")
	public void givenTheUserIsOnTheDashboardPage() {
		user.onDashboardLoginPage();
	}

	@When("the user logs into the dashboard with <username> and <password>")
	public void whenTheUserLogsIntoDashboard(@Named("username") String username, @Named("password") String password) {
		user.fillInForm(username, password);
		user.pause();
	}
	
	//****************************************************
	
	@When("the user logs into the dashboard")
	public void whenTheUserLogsIntoDashboard() {
		 user.fillInForm();
	}

	@Then("they should see the summary page with <username>")
	public void thenTheyShouldSeeSummaryPage(@Named("username") String username) {
		user.shouldSeePage(username);
		user.pause();
	}
	
	//*********************************************
	
	@Then("they should see the the summary page")
	public void thenTheyShouldSeeSummaryPage() {
		user.shouldSeePage();
	}

	// Scenario: View all application information

	@Given("the user is on the dashboard homepage")
	public void onDashboardHomepage() {
		user.onDashboardHomePage();
	}

	@Then("the user reviews the application with <username>")
	public void userReviewsApplication(@Named("username") String username) {
		user.reviewApplicationPage(username);
	}
	
	//***************************************
	
	@When("the user reviews the application")
	public void userReviewsApplication() {
		user.reviewApplicationPage();
	}

	@Then("the user should view mailing address information")
	public void userViewsMailingAddressInformation() {
		user.viewMailingAddress();
	}

	@Then("the user should view phone number information")
	public void userViewPhoneNumberInformation() {
		user.viewPhoneNumber();
	}

	@Then("the user should view electronic fund information")
	public void userViewsElectronicFundInformation() {
		user.viewBankInformation();
	}

	@Then("the user should view insurance information")
	public void userViewsInsuranceInformation() {
		user.viewInsuranceInformation();
	}

	// Scenario: View notifications on homepage
	// given see above

	@Then("the user is on the summary page with <username>")
	public void whenTheyShouldSeeSummaryPage(@Named("username") String username) {
		user.onSummaryPage(username);
	}

	@Then("the notification should be displayed")
	public void notificationShouldBeDisplayed() {
		user.notificationDisplayed();
	}

	// Scenario: View personalized list of FOAs from the additional resources
	// given see above

	@Then("the user views additional resources with the <username>")
	public void userViewsAdditionalResources(@Named("username") String username) {
		user.goToAdditionalResources(username);
	}

	@Then("the user should view the list of FOAs with <username>")
	public void userViewsListOfFoasOnAdditionalResources(@Named("username") String username) {
		user.getFoaResults(username);
	}

	// Scenario: Update electronic fund application information
	// given see above
	// when see above

	@Then("the user should update electronic fund information")
	public void updateElectronicFund() {
		user.updateBankInfo();
	}

	// Update mailing address information
	// given see above
	// when see above

	@Then("the user should update mailing address information")
	public void shouldUpdateMailingAddressInformation() {
		user.updateMailingInfo();
	}

	// Scenario: Mailing address information is saved
	// given see above
	// when see above

	@Then("the user should see their saved mailing information")
	public void shouldSeeSavedMailingInformation() {
		user.mailingInfoSaved();
	}

	// Scenario: Update phone number information
	// given see above
	// when see above

	@Then("the user should update phone number information with <username>")
	public void userShouldUpdatePhoneNumber(@Named("username") String username) {
		user.updatePhoneInfo(username);
	}

	// Scenario: Phone number information is saved
	// given see above
	// when see above

	@Then("the user should see their saved phone number information")
	public void shouldSeeSavedPhoneInformation() {
		user.phoneInfoSaved();
	}

	@Then("the user goes back to the summary page")
	public void goBackToSummaryPage() {
		user.backToSummaryPage();
	}

	// Scenario: Electronic fund information is saved
	// given see above
	// when see above

	@Then("the user should see their saved information")
	public void shouldSeeSavedInformation() {
		user.bankInfoSaved();
	}

	// Scenario: Update insurance application information
	// given see above
	// when see above

	@Then("the user should update insurance information")
	public void userShouldUpdateInsuranceInformation() {
		user.updateInsuranceInfo();
	}

	// Scenario: Insurance application information is saved
	// given see above
	// when see above

	@Then("the user should see their saved insurance information")
	public void userShouldSeeSavedInsuranceInformation() {
		user.insuranceInfoSaved();
	}

	// Scenario: Logging out of the dashboard
	// given see above

	@Then("the user logs out of the dashboard")
	public void userLogsOutDashboard() {
		user.logOutDashboard();
		user.pause();
	}

	@Then("they should see the home page")
	public void shouldSeeHomePage() {
		user.getCurrentUrl();
		user.pause();
	}
}