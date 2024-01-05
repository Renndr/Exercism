# Train Scheduling System Prototype

## Introduction

As part of a project to develop a train scheduling system for a busy railway network, you've been tasked with creating a prototype for the train routes in the scheduling system. Each route is represented by a doubly linked list, where each station along the train's route is represented by a node in the linked list.

## Instructions

- **Doubly Linked List Representation:**
  - Each station along the train's route is represented by a node in the doubly linked list.
  - In a doubly linked list, each node links to both the node that comes before it and the node that comes after it.

- **Route Operations:**
  - Routes can be extended by adding stations to the beginning or end of a route.
  - Routes can be shortened by removing stations from the beginning or end of a route.
  - Sometimes a station gets closed down, and in that case, the station needs to be removed from the route, even if it is not at the beginning or end.

- **Size Measurement:**
  - The size of a route is measured by the number of stations it stops at, not by how far the train travels.

## Note

The linked list is a fundamental data structure in computer science, often used in the implementation of other data structures. It is a list of nodes that are linked together, and in a doubly linked list, each node links to both the node that comes before it and the node that comes after it.

For more in-depth understanding, you can refer to articles that explain linked lists using drawings.

## Generics

This exercise introduces generics. Generics allow you to write more general and reusable code by accepting any type of input, such as Integer or String.

Constraints on generics:
- Once you've constructed a class with generics for a specific type, you can't put a different type into it.
- Generics cannot be primitive types (e.g., int or long); instead, use their corresponding reference types (e.g., Integer or Long).

Example use case of generics:
```java
List<Integer> someList = new LinkedList<>();
```
Now `someList` can only contain Integers. Similarly:
```java
List<String> someOtherList = new LinkedList<>();
```
Now `someOtherList` can only contain Strings.

## Example Implementation

Here's an example use case of generics for a linked list:
```java
public class TrainRoute<T> {
    private Node<T> head;
    private Node<T> tail;
    
    // Constructor, methods, and other details go here
    
    private static class Node<T> {
        T data;
        Node<T> prev;
        Node<T> next;
        
        // Constructor and other details go here
    }
}
```

In this example, `T` is a placeholder for the type of data the linked list will hold, allowing flexibility in the type of data it can contain.