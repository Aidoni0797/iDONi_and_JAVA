import java.util.Scanner;

public class example_84 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int grade, k = 0, sum = 0;
        double sred;
        grade = scan.nextInt();
        while (grade >= 0) {
            sum += grade;
            k+=1;
            grade = scan.nextInt();
        }
        if (k > 0) {
            sred =  (double) sum / k;
            System.out.printf("%.1f%n", sred);
        } else {
            System.out.println("No data");
        }
    }
}