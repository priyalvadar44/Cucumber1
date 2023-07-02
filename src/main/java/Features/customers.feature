Feature: customer

  Background:  Below are the common steps for each scenario
    Given User Launch chrome browser
    When User opens Url "https://admin-demo.nopcommerce.com/login"
    And User enters email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then User can view dashboard

@sanity
  Scenario: Add a new customer
    When User click on customers menu
    And click on customer Menu item
    And click on Add new button
    Then USer can view Add new Customer page
    When User enter customer info
    And click on save button
    Then User can view confirmation message "The new customer has been added successfully"
    And close brower

  @regression
    Scenario: Search customer by EmailId
      When User click on customers menu
      And click on customer Menu item
      And Enter customer email
      When Click on search button
      Then User should found Email in the Search table
      And close brower

    @regression
      Scenario: Search Customer by Name
        When User click on customers menu
        And click on customer Menu item
        And Enter customer FirstName
        And Enter customer LastName
        When Click on search button
        Then User should found Name in the Search table
        And close brower







