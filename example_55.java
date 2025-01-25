import java.util.Scanner;

public class example_55 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double sumFirstTeam = 0;
        double sumSecondTeam = 0;

        for (int i = 0; i < 2; i++) {
            sumFirstTeam += scanner.nextDouble();
        }

        for (int i = 0; i < 4; i++) {
            sumSecondTeam += scanner.nextDouble();
        }

        double avgFirstTeam = sumFirstTeam / 2;
        double avgSecondTeam = sumSecondTeam / 4;

        if (avgFirstTeam > avgSecondTeam) {
            System.out.println("First");
        } else if (avgFirstTeam < avgSecondTeam) {
            System.out.println("Second");
        } else {
            System.out.println("Draw");
        }

    }
}
//решение ChatGPT это круто, это быстро и система принимает