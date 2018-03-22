Feature:AnimalTest
  Scenario: The fish makes a blurp sound
    Given I have  a fish
    When The fish makes a sound
    Then I expect the sound to be blurp