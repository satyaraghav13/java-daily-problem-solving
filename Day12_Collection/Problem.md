## Problem
Write a Core Java program to check whether a given sentence is a pangram.

A pangram is a sentence that contains all the 26 letters of the English alphabet
at least once.

## Input
String sentence = "The quick brown fox jumps over the lazy dog";

## Output
Pangram

## Explanation
The given sentence contains all English alphabets from 'a' to 'z',
so it is a Pangram.

## Rules
- Use Core Java only
- Use Collection Framework (Set)
- Ignore case sensitivity
- Do not use any inbuilt pangram libraries

## Approach
1. Convert the sentence to lowercase.
2. Create a Set to store unique characters.
3. Traverse the sentence character by character.
4. Add each alphabet character to the Set.
5. If the size of the Set becomes 26, it is a Pangram.
6. Otherwise, it is not a Pangram.
