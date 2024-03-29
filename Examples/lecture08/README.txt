AT-M42 Client Server Programming for the Java Plaform
======================================================

Examples for Lecture 8: Unit Testing
---------------------------------------------------

This folder contains all the examples from [Lecture 8](/dokuwiki/at-m42:lecture8). Note that `Game.class` contains a bug that will make some of the tests fail. See the [lecture](/dokuwiki/at-m42:lecture8) for corrections. 

### Classes to be Tested

* [Item.groovy](Item1.groovy) &ndash; an item in the game.
* [Game.groovy](Game.groovy) &ndash; the game class (contains a bug).
* [Player.groovy](Player.groovy) &ndash; the player class (contains a bug).

### Test Cases

* [example1.groovy](example1.groovy) &ndash; Testing with `println`.
* [example2.groovy](example2.groovy) &ndash; Testing with assertions.
* [ItemTest.groovy](ItemTest.groovy) &ndash; Testing with JUnit.
* [GameTest.groovy](GameTest.groovy) &ndash; Testing the `Game` class (complete with some methods commented out).
* [PlayerTest.groovy](PlayerTest.groovy) &ndash; Testing the `Player` class (complete with some methods commented out).

### Test Suites

* [runAllTests.groovy](runAllTests.groovy) &ndash; run all Game/Item tests.
* [runAllTests2.groovy](runAllTests2.groovy) &ndash; run all Game/Item/Player tests.

----

[Home](/dokuwiki/at-m42:home) | [Lectures](/dokuwiki/at-m42:lectures) | [Lecture 8](/dokuwiki/at-m42:lecture8) | [Previous Examples](../lecture06/index.php) | [All Examples](../index.php) | [Next Examples](../lecture10/index.php)
  

