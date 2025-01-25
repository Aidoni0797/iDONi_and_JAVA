import java.util.Scanner;

public class example_49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            // Проверяем, является ли число шестизначным
            if (Math.abs(number) < 100000 || Math.abs(number) > 999999) {
                System.out.println("ERROR");
            } else {
                // Находим сумму первых и последних трех цифр
                int absNumber = Math.abs(number);
                int firstPart = absNumber / 1000; // Первые три цифры
                int secondPart = absNumber % 1000; // Последние три цифры

                int sumFirst = sumOfDigits(firstPart);
                int sumSecond = sumOfDigits(secondPart);

                // Проверяем, равны ли суммы
                if (sumFirst == sumSecond) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        } else {
            System.out.println("ERROR");
        }

        scanner.close();
    }

        // Метод для вычисления суммы цифр числа
        public static int sumOfDigits(int number) {
            int sum = 0;
            while (number > 0) {
                sum += number % 10; // Добавляем последнюю цифру
                number /= 10; // Убираем последнюю цифру
            }
            return sum;
        }

}
