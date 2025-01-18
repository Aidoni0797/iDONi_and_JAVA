import java.util.Scanner;

public class example_24 {
    public static void main(String[] args) {
        String name;
        Scanner scan = new Scanner(System.in);
        System.out.println("Your name and click Enter:");
        name = scan.next(); //Читает строку до пробела
        System.out.println("Hello, " + name);
        int age;
        System.out.println("How old are you: ");
        age = scan.nextInt(); //Читает строку до пробела и преобразует в int
        System.out.println("Your age - " + age);
    }
}