Feature: Pulsa Product
  As a admin
  I want to access pulsa Product
  So that I successfully to access pulsa product

  Scenario Outline: Add Pulsa Product Functionality
    Given I am on the admin page
    When I click sidebar Pulsa Product
    And I click button Add New
    And I input field "<name>" name in pulsa product
    And I input field "<denom>" denom in pulsa product
    And I input field "<stock>" stock in pulsa product
    And I input field "<providerId>" provider id in pulsa product
    And I input field "<grossAmount>" gross amount in pulsa product
    And I input field "<providerName>" provider name in pulsa product
    And I click submit
    Then I get the "<result>" pulsa product
    Examples:
      | name | denom | stock | providerId | grossAmount | providerName | result |
      | Pulsa 50K | 50000  | 9        | 3      | 51000   | By U   | redirectPulsaProductPage |
      | Pulsa 50K | 50000  | 0        | 3      | 51000   | By U   | noValidationData         |
      | Pulsa 50K | string | 9        | 3      | 51000   | By U   | noValidationData         |
      | Pulsa 50K | 50000  | string   | 3      | 51000   | By U   | noValidationData         |
      | Pulsa 50K | 50000  | 9        | string | 51000   | By U   | noValidationData         |
      | Pulsa 50K | 50000  | 9        | 3      | string  | By U   | noValidationData         |
      |           | 50000  | 9        | 3      | 51000   | By U   | noValidationData         |
      | Pulsa 50K |        | 9        | 3      | 51000   | By U   | noValidationData         |
      | Pulsa 50K | 50000  |          | 3      |         | By U   | noValidationData         |
      | Pulsa 50K | 50000  | 9        |        | 51000   | By U   | noValidationData         |
      | Pulsa 50K | 50000  | 9        | 3      |         | By U   | noValidationData         |
      | Pulsa 50K | 50000  | 9        | 3      | 51000   |        | noValidationData         |



  Scenario Outline: Update Pulsa Product Functionality
    Given I am on the admin page
    When I click sidebar Pulsa Product
    And I click button edit
    And I input field "<name>" name in pulsa product
    And I input field "<denom>" denom in pulsa product
    And I input field "<stock>" stock in pulsa product
    And I input field "<providerId>" provider id in pulsa product
    And I input field "<grossAmount>" gross amount in pulsa product
    And I input field "<providerName>" provider name in pulsa product
    And I click update
    Then I get the "<result>" pulsa product
    Examples:
      | name | denom | stock | providerId | grossAmount | providerName | result |
      | Pulsa 50K | 50000  | 9        | 3      | 51000   | By U   | redirectPulsaProductPage |
      | Pulsa 50K | 50000  | 0        | 3      | 51000   | By U   | noValidationData  |
      | Pulsa 50K | string | 9        | 3      | 51000   | By U   | noValidationData  |
      | Pulsa 50K | 50000  | string   | 3      | 51000   | By U   | noValidationData  |
      | Pulsa 50K | 50000  | 9        | string | 51000   | By U   | noValidationData  |
      | Pulsa 50K | 50000  | 9        | 3      | string  | By U   | noValidationData  |
      |           | 50000  | 9        | 3      | 51000   | By U   | noValidationData  |
      | Pulsa 50K |        | 9        | 3      | 51000   | By U   | noValidationData  |
      | Pulsa 50K | 50000  |          | 3      |         | By U   | noValidationData  |
      | Pulsa 50K | 50000  | 9        |        | 51000   | By U   | noValidationData  |
      | Pulsa 50K | 50000  | 9        | 3      |         | By U   | noValidationData  |
      | Pulsa 50K | 50000  | 9        | 3      | 51000   |        | noValidationData  |



  Scenario: As a admin, i want to delete Pulsa Product
    Given I am on the admin page
    When I click sidebar Pulsa Product
    And I click button delete
    Then I get the result pulsa product

  Scenario: As a admin, i want to search Pulsa Product
    Given I am on the admin page
    When I click sidebar Pulsa Product
    And I click button search
    And I input field search pulsa product
    Then I get the result pulsa product using search