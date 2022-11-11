package mentor_tasks;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task_01 {
    /* TASK :
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.

         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
                     for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
                     ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
                    for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
                    ortalama kazançtan aşağıysa o günleri return yap.
          */




    static double toplamKazanc = 0;
    static List<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"));
    static List<Double> gunlukKazanclar = new ArrayList<>();
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int gun = 0;

        while(gun<7){
            System.out.println(gunler.get(gun) + " gununun kazancini giriniz:");

            double gunlukHasilat= input.nextDouble();
            gunlukKazanclar.add(gunlukHasilat);

            toplamKazanc+=gunlukHasilat;
            gun++;
        }
        System.out.println("Gunluk Kazanclar: " + gunlukKazanclar);
        System.out.println("---------------");

        System.out.println("Toplam Kazanc: " + toplamKazanc);
        System.out.println("---------------");

        getOrtalamaKazanc();
        String numberFormat = new DecimalFormat("##.##").format(getOrtalamaKazanc());
        System.out.println("Ortalama Kazanc: " + numberFormat);
        System.out.println("--------------");

        getOrtalamaninUstundeKazancGunleri();
        System.out.println("Ortalamanin Ustundeki Gunler: " + getOrtalamaninUstundeKazancGunleri() );
        System.out.println("--------------");

        getOrtalamaninAltindaKazancGunleri();
        System.out.println("Ortalamanin Altindaki Gunler: " +getOrtalamaninAltindaKazancGunleri() );



    }//main

    public static double getOrtalamaKazanc(){
        double ortalama=toplamKazanc/gunler.size();
        return ortalama;
    }

    public static String getOrtalamaninUstundeKazancGunleri(){
        String ortUstundeGun = "";
        for(int i=0; i<gunlukKazanclar.size(); i++){
            if(gunlukKazanclar.get(i) > getOrtalamaKazanc()){

                ortUstundeGun+=gunler.get(i) + " ";
            }

        }return ortUstundeGun ;
    }

    public static String getOrtalamaninAltindaKazancGunleri(){
        String ortAltindaGun="";
        for(int i=0; i<gunlukKazanclar.size(); i++){
            if(gunlukKazanclar.get(i) < getOrtalamaKazanc()){
                ortAltindaGun+= gunler.get(i)+ " ";
            }
        }return ortAltindaGun ;
    }





}//class
