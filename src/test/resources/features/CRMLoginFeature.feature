
Feature: CRM Login Feature
  
  Scenario: Free CRM Login Scenario
    
    Given User is already on Login Page
    When User enters credentials
    			| Username | Password |
    			| nirmalyabasu1992@gmail.com | Selenium@041992 |
    Then Should display home page
    Then Close the browser    
    
    