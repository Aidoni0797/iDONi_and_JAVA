import java.util.Scanner;

public class example_80 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number < 0){
            number *= -1;
        }
        int cyf = 0;
        int sum = 0;
        String str = String.valueOf(number);
        for (int i = 0; i< str.length(); i++){
            char firstChar = str.charAt(i);
            if (firstChar == '1'){ cyf +=1; }
            if (firstChar == '2'){ cyf +=2; }
            if (firstChar == '3'){ cyf +=3; }
            if (firstChar == '4'){ cyf +=4; }
            if (firstChar == '5'){ cyf +=5; }
            if (firstChar == '6'){ cyf +=6; }
            if (firstChar == '7'){ cyf +=7; }
            if (firstChar == '8'){ cyf +=8; }
            if (firstChar == '9'){ cyf +=9; }
            if (firstChar == '0'){ cyf +=0; }
        }
        System.out.print(str.length() + " " + cyf);
    }
}