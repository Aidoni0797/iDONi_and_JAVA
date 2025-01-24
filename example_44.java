import java.util.Scanner;

public class example_44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long income = scan.nextLong(); //для ввода дохода <=4 млрд.
        if (income % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}