# Core Java Labs

A comprehensive collection of Java lab exercises covering fundamental to advanced Java concepts, created as part of Cloud Full Stack Training.

## Labs Overview

| Lab | Topic | Exercises |
|-----|-------|-----------|
| **Lab 1** | **Basics & Algorithms** | 8 exercises |
| | | • Digit cube sum calculator |
| | | • Traffic light simulator with switch-case |
| | | • Fibonacci series generator |
| | | • Prime number checker |
| | | • Sum of numbers divisible by 3 or 5 |
| | | • Difference between sum of squares and square of sum |
| | | • Increasing number validator |
| | | • Power of two checker |
| **Lab 2** | **Arrays** | 4 exercises |
| | | • Find second smallest element in array |
| | | • Sort strings and convert case |
| | | • Reverse array digits and sort |
| | | • Remove duplicates and sort descending |
| **Lab 3** | **Strings & Text Processing** | 7 exercises |
| | | • Tokenize and sum integers from string |
| | | • Create mirror image of string |
| | | • Replace consonants with next consonant |
| | | • Calculate digit difference in number |
| | | • Count characters, lines, and words in text |
| | | • Check if string is positive (alphabetically sorted) |
| | | • Additional string manipulation exercises |
| **Lab 4** | **Inheritance & OOP** | 3 exercises |
| | | • Library item hierarchy implementation |
| | | • Item → WrittenItem (Book, JournalPaper) |
| | | • Item → MediaItem (Video, CD) |
| | | • Demonstrate polymorphism and inheritance |
| **Lab 5** | **Custom Exceptions** | 3 exercises |
| | | • Age validation with custom exception |
| | | • Employee name validation (firstName + lastName) |
| | | • Salary validation with custom EmployeeException |
| **Lab 6** | **Collections Framework** | 7 exercises |
| | | • Sort HashMap values in ascending order |
| | | • Count character occurrences using HashMap |
| | | • Map numbers to their squares |
| | | • Assign medals based on student marks (Gold ≥90, Silver ≥80, Bronze ≥70) |
| | | • Find second smallest element using Collections |
| | | • Filter voter-eligible IDs (age > 18) using LocalDate |
| | | • Reverse digits and sort numbers |
| **Lab 8** | **Multithreading** | 2 exercises |
| | | • File copy using Thread class (10-byte chunks) |
| | | • Timer displaying current time every second |
| **Lab 9** | **Executor Framework** | 2 exercises |
| | | • File copy using ExecutorService |
| | | • Timer using ExecutorService and Callable |
| | | • Job seeker username validation (≥8 chars + "_job" suffix) |

## Employee Insurance System (EIS)

A complete 3-tier application demonstrating layered architecture and business logic implementation.

### Architecture

```
com.cg.eis/
├── bean/           Employee entity (POJO)
├── service/        Business logic layer
│   ├── EmployeeService (interface)
│   └── EmployeeServiceImpl (implementation)
└── pl/             Presentation layer (console UI)
```

### Features

- **Add Employee**: Register new employees with id, name, salary, and designation
- **Auto Insurance Assignment**: Automatically assigns insurance scheme based on:
  - **Scheme A**: Manager with salary ≥ ₹40,000
  - **Scheme B**: Programmer with salary ₹20,000-₹40,000
  - **Scheme C**: System Associate with salary ₹5,000-₹20,000
  - **No Scheme**: Clerk with salary < ₹5,000
- **Display by Scheme**: Filter and display employees by insurance scheme
- **Delete Employee**: Remove employee by ID
- **View All**: Display all registered employees

### Running the EIS Application

```bash
java -cp bin com.cg.eis.pl.MainApp
```

## Prerequisites

- **Java 21+** (JavaSE-21)
- **Eclipse IDE** (recommended) or any Java compiler
- Basic understanding of Java fundamentals

## Getting Started

### Using Eclipse

1. Open Eclipse → **File** → **Import** → **General** → **Existing Projects into Workspace**
2. Select this directory as the root
3. The project compiles automatically with JavaSE-21
4. Right-click any Java file with `main` method → **Run As** → **Java Application**

### Using Command Line

```bash
# Compile all sources
javac -d bin src/com/aakash/**/*.java src/com/cg/**/*.java

# Run a specific lab exercise
java -cp bin com.aakash.lab1.ex1.Lab1Ex1

# Run Lab 6 Exercise 4 (Medal Assignment)
java -cp bin com.aakash.lab6.ex4.Lab6Ex4

# Run Lab 8 Exercise 1 (File Copy with Threads)
java -cp bin com.aakash.lab8.ex1.FileProgram

# Run Lab 9 Exercise 1 (File Copy with ExecutorService)
java -cp bin com.aakash.lab9.ex1.FileExecutorProgram

# Run Employee Insurance System
java -cp bin com.cg.eis.pl.MainApp
```

## Project Structure

```
src/
├── com/aakash/
│   ├── lab1/          Basics & Algorithms (ex1-ex8)
│   ├── lab2/          Arrays (ex1-ex4)
│   ├── lab3/          Strings & Text Processing (ex1-ex5, ex8-ex9)
│   ├── lab4/          Inheritance & OOP (ex1-ex3)
│   ├── lab5/          Custom Exceptions (ex1-ex3)
│   ├── lab6/          Collections Framework (ex1-ex7)
│   ├── lab8/          Multithreading (ex1-ex2)
│   └── lab9/          Executor Framework (ex1-ex2)
└── com/cg/eis/
    ├── bean/          Employee entity
    ├── service/       Business logic layer
    └── pl/            Presentation layer
```

Each exercise is an independent Java class with a `main` method for direct execution.

## Key Learning Outcomes

### Core Java Concepts
- ✅ Control structures and algorithms
- ✅ Array manipulation and sorting
- ✅ String processing and pattern matching
- ✅ Object-oriented programming principles
- ✅ Inheritance and polymorphism

### Advanced Topics
- ✅ Custom exception handling
- ✅ Collections Framework (HashMap, ArrayList)
- ✅ Multithreading with Thread class
- ✅ Executor Framework and thread pools
- ✅ Date/Time API (LocalDate, Period)
- ✅ Layered architecture design

### Design Patterns
- ✅ Service layer pattern
- ✅ Interface-based programming
- ✅ Separation of concerns
- ✅ CRUD operations

## Lab Highlights

### Lab 6 - Collections Framework
Comprehensive exercises on Java Collections API, focusing on HashMap operations, sorting, filtering, and real-world scenarios like medal assignment and voter eligibility checking.

### Lab 8 - Multithreading
Introduction to concurrent programming with Thread class, demonstrating file I/O operations and timer implementations using multiple threads.

### Lab 9 - Executor Framework
Advanced concurrency using ExecutorService for better thread management, including Callable tasks and thread pool optimization.

### Employee Insurance System
A complete application showcasing:
- **3-tier architecture** (Bean, Service, Presentation)
- **Business rule implementation** (insurance scheme logic)
- **CRUD operations** with in-memory storage
- **Console-based user interface**

## Notes

- All exercises include sample test cases in their `main` methods
- File-based exercises (Lab 8, Lab 9) create sample files automatically if not present
- The EIS system uses HashMap for in-memory employee storage
- Each lab builds upon concepts from previous labs

## License

This project is for educational purposes as part of Cloud Full Stack Training.

## Author

**Aakash Joshi**  
Cloud Full Stack Training Program
