import java.util.Scanner;

public class example_54 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        int f = scan.nextInt();

        float f1 = (a+b) / 2;
        float f2 = (c+d+e+f)/4;
        if (f1>f2){
            System.out.print("First");
        }else{
            if (f1<f2){
                System.out.print("Second");
            }else{
                System.out.print("Draw");
            }
        }
    }
}
//без ChatGPT это круто думаешь сам, но система не принимает