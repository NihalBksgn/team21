package mentor_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task_02 {
 /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.

        Ipucu:
        Class icinde 3 method olacak
         * main() isimli bir method
         * musteriSecimi() isimli bir method
         * kasa() isimli bir method
         * */


    static List<String> urunler =new ArrayList<>(Arrays.asList("Urun Kodu : 1 - Muz","Urun Kodu : 2 - Portakal","Urun Kodu : 3 - Elma",
            "Urun Kodu : 4 - Kivi","Urun Kodu : 5 - Erik"));

    static List<Double> fiyatlar=new ArrayList<>(Arrays.asList(3.5,2.0,2.0,4.0,3.5));

    static double toplamOdenecekTutar;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("            URUNLER                            URUN FIYATLARI");
        System.out.println("-----------------------------------------------------------------");
        for(int i=0; i< urunler.size(); i++){
            System.out.print(urunler.get(i));
            for(int k=i-1; k<i; k++){

            }System.out.println("                              " +fiyatlar.get(i));
        }

        System.out.println("------------------------------------------------------------------");

       musteriSecimi();



    }//main


    public static void musteriSecimi(){
        System.out.println("Lutfen secmek istediginiz urunu giriniz");
        int secim = input.nextInt();

        System.out.println("Sectiginiz urunden kac kilo almak istersiniz?");
        double kilo= input.nextDouble();
        double urunTutari=fiyatlar.get(secim-1);
        double urunToplamTutar= kilo*urunTutari;
        toplamOdenecekTutar+= urunToplamTutar;

        System.out.println("Alisverise devam etmek icin 1, Kasa icin 2'yi seciniz");
        int karar = input.nextInt();
        if(karar==1){
            musteriSecimi();
        }else{
            kasa();
        }
    }

    public static void kasa(){
        System.out.println("Alisverisinizin Toplam Tutari: " + toplamOdenecekTutar);
    }
}//class


