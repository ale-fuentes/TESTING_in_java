Feature: Game Rock, Paper, or Scissors

  Scenario: the user wins when choose Rock and computer choose Scissors
    Given the user will choose "rock"
    And the computer will choose "scissors"
    When they play
    Then verify that the computer chose "scissors"
    And user wins

  Scenario: the user wins when choose Scissors and computer choose Paper
    Given the user will choose "scissors"
    And the computer will choose "paper"
    When they play
    Then verify that the computer chose "paper"
    And user wins

  Scenario: the user wins when choose Paper and computer choose Rock
    Given the user will choose "paper"
    And the computer will choose "rock"
    When they play
    Then verify that the computer chose "rock"
    And user wins

  Scenario: the user wins when choose Rock and computer choose Paper
    Given the user will choose "rock"
    And the computer will choose "paper"
    When they play
    Then verify that the computer chose "paper"
    And user lose

  Scenario: the user wins when choose Paper and computer choose Scissor
    Given the user will choose "paper"
    And the computer will choose "scissors"
    When they play
    Then verify that the computer chose "scissors"
    And user lose

  Scenario: the user wins when choose Rock and computer choose Paper
    Given the user will choose "rock"
    And the computer will choose "paper"
    When they play
    Then verify that the computer chose "paper"
    And user lose

  Scenario: the user wins when choose Rock and computer choose Rock
    Given the user will choose "rock"
    And the computer will choose "rock"
    When they play
    Then verify that the computer chose "rock"
    And both tie