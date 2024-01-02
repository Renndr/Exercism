# Introduction to Nullability in Java

In Java, the concept of nullability refers to the presence or absence of a value. The null literal is used to denote the absence of a value in Java.

## Nullability in Primitive and Reference Types

- **Primitive Data Types:** Primitive data types in Java always have a default value and, therefore, can never be null. By convention, they start with a lowercase letter (e.g., int). Attempting to assign a primitive variable a value of null will result in a compile-time error, as the variable always holds a primitive value of the type assigned.

  ```java
  // Throws compile-time error stating the required type is int, but null was provided
  int number = null;
  ```

- **Reference Types:** Reference types in Java contain the memory address of an object and can have a value of null. These variables usually start with an uppercase letter (e.g., String). Assigning a reference variable a null value will not result in a compile-time error, as reference variables are nullable.

  ```java
  // No error will occur as the String variable str is nullable
  String str = null;
  ```

## Exercise: Employee Name Badges

In this exercise, you will be writing code to print name badges for factory employees. Employees have an ID, name, and department name.

### Badge Labels Format

Employee badge labels are formatted as follows:

```java
Badge badge = new Badge();
badge.print(734, "Ernest Johnny Payne", "Strategic Communication");
// => "[734] - Ernest Johnny Payne - STRATEGIC COMMUNICATION"
```

### Modifications to the Badge.print() Method

1. **Supporting New Employees without an ID:**
   - Due to a quirk in the computer system, new employees occasionally don't yet have an ID when they start working at the factory. Modify the `Badge.print()` method to support new employees without an ID.

   ```java
   Badge badge = new Badge();
   Badge.print(null, "Jane Johnson", "Procurement");
   // => "Jane Johnson - PROCUREMENT"
   ```

2. **Label for the Factory Owner:**
   - Even the factory's owner has to wear a badge at all times. However, an owner does not have a department. Modify the `Badge.print()` method to print a label for the owner.

   ```java
   Badge badge = new Badge();
   badge.print(254, "Charlotte Hale", null);
   // => "[254] - Charlotte Hale - OWNER"
   ```

   - It is possible for the owner to also be a new employee:

   ```java
   Badge badge = new Badge();
   badge.print(null, "Charlotte Hale", null);
   // => "Charlotte Hale - OWNER"
   ```

**Note:** Ensure that the department is uppercased on the label, and consider the scenarios described to create a flexible and accurate implementation of the `Badge.print()` method.