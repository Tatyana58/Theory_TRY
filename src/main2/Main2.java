package main2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Создадим новый класс
public class Main2 {

//    public static void main(String[] args) {
//    }
//
//    // Создадим наш новый метод вне метода main
//    // Указываем в сигнатуре метода возможное исключение
//    public static String readFirstLineFromFileWithFinallyBlock(String path)
//            throws IOException {
//
//        // Создадим объект класса BufferedReader, который является потоком
//        BufferedReader br = new BufferedReader(new FileReader(path));
//
//        // В блоке try проводим необходимую работу с объектом
//        try {
//            return br.readLine();
//
//            // Блок catch пропускаем, так как не планируем обрабатывать исключения
//            // И в блоке finally вызываем метод close, так как потоки,
//            // с которыми мы работаем необходимо обязательно закрывать
//        } finally {
//            if (br != null) {
//                br.close();
//            }
//        }
//    }

    public static void main(String[] args) {
    }

    // Реализуем метод с помощью try-with-resources
    public static String readFirstLineFromFile(String path) throws IOException {

        // Объявим ресурс, с которым будем работать
        // Метод close() вызывается неявно при закрытии блока try
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }
}


