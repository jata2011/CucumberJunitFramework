Feature: Verify RBA Payment and Infrastructure

  #Multiline comment - Ctrl +/
# e.g. without Examples keyword

  Scenario Outline: Navigate RBA Payment and Infrastructure
    Given I am on the RBA website homepage "<URL>"
    When I click on "<topMenuItem>"
    Then I verify that the page has updated information "topMenuItem"
    And I click on "<subMenuItem>" from the left menu
    And I click on "<childSubMenuItem>" from the On This page list
    Then I verify that I am taken to the "<childSubMenuItem>" section

    Examples:
     |URL                     | topMenuItem               | subMenuItem                 | childSubMenuItem        |
     |https://www.rba.gov.au/ | Payments & Infrastructure | Payments System             | Non-cash Payments       |
     |https://www.rba.gov.au/ | Financial Stability       | What is Financial stability | Role of the Reserve Bank|


#    Scenario: Search for a job "<jobsearch>"
#      Given  I am on the RBA website homepage "https://www.rba.gov.au/"
#      When I enter search criteria "<SearchTerm>"
#      And I click on Search button
#      Then Search result with <"SearchTerm>" should appear