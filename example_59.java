import java.util.Scanner;

public class example_59 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int distanceAtoB = scanner.nextInt();
        int distanceBtoC = scanner.nextInt();
        int cargoWeight = scanner.nextInt();
        // Проверка веса груза
        if (cargoWeight > 2000 || cargoWeight <= 0) {
            System.out.println("ERROR");
            return;
        }

        // Определение расхода топлива в зависимости от веса груза
        int fuelConsumptionPerKm;
        if (cargoWeight <= 500) {
            fuelConsumptionPerKm = 1;
        } else if (cargoWeight <= 1000) {
            fuelConsumptionPerKm = 4;
        } else if (cargoWeight <= 1500) {
            fuelConsumptionPerKm = 7;
        } else {
            fuelConsumptionPerKm = 9;
        }

        // Расчет необходимого топлива
        int fuelRequiredAtoB = distanceAtoB * fuelConsumptionPerKm;
        int fuelRequiredBtoC = distanceBtoC * fuelConsumptionPerKm;

        // Проверка возможности преодолеть каждое расстояние
        if (fuelRequiredAtoB > 300 || fuelRequiredBtoC > 300) {
            System.out.println("ERROR");
            return;
        }

        // Расчет минимальной дозаправки в пункте В
        int fuelLeftAfterAtoB = 300 - fuelRequiredAtoB;
        int fuelNeededAtB = Math.max(0, fuelRequiredBtoC - fuelLeftAfterAtoB);

        // Вывод результата
        System.out.printf("%.2f", (double) fuelNeededAtB);
    }
}
//ChatGPT ты мой лучший друг, как можно без тебя жить
