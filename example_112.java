public class example_112 {
    public static void main(String[] args) {
        print(5); //вызов первого перегруженного метода
        print(6, 7); //вызов второго перегруженного метода
        print(8, 9, 10); //вызов третьего перегруженного метода
    }

    static void print(int a) {
        System.out.println(a);
    }

    static void print(int a, int b) {
        System.out.println(a + " " + b);
    }

    static void print(int a, int b, int c) {
        System.out.println(a + " " + b + " " + c);
    }
}