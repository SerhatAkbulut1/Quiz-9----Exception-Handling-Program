# Exception Handling Program

# Introduction

This program demonstrates exception handling by handling various errors that may occur during its execution. It reads an input file and performs certain operations based on its contents, ensuring that the program does not crash and properly identifies and handles errors.

# Error Cases

## Case 0: No Error

The program runs without any unexpected situations. The text written in the input file is printed to the output file. The input file must have at least one character (a letter or a space).

## Case 1: Parameter Number Error

This error occurs when the program has a different number of parameters than 1.

## Case 2: Empty Input File

This error occurs when the specified input file is empty.

## Case 3: Invalid Character in Input File Error

This error occurs when the input file contains characters other than the 26 letters and space

## Case 4: Input File Not Found Error

This error occurs when the specified input file cannot be found.

# Usage

Ensure you have Java installed on your system.

Compile the Java program using the following command:
javac ExceptionHandlingProgram.java

Run the program with the input file as a command-line argument:
java ExceptionHandlingProgram input.txt

Replace input.txt with the path to your desired input file.

# Output

The program will create an output file named output.txt that contains the processed data or error messages.
