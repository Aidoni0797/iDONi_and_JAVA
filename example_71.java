import java.util.Scanner;

public class example_71 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kol = 0; //kol - счетчик введенных оценок
        int kol1 = 0; //kol - счетчик введенных оценок
        int mark; //оценка
        while (kol < 10) {
            mark = scan.nextInt(); //вводим оценку
            if (mark<4){
                kol1++; //счетчик увеличиваем
            }
            kol++;
        }
        System.out.print(kol1);
    }
}