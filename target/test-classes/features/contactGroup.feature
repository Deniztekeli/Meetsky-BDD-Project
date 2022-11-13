Feature: Contact Group Functionality
  Agile Story: As a user, I should be able to create a new group and add any contact into a group under Contacts module


  Background:
    Given the user is on the login page
    And the user enters the contacts menu

  @ETSKY-898
  Scenario: Creating a new group under Contacts Module
    When user click plus + sign on Groups tab
    And user enter a group name
    Then user should able to create a new group successfully

  @ETSKY-899
  Scenario: Creating a new group under Contacts Module with already existing group name
    When user click plus + sign on Groups tab
    And user enter an already existed group name
    Then user should not able to create a new group

  @ETSKY-901
  Scenario: Seeing all available group names in a contact's info menu.
    When user click on the Not grouped icon on the left side menu
    And select one of those existing contacts
    And click on the group dropdown menu where places contact's info menu
    Then user should able to see all group names

  @ETSKY-900
  Scenario: Adding existing contact by choosing a group to the group dropdown menu
    When user click on the Not grouped icon on the left side menu
    And select one of those existing contacts
    And click on the group dropdown menu where places contact's info menu
    And select one of those group names
    Then user should see selected contact is under the selected group menu

  @ETSKY-902
  Scenario: Adding a new property as Birthday to the contact's info page
    When user click the any contact from the list
    And user click the dropdown menu under the Add new property
    And user click the Birthday property
    Then user should able to see Birthday property in the contact info page