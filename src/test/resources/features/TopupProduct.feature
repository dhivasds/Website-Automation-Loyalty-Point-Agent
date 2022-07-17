Feature: Topup Product
  As a admin
  I want to access Topup Product
  So that I successfully to access topup product


  Scenario Outline: Add Topup Product Functionality
    Given I am on the admin page
    When I click button Add New
    And I input field "<name>" name in top up product
    And I input field "<amount>" amount in top up product
    And I input field "<grossAmount>" gross amount in top up product
    And I click submit
    Then I get the "<result>" top up product
    Examples:
      | name | amount | grossAmount | result |
      | Topup 250K  | 250000  | 251000 | redirectTopupProductPage   |
      | Topup 250K  | string  | 251000 | noValidationData           |
      | Topup 250K  | 250000  | string | noValidationData           |
      |             | 250000  | 251000 | noValidationData           |
      | Topup 250K  |         | 251000 | noValidationData           |
      | Topup 250K  | 250000  |        | noValidationData           |

  Scenario Outline: Edit Topup Product Functionality
    Given I am on the admin page
    When I click button Add New
    And I input field "<name>" name in top up product
    And I input field "<amount>" amount in top up product
    And I input field "<grossAmount>" gross amount in top up product
    And I click submit
    Then I get the "<result>" top up product
    Examples:
      | name | amount | grossAmount | result |
      | Topup 250K  | 250000  | 251000 | redirectTopupProductPage   |
      | Topup 250K  | string  | 251000 | noValidationData           |
      | Topup 250K  | 250000  | string | noValidationData           |
      |             | 250000  | 251000 | noValidationData           |
      | Topup 250K  |         | 251000 | noValidationData           |
      | Topup 250K  | 250000  |        | noValidationData           |


  Scenario: As a admin, i want to delete Top up Product
    Given I am on the admin page
    When I click button delete
    Then I get the result top up product

  Scenario: As a admin, i want to search Top up Product
    Given I am on the admin page
    When I click button search
    And I input field search topup product
    Then I get the result product using search


