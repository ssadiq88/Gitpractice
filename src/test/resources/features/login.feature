Feature: This feature is use for testing UI of retail page


@test
  Scenario: Verify user can search a product
    Given User is on retail website
    When User search for "pokemon" prodcut
    Then The product should be displayed
