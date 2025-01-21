import java.util.Scanner;


public class example_41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double z = 2*Math.pow(Math.sin(3*Math.PI-2*a),2)*Math.pow(Math.cos(5*Math.PI+2*a),2);
        double y = 0.25 - 0.25*Math.sin(2.5*Math.PI - 8*a);

        System.out.print(Math.round(z * 100000.0) / 100000.0+" "+Math.round(y * 100000.0) / 100000.0);
    }
}