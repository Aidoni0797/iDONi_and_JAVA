import java.util.Scanner;

public class example_82 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        char frtch = scan.next().charAt(0);
        if (b<0){
            System.out.println("ERROR");
        } else {
            if (a == 2){
                for (int i = 1; i<= b; i++) {
                    System.out.print(frtch);
                }
            } else if (a == 1){
                for (int i = 1; i<= b; i++) {
                    System.out.println(frtch);
                }
            } else{
                System.out.println("ERROR");
            }
        }
    }
}