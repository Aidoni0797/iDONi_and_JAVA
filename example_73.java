import java.util.Locale;
import java.util.Scanner;

public class example_73 {
    static final int N = 5;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double average = 0; //среднее
        int mark; //оценка
        for (int kol = 0; kol < N; kol++) {
            mark = scan.nextInt(); //вводим оценку
            average += mark; //прибавляем, накапливая сумму
        }
        average /= N; //вычисляем среднее
        System.out.printf("%.1f", average);
    }
}