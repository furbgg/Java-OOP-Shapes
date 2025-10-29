> **Note: Language Context**
>
> Please note that this project was written in **German** as part of my `Ausbildung` (German vocational training). Therefore, all variable names, comments, and console outputs (`System.out.println`) within the source code are in German.

---

# Java OOP Shapes Demo (with JUnit Tests)

## About This Project

This project is a comprehensive demonstration of core **Object-Oriented Programming (OOP)** principles in Java. It models different geometric shapes using a clean inheritance hierarchy and showcases polymorphism.

Crucially, the logic for each shape (`Circle`, `Rectangle`, `Square`) is validated with **JUnit 5 unit tests**.

## Key OOP Concepts Demonstrated

### 1. Abstraction

* **`Shapes.java`**: An `abstract` base class defines the *common* attributes (`color`, `isFilled`) and *required behaviors* (`getArea()`, `getPerimeter()`) for all shapes, without providing a concrete implementation for the behaviors.

### 2. Inheritance

* **`Circle.java`, `Rectangle.java`**: Concrete classes that `extend Shapes`, inheriting the common attributes and providing specific implementations for `getArea()` and `getPerimeter()`.
* **`Square.java`**: Demonstrates multi-level inheritance by extending `Rectangle`, reusing its logic and constructor while enforcing the square constraint (width = length).

### 3. Polymorphism

* **`app.java`**: The `main` method showcases polymorphism beautifully. It creates a `List<Shapes>` that holds *different types* of shape objects (`Circle`, `Rectangle`, `Square`).
* When iterating through the list, calling `s.getArea()` or `s.getPerimeter()` automatically invokes the correct implementation for the *actual* object type at runtime.

### 4. Encapsulation

* Class attributes (like `radius`, `width`) are kept `private`, with access controlled through constructors and potentially getters (though only `getColor` and `isFilled` are implemented in the base class here).
* Input validation (e.g., checking for non-positive dimensions) is done within the constructors, ensuring objects cannot be created in an invalid state.

### 5. JUnit Testing

* Separate test classes (`CircleTest`, `RectangleTest`, `SquareTest`) provide **unit tests** for each concrete shape.
* **Tests cover:**
    * Correct calculation of area and perimeter.
    * Correct handling of invalid constructor arguments (e.g., negative radius), ensuring `IllegalArgumentException` is thrown as expected.
