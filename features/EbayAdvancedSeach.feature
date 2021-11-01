Feature: Amazon Electronics Page

  @P12
  Scenario: Select Your Address on Amazon Page
    Given I am on Amazon Electronics  Page
    When I click on Select Your Address
    Then I am navigated to the Modal
    And I entered PIN Code 826001
    And I clicked on Apply
    Then I navigated to the same page

  #@P123 @P121
  #Scenario: Advanced Search an item
    #Given I am on Ebay Advanced Search Page
    #When I advance search an item
      #| email      | password     |
      #| 9835163901 | Singhal0123@ |
