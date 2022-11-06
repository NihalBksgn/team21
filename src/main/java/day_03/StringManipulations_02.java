package day_03;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringManipulations_02 {

    public static void main(String[] args) {
        /*
        SORU 11:
        Bir String’ in başında ve sonunda boşluk karakteri olup olmadığını kontrol etmek için kod
        yazınız.
        Örnek: ‘ Ali ’ için kodunuz konsolda false yazmalıdır
        ‘Ali’ için kodunuz konsolda true yazmalıdır
         */

        String i = "  Mehmet   ";
        String sonuc = i.trim().equals(i) ? "true" : "false";
        System.out.println(sonuc);

        /*
        SORU 12:
        Bir String’ in başında büyük harf ve sonunda nokta olup olmadığını kontrol etmek için kod yazınız.
                Örnek: ‘Ali’ için kodunuz konsolda false yazdırmalıdır
                ‘ali.’ için kodunuz konsolda false yazdırmalıdır
                ‘ Ali. ’ için kodunuz konsolda false yazdırmalıdır
                ‘Ali.’ için kodunuz konsolda true yazdırmalıdır
                ‘ALI.’ için kodunuz konsolda true yazdırmalıdır
            */

        String j = "Veli.";
        String dogruMu = j.charAt(0) >= 'A' && j.charAt(0) <= 'Z' && j.charAt(j.length() - 1) == '.' ? "True" : "False";
        System.out.println(dogruMu);

        /*
        SORU 13:
        Aşağıdaki koşullar için bir parolanın geçerli olup olmadığını kontrol etmek için kod yazınız;
        Şifre boşluk karakterinden farklı olacak şekilde en az 8 karakter içermelidir. Şifrede en az 1
        sembol olmalıdır.
         */

        String sifre="123562.8";
        boolean krktrSayisi =sifre.replace(" ","").length()>7;
        boolean sembolVarMi= sifre.replaceAll("[0-9a-zA-Z ]","").length()>0;
        String sonuc2 =krktrSayisi && sembolVarMi ? "true" : "false";
        System.out.println(sonuc2);

        /*
        SORU 14:
        Bir String’ in belirli bir tek karaktere sahip olup olmadığını üç farklı şekilde kontrol etmek
        için kod yazınız.
         */
        //1.yol:
        String k ="Nihal";
        boolean VarMI= k.contains("h");
        //2.yol
        boolean varMi2 =k.replaceAll("[^h]","").length()>0;
        System.out.println(varMi2);
        //3.yol
        boolean varMi3 =k.indexOf("h")==-1;
        System.out.println(varMi3);

        /*
        SORU 15.
        String gomlekFiyat = ‘$12.99’;
        String kitapFiyat = ‘$35.99’;
        Gömlek ve kitap fiyatlarının toplamını bulmak için gereken kodu yazınız.
         */

        String gomlekFiyat = "$12.99";
        String kitapFiyat = "$35.99";

        String yeniGomlek =gomlekFiyat.replaceAll("[$.]","");
        String yeniKitap =kitapFiyat.replaceAll("[$.]","");

        double gomlek = Double.valueOf(yeniGomlek);
        double kitap = Double.valueOf(yeniKitap);
        System.out.println((gomlek+kitap/100));

        /*
        SORU 16:
        Verilen bir ismin adının ve soyadının baş harflerini almak için kodu yazınız.
        Not: İkinci isim kapsam dışındadır.
        Örnek: Tom Hanks ==> TH, Mary Star ==> MS
        */
        String isim= "Idil Bakisgan";
        String ilkHarf=isim.substring(0,1);
        String soyIsimIlkHarf = isim.split(" ")[1].substring(0,1);
        System.out.println(ilkHarf+soyIsimIlkHarf);


        /*
        SORU 17:
        Bir String’ de kullanılan noktalama işaretlerinin sayısını bulmak için bir kod yazınız.
        */

        String m="Vay be! Ali 13 yaşında ama üniversite öğrencisi...";
        int noktalama =m.replaceAll("[^\\p{Punct}]","").length();
        System.out.println(noktalama);

    }
}
