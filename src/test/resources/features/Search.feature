Feature: As a sports user, I would like to read about all articles related to sports


  Scenario: Use the search option to find all articles related to ‘sports’. Output the first heading and the last heading returned on the page.
    Given user lands on "Homepage" page
    When user clicks search box
    And user types "sports" into search box and hits the enter
    And list first and last headings on the page





