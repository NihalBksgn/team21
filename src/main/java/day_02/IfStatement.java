package day_02;

import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args) {
        // SORU 1:
        // asagidaki secenekler dogrultusunda gereken kodu yaziniz.
        // a)Aralik,ocak,subat icin "Kis"
        // b) Mart,nisan ,mayis icin "Ilkbahar"
        // c)haziran temmuz agustos icin "yaz"
        // d)eylul ekim kasim icin "sonbahar"
        // e)digerleri icin "gecersiz ay adi"

        Scanner input = new Scanner(System.in);
        System.out.println("Bir ay adi giriniz");
        String ayIsmi = input.next();

        boolean kis = ayIsmi.equalsIgnoreCase("aralik") ||
                ayIsmi.equalsIgnoreCase("ocak") ||
                ayIsmi.equalsIgnoreCase("subat");

        boolean ilkbahar = ayIsmi.equalsIgnoreCase("mart") ||
                ayIsmi.equalsIgnoreCase("nisan") ||
                ayIsmi.equalsIgnoreCase("mayis");

        boolean yaz = ayIsmi.equalsIgnoreCase("haziran") ||
                ayIsmi.equalsIgnoreCase("temmuz") ||
                ayIsmi.equalsIgnoreCase("agustos");

        boolean sonbahar = ayIsmi.equalsIgnoreCase("eylul") ||
                ayIsmi.equalsIgnoreCase("ekim") ||
                ayIsmi.equalsIgnoreCase("kasim");

        if (kis) {
            System.out.println("kis");
        } else if (ilkbahar) {
            System.out.println("ilkbahar");
        } else if (yaz) {
            System.out.println(yaz);
        } else if (sonbahar) {
            System.out.println("yaz");
        } else {
            System.out.println("gecerli bir ay adi giriniz");
        }
        //  PDF SORU 1.
        //kullanicidan gun ismi girmesini isteyiniz.girilen isim gecerli ise
        //GUN isminin 1..,2..ve3.. harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin.
        //GUN ismi gecerli degilse "gecerli bir gun ismi giriniz" yazdirin.

        System.out.println("bir gun ismi giriniz");
        String gun = input.next().toLowerCase();

        if (gun.equalsIgnoreCase("pazar") ||
                gun.equalsIgnoreCase("pazartesi") ||
                gun.equalsIgnoreCase("sali") ||
                gun.equalsIgnoreCase("carsamba") ||
                gun.equalsIgnoreCase("persembe") ||
                gun.equalsIgnoreCase("cuma") ||
                gun.equalsIgnoreCase("cumartesi")) {
            String ilk = gun.substring(0,1).toUpperCase();
            String iknciUcuncu=gun.substring(1,3);
            System.out.println("girdiginiz gunun ilk uc harfi:" +ilk+iknciUcuncu);
        }else{
            System.out.println("gecerli bir gun adi giriniz");
        }

        //Soru 4: asagidaki secenekler dogrultusunda gereken kodu yaziniz
        //a)son basamak 5 e esit ve 5 den buyukse yuvarlama islemi "son basamagi bir ust ondaliga yuvarla"
        //b)son basamak 5 ten kucukse yuvarlama islemi,son basamagi bir alt ondaliga yuvarla

        int s=124;
        if(s%10>=5){
            System.out.println("Son basamagi bir üst ondaliga yuvarla:" + (s/10+1)*10);
        }else{
            System.out.println("Son basamagi bir alt ondaliga yuvarla:" + (s/10)*10);
        }

    }
}
