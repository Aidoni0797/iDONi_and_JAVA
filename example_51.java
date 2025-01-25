import java.util.Scanner;

public class example_51 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int invest = scan.nextInt();
        int procent = 2;
        if (invest > 1000) {
            procent = 3; //отменяем процент 2, назначаем процент 3
        }
        if (invest > 10000){
            procent = 5; //отменяем процент 3, назначаем процент 5
        }
        int pay = (int)(invest * (1 + procent / 100.));
        System.out.println("К выдаче: "+pay);
    }
}