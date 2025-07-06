import java.util.Scanner;

public class LoktevAstonTest {
    public static void main(String[] args) {
        // Создаём объект для чтения ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Просим пользователя ввести первую строку
        System.out.println("Введите первую строку:");
        String a = scanner.nextLine();

        // Просим пользователя ввести вторую строку
        System.out.println("Введите вторую строку:");
        String b = scanner.nextLine();

        // Сравниваем строки и выводим результат
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        // Закрываем Scanner
        scanner.close();
    }
}