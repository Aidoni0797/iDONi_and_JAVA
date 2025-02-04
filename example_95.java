public class example_95 {
    public static void main(String[] args) {
        int i;
        ONE:
        for (i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) continue ONE;
                System.out.printf("i=%d j=%d \n", i, j);
            }
        }
    }
}