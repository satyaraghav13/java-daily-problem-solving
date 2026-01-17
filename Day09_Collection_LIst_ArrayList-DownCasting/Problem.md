# Problem: Storing Multiple Object Types in a List Using instanceof

## Problem Statement
In Java, we often face situations where we need to store different types of objects
such as custom class objects and Strings in a single collection.
Since Java collections are type-safe using generics, handling heterogeneous data
becomes challenging.

The problem is to design a solution where:
- Multiple object types (Emp, Manager, String) are stored in a single List
- Each object is identified at runtime
- Object-specific data is accessed safely without runtime errors

---

## Requirements
1. Create an `Emp` class with fields: `eid`, `name`, and `address`
2. Create a `Manager` class with fields: `mid` and `name`
3. Store `Emp`, `Manager`, and `String` objects in a single `List`
4. Traverse the list and:
   - Print employee details if the object is `Emp`
   - Print manager details if the object is `Manager`
   - Print the value directly if the object is `String`

---

## Constraints
- Use a single collection to store all objects
- Avoid `ClassCastException`
- Use runtime type checking
- Follow object-oriented principles

---

## Concept Used
- `List<Object>`
- `instanceof` operator
- Type casting
- Encapsulation (getter/setter)
- Runtime polymorphism

---

## Expected Output
