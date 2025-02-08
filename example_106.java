public class example_106 {  //Tests - имя класса
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        example_106 data = new example_106();  //создание экуземпляра класса Tests
//    Все возможные варианты запоминай
        example_106.plus(a, b);
        data.plus(a, b);
        data.minus(a, b);
        plus(a, b);
    }
    static void plus(int x, int y){
        System.out.println(x + " + " + y);
    }
    void minus(int x, int y){
        System.out.println(x + " - " + y);
    }
}