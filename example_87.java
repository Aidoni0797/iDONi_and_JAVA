import java.util.Scanner;

public class example_87 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();
        int g = 0;
        for(int i = 1; i <= height; i++) {
            g = height-i+1;
            for(int j = height; j >= i; j--) {
                System.out.print(g);
            }
            System.out.println();
        }
    }
}