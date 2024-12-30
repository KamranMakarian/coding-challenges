import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileProcessor {

    String filePath;
    List<String> allWords;

    public FileProcessor(String filePath) {
        this.filePath = filePath;
        this.allWords = new ArrayList<>();
    }

    public void readFile() throws FileProcessingException{
        File inputFile = new File(filePath);

        try(Scanner inputData = new Scanner(inputFile)) {
            while (inputData.hasNextLine()){
                String currentLine = inputData.nextLine();
                String[] words = currentLine.split("\\s+");
                for (int i = 0; i < words.length; i++){
                    words[i] = words[i].replaceAll("[!@#$%&*{}\\[\\]~^']","");
                    allWords.add(words[i]);
                }
            }
        } catch(IOException e) {
            throw new FileProcessingException("Error reading file: " + filePath, e);
        }
    }

    public double calculateAverageWordLength() throws ArithmeticException{
        if (allWords.isEmpty()) {
            throw new ArithmeticException("No words to calculate the average length.");
        }
        int sum = 0;
        int count = 0;
        for (String word: allWords){
            sum += word.length();
            count += 1;
        }
        return (double) sum / count;
    }
}