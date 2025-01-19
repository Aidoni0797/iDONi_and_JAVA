import java.util.Locale;
import java.util.Scanner;

public class example_33 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); //если по умолчанию дробная часть отделяется запятой
        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();

        System.out.println(number1 > number2 ? number1 : number2);
    }
}
