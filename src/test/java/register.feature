Feature: log in işlemi
  Scenario Outline: login olabilme işlemi

    When navigate to site
    Then click sign in button

    When name "<name>" giriniz
    Then email "<email>" giriniz
    Examples:
      | name | email |

|      mehmet| mehmetgokmen@hjashdh|
    |ali         |teto@gmail           |