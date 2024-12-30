public class Main {

    /*
    * Task
Create a FileProcessor system that reads content from a file and calculates the average length of the words in the file. Implement robust exception handling to manage possible errors such as missing files or malformed data. This exercise will help you understand the flow of exception handling, custom exceptions, and the try-catch-finally structure.

Requirements
Class Structure:

FileProcessor:
Responsible for reading file contents and calculating the average word length.
Contains methods for file reading and word length calculation.
Custom Exception:
FileProcessingException: A custom exception to handle specific issues related to file processing.
Exception Handling Flow:

Handle IOException in the readFile() method if the file is not found or cannot be read.
Handle ArithmeticException in calculateAverageWordLength() if there are no words in the file.
Use a finally block to ensure resources are closed, even if an exception occurs.
File I/O:

Read lines from a text file at a given path, split each line into words, and store the words.
Calculate the average length of words after reading the entire file.
Steps
Define the Custom Exception Class:

Create FileProcessingException, extending Exception, with a constructor that accepts a message and an optional cause.
Implement the FileProcessor Class:

Properties:
String filePath: The path to the file to be read.
Methods:
void readFile(): Reads the file line by line and splits each line into words.
Throws FileProcessingException if the file is missing or cannot be read.
double calculateAverageWordLength(): Calculates the average length of words in the file.
Throws ArithmeticException if there are no words.
Use try-catch-finally in readFile() to manage exceptions and ensure resources are released.
Implement the Main Class:

In main, create an instance of FileProcessor, call its methods, and handle potential exceptions.
Print user-friendly error messages if any exception occurs.
UML Diagram
This UML diagram illustrates the structure of the FileProcessor system:

sql
Copy code
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
* */

    public static void main(String[] args) {
        String filePath = "data/textLength.txt"; // Replace with a valid file path
        FileProcessor fileProcessor = new FileProcessor(filePath);

        try {
            fileProcessor.readFile();
            double averageWordLength = fileProcessor.calculateAverageWordLength();
            System.out.printf("Average word length: %.2f\n", averageWordLength);
        } catch (FileProcessingException e) {
            System.out.println("File processing error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Calculation error: " + e.getMessage());
        }
    }
}
