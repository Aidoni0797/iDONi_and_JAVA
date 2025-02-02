import java.util.Scanner;

public class example_91 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Перестановка границ при необходимости
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        int maxDigitSum = -1;
        int numberWithMaxDigitSum = a;

        for (int i = a; i <= b; i++) {
            int sum = sumOfDigits(Math.abs(i));
            if (sum > maxDigitSum) {
                maxDigitSum = sum;
                numberWithMaxDigitSum = i;
            }
        }

        System.out.println(numberWithMaxDigitSum);

        scanner.close();
    }

    // Метод для вычисления суммы цифр числа
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
