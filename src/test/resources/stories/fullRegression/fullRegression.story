Narrative:
In order to  assert that the dashboard functionality of https://www.disasterassistance.gov/ is working
As a  tester
I want to  run the daily regressions at least twice a day 

Scenario: Logging into Disaster Assistance dashboard 
Meta: @skip
Given the user is on the dashboard page
When the user logs into the dashboard with <username> and <password>
Then they should see the summary page with <username>
Then the user logs out of the dashboard
Then they should see the home page

Examples:
|username|password|
|430990610|1960-9-15|
|786787687|1984-1-1|
|158338199|1966-6-6|
|430993352|1987-12-12|
|875473101|1979-1-2|
|735213161|1968-05-01|
|594575741|1961-01-01|
|333011003|1990-01-04|
|333011004|1990-01-05|
|333011005|1990-01-06|
|333011006|1990-01-07|
|333011007|1990-01-08|
|049828525|1971-11-11|
|001010001|1919-12-12| 
|735151123|1968-05-01| 
|735251523|1968-05-01| 

Scenario: View all application information
Meta: @skip
Given the user is on the dashboard page
When the user logs into the dashboard with <username> and <password> 
Then the user reviews the application with <username>
Then the user should view mailing address information
Then the user should view phone number information
Then the user should view electronic fund information
Then the user should view insurance information
Then the user logs out of the dashboard
Then they should see the home page

Examples:
|username|password|
|430990610|1960-9-15|
|786787687|1984-1-1|
|158338199|1966-6-6|
|049828525|1971-11-11|
|735251523|1968-05-01|

Scenario: View notifications on homepage
Meta: @skip
Given the user is on the dashboard page
When the user logs into the dashboard with <username> and <password>
Then the user is on the summary page with <username>
Then the notification should be displayed
Then the user logs out of the dashboard
Then they should see the home page

Examples:
|username|password|
|430990610|1960-9-15|
|786787687|1984-1-1|
|158338199|1966-6-6|
|049828525|1971-11-11|
|735251523|1968-05-01|

Scenario: View personalized list of FOAs from the additional resources
Meta: @skip
Given the user is on the dashboard page
When the user logs into the dashboard with <username> and <password>
Then the user views additional resources with the <username>
Then the user should view the list of FOAs with <username>
Then the user logs out of the dashboard
Then they should see the home page

Examples:
|username|password|
|430990610|1960-9-15|
|158338199|1966-6-6|
|049828525|1971-11-11|
|735251523|1968-05-01|
|786787687|1984-1-1|

Scenario: Mailing address information is saved
Meta: @skip 
Given the user is on the dashboard page
When the user logs into the dashboard with <username> and <password>
Then the user reviews the application with <username>
Then the user should update mailing address information
Then the user goes back to the summary page
Then the user reviews the application with <username>
Then the user should see their saved mailing information
Then the user logs out of the dashboard
Then they should see the home page

Examples:
|username|password|
|430990610|1960-9-15|
|158338199|1966-6-6|
|735251523|1968-05-01|
|786787687|1984-1-1|

Scenario: Phone number information is updated and saved
Meta: @skip
Given the user is on the dashboard page
When the user logs into the dashboard with <username> and <password>
Then the user reviews the application with <username>
Then the user should update phone number information with <username>
Then the user goes back to the summary page
Then the user reviews the application with <username>
Then the user should see their saved phone number information
Then the user logs out of the dashboard
Then they should see the home page

Examples:
|username|password|
|430990610|1960-9-15|
|158338199|1966-6-6|
|786787687|1984-1-1|
|049828525|1971-11-11|

Scenario: Update electronic fund application information
Meta: @skip
Given the user is on the dashboard homepage
When the user reviews the application
Then the user should update electronic fund information

Scenario: Electronic fund information is saved 
Meta: @skip
Given the user is on the dashboard homepage
When the user reviews the application 
Then the user should see their saved information

Scenario: Logging into the dashboard
Meta: 
Given the user is on the dashboard page
When the user logs into the dashboard
Then they should see the the summary page 

Scenario: Update insurance application information
Meta: 
Given the user is on the dashboard homepage
When the user reviews the application
Then the user should update insurance information

Scenario: Insurance application information is saved
Meta: @skip
Given the user is on the dashboard homepage
When the user reviews the application
Then the user should see their saved insurance information 

Scenario: Logging out of the dashboard
Meta: @skip
Given the user is on the dashboard page
When the user logs out of the dashboard 
Then they should see the home page