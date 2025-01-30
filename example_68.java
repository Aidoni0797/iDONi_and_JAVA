import java.util.Scanner;

public class example_68 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String znak = scan.next(); //знак вводим как строку
        int b = scan.nextInt();
        boolean flag = true; //признак того, что выводить результат нужно
        int result = switch (znak) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> {
                if (b == 0) {
                    System.out.println("ERROR");
                    flag = false; //в конце программы вывод будет не нужен
                    yield 0;
                } else {
                    yield a / b;
                }
            }
            case "%" -> {
                if (b == 0) {
                    System.out.println("ERROR");
                    flag = false; //вывод не нужен
                    yield 0;
                } else {
                    yield a % b;
                }
            }
            default -> {
                System.out.println("ERROR");
                flag = false; //и в этом случае вывод результата не нужен
                yield 0;
            }
        };
        if (flag) {  //если flag остался true, то вывод нужен
            System.out.println(result);
        }
    }
}