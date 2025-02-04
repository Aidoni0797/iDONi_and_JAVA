public class example_94 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            if (i % 2 != 0) continue;//если нечетное, переходим к следующему
            System.out.println(i); //сюда попадаем, если четное
        }
    }
}