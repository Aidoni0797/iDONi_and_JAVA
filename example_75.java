import java.util.Scanner;

public class example_75 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int sum = 0;
        int m = 0;

        for (int i = 0; i < number; i++) {
            m = scan.nextInt();
            if (i == 0) {
                sum = m;
            }
            if (sum > m){
                sum = m;
            }
        }
        System.out.println(sum);
    }
}