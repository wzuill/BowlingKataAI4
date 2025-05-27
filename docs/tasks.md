# BowlingWithAI Improvement Tasks

This document contains a comprehensive list of tasks for developing and improving the BowlingWithAI project. Each task is marked with a checkbox that can be checked off when completed.

I will create all tasks.  For the time being, you do not need to create any tasks
## Project Setup and Architecture

1. [ ] Create a test that proves that a BowlingGame object can be instantiated. It should be a failing test.
2. [ ] Create code to fulfill the currently failing test
3. [ ] Create a test of a gutter game.  
4. [ ] Make the gutterGame test pass.
5. [ ] Do TDD for a game where each of 20 balls knocks down one pin.
6. [ ] Refactor the duplicate code in the test file.
7. [ ] Do TDD for a game with one spare in the first frame.  In the second frame the first roll will knock down 4 pins, and all other rolls in the game will knock down 0 pins.
8. [ ] Do TDD for a game with one strike in the first frame. In the second frame the first roll will knock down 7 pins, and all other rolls in the game will knock down 0 pins.
9. [ ] Do TDD for a game with one strike in the first frame. In the second frame the first roll will knock down 2 pins and the second roll will knock down 1 pin, and all other rolls in the game will knock down 0 pins.
10. [ ] Do TDD for a perfect game.
11. [ ] Do a test for a game with frames that have spares, strikes, and non-bonus frames.  
12. [ ] Do a similar test with something special at the end that we haven't covered yet.
13. [ ] Make any test that you can concoct for functionally that is not yet covered.
14. [ ] Test a Spare in the 10th from with a strike as a bonus, and a strike in the 10th from with a spare as the bonus
15. [ ] Some comments in the tests are an indication that we need to refactor so the code expresses its intention better.