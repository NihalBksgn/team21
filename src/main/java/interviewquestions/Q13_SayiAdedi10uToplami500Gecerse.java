package interviewquestions;

import java.util.Scanner;

public class Q13_SayiAdedi10uToplami500Gecerse {
    /*  soru 13)
        Kullanicidan toplanmak uzere sayilar isteyin.
        Sayi adedi 10'u gecerse yada toplami 500'u gecerse " Bu kadar sayi yeter ...adet sayi girdiniz toplami..." yazdirin
 */
    public static void main(String[] args) {
        int toplam=0;

        int sayiAdedi=0;
        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");


        do{
            int sayi= input.nextInt();
            toplam+=sayi;
            System.out.println("Lutfen bir sayi daha giriniz");

        }while (sayiAdedi < 11 && toplam<500);
        System.out.println("Bukadar sayi yeter" + sayiAdedi+ "adet sayi girdiniz toplami: " + toplam);
    }

}
