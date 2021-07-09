Feature:  Login data creation

#  Scenario: Check if the user is able to login with valid_user credentials
#    Given I have opened the browser
#    And User is on the stage site with login screen
#    When I entering correct username and I enter correct password from the excel file /home/addweb/IdeaProjects/Gaa_new/excel_list/cucumberBDD.xlsx
#    When I am doing a click on the login button
#    Then I get redirected to the same page of the site with validations
#    Then Close the browser

# Data driven by Passing the credentials from Feature file

#  Scenario: Check if the user is able to login with valid_user credentials
#    Given I have opened the browser
#    And User is on the stage site with login screen
#    When I entering correct "addweb" and I enter correct "testing@123"
#    When I am doing a click on the login button
#    Then I get redirected to the same page of the site with validations
#    Then Close the browser

#Data driven testing by passing parameters from the Feature file
#  Scenario: Check if the user is able to login with valid_user credentials
#    Given I have opened the browser
#    And User is on the stage site with login screen
#    When I entering correct username and I enter correct password
#      | Username_123 | Password_123 |
#      | Username_456 | Password_456 |
#
#    When I am doing a click on the login button
#    Then I get redirected to the same page of the site with validations
#    Then Close the browser

  Scenario: Check if the user is able to login with valid_user credentials
    Given I have opened the browser
    And User is on the stage site with login screen
    When User enters correct credentials with data in excel at "/Users/addweb/IdeaProjects/Cucumber_Setup/Features/ExcelData.feature"
    When I am doing a click on the login button
    Then Close the browser