import java.util.Scanner;

public class example_78 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        do {
            int cyf = number % 10; //получаем последнюю цифру
            System.out.print(cyf + " ");
            number /= 10;    //избавляемся от нее
        } while (number != 0);
    }
}