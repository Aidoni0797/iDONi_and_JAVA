import java.util.Scanner;

public class example_72 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = 0;
        if (a > b){
            c = b;
            b = a;
            a = c;
        }
        double kol = 1.0; //kol - счетчик введенных оценок

        while (a <= b) {
            kol*=a;
            a+=1;
        }
        System.out.print(kol);
    }
}