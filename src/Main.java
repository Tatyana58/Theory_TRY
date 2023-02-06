import java.io.File;
import java.io.FileNotFoundException;

// Создадим класс
public class Main {

    // Создадим метод main
    public static void main(String[] args) {
    }

//    // Добавим в сигнатуру метода информацию о возможном исключении
//    public static void check(File file) throws FileNotFoundException {
//        if (!file.exists()) {
//            throw new FileNotFoundException();
//        }
//        if (file.isDirectory()) {
//            throw new IllegalArgumentException(file.getPath() + " is a directory");
//        }
//    }

//
// Добавим для нового метода обработку с помощью конструкции try catch
//public static void checkFile(String path) {
//    File file = new File(path);
//    try {
//        check(file);
//    } catch (FileNotFoundException e) {
//        System.out.println("Файл по пути " + path + " не найден");
//    }
//    System.out.println("Проверка завершена");
//}
//    public static void check(File file) throws FileNotFoundException {
//        if (!file.exists()) {
//            throw new FileNotFoundException();
//        }
//        if (file.isDirectory()) {
//            throw new IllegalArgumentException(file.getPath() + " is a directory");
//        }
//    }

    // Добавим в метод блок finally, чтобы эта часть выполнилась в любом случае
    public static void checkFile(String path) {
        File file = new File(path);
        try {
            check(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл по пути " + path + " не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Файл по пути " + path + " является папкой");
        } finally {
            System.out.println("Проверка завершена");
        }
    }

    public static void check(File file) throws FileNotFoundException {
        if (!file.exists()) {
            throw new FileNotFoundException();
        }
        if (file.isDirectory()) {
            throw new IllegalArgumentException(file.getPath() + " is a directory");
        }
    }
}
