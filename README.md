# Using Teste in JAVA (Junit, tdd, Mockito)
![](https://img.shields.io/badge/Author-Alejandro_Fuentes_|_fuentesra@hotmail.com-informational?style=flat&logoColor=white&color=4a4c4d)

## Mockito


[Mockito][link-mockito] is framework for unit tests in java.
Your main functionality is creating a simulation the element util for test that don't need to change values in sensivel sources when we do test our funcionality.


### Some tips

* **final class**<br />
how to mock the class that have the propertie `final`, in file configuration of mockito
`resources\mockito-extensions\org.mockito.plugins.MockMaker` : 

```yaml
mock-maker-inline
```

* **primitive obsession**<br />
when we build a classes and set properties using type primitive, but [this site][link-about-primitiveObsession] talk about code smell when is it, and explanation for why is better using type objects. 


## Cucumber

[Cucumber][link-cucumber] is a feature that help us to testing employing BDD (Behavior-Drive Development).
Is a good ideai when coworker don't have knowledge about coding of program, but yes has knowledge about business.

I my example, I use Intellj, them I do install 2 plugins (CTRL + ALT + S):

* Cucumber for Java
* Gerkin

And, I add two depedencies in my project:

```xml
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-java8</artifactId>
            <version>7.0.0</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>7.0.0</version>
            <scope>test</scope>
        </dependency>
```

### Some example with test in cucumber

```
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
```

<!-- link and references -->
[link-mockito]: https://site.mockito.org/
[link-cucumber]: https://cucumber.io/
[link-about-primitiveObsession]: https://blog.koalite.com/2017/09/primitive-obsession-obsession/