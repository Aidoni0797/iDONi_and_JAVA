public class example_14 {
    public static void main(String[] args) {
        //Пример overflow:
        short maxValue = 256;
        byte bb = (byte) maxValue;
        System.out.println(bb);
    }
}
