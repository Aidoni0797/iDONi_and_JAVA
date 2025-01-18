public class example_8 {
    public static void main(String[] args) {
        int number = 50;
        int delitel = 0;
        //второй операнд не вычисляется и ошибки не возникает
        if (delitel != 0 && (number % delitel) == 0)
            System.out.println(delitel + " является делителем " + number);
//        Без использования укороченного оператора
//          возникнет ошибка "деление на ноль"
//      if(delitel != 0 & (number % delitel) == 0)
//           System.out.println(delitel + " является делителем " + number);
        System.out.println("Завершение работы iDONi");
    }
}
