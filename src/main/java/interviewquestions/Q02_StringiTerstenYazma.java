package interviewquestions;

import java.util.Scanner;

public class Q02_StringiTerstenYazma {
    // Kullanicidan bir String isteyin ve Stringi tersten yazin

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("String giriniz");
        String str = input.nextLine();
        String ters = "";

        int i =str.length()-1;
        while(i>=0){

            ters+=str.charAt(i);
            i--;
        }
        System.out.println(ters);

        StringBuilder strb = new StringBuilder(str);
        String son =strb.reverse().toString();
        System.out.println(son);

    }
}
