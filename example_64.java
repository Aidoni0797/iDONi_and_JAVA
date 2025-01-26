import java.util.Scanner;

public class example_64 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month = scan.next(); //вводим название месяца
        String lowerCase = month.toLowerCase();
        switch (lowerCase) {
            case "понедельник":
                System.out.println("Monday");
                break;
            case "вторник":
                System.out.println("Tuesday");
                break;
            case "среда":
                System.out.println("Wednesday");
                break;
            case "четверг":
                System.out.println("Thursday");
                break;
            case "пятница":
                System.out.println("Friday");
                break;
            case "суббота":
                System.out.println("Saturday");
                break;
            case "воскресенье":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("ERROR");
        }
    }
}