Feature: Contact Us Test
  Scenario: Go to website and test contact us page
    Given navigate to website
    And click on contact us button
    And Select subject headıng
    And type email
    And type order reference
    And type a message
    When Click on submit button
    Then Verify success message

