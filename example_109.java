import java.util.Scanner;

class example_109 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        example_109 data = new example_109();
        data.printDivider(number);
    }
    static void printDivider(int x){
        for (int i = 1; i<=x; i++){
            if (x % i == 0){
                System.out.print(i+" ");
            }
        }
    }
}