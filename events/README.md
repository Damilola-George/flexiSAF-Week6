# Java OOP Concepts Demonstration

This project demonstrates key Object-Oriented Programming concepts in Java, specifically focusing on:
- Nested Classes
- Access Modifiers
- Anonymous Classes

## Project Overview

The project implements a simple event management system to showcase these OOP concepts through practical examples.

## Demonstrated Concepts

### 1. Access Modifiers
The project demonstrates the use of different access modifiers:
- `private` - For encapsulating internal fields (e.g., Event class fields)
- `public` - For accessible methods and classes
- `default` (package-private) - Used in EventStatistics for package-level access
- `static` - Used for utility methods and nested classes

### 2. Nested Classes
Demonstrated through:
- Static nested class: `EventManager.EventHandler`
  ```java
  public static class EventHandler {
      private String type;
      // ... implementation
  }

### 3. Anonymous Classes

EventListener listener = new EventListener() {
    @Override
    public void onEventStart() {
        // Implementation
    }

    @Override
    public void onEventEnd() {
        // Implementation
    }
};



## Project Structure
Event.java - Demonstrates encapsulation using private fields and public methods

EventManager.java - Shows nested and anonymous classes implementation

EventListener.java - Interface used for anonymous class demonstration

EventStatistics.java - Demonstrates package-private access modifier

Main.java - Contains example usage of all concepts

## Running the Example
### Execute the Main class to see the demonstration of:

Creating events with encapsulated data

Using nested class EventHandler

Implementation of anonymous EventListener

Package-level access control
