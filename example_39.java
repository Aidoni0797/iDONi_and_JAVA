import java.util.Scanner;

public class example_39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите аргумент: ");
        double x = scan.nextDouble();
        double y = Math.sqrt(2) / 2 * Math.sin(x / 2 + Math.PI);
        System.out.println("Значение функции= " + y);
    }
}
//зачем мне это, может в будущем, ой какой кошмар