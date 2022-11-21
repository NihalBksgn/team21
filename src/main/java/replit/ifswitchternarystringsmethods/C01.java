package replit.ifswitchternarystringsmethods;

import java.util.Scanner;

public class C01 {
    /*
    Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.

Input :
John White
1234234534561478

Output :
Name : J*** W****
CCN  : **** **** **** 1478

* Ilk Harfler Buyuk harf ile baslamalidir.

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz");
        String ad = input.next();
        System.out.println("Lutfen soyadinizi giriniz");
        String soyad = input.next();
        System.out.println("Kredi Karti numaranizi giriniz");
        String kartNo = input.next();

       ad = ad.substring(0, 1).toUpperCase() + ad.substring(1).replaceAll("[a-zA-Z]", "*");
       soyad = soyad.substring(0, 1).toUpperCase() + soyad.substring(1).replaceAll("[a-zA-Z]", "*");
       kartNo= kartNo.substring(0,12).replaceAll("[0-9]","*") + kartNo.substring(12);

        System.out.println("Name: " + ad + " " + soyad);
        System.out.println("CCN: " + kartNo);
    }
}
