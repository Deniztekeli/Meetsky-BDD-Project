@ETSKY-918 @wip
Feature: Add to Favorites/Rename/Comment on File Functionality
  Agile story: As a user, I should be able to add a file to favorites,
  rename any file and give some comments on any file.

  Background:
    Given the user is on the login page
    And the user enter the files section

  @ETSKY-914
  Scenario: Adding any file to favorites by clicking tree dots menu
    When user click three dots of the created file
    And user select add to favorites link
    Then user should see selected file has a star icon

  @ETSKY-915
  Scenario: Renaming any file from its own tree dots menu
    When user click three dots of the created file 2
    And user select rename and write new name and click enter
    Then user should see new name on the file

  @ETSKY-916
  Scenario: Putting some comments on any file from the file details menu
    When user click icon next to tree dots
    And user select comment section
    Then user should be able to add comments

  @ETSKY-917
  Scenario: Deleting the comment made on file details menu
    When user click on three dots and select details option
    And user click on comment button
    Then user click three dots of any comment and select delete