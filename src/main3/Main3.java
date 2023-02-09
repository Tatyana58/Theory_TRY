package main3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Создадим новый класс
public class Main3 {

    public static void main(String[] args) {
    }

    // Создаем наш метод вне метода main
    public static String readFirstLineFromFile2(String path)
            throws IOException {

        // Объявляем ресурсы, перечисляя их через ";"
        try (FileReader f = new FileReader("a.txt");
             BufferedReader br = new BufferedReader(f)) {
            return br.readLine();
        }
    }
}
