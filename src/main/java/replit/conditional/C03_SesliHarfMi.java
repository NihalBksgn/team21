package replit.conditional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C03_SesliHarfMi {
    /*
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu, değilse sessiz harf olduğunu ekrana yazdırsın.
    Girdiği değer harf değilse yada 1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir harf giriniz");
        String harf = input.next();


        String alfabe = "A\tB\tC\tD\tE\tF\tG\tH\tI\tJ\tK\tL\tM\tN\tO\tP\tQ\tR\tS\tT\tU\tV\tW\tX\tY\tZ\t" +
                "a\tb\tc\td\te\tf\tg\th\ti\tj\tk\tl\tm\tn\to\tp\tq\tr\ts\tt\tu\tv\tw\tx\ty\tz";
        String sayilar = "0123456789";
        String str = input.next();

        if (str.length() != 1) {
            System.out.println("Yanlış karakter girdiniz");
        } else if (alfabe.contains(str)) {
            if (str.equals("a") || str.equals("e") || str.equals("i") || str.equals("o") || str.equals("u") ||
                    str.equals("A") || str.equals("E") || str.equals("I") || str.equals("O") || str.equals("U")) {
                System.out.println("Sesli");
            } else {
                System.out.println("Sesli degil");
            }

        } else if (sayilar.contains(str)) {
            System.out.println("Yanlıs karakter");
        } else {
            System.out.println("Yanlıs karakter");
        }


    }
}