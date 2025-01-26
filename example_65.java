import java.util.Scanner;

public class example_65 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt(); //вводим название месяца
        switch (month) {
            case 1:
                System.out.println("Working day");
                break;
            case 2:
                System.out.println("Working day");
                break;
            case 3:
                System.out.println("Working day");
                break;
            case 4:
                System.out.println("Working day");
                break;
            case 5:
                System.out.println("Working day");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("ERROR");
        }
    }
}