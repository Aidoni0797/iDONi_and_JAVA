import java.util.Scanner;


public class example_40 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x = scan.nextDouble();
        double y = Math.log(x + 7 * Math.sqrt(Math.pow(x,4)+Math.PI));

        System.out.println(Math.round(y * 10000.0) / 10000.0);
    }
}
