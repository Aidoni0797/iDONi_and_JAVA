import java.util.Scanner;


public class example_41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double z = 2*Math.pow(Math.sin(3*Math.PI-2*a),2)*Math.pow(Math.cos(5*Math.PI+2*a),2);
        double y = (1 - Math.sin((5*Math.PI - 16*a)/2))/4;
        double res1 = Math.round(z * 10000.0) / 10000.0;
        double res2 = Math.round(y * 10000.0) / 10000.0;
        System.out.printf("%.4f %.4f",res1,res2);
    }
}
//голова кругом? как округлить так и не поняла, вроде все элементарно, но...