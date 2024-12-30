# File Processor with Exception Handling

# Task: FileProcessor System

Create a **FileProcessor** system that reads content from a file and calculates the average length of the words in the file. Implement robust exception handling to manage possible errors such as missing files or malformed data. This exercise will help you understand the flow of exception handling, custom exceptions, and the `try-catch-finally` structure.

---

## Requirements

### Class Structure

#### **FileProcessor**
- **Responsibilities**:
  - Reading file contents.
  - Calculating the average word length.
- **Methods**:
  - Methods for file reading and word length calculation.

#### **Custom Exception**
- **FileProcessingException**:
  - A custom exception to handle specific issues related to file processing.

---

## Exception Handling Flow
1. **IOException**:
   - Handle in `readFile()` method if the file is not found or cannot be read.
2. **ArithmeticException**:
   - Handle in `calculateAverageWordLength()` if there are no words in the file.
3. **Finally Block**:
   - Ensure resources are closed, even if an exception occurs.

---

## File I/O
1. Read lines from a text file at a given path.
2. Split each line into words and store the words.
3. Calculate the average length of words after reading the entire file.

---

## Steps

### Define the Custom Exception Class
1. Create `FileProcessingException`, extending `Exception`, with a constructor that accepts:
   - A message.
   - An optional cause.

### Implement the FileProcessor Class
- **Properties**:
  - `String filePath`: The path to the file to be read.
- **Methods**:
  1. `void readFile()`: 
     - Reads the file line by line and splits each line into words.
     - Throws `FileProcessingException` if the file is missing or cannot be read.
  2. `double calculateAverageWordLength()`:
     - Calculates the average length of words in the file.
     - Throws `ArithmeticException` if there are no words.
  3. Use `try-catch-finally` in `readFile()` to manage exceptions and ensure resources are released.

### Implement the Main Class
1. In `main`, create an instance of `FileProcessor`.
2. Call its methods and handle potential exceptions.
3. Print user-friendly error messages if any exception occurs.

---

## UML Diagram

This UML diagram illustrates the structure of the FileProcessor system:


+--------------------------+
|      FileProcessor       |
|--------------------------|
| - filePath: String       |
|--------------------------|
| + readFile(): void       |
| + calculateAverageWordLength(): double |
|--------------------------|
+--------------------------+

+--------------------------+
|  FileProcessingException |
|--------------------------|
| + FileProcessingException(String message) |
| + FileProcessingException(String message, Throwable cause) |
+--------------------------+