package day_03;

import java.util.Scanner;

public class NestedIfSorusu {

    public static void main(String[] args) {

        /*
         * TASK :
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
         * alirsa %10 indirim yapan code create ediniz.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen aldiginiz urun adedini giriniz");
        int adet= input.nextInt();
        System.out.println("Lutfen aldiginiz urunlerin liste fiyatini giriniz");
        double fiyat = input.nextDouble();
        System.out.println("Müsteri kartiniz varsa EVET, yoksa HAYIR yaziniz");
        String kart = input.next().toUpperCase();

        if(kart.equals("EVET")){
            if(adet>10){
                System.out.println("urunun indirimli fiyati: " + (fiyat*80/100));
            }else{
                System.out.println("urunun indirimli fiyati: " + (fiyat*85/100));
            }

        }else if (kart.equals("HAYIR")){
            if(adet>10){
                System.out.println("urunun indirimli fiyati: " + (fiyat*85/100));
            }else{
                System.out.println("urunun indirimli fiyati: " + (fiyat*90/100));
            }
        }
    }
}
