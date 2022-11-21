package practiceSorulari;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AkrepileYelkovan {
    /*
    Kullanıcıdan 2 sayi girmesini isteyin girilen degerlerden
    biri saati digeri dakikayi temsil edecek.Bize akrep ile yelkovan arasındaki kucuk acıyı hesaplayan acısal
    olarak donduren methodu yazınız.
    input:12, minutes:30
    output:165
    */
    public static void main(String[] args) {

        System.out.println(aciHesapla(18,30));
    }

    public static double aciHesapla(int saat,int dakika){

        double dakikadanSaateGelenAci= ((double) dakika/60)*30;//dakikayi saate cevirmek icin 60'a böl ve saat basi 30derece olddan 30la carp

        double aciSaat = (saat%12)*30 + dakikadanSaateGelenAci;//saat'in 12ye bölümünü al sebep dijital degil normal 12'lik saatle calismamiz. Ek satin acisini da ekle

        double aciDakika = dakika*6; // Dakika basina 6 derece geldiigi icin verilen dakikayi 6 ile carp

        double aradakiFark = Math.abs(aciDakika-aciSaat); // farkin mutlak degerini aldik cunku akrebin acisinin yelkovanin acisini gectigi durumlar da var

        if (aradakiFark>180){
            return 360-aradakiFark;
        }else return aradakiFark;



    }
}