//chatgpt ты меня спасаешь от депресии
import java.util.Scanner;

public class example_38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод цены товара
        String[] priceInput = scanner.nextLine().split(" "); // Ввод цены
        int rubles = Integer.parseInt(priceInput[0]); // Рубли
        int kopecks = Integer.parseInt(priceInput[1]); // Копейки

        // Ввод размера скидки
        int discountPercentage = Integer.parseInt(scanner.nextLine()); // Размер скидки

        // Перевод цены в копейки
        int totalKopecks = rubles * 100 + kopecks;

        // Рассчет скидки
        double discount = (double) totalKopecks * discountPercentage / 100;

        // Вычисление итоговой стоимости в копейках (в большую сторону)
        int discountedKopecks = (int) Math.ceil(totalKopecks - discount);

        // Разделение стоимости на рубли и копейки
        int finalRubles = discountedKopecks / 100;
        int finalKopecks = discountedKopecks % 100;

        // Форматированный вывод результата
        System.out.printf("%d руб. %02d коп.%n", finalRubles, finalKopecks);
    }
}