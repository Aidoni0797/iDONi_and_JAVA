import java.util.Scanner;

public class example_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int summa = sc.nextInt();
        final int BASA = 100;
        final int PROCENT = 5;

        int salary = BASA + summa * PROCENT / 100;
        System.out.println(salary);
    }
}
