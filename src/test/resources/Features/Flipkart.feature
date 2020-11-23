Feature: Verify the Links are broken

  Scenario: validate source and destinations
    Given launching frontier browser
    When entered the source and destinations
    And click login button
    Then verify link is live