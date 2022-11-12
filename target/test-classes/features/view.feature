Feature: Folder view features
  As a user, I should be able to change folder view order by using Name/Size/Modified buttons
  Background:
    Given the user is on the login page


Scenario: Changing folder view order by Name
  When user click files menu
  And  user select name option to order the folders
  Then user should see the folders ordered by name



Scenario: Changing folder view order by Size
  When user click files menu
  And  user select size option to order the folders
  Then user should see the folders ordered by size


Scenario: Changing folder view order by Modified
  When user click files menu
  And  user select name option to order the modified
  Then user should see the folders ordered by modified date


Scenario: Changing folder view  by clicking the toggle-view button at the right corner of all files tab screen
  When user click files menu
  And user click the toggle-view button
  Then user should be able to change the view of the folders as side by side and in a column


Scenario: Selecting all the files at once and see the total values of
all files in the first line when clicked on the “select all” checkbox at the left top corner of the list
  When user click files menu
  And user select all the files option
  Then user should be able to select all files at once and should able to see total files number
