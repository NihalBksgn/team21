package day_02;

import java.util.Scanner;

public class IfStatement_02 {


    public static void main(String[] args) {
    /* soru 5:
    Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
    a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
    b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
    c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen"
    */

        Scanner input = new Scanner(System.in);
        System.out.println("ücgenin kenar uzunluklarini giriniz");
        int k1 = input.nextInt();
        int k2 = input.nextInt();
        int k3 = input.nextInt();

        if (k1 == k2 && k2 != k3 || k2 == k3 && k3 != k1 || k3 == k1 && k2 != k1) {
            System.out.println("ikizkenar");

        } else if (k1 == k2 && k2 == k3) {
            System.out.println("Eskenar Ücgen");
        } else {
            System.out.println("Cesitkenar Ücgen");
        }


        /* Soru:6

        Mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir dönüştürücü oluşturmak için
        kod yazınız. Google'dan dönüşümler için formülleri bulunuz.
        a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde, konsolda kodunuz
        "16 km" yazmalıdır (sayı dinamik olacak)
        b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde, konsolda
        kodunuz "2" yazmalıdır (sayı dinamik olacak)
        c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak girdiğinde,
                konsolda kodunuz "28.3333 santigrat" yazmalıdır (sayı dinamik olacak)

         */




    }
}
