import java.util.Scanner;

public class example_96 {
    public static void main(String[] args) {
        int i;
        int j=0;
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for (i = 1; i <= number; i++) {
            if (number % i == 0){
                j += 1;
            }
        }
        if (j==2 && number!=1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
//не очень самый правильный подход но для твоего уровня iDONi нормально