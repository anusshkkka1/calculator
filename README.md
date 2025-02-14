# Java Calculator

A simple calculator application built with Java Swing, featuring a modern UI and basic arithmetic operations.

## Prerequisites

- Java Development Kit (JDK) 8 or higher installed on your system
- Make sure the `java` and `javac` commands are available in your system's PATH

## Project Structure

```
calculator/
├── src/
│   ├── Calculator.java
│   └── components/
│       ├── CalculatorDisplay.java
│       ├── CalculatorButtonPanel.java
│       └── CalculatorLogic.java
└── README.md
```

## How to Compile

1. Open a terminal in the project root directory
2. Run the following command to compile all Java files:

```bash
javac -d bin src/**/*.java
```

This will compile all Java files and place the compiled `.class` files in a `bin` directory.

## How to Run

After compiling, run the calculator using:

```bash
java -cp bin Calculator
```

## Features

- Basic arithmetic operations (+, -, *, /)
- Clear function (C)
- Modern UI with a clean design
- Responsive button layout
- Error-free calculations

## Controls

- Use number buttons (0-9) to input numbers
- Use operator buttons (+, -, *, /) for calculations
- Press '=' to see the result
- Press 'C' to clear the display and start over 
