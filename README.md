# Library Book Return Fine Calculator

This Java program calculates the fine for returning a library book after the due date. It takes the due date and return date as input and computes the fine based on specific criteria.

## Features

- **Fine Calculation**: Calculates the fine based on the difference between the due date and the return date.
- **Input Handling**: Utilizes the `Scanner` class for user input, ensuring valid input values.
- **Fine Rules**:
    - If the book is returned after the calendar year, a fixed fine of 10,000 is imposed.
    - If the book is returned within the same calendar year:
        - If returned within the same month, a fine of 15 per day late is applied.
        - If returned in a subsequent month but within the same calendar year, a fine of 500 per month late is applied.
    - No fine is applied if the book is returned before or on the due date.

## Usage

To use the program, compile the `Main.java` file and execute the generated class file. Follow the on-screen instructions to input the due date and return date, and the program will output the calculated fine.

```bash
javac Main.java
java Main
