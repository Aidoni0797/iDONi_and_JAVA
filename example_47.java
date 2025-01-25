import java.util.Scanner;
public class example_47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            // Проверяем, является ли число трехзначным
            if (Math.abs(number) < 100 || Math.abs(number) > 999) {
                System.out.println("ERROR");
            } else {
                int sum = 0;
                boolean hasOddDigits = false;

                // Обрабатываем каждую цифру
                int absNumber = Math.abs(number);
                while (absNumber > 0) {
                    int digit = absNumber % 10; // Берем последнюю цифру
                    if (digit % 2 != 0) { // Проверяем, нечетная ли цифра
                        sum += digit;
                        hasOddDigits = true;
                    }
                    absNumber /= 10; // Убираем последнюю цифру
                }

                if (hasOddDigits) {
                    System.out.println(sum); // Вывод суммы нечетных цифр
                } else {
                    System.out.println("NO"); // Если нечетных цифр нет
                }
            }
        } else {
            System.out.println("ERROR");
        }

        scanner.close();
    }
}
