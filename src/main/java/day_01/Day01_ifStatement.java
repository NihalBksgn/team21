package day_01;

import java.util.Scanner;

public class Day01_ifStatement {
    public static void main(String[] args) {

       // Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazin

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= input.nextInt();

        if(sayi%2==0){
            System.out.println("Cift sayidir");
        }else{
            System.out.println("tek sayidir");
        }

        //soru: Kullanicidan gun isimlerinin birinin ilk harfini isteyin ve o harfle baslayan gun isimlerini yazdirin

        System.out.println("Lütfen bir gunun ilk harfini giriniz");
        char ilkHarf= input.next().toUpperCase().charAt(0);
        if(ilkHarf=='P'){
            System.out.println("gununuzun adi Pazar,pazartesi veya persembe'dir");
    }else if(ilkHarf=='S'){
            System.out.println("gununuzun adi Sali'dir");
        }else if(ilkHarf=='C'){
            System.out.println("gununuzun adi Carsamba,cuma veya cumartesidir");
        }else{
            System.out.println("lutfen haftanin gunlerinden birinin ilk harfini giriniz");
        }
        //kullanicidan gun ismi alin ve haftaici veya haftasonu oldugunu yazdirin

        System.out.println("Bir gun ismi giriniz");
        String gunAdi = input.next();
        if(gunAdi.equalsIgnoreCase("PAZARTESI") || gunAdi.equalsIgnoreCase("SALI")
                || gunAdi.equalsIgnoreCase("CARSAMBA") || gunAdi.equalsIgnoreCase("PERSEMBE")
                || gunAdi.equalsIgnoreCase("CUMA")){
            System.out.println("hafta icidir");
        } else if (gunAdi.equalsIgnoreCase("CUMARTESI") || gunAdi.equalsIgnoreCase("PAZAR")) {
            System.out.println("hafta sonudur");
        }else{
            System.out.println("lutfen gecerli bir gun adi giriniz");
        }


        System.out.println("lutfen dörtgeninizin bir kenar uzunlugunu giriniz");
        int kenar1=input.nextInt();
        System.out.println("Bir kenar uzunlugu daha giriniz");
        int kenar2= input.nextInt();

        if(kenar1==kenar2){
            System.out.println("Dortgeniniz Karedir");
        }else{
            System.out.println("Dortgeniniz Dikdörtgendir");
        }


    //Soru 5 : Kullanicidan bir gun alin eger gun "Cuma" ise ekranda "Müslümanlar icin kutsal gun" yazdirin
        //         "Cumartesi" ise ekrana "Yahudiler icin kutsal gun" yazdirin
        //         "Pazar" ise ekrana "Hristiyanlar icin kutsal gun" yazdirin

        System.out.println("Bir gun ismi giriniz");
        String gunIsmi=input.next();
        if(gunIsmi.equalsIgnoreCase("cuma")){
            System.out.println("Muslumanlar icin kutsal gun");
        }else if(gunIsmi.equalsIgnoreCase("cumartesi")){
            System.out.println("yahudiler icin kutsal gun");
        }else if(gunIsmi.equalsIgnoreCase("pazar")){
            System.out.println("Hristiyanlar icin kutsal gun");
        }else{
            System.out.println("Gecerli bir gun giriniz");
        }




    }
}

