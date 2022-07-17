Feature: Subscriber
  As a admin
  I want to see subscriber
  So that i can see subscriber

  Scenario: As a admin, i want to find subscriber
    Given I am on the admin page
    When I click sidebar Subscriber
    And I click button search
    And I input field search subscriber
    Then I get the result subscriber using search


  Scenario: As a admin, i want to delete subscriber
    Given I am on the admin page
    When I click sidebar Subscriber
    And I click button delete
    Then I get the result subscriber

