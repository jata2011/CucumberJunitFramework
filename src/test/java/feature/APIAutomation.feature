Feature: Pet Management

  Scenario: Create update and Delete a PET
    Given I have a PET with name "Fido"
    When I create the PET
    Then the PET is created successfully
    When I update the PET name to "Buddy"
    Then Pet is updated to "Buddy"
    When I delete the PET
    Then the PET is deleted successfully with status code 200
