import java.util.Scanner;

public class example_90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        if (k > 0 && k < 10) {
            for (int i = 1; i <= k; i++) {
                for (int j = 1; j <= k; j++) {
                    System.out.print(i * j + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("ERROR");
        }

        scanner.close();
    }
}
//chatgpt почему ты такой умный, я завидую