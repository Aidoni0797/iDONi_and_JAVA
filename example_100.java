import java.util.Scanner;

public class example_100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += findSmallestDivisor(i);
        }
        if (start ==1 && end==1){
            System.out.println(0);
        } else{
            System.out.println(sum);
        }

    }

    // Метод для нахождения наименьшего делителя числа, начиная с 2
    public static int findSmallestDivisor(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return i;
            }
        }
        // Если делителей нет, число простое, возвращаем само число
        return num;
    }
}
