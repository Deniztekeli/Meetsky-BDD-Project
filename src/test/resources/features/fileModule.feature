Feature: Files module


  Background:
    Given the user is on the login page

  @wip @ETSKY-928
  Scenario: User can create a new folder
    Given User is on the Files page
    When User clicks on the + button
    And User clicks on the "New folder" button
    And User enter new folder name and press enter
    Then New folder is displayed on the page

  @wip
  Scenario: User can move or copy any selected item to any folder
    Given User is on the Files page
    When User clicks on the three dots button of "Folder1"
    And  User clicks on the Move or copy button
    And User clicks on the one of the folders
    And User clicks on the move button
    Then User move the chosen file to new folder

  @wip
  Scenario: User can delete any selected item from its three dots menu
    Given User is on the Files page
    When User clicks on the three dots button of "deleted folder"
    And User clicks on the delete folder button
    And User clicks on the Deleted files button
    Then Deleted file is displayed on the page

  @wip
  Scenario: User can see the total number of files and folders under the files list table
    Given User is on the Files page
    Then The total number of files and folders are displayed under the files list table

  @wip
  Scenario: User can create a new text document
    Given User is on the Files page
    When User clicks on the + button
    And User clicks on the "New text file" button
    And User enter file name and press enter
    Then New text file is displayed on the page






