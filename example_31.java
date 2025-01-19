import java.util.Scanner;

public class example_31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        int lastDigit = number % 10; //последняя цифра
        int firstDigit = number / 10; //первая цифра, поскольку число двузначное

        System.out.println(lastDigit);
        System.out.println(firstDigit);
    }
}
