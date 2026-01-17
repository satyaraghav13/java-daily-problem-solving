# Problem: Upcasting and Downcasting in Java

## Problem Statement
In Java, inheritance allows a child class to acquire properties and methods of a parent class.
However, when objects are referenced using parent or child references, accessing methods
depends on the type of reference and object.

The problem is to understand and demonstrate:
-  Upcasting (Child object → Parent reference)
-  Downcasting (Parent reference → Child reference)
-  Method overriding behavior
-  Safe and unsafe downcasting scenarios

---

## Objective
1. Create a parent class `Animal` with a method `sound()`
2. Create a child class `Dog` that:
   - Overrides the `sound()` method
   - Defines a child-specific method `bark()`
3. Demonstrate upcasting using parent reference
4. Demonstrate downcasting using explicit type casting
5. Explain runtime behavior using `instanceof`
6. Show an invalid downcasting case

---

## Concepts Used
- Inheritance
- Method overriding
- Upcasting
- Downcasting
- Runtime polymorphism
- `instanceof` operator
- `ClassCastException`

---

## Key Scenarios

### 1. Upcasting
- A child object is referred to by a parent class reference
- Happens automatically
- Only parent methods are accessible
- Overridden methods execute based on object type

### 2. Downcasting
- Parent reference is explicitly converted to child reference
- Required to access child-specific methods
- Must be done carefully to avoid runtime errors

### 3. Safe Downcasting
- Performed using `instanceof`
- Prevents `ClassCastException`

### 4. Invalid Downcasting
- Occurs when parent object is cast to child
- Causes runtime `ClassCastException`


## Expected Output
