import java.util.Scanner;

public class example_99 {
    public static void main(String[] args) {
        int i;
        int j=0;
        int y=0;
        int u =0;
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

            for (u = 2; u<number; u++){
                if (number % u == 0 && u % 2==0){
                    j+=u;
                }
            }

        System.out.print(j);
    }
}
