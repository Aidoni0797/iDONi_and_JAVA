import java.util.Scanner;

public class example_86 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();
        for(int i = 1; i <= height; i++) { //меняется i - номер строки
            for(int j = 1; j <= i; j++) { //меняется j - номер столбца
                System.out.print("*");
            }
            System.out.println();
        }
    }
}