import java.util.Scanner;

public class example_58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hoursWorked = scanner.nextInt();
        double hourlyRate = scanner.nextDouble();

        if (hoursWorked < 0 || hourlyRate < 0) {
            System.out.println("ERROR");
            return;
        }

        double salary = 0.0;

        if (hoursWorked <= 20) {
            // Обычный тариф
            salary = hoursWorked * hourlyRate;
        } else if (hoursWorked <= 40) {
            // Первые 20 часов по обычному тарифу
            salary = 20 * hourlyRate;
            // Остальные часы (от 21 до 40) по полуторному тарифу
            salary += (hoursWorked - 20) * hourlyRate * 1.5;
        } else {
            // Первые 20 часов по обычному тарифу
            salary = 20 * hourlyRate;
            // Следующие 20 часов по полуторному тарифу
            salary += 20 * hourlyRate * 1.5;
            // Часы свыше 40 по двойному тарифу
            salary += (hoursWorked - 40) * hourlyRate * 2;
        }

        // Округление зарплаты до 2 знаков после запятой
        System.out.printf("%.2f", salary);
    }
}
//ChatGPT решает проблему за 10 секунд и система приняла, это хорошо или плохо, а iDONi...
