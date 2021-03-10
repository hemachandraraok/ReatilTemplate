Feature: order tshirt

  @order
  Scenario: verify order confirmation in order history page
    Given I am on homepage
    When I sign in
    And I order a tshirt
    Then I should see my order in order history


  @update
  Scenario: update personal information
    Given I am on homepage
    When I sign in
    And I update my personal information
    Then my personal information is saved