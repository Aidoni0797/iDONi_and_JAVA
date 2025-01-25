import java.util.Scanner;

public class example_45 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double f1 = scan.nextDouble();
        double f2 = scan.nextDouble();
        double f3 = scan.nextDouble();
        double f4 = scan.nextDouble();

        double d1 = Math.sqrt(f1*f1+f2*f2);
        double d2 = Math.sqrt(f3*f3+f4*f4);
        if (d1<d2) {
            System.out.println("Первая точка ближе");
        }else{
            if (d1>d2){
                System.out.println("Вторая точка ближе");
            }else{
                System.out.println("Точки на равных расстояниях");
            }
        }
    }
}