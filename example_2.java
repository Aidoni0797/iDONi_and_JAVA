public class example_2 {
        public static void main(String[] args) {
            {
                //  System.out.println(x); // переменная x еще невидима
                int x = 12;
                System.out.println(x);//переменная х доступна
            }
            //System.out.println(x); //переменная x уже невидима
            for (int i = 1; i <= 3; i++){
                System.out.println("iDONi");
            }
            //System.out.println(i); //переменная i уже невидима
        }
}
