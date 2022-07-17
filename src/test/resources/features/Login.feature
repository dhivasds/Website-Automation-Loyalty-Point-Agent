#Feature: Login
#  As a admin
#  I want to login
#  So that I can access admin page
#
#  Scenario Outline: Login Functionality
#    Given I am on the homepage page
#    When I click button signin
#    And I input "<email>" email
#    And I input "<password>" password
#    And I click button login
#    Then I get the "<result>"
#    Examples:
#      | email| password | result |
#      |admin@gmail.com   | password      | redirectAdminPage      |
#      |random@gmail.com  | password      | accountNotRegistered   |
#      |admin             | password      | invalidEmail           |
#      |admin@gmail.com   | password2     | invalidPassword        |
#      |admin@gmail.com   | pass          | lessPassword           |
#      |                  | password      | emailRequired          |
#      |admin@gmail.com   |               | passwordRequired       |
#
#
#
