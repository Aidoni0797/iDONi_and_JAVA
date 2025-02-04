import java.util.Scanner;

public class example_97 {
    public static void main(String[] args) {
        int i;
        int j=0;
        int y=0;
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int number1 = scan.nextInt();
        for (i = number; i <= number1; i++) {
            j = 0;
            for (int k = 1; k<=i;k++) {
                if (i % k == 0) {
                    j += 1;
                }
            }
            if (j==2 && i!=1){
                y+=1;
                if (y == 1){
                    System.out.print(i);
                }else{
                    System.out.print(" "+i);
                }
            }
        }
    }
}
