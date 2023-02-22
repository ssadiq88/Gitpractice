Feature: TEK Retail Application Signin feature

  
  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User Click on Sign in option
    And User enter email 'transformer.test@gmail.com' and password 'Tek@123456'
    And User click on login button
    Then User should be logged in into Account

@smokeTest
  Scenario Outline: Verify user can sign in into Retail Application
    Given User is on retail website
    When User Click on Sign in option
    And User enter email 'transformer.test@gmail.com' and password 'Tek@123456'
    And User click on login button
    Then User should be logged in into Account

    Examples: 
      | eamil                       | Password   |
      | transformers@tekschool.us   | Tek@12345  |
      | phantom.tekschool@gmail.com | Tek@12346  |
      
