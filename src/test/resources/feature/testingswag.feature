Feature: E-commerce purchase flow

  Scenario Outline: Add items, complete purchase, and verify order confirmation
    Given User is on the Swag Labs homepage And User login with user:
      |<Username>|
      |<Password>|
    When User adds products to the cart "Sauce Labs Backpack" and "Sauce Labs Bike Light"
    And User proceeds to checkout
    And User enters checkout data:
      | <FirstName>|
      |<LastName>|
      |<PostalCode>|
    And User completes the purchase
    Then User can see the order completion message
    And Cart should be empty after purchase

    Examples:
      | Username  | Password   | FirstName | LastName | PostalCode |
      | standard_user | secret_sauce | Soupik      | Das      | 000023      |
      | standard_user  | secret_sauce | Arya      | K    | 90123      |

