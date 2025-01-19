import java.util.Scanner;

public class example_37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalSeconds = scan.nextInt();

        // Вычисляем часы, минуты и секунды
        int hours = totalSeconds / 3600; // 1 час = 3600 секунд
        int minutes = (totalSeconds % 3600) / 60; // остаток делим на 60 для минут
        int seconds = totalSeconds % 60; // остаток от деления на 60 - это секунды

        // Вывод результата
        System.out.printf("%d часов %d минут %d секунд", hours, minutes, seconds);
    }
}

