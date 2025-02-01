import java.util.Scanner;

public class example_76 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int sum = 0;
        int m = 0;

        for (int i = 0; i <= number; i++) {
            if (i!=0){
                if (number%i==0){
                    sum += i;
                }
            }

        }
        System.out.println(sum);
    }
}