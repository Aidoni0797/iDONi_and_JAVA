import java.util.Scanner;

public class example_35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int lastDigit = b % 100; //последняя цифра
        int firstDigit = b / 100; //первая цифра, поскольку число двузначное

        System.out.println(a+ firstDigit+" р. "+ lastDigit+" к.");
    }
}
