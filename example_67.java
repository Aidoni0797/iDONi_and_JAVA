import java.util.Scanner;

public class example_67 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month = scan.next(); //вводим название месяца
        String result = switch (month) {
            case "Декабрь", "Январь", "Февраль" -> "Зима";
            case "Март", "Апрель", "Май" -> "Весна";
            case "Июнь", "Июль", "Август" -> "Лето";
            case "Сентябрь", "Октябрь", "Ноябрь" -> "Осень";
            default -> "Неверное название месяца!";
        };
        System.out.println(result);
    }
}