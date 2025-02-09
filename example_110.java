import java.util.Scanner;

public class example_110 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int max = maxNumberDivider(a, b);
        System.out.println(maxNumberDivider(a, b)); // Пример вызова
    }

    public static int maxNumberDivider(int start, int end) {
        int maxDivisors = 0;
        int numberWithMaxDivisors = start;

        for (int i = start; i <= end; i++) {
            int divisors = countDivisors(i);
            if (divisors > maxDivisors) {
                maxDivisors = divisors;
                numberWithMaxDivisors = i;
            }
        }

        return numberWithMaxDivisors;
    }

    private static int countDivisors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }
}
