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

	// Scenario: View notifications on homepage
	// given see above
	
	@Given("the user is on the dashboard page")
	public void givenTheUserIsOnTheDashboardPage() {
		user.onDashboardLoginPage();
	}

	@When("the user logs into the dashboard with <username> and <password>")
	public void whenTheUserLogsIntoDashboard(@Named("username") String username, @Named("password") String password) {
		user.fillInForm(username, password);
	}
	
	@Then("the user is on the summary page with <username>")
	public void whenTheyShouldSeeSummaryPage(@Named("username") String username) {
		user.onSummaryPage(username);
	}	

	@Then("the notification should be displayed with <username>")
	public void notificationShouldBeDisplayed(@Named("username") String username) {
		user.notificationDisplayed(username);
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

	// Scenario: Update all information

	@Then("the user reviews the application with <username>")
	public void userReviewsApplication(@Named("username") String username) {
		user.reviewApplicationPage(username);
	}
	
	@Then("the user should view mailing address information with <username>")
	public void userViewsMailingAddressInformation(@Named("username") String username) {
		user.viewMailingAddress(username);
	}
	
	@Then("the user should update mailing address information")
	public void shouldUpdateMailingAddressInformation() {
		user.updateMailingInfo();
	}

	@Then("the user should see their saved mailing information")
	public void shouldSeeSavedMailingInformation() {
		user.mailingInfoSaved();
	}
	
	@Then("the user should view phone number information with <username>")
	public void userViewPhoneNumberInformation(@Named("username") String username) {
		user.viewPhoneNumber(username);
	}

	@Then("the user should update phone number information with <username>")
	public void userShouldUpdatePhoneNumber(@Named("username") String username) {
		user.updatePhoneInfo(username);
	}

	@Then("the user should see their saved phone number information")
	public void shouldSeeSavedPhoneInformation() {
		user.phoneInfoSaved();
	}
	
	@Then("the user should view electronic fund information with <username>")
	public void userViewsElectronicFundInformation(@Named("username") String username) {
		user.viewBankInformation(username);
	}
	
	@Then("the user should update electronic fund information with <username>")
	public void updateElectronicFund(@Named("username") String username) {
		user.updateBankInfo(username);
	}
	
	@Then("the user should see their saved bank information")
	public void shouldSeeSavedInformation() {
		user.bankInfoSaved();
	}
	
	@Then("the user should view insurance information with <username>")
	public void userViewsInsuranceInformation(@Named("username") String username) {
		user.viewInsuranceInformation(username);
	}
	
	@Then("the user should update insurance information with <username>")
	public void userShouldUpdateInsuranceInformation(@Named("username") String username) {
		user.updateInsuranceInfo(username);
	}

	@Then("the user should see their saved insurance information with <username>")
	public void userShouldSeeSavedInsuranceInformation(@Named("username") String username) {
		user.insuranceInfoSaved(username);
	}

	@Then("the user goes back to the summary page")
	public void goBackToSummaryPage() {
		user.onSummaryPage();
	}

	@Then("the user logs out of the dashboard")
	public void userLogsOutDashboard() {
		user.logOutDashboard();
	}

	@Then("they should see the home page")
	public void shouldSeeHomePage() {
		user.getCurrentUrl();
	}
}