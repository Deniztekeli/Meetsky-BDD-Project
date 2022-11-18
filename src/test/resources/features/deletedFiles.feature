
Feature: User Story :

  As a user, I should be able to see all deleted files and delete/restore them permenantly under the Deleted Files tab.

  Acceptance Criteria:

  Background:
    Given the user is on the login page
    And user clicks on files module

    @ETSKY-936
  Scenario: User can see the most recent deleted file in the first line of the deleted file list when deleted files are ordered by newest to oldest
    When user clicks on deleted files sub-module
    And user should see the recent deleted file in the first line of the deletes list
    Then deleted files are ordered by newest to oldest

    @ETSKY-937
  Scenario: User can order the all deleted files by newest to oldest or visa versa
    When user clicks on deleted files sub-module
    #And user clicks on  deleted button to order by newest to oldest or visa versa
    Then user can see deleted item by by newest to oldest or visa versa

    @ETSKY-938
  Scenario: User can order alphabetically all the deleted files based on their names
    When user clicks on deleted files sub-module
    And user clicks on Name button
    Then user can order alphabetically all the deleted files based on their names

    @ETSKY-939
  Scenario: User can delete any deleted file permanently by using the three dots icon in the file’s line
    When user clicks on deleted files sub-module
    And user clicks on three dots
    And users clicks on delete permanently button
    Then user can delete the file permanently from website

    @ETSKY-940 @smoke
  Scenario: User can restore any deleted file and see it again under the All Files tab
    When user clicks on deleted files sub-module
    And user clicks on the restore button near to the three dots' selection
    And user clicks on recent file button
    Then user can see the restored file into the list of file