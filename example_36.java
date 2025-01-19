import java.util.Scanner;

public class example_36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int d = scan.nextInt();

        int max = Math.max(a, b);
        int max1 = Math.max(max, d);

        int min = Math.min(a, b);
        int min1 = Math.min(min, d);


        System.out.println(max1-min1);
    }
}
