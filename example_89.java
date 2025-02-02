import java.util.Scanner;

public class example_89 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a<=0){
            System.out.print("ERROR");
        }else{
            if (a%2!=0){
                for(int i = 1; i <= a; i++) {
                    for(int j = 1; j <= a/2; j++) {
                        if (j>i || j==i){
                            System.out.print("**");
                        } else{
                            System.out.print(" ");
                        }
                    }
                    if (((a/2)+1) == i){
                        System.out.print("*");
                        break;
                    } else{
                        System.out.print("*");
                    }
                    System.out.println();
                }
            } else{
                for(int i = 1; i <= a; i++) {
                    for(int j = 1; j <= a/2; j++) {
                        if (j>i || j==i){
                            System.out.print("**");
                        } else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
        }
    }
}
//было не легко