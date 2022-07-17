Feature: User
  As a admin
  I want to access detail user
  So that I successfully to access detail user


  Scenario Outline: Edit User Functionality
    Given I am on the admin page
    When I click sidebar User
    And I click button edit
    And I input field "<name>" name in pulsa
    And I input field "<balance>" balance in pulsa
    And I input field "<phone>" phone in pulsa
    And I input field "<coin>" coin in pulsa
    And I click update
    Then I get the "<result>" pulsa
    Examples:
      | name | balance | phone | coin | result |
      | User | 15500     | 08782925251 | 5300   | successUpdateData|
      | User | 15500     | 087         | 5300   | noValidationData |
      | User | String    | 08782925251 | 5300   | noValidationData |
      | User | 15500     | String      | 5300   | noValidationData |
      | User | 15500     | 08782925251 | String | noValidationData |
      |      | 15500     | 08782925251 | 5300   | noValidationData |
      | User |           | 08782925251 | 5300   | noValidationData |
      | User | 15500     |             | 5300   | noValidationData |
      | User | 15500     | 08782925251 |        | noValidationData |



  Scenario: As a admin, i want to search user
    Given I am on the admin page
    When I click sidebar User
    And I click button search
    And I input field search user
    Then I get the result user using search
