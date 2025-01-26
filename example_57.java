import java.util.Scanner;

public class example_57 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        float b = scan.nextFloat();
        double c = 0;
        if (a<=20){
            c = b * 20;
        }
        if (a-40<=20){
            c = b * 20 + b*20*1.5;
        }
        if (a-40>0){
            c = b * 20 + b*20*1.5 +(b*(a-40))*2;
        }
        if (c!=0){
            String formattedValue = String.format("%.2f", c);
            System.out.println(formattedValue);
        } else{
            System.out.println("ERROR");
        }
    }
}
//я решаю система не принимает, печально, когда же ты напишешь код чтобы система приняла