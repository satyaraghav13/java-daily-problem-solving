## Problem   1
Write a Core Java program to count the frequency of each word
in a given sentence using Collection Framework.

## Input
String sentence = "java is easy and java is powerful";

## Output
java = 2  
is = 2  
easy = 1  
and = 1  
powerful = 1  

## Rules
- Use Collection Framework only
- Use HashMap to store word frequency
- Comparison should be case-insensitive
- Do not use any inbuilt frequency methods

## Approach
1. Convert the sentence to lowercase.
2. Split the sentence into words.
3. Traverse each word and store it in a HashMap.
4. If the word already exists, increase its count.
5. Otherwise, insert the word with count 1.
6. Print all words with their frequencies.






## Problem   02
Write a Core Java program to find the first non-repeating character
in a given string using Collection Framework.

## Input
String input = "swiss";

## Output
w

## Explanation
In the string "swiss":
- s → appears multiple times
- w → appears only once and comes first

So, the first non-repeating character is 'w'.

## Rules
- Use Collection Framework only
- Use LinkedHashMap to maintain insertion order
- Do not use inbuilt frequency methods

## Approach
1. Convert the string to lowercase (optional for case-insensitive check).
2. Traverse the string character by character.
3. Store each character and its count in a LinkedHashMap.
4. Traverse the map entries in insertion order.
5. Print the first character whose count is 1.


