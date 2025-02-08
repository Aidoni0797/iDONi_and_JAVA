public class example_102 {
    public static void main(String[] args) {
        //создание объекта
        StringBuilder filename = new StringBuilder("data");
        addExtention(filename);//передача в метод ссылки на объект
        System.out.println("Имя файла c расширением: " + filename);
    }
    static void addExtention(StringBuilder sb){
        sb.append(".txt"); //добавление символов в строку
    }
}