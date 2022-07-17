Feature: Quota Product
  As a admin
  I want to access quota Product
  So that I successfully to access quota product

  Scenario Outline: Add Quota Product Functionality
    Given I am on the admin page
    When I click sidebar Quota Product
    And I click button Add New
    And I input field "<name>" name in quota product
    And I input field "<description>" description in quota product
    And I input field "<stock>" stock in quota product
    And I input field "<providerId>" provider id in quota product
    And I input field "<grossAmount>" gross amount in quota product
    And I input field "<providerName>" provider name in quota product
    And I click submit
    Then I get the "<result>" quota product
    Examples:
      | name | description | stock | providerId | grossAmount | providerName | result |
      | Quota 25GB  | Quota Utama 25GB 1 Bulan  | 15      | 3      | 85000  | By U  | redirectTopupProductPage |
      | Quota 25GB  | Quota Utama 25GB 1 Bulan  | 0       | 3      | 85000  | By U  | noValidationData |
      | Quota 25GB  | Quota Utama 25GB 1 Bulan  | String  | 3      | 85000  | By U  | noValidationData |
      | Quota 25GB  | Quota Utama 25GB 1 Bulan  | 15      | String | 85000  | By U  | noValidationData |
      | Quota 25GB  | Quota Utama 25GB 1 Bulan  | 15      | 3      | String | By U  | noValidationData |
      |             | Quota Utama 25GB 1 Bulan  | 15      | 3      | 85000  | By U  | noValidationData |
      | Quota 25GB  |                           | 15      | 3      | 85000  | By U  | noValidationData |
      | Quota 25GB  | Quota Utama 25GB 1 Bulan  |         | 3      | 85000  | By U  | noValidationData |
      | Quota 25GB  | Quota Utama 25GB 1 Bulan  | 15      |        | 85000  | By U  | noValidationData |
      | Quota 25GB  | Quota Utama 25GB 1 Bulan  | 15      | 3      |        | By U  | noValidationData |
      | Quota 25GB  | Quota Utama 25GB 1 Bulan  | 15      | 3      | 85000  |       | noValidationData |



  Scenario Outline: Edit Quota Product Functionality
    Given I am on the admin page
    When I click sidebar Quota Product
    And I click button Add New
    And I input field "<name>" name in quota product
    And I input field "<description>" description in quota product
    And I input field "<stock>" stock in quota product
    And I input field "<providerId>" provider id in quota product
    And I input field "<grossAmount>" gross amount in quota product
    And I input field "<providerName>" provider name in quota product
    And I click update
    Then I get the "<result>" quota product
    Examples:
      | name | description | stock | providerId | grossAmount | providerName | result |
      | Quota 25GB  | Quota Utama 25GB 1 Bulan  | 15      | 3      | 85000  | By U  | redirectTopupProductPage |
      | Quota 25GB  | Quota Utama 25GB 1 Bulan  | 0       | 3      | 85000  | By U  | noValidationData |
      | Quota 25GB  | Quota Utama 25GB 1 Bulan  | String  | 3      | 85000  | By U  | noValidationData |
      | Quota 25GB  | Quota Utama 25GB 1 Bulan  | 15      | String | 85000  | By U  | noValidationData |
      | Quota 25GB  | Quota Utama 25GB 1 Bulan  | 15      | 3      | String | By U  | noValidationData |
      | Quota 25GB  | Quota Utama 25GB 1 Bulan  | 15      | 3      | 85000  | By U  | noValidationData |
      |             | Quota Utama 25GB 1 Bulan  | 15      | 3      | 85000  | By U  | noValidationData |
      | Quota 25GB  |                           | 15      | 3      | 85000  | By U  | noValidationData |
      | Quota 25GB  | Quota Utama 25GB 1 Bulan  |         | 3      | 85000  | By U  | noValidationData |
      | Quota 25GB  | Quota Utama 25GB 1 Bulan  | 15      |        | 85000  | By U  | noValidationData |
      | Quota 25GB  | Quota Utama 25GB 1 Bulan  | 15      | 3      |        | By U  | noValidationData |
      | Quota 25GB  | Quota Utama 25GB 1 Bulan  | 15      | 3      | 85000  |       | noValidationData |



  Scenario: As a admin, i want to delete Quota Product
    Given I am on the admin page
    When I click sidebar Quota Product
    And I click button delete
    Then I get the result quota product

  Scenario: As a admin, i want to search Quota Product
    Given I am on the admin page
    When I click sidebar Quota Product
    And I click button search
    And I input field search quota product
    Then I get the result quota product using search
