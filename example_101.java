public class example_101{
    public static void main(String[] args) {
        double a = 0.5, b = 17.2, c = -34;
        double result = maximum(a, b, c); //вызов метода. Его результат присваивается result
        System.out.println("Максимальное= " + result);
    }

    static double maximum(double x, double y, double z){
        double max = x > y ? x : y;
        max = z > max ? z : max;
        return max; //возврат значение и выход из метода
    }
}

//Для iDONi это долго