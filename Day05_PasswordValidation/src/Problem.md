## Problem  1
Write a Core Java program to validate a user password.

## Rules
1. Password length must be at least 8 characters.
2. It must contain at least:
   - one uppercase letter
   - one lowercase letter
   - one digit
3. No special validation libraries allowed.

## Input
String password = "Java1234";

## Output
Valid Password

## Explanation
The password contains uppercase (J), lowercase (ava),
digits (1234), and its length is 8 characters.

## Constraints
- Use only Core Java
- Do not use regex
- Use loops and conditionals only








## Problem       2
Write a Core Java program that validates a user password.
If the password is invalid, the user should be asked to enter
the password again until a valid password is provided.

## Password Rules
1. Password length must be at least 8 characters.
2. The first character must be an uppercase letter.
3. The password must contain:
   - at least one lowercase letter
   - at least one digit
   - at least one special character

## Input
User enters the password using Scanner.

## Output
- If the password is invalid, display an error message
  and ask the user to enter the password again.
- If the password is valid, display:
  "Valid Password"

## Explanation
The program uses a loop to continuously ask the user
for a password until all validation rules are satisfied.
The `continue` statement is used to retry when the password
is invalid, and the `break` statement is used to exit the loop
once a valid password is entered.

## Constraints
- Use Core Java only
- Do not use regular expressions
- Use loops and conditionals

