import java.util.Locale;
import java.util.Scanner;

public class example_70 {
    static final int N = 5;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        int kol = 0; //kol - счетчик введенных оценок
        double average = 0; //среднее
        int mark; //оценка
        while (kol < N) {
            mark = scan.nextInt(); //вводим оценку
            average += mark; //прибавляем, накапливая сумму
            kol++; //счетчик увеличиваем
        }
        average /= N; //вычисляем среднее
        System.out.printf("%.1f", average);
    }
}