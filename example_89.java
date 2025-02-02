import java.util.Scanner;

public class example_89 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a<=0){
            System.out.print("ERROR");
        }else{
            for(int i = 1; i <= a; i++) {
                for(int j = 1; j <= a; j++) {
                    if (j>i || j==i){
                        System.out.print("*");
                    } else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
//было не легко