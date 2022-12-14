@ETSKY-950
Feature: US-011 Tasks Module Functionality
  Agile Story: As a user, I should be able to create a new task list
  or a single task and add any task to completed and importants tasks list.

  Background:
    Given the user is on the login page

    #1_1 --> DONE
  @ETSKY-944
  Scenario: User can create a new list of tasks**
    When User should click TASKS icon at the top
    And Click add list on the left column
    And Enter a list name and click enter
    Then Verify that user can see all the created lists

    #1_2 NEGATIVE --> DONE
  @ETSKY-946
  Scenario: User can not create a new list of tasks with same name
    When User should click TASKS icon at the top
    And Click add list on the left column
    Then Verify that the already exist message is displayed

    #2 --> DONE
  @ETSKY-945
  Scenario: User can create a new task
    When User should click TASKS icon at the top
    And Enter a task name and click enter on Add a task too... box
    Then Verify that user can able to create new task and it should appear on the page

    #3 --> DONE
  @ETSKY-947
  Scenario: User can add any task to the list of completed tasks by clicking on the checkbox near the task name
    When User should click TASKS icon at the top
    And Click on the checkbox near the task name
    Then Verify that the completed task is appeared in the COMPLETED tasks tab

    #4 --> DONE
  @ETSKY-948
  Scenario: User can add any task to the list of important tasks by clicking on the star icon on the right side of task line
    When User should click TASKS icon at the top
    And Click on the star icon on the right side of task line
    Then Verify that the task is appeared in the IMPORTANT tasks tab

    #5 --> DONE
  @ETSKY-949 @smoke
  Scenario: User can see the number of all uncompleted tasks next to the Current tab
    When User should click TASKS icon at the top
    Then Verify that the number of uncompleted tasks next to current tab


