import java.util.Scanner;

public class example_81 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int cyf = 0;
        if (a < b){
            cyf = a;
        } else{
            cyf = b;
        }
        System.out.print(1);
        for (int i = 2; i<= cyf; i++){
            if (a % i == 0 && b % i == 0){
                System.out.print(" "+i);
            }
        }
    }
}