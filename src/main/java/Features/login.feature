Feature: Login

  @sanity
  Scenario: Successful Login with valid credential
    Given User Launch chrome browser
    When User opens Url "https://admin-demo.nopcommerce.com/login"
    And User enters email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then Page title should be "Dashboard / nopCommerce administration"
    When User click on log out link
    Then Page title should be "Your store. Login"
    And close brower

    @regression
  Scenario Outline: Login data driven
    Given User Launch chrome browser
    When User opens Url "https://admin-demo.nopcommerce.com/login"
    And User enters email as "<Email>" and Password as "<Password>"
    And Click on Login
    Then Page title should be "Dashboard / nopCommerce administration"
    When User click on log out link
    Then Page title should be "Your store. Login"
    And close brower

    Examples:
      | Email                | Password |
      | admin@yourstore.com  | admin    |
      | admin1@yourstore.com | admin123 |

