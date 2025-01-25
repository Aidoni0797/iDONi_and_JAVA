import java.util.Scanner;

public class example_46 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number < 0) number = -number;
        if (number < 100 || number > 999) { //неверные исходные данные
            System.out.println("ERROR");
            return; //прекращение работы программы
        }
    }
}
//Что выполняет данный код непонятно