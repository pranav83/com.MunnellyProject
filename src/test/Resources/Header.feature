@MunnellysHeader
Feature:Verify the header menu
    Background:  Given I open Munnellys homepage
    Scenario:Verify the logo, video and links on header menu

      And I should verify logo present on page
      When I click on the all links in Header Menu
      Then I should Navigate to relevant page
      And I should verify video on homepage;
      And I should verify text on video
      When I click on scroll arrow
      Then page should scroll to our services

