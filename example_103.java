public class example_103 {
    public static void main(String[] args) {
        double a = 0.6;
        double b = 1.25;
        //вызов статического метода - вариант 1 (от имени класса)
        double result1 = example_103.product(a,b);
        //вариант 2-вызов стат. метода внутри того же класса
        double result2 = product(a, b);
        //создание экземпляра класса
        example_103 ex = new example_103();
        //вызов метода экземпляра от имени объекта
        double result3 = ex.summa(a, b);
        //вызов статического метода от имени объекта - вариант 3
        double result4 = ex.product(a, b);
        //double result5 = Example3.summa(a, b); //так нельзя
        //double result6 = summa(a, b); //так нельзя
    }
    //статический метод
    static double product(double x, double y){
        return x * y;
    }
    //метод экземпляра
    double summa(double x, double y){
        return x + y;
    }
}