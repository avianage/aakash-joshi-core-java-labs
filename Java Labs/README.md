# Core Java Labs

A collection of Java lab exercises covering fundamental to intermediate Java concepts, created as part of Cloud Full Stack Training.

## Labs Overview

| Lab | Topic | Exercises |
|-----|-------|-----------|
| Lab 1 | Basics & Algorithms | 8 exercises — digit cube sum, traffic light simulator, Fibonacci, prime numbers, sum of divisibles, sum of squares vs square of sum, increasing number check, power of two check |
| Lab 2 | Arrays | 4 exercises — second smallest element, string sorting & case conversion, reverse digits & sort, remove duplicates & sort descending |
| Lab 3 | Strings & Text Processing | 6 exercises — tokenizing integers, mirror image, replace consonants, digit difference number, char/line/word count (stub), positive string check |
| Lab 4 | Inheritance & OOP | 3 exercises — library item hierarchy (Item → WrittenItem/MediaItem → Book/JournalPaper/Video/CD) |
| Lab 5 | Custom Exceptions | 3 exercises — age validation, employee name validation, salary validation |

## Prerequisites

- Java 21+
- Eclipse IDE (recommended) or any Java compiler

## Getting Started

### Using Eclipse

1. Open Eclipse → File → Import → General → Existing Projects into Workspace
2. Select this directory as the root
3. The project compiles automatically with JavaSE-21

### Using Command Line

```bash
# Compile all sources
javac -d bin src/**/*.java

# Run a specific exercise (e.g., Lab 1 Ex 1)
java -cp bin com.aakash.lab1.ex1.Lab1Ex1
```

## Project Structure

```
src/com/aakash/
├── lab1/   (ex1 - ex8)
├── lab2/   (ex1 - ex4)
├── lab3/   (ex1 - ex5, ex8)
├── lab4/   (ex1 - ex3)
└── lab5/   (ex1 - ex3)
```

Each exercise is an independent Java class with a `main` method for direct execution.

## License

This project is for educational purposes.
