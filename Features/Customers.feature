Feature: Customers

  Scenario: Add a new Customer
    Given User launch the Browser
    When User Opens URL "https://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and password as "admin"
    And Click on login
    Then user can view the dashboard
    When user click on customer manu
    And  user click on customer menu item
    And user click on add new button
    Then user can view add new customer page
    And user enter customer info
    And user click on save button
    Then user can view confirmation message "The new Customer has been added Successfully."
    And  Close browser

