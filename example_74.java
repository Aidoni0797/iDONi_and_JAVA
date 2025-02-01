import java.util.Scanner;

public class example_74 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number < 1000 || number > 9999) { //если число не четырехзначное
            System.out.println("ERROR");
            return;  //закончить программу
        }

        int sum = 0;
        for (int i = 0; i < 4; i++) { //цикл повторяется 4 раза
            sum += number % 10; //последнюю цифру прибавляем к сумме
            number = number / 10; //избавляемся от последней цифры в числе
        }
        System.out.println(sum);
    }
}