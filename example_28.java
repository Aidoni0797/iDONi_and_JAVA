import java.util.Scanner;

public class example_28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int age = scan.nextInt();
        double discount = scan.nextDouble();
        scan.close();
        System.out.println("С Днем Рождения, "+name+"!");
        System.out.println("Сегодня Вам "+age+"!");
        System.out.println("По этому поводу Вам скидка "+discount+"%");
        System.out.println("на весь ассортимент нашего сайта!");
    }
}
//не легко  найти ошибку в регистрах, надо быть очень внимательным, чудовище, какое то