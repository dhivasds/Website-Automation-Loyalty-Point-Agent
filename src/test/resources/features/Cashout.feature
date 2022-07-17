Feature: Cashout Product
  As a admin
  I want to access cashout Product
  So that I successfully to access cashout product

  Scenario Outline: Add Cashout Product Functionality
    Given I am on the admin page
    When I click sidebar Cashout Product
    And I click button Add New
    And I input field "<name>" name in cashout product
    And I input field "<coinAmount>" coin Amount in cashout product
    And I input field "<balanceAmount>" balance Amount in cashout product
    And I click submit
    Then I get the "<result>" cashout product
    Examples:
      | name | coinAmount | balanceAmount | result |
      | Cashout 5000  | 5000    | 5000    | redirectCashoutProductPage  |
      | Cashout 5000  | String  | 5000    | noValidationData            |
      | Cashout 5000  | 5000    | String  | noValidationData            |
      |               | 5000    | 5000    | noValidationData            |
      | Cashout 5000  |         | 5000    | noValidationData            |
      | Cashout 5000  | 5000    |         | noValidationData            |


  Scenario Outline: Edit Cashout Product Functionality
    Given I am on the admin page
    When I click sidebar Cashout Product
    And I click button edit
    And I input field "<name>" name in cashout product
    And I input field "<coinAmount>" coin Amount in cashout product
    And I input field "<balanceAmount>" balance Amount in cashout product
    And I click update
    Then I get the "<result>" cashout product
    Examples:
      | name | coinAmount | balanceAmount | result |
      | Cashout 5000  | 5000    | 5000    | redirectCashoutProductPage  |
      | Cashout 5000  | String  | 5000    | noValidationData            |
      | Cashout 5000  | 5000    | String  | noValidationData            |
      |               | 5000    | 5000    | noValidationData            |
      | Cashout 5000  |         | 5000    | noValidationData            |
      | Cashout 5000  | 5000    |         | noValidationData            |


  Scenario: As a admin, i want to delete Cashout Product
    Given I am on the admin page
    When I click sidebar Cashout Product
    And I click button delete
    Then I get the result cashout product

  Scenario: As a admin, i want to search Cashout Product
    Given I am on the admin page
    When I click sidebar Cashout Product
    And I click button search
    And I input field search cashout product
    Then I get the result cashout product using search
