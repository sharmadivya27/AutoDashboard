Narrative:
In order to  assert that the dashboard functionality of https://www.disasterassistance.gov/ is working
As a  tester
I want to  run the daily regressions at least twice a day 

Scenario: View notifications on homepage
Meta: @skip
Given the user is on the dashboard page
When the user logs into the dashboard with <username> and <password> 
Then the user is on the summary page with <username>
Then the notification should be displayed with <username>
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
|430991038|1987-3-26|
|265798306|1966-12-12|

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
|430991038|1987-3-26|
|265798306|1966-12-12|

Scenario: All information is updated and saved
Meta: 
Given the user is on the dashboard page
When the user logs into the dashboard with <username> and <password> 
Then the user reviews the application with <username>
Then the user should view mailing address information with <username>
Then the user should view phone number information with <username>
Then the user should view insurance information with <username>
Then the user should update mailing address information
Then the user should update phone number information with <username>
Then the user should update insurance information with <username>
Then the user goes back to the summary page
Then the user reviews the application with <username>
Then the user should see their saved mailing information
Then the user should see their saved phone number information
Then the user should see their saved insurance information with <username>
Then the user logs out of the dashboard
Then they should see the home page

Examples:
|username|password|
|430990610|1960-9-15|

Scenario: Electronic fund application information is updated and saved 
Meta: @skip
Given the user is on the dashboard page
When the user logs into the dashboard with <username> and <password> 
Then the user reviews the application with <username>
Then the user should view electronic fund information with <username>
Then the user should update electronic fund information with <username>
Then the user goes back to the summary page
Then the user reviews the application with <username>
Then the user should see their saved bank information 
Then the user logs out of the dashboard
Then they should see the home page

Examples:
|username|password|
|430990610|1960-9-15|
|786787687|1984-1-1|
|158338199|1966-6-6|
|430993352|1987-12-12|
|735213161|1968-05-01|
|594575741|1961-01-01|
|333011003|1990-01-04|
|333011004|1990-01-05|
|333011005|1990-01-06|
|333011006|1990-01-07|
|049828525|1971-11-11|
|001010001|1919-12-12| 
|735151123|1968-05-01|  
|735251523|1968-05-01|  
|430991038|1987-3-26|
|265798306|1966-12-12|