import java.util.Scanner;

public class LoktevJavaEvenNumbers {
    public static void main(String[] args) {
        // Создаём объект для чтения ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Пример массива из задания
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Выводим сообщение для пользователя
        System.out.println("Дан массив: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]");
        System.out.println("Чётные числа из массива:");

        // Проходим по массиву и выводим чётные числа
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

        // Дополнительно: возможность ввода пользователем
        System.out.println("\nХотите ввести свой массив? (да/нет)");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("да")) {
            System.out.println("Введите количество чисел в массиве:");
            int count = Integer.parseInt(scanner.nextLine());

            int[] customNumbers = new int[count];
            System.out.println("Введите " + count + " чисел по одному:");
            for (int i = 0; i < count; i++) {
                customNumbers[i] = Integer.parseInt(scanner.nextLine());
            }

            System.out.println("Чётные числа из вашего массива:");
            for (int number : customNumbers) {
                if (number % 2 == 0) {
                    System.out.println(number);
                }
            }
        }

        // Закрываем Scanner
        scanner.close();
    }
}