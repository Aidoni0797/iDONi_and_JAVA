import java.util.Scanner;

public class example_88 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a<0 || b<0){
            System.out.print("ERROR");
        }else{
            for(int i = 1; i <= a; i++) {
                for(int j = 1; j <= b; j++) {
                    if (i==1 || i==a){
                        System.out.print("*");
                    } else if (j==1 || j==b){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}