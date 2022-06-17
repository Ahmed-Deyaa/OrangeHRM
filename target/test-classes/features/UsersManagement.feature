Feature: Users Management
  In order to give access to users
  As a system admin
  I want to load users page successfully

  @smokeTest @regression
  Scenario Outline: open users page successfully

    Given user navigates to orange website <url>
    When  user enters valid <username> and <password>
    And   user clicks on login button
    Then  user navigates to home page successfully
    When  user hover over admin Tab
    And   user hover over userManagement Tab
    And   user click on users tab
    Then  user navigates to users page successfully

    Examples:
    |url|username|password|
    |"https://opensource-demo.orangehrmlive.com/"|"Admin"|"admin123"|

