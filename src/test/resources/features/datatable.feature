Feature: Demonstrating the data table feature of cucumber

  Cucumber provide ability to orginize repeating steps with different data
  using the data table featureand automatically convert the table into
  few known data types supported b cucumber

  Scenario: Petting zoo
    Given I have a "horse"
    And I have a "dog"
    And I have a "turtle"
    And I have a "zebra"
    When I call their names
    Then they come to me

  Scenario: Petting zoo with table
    Given I have following animal
#      if you want it to nicely aligned, Command +Option+L
      | horse  |
      | dog    |
      | turtle |
      | zebra  |
    When I call their names with below names
      | Kira    |
      | Doru    |
      | Tito    |
      | Zemfira |
    Then they come to me with below noise
      | horse  | Nai  |
      | dog    | Woof |
      | turtle | Hiss |
      | zebra  | Bro  |

  @ui@wip
  Scenario: Login to WebOrder app by providing username password in 2 column table

    Given we are at web order login page
    When we provide below credentials
      | username | Tester |
      | password | test   |
    Then we should see all order page

  Scenario: Representing table with heder and more than 2 columns with list of map
#      we want to represent each raw as a map object with column name as key value as cell value
#      since we hvae multiple raw, we want to store all raw map into List of map
    Given this is the prodyct reference

      | Product     | Price | Discount |
      | MyMoney     | 100   | 0.08     |
      | FamilyAlbum | 80    | 0.15     |
      | ScreenSaver | 20    | 0.1      |
