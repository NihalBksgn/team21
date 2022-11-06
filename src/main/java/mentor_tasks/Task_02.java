package mentor_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_02 {
    public static void main(String[] args) {

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

        List<String> urunler =new ArrayList<>(Arrays.asList("Muz","Portakal","Elma","Kivi","Erik"));

        List<Double> fiyatlar=new ArrayList<>(Arrays.asList(3.5,2.0,2.0,4.0,3.5));

        System.out.println("Urun No\t\t\tUrunler\t\t\tFiyatlar");

        for(int i=1; i<=urunler.size(); i++){
            System.out.print(i);
            for(int k=i-1; k<i; k++){

                System.out.println("\t\t\t\t"+urunler.get(k));
                System.out.println("\t\t\t\t\t\t\t\t"+ fiyatlar.get(i-1)+ "$");
            }
        }







    }


}


