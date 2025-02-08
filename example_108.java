import java.util.Scanner;

class example_108 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c;
        if (b<a){
            c = b;
            b = a;
            a = c;
        }
        example_108 data = new example_108();
        data.simpleInRange(a,b);
    }
    static void simpleInRange(int x, int y){
        int pp = 0;
        int pp1 = 0;
        for (int i = x; i<=y; i++){
            pp = 0;
            for (int j=1; j<=i; j++){
                if (i % j == 0){
                    pp += 1;
                }
            }
            if (pp == 2){
               pp1 += 1;
            }
        }
        System.out.print(pp1);
    }
}