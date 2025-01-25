import java.util.Scanner;

public class example_50 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int invest = scan.nextInt();
        int procent;
        if (invest > 10000) {
            procent = 5;
        }else if (invest > 1000) { //от 1001 до 10000
            procent = 3;
        }else {                //до 1000
            procent = 2;
        }
        int pay = (int)(invest * (1 + procent / 100.));
        System.out.println("К выдаче: "+pay);
    }
}