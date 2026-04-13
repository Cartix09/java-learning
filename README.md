# java-learning


Java Programming Labs

Lab 1
Two-class Maven project with unit test.

- Created Maven project structure
- Implemented `App` and `Greeter`
- Added basic unit test
- Verified build using:

---

## Lab 2 – Variables, Operators, and Input

- Implemented `Calculator` class:
- `sum`
- `diff`
- `product`
- `average`
- Parsed integers from command line arguments
- Added unit tests for all methods




---

## Lab 3 – Conditionals and Validation

- Added input validation:
  - check number of arguments
  - handle invalid input (NumberFormatException)
- Implemented:
  - `boolean isEven(int x)`
- Extended tests

---

## Lab 4 – Loops and Arrays

- Implemented `ArrayStats`:
  - `max`
  - `min`
  - `mean`
- Processed multiple input values
- Added tests for:
  - normal cases
  - single element
  - negative values

---

## Lab 5 – Exceptions

- Added validation to `ArrayStats`
- Threw `IllegalArgumentException` for empty arrays
- Tested exceptions using `assertThrows`

---

## Lab 6 – Classes, Encapsulation, and Invariants

- Created `Product` class:
  - private fields (`name`, `price`)
  - getters
- Enforced invariant:
  - price cannot be negative
- Added tests for validation and correctness

---

## Lab 7 – Collections and Aggregation

- Implemented `Cart` class using `ArrayList`
- Methods:
  - `add(Product p)`
  - `total()`
- Tested:
  - empty cart
  - multiple products

---

## Lab 8 – Inheritance and Polymorphism

- Created abstract class `Shape`
- Implemented:
  - `Circle`
  - `Rectangle`
- Used polymorphism with `List<Shape>`
- Added utility to compute total area
- Tested area calculations

---

## Lab 9 – Interfaces and Dependency Injection

- Created `Printer` interface
- Implemented `ConsolePrinter`
- Refactored `App` to use dependency injection
- Created `FakePrinter` for testing
- Separated logic from output

---

## Lab 10 – Mini Project (Library System)

- Implemented a simple library system:
  - `Book`
  - `Library`
  - `Printer`
  - `App`
- Features:
  - add books
  - count books
  - total pages
  - search by title
- Added validation using exceptions
- Implemented 10+ unit tests
- Verified build with:
