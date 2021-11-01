Feature: Flipkart Home Page Scenarios

  
  @P1 @P11
  
  
  Scenario: Electronics Icon
  
  //Given,When,And,Then
  
  
  Given I am on Amazon Home Page
  When I click on Electronics in navbar
  Then I navigate to Electronics Page
  @P2 @setCookies
  Scenario: Amazon Search Bar
    Given I am on Amazon Home Page
    When I searched for 'Oppo'
    Then I clicked on Smartphones & Basic Mobiles

  @P3 @setCookies @Test
  Scenario: Amazon Search Bar2
    Given I am on Amazon Home Page
    When I searched for 'OnePlus'
    Then I clicked on Smartphones & Basic Mobiles

  @P4
  Scenario: Search an item in category
    Given I am on Amazon Home Page
    When I searched for 'soap' in 'BaBy' category

  @P123 @setCookies
  Scenario: Sign in Amazon
    Given I am on Amazon Home Page
    When I clicked on Sign in
      | email      | password     |
      | 9835163901 | Singhal0123@ |

  @42
  Scenario Outline: Home Page Links
    Given I am on Amazon Home Page
    When I click on '<link>'
    Then I validate that page navigates to '<url>' and title contains '<title>'

    Examples: 
      | link        | url                                                                                                                  | title       |
      | Mobiles     | https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles_9292c6cb7b394d30b2467b8f631090a7  | Mobiles     |
      | Electronics | https://www.amazon.in/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics_c5b70a82461a484189e700166599ce9f | Electronics |
      | Fashion     | https://www.amazon.in/gp/browse.html?node=6648217031&ref_=nav_cs_fashion_ad6f81eb5d474066bc9e5788a3c19a28            | Fashion     |
