Feature: Tricentis car insurance form

  Scenario: vehicle insurance quote
    Given go to the website Tricentis
    And enter all vehicle data
    And enter all insurant data
    And enter all product data
    And select price option
    When send quote
    Then valid message email sent successfully