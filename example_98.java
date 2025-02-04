import java.util.Scanner;

public class example_98 {
    public static void main(String[] args) {
        int i;
        int j=0;
        int y=0;
        int u =0;
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int number1 = scan.nextInt();
        if (number1<number){
            u = number1;
            number1 = number;
            number = u;
        }
        for (i = number; i <= number1; i++) {
            j = 0;
            for (int k = 1; k<=i;k++) {
                if (i % k == 0) {
                    j += 1;
                }
            }
            if (j>=3 && i!=1){
                y+=1;
                if (y == 1){
                    System.out.print(i);
                    break;
                }
            }
        }
        if (y == 0){
            System.out.print("NO");
        }
    }
}
