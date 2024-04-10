// Задача:
// Написать программу в Java которая принимает на вход тест из файла input.txt и удаляет в тексте каждую вторую строку.
// Данные результата записывает в новый файл output.txt

package RemoveEverySecondLine;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RemoveEverySecondLine {

    public static void main(String[] args) {
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            int lineNumber = 1;

            while ((line = br.readLine()) != null) {
                if (lineNumber % 2 != 0) {
                    bw.write(line);
                    bw.newLine();
                }
                lineNumber++;
            }

            System.out.println("Вторые строки успешно удалены.");

        } catch (IOException e) {
            System.out.println("Произошла ошибка.");
            e.printStackTrace();
        }
    }
}
