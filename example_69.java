import java.util.Scanner;

public class example_69 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt(); //вводим название месяца
        String result = switch(month) {
            case 1,2,12  -> "Winter";
            case 4,5,3  -> "Spring";
            case 7,8,6  -> "Summer";
            case 9,10,11  -> "Autumn";
            default -> "ERROR";
        };
        System.out.println(result);
    }
}