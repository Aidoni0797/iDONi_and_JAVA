import java.util.Scanner;

public class example_56 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        int f1 = Math.min(a,b);
        int f2 = Math.min(c,d);
        int f3 = Math.min(f1,f2);
        int f4 = Math.min(f3,e);
        System.out.print(f4);
    }
}
//не самый правильны подход но вроде система приняла