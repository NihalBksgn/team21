package replit.conditional;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C07_SayininGunKarsiligi {
    /*
    1 ile 7 arasında girilen bir tamsayı ile haftanın gününün adını gösteren bir Java kodu yazın.

Test Data :
3
Beklenen Çıktı:
Carsamba

Test Data:
1
Beklenen Çıktı:
Pazartesi

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("1 ile 7 arasinda bir sayi giriniz");
        int sayi = input.nextInt();

switch (sayi){
    case 1:
        System.out.println("Pazartesi");
        break;
    case 2:
        System.out.println("sali");
        break;
    case 3:
        System.out.println("carsamba");
        break;
    case 4:
        System.out.println("persembe");
        break;
    case 5:
        System.out.println("cuma");
        break;
    case 6:
        System.out.println("cumartesi");
        break;
    case 7:
        System.out.println("pazar");
        break;
    default:
        System.out.println("gecerli bir sayi giriniz");

}
    }

}
