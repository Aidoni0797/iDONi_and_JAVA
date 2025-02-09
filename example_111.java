import java.util.Scanner;

public class example_111 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = scan.nextInt();
        String str = scan.next();
        char symbol = str.charAt(0);
        scan.close();

        printTriangle(width, symbol);
    }

    public static void printTriangle(int width, char symbol) {
        int start = (width % 2 == 0) ? 2 : 1; // Начинаем с 1, если нечетное, или с 2, если четное
        for (int i = start; i <= width; i += 2) {
            int spaces = (width - i) / 2;
            System.out.println(" ".repeat(spaces) + String.valueOf(symbol).repeat(i));
        }
    }
}
//ChatGPT иногда меня удивляешь