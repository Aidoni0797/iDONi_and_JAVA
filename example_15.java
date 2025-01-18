public class example_15 {
    public static void main(String[] args) {
        //Примеры underflow:
        double d1 = 0.3333333333333333;
        // потеря чисел после точки начиная с 8 знака
        float f1 = (float) d1;
        System.out.println(f1);
        //Результат: 0.33333334

        float f3 = 3.64f;
        int i3 = (int) f3; // дробная часть отбрасывается
        System.out.println(i3);
        //Результат: 3
    }
}
