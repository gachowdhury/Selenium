Feature: Automate Leaftaps Application

Scenario: TC001_login and logout

Given Launch chrome browser and load url
And enter username as DemoSalesManager
And enter password as crmsfa
When click the login button
Then its navigated Homepage
And click the logout button
And close browser