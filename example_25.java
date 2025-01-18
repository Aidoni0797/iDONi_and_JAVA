import java.util.Scanner;
public class example_25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name;
        name = scan.nextLine(); //здесь вводит нормально
        scan.close(); //закрыли стандартный поток ввода
        Scanner scan2 = new Scanner(System.in); //создаем новый сканнер
        System.out.println("How old are you?");
        int age = scan.nextInt(); //здесь возникает ошибка во время выполнения
        //готовимся к ухудшению настроения
        scan2.close();
    }
}
