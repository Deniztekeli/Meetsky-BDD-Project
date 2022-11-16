Feature: Login features


  Background:
    Given the user is on the login page
    When the user clicks on the Profile button
    And the user clicks Settings button under the Profile option

  @smoketest
    Scenario: see personal info under Profile Settings page
    Then user should see Full name, Email, and Phone Number options
  @smoketest
      Scenario: change "Full name" info under Profile Settings page
        When the user clicks under the Full name tab
        And the user deletes the existing contact name
        Then user writes a new Full name on the tab

  @smoketest
        Scenario: make "Phone number" info as private under Profile Settings page
          When the user clicks the dropdown of Phone number
          Then user able to click 'Private' option
  @smoketest
          Scenario: see the current local time under the Locale dropdown
            When the user goes to the Locale dropdown
            Then user should see the current local time under dropdown
