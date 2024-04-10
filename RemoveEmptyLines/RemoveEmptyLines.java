// Задача:
// Написать программу в Java которая принимает на вход текст из файла input.txt и удаляет в тексте
// все строки содержащие в строке менее одного символа. 
// Данные результата записывает в новый файл output.txt

package RemoveEmptyLines;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RemoveEmptyLines {

    public static void main(String[] args) {
        String inputFileName = "input.txt";
        String outputFileName = "output.txt";

        removeEmptyLines(inputFileName, outputFileName);
    }

    public static void removeEmptyLines(String inputFileName, String outputFileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));

            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    writer.write(line);
                    writer.newLine();
                }
            }

            reader.close();
            writer.close();

            System.out.println("Все пустые строки удалены.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
