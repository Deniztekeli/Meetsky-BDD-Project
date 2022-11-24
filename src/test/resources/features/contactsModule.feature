Feature: Contacts Module Functionality
  Agile Story: As a user, I should be able to create a new contact and edit/delete any contact under Contacts module


  Background:
    Given the user is on the contacts module page
    And the user enters the contacts menu

@ETSKY-951
  Scenario: Creating a new contact under Contacts module
    When user click on new contact
    And user put first name and last name of the contact here
    Then user should able to create a new contact appears in the All contacts list with matching initials

  @ETSKY-952
  Scenario: Seeing contact list when clicked All contact and see the total number as well
    When user click on All contacts
    And user should able to see all contacts
    Then user should see the total number as well

  @ETSKY-953
  Scenario: Changing the profile picture of any contact with a previously uploaded picture by using Choose from files option
    When user click on the Any name on the contact menu
    And select image icon
    And click on the option Choose from files
    And choose any photo from archive
    Then user click on Choose button

  @ETSKY-954
  Scenario: Delete any selected contact
    When user click on the any contact name under Contacts icon
    And click on three vertical ellipsis on the right side of the page
    Then click Delete button
