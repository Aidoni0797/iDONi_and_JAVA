import java.util.Scanner;

public class example_32 {
    public static void main(String[] args) {
        final int FILM = 760;
        final int CLIP = 95;
        Scanner scan = new Scanner(System.in);
        int volume = scan.nextInt();
        volume *= 1024; //переводим в мегабайты

        int films = volume / FILM; //количество фильмов: деление нацело на объем одного фильма
        volume %= FILM; // останется после записи фильмов
        int clips = volume / CLIP; //количество клипов
        int remain = volume % CLIP; //останется после записи клипов

        System.out.println(films);
        System.out.println(clips);
        System.out.println(remain);
    }
}
