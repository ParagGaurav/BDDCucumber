Feature: Login

  Scenario: Successful Login with valid Credentials
    Given User launch the Browser
    When User Opens URL "https://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and password as "admin"
    And Click on login
    Then Page title should be "Dashboard / nopCommerce administration"
    When User Click on Logout Link
    Then Page title should be "Your store. Login"
    And Close browser

#  Scenario Outline: Login Data Driven
#    Given User launch the Browser
#    When User Opens URL "https://admin-demo.nopcommerce.com/login"
#    And User enters Email as "<email>" and password as "<password>"
#    And Click on login
#    Then Page title should be "Dashboard / nopCommerce administration"
#    When User Click on Logout Link
#    Then Page title should be "Your store. Login"
#    And Close browser
#
#    Examples:
#      | email                | password |
#      | admin@yourstore.com  | admin    |
#      | abc@yourstore.com | admin123 |