Feature: Verify RBA Payment and Infrastructure

  Scenario: Navigate RBA Payment and Infrastructure
    Given I am on the RBA website homepage "https://www.rba.gov.au/"
    When I click on "Payments & Infrastructure"
    Then I verify that the page has updated information "Payments & Infrastructure"
    And I click on "Payments System" from the left menu
    And I click on "Non-cash Payments" from the On This page list
    Then I verify that I am taken to the "Non-cash Payments" section