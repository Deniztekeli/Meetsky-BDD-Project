Feature: Login features

  Background:
    Given the user is on the login page
    When the user clicks on the Profile button
    And the user clicks Settings button under the Profile option

  @ETSKY-919
    Scenario: see personal info under Profile Settings page
    Then user should see Full name, Email, and Phone Number options

  @smoke
  @ETSKY-920
  Scenario: change "Full name" info under Profile Settings page
    When the user clicks under the Full name tab
    And the user deletes the existing contact name
    Then user writes a new Full name on the tab

 @ETSKY-921
 Scenario: make "Phone number" info as private under Profile Settings page
   When the user clicks the dropdown of Phone number
   Then user able to click 'Private' option

  @ETSKY-923
   Scenario: see the current local time under the Locale dropdown
     When the user goes to the Locale dropdown
     Then user should see the current local time under dropdown
