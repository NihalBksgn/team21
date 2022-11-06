package day_03;

import java.util.Scanner;

public class StringManioulations01 {

    public static void main(String[] args) {

      /*
        SORU 1:
        Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir
        ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda
        yazdırınız.
        Örnek: mIAMI - Miami
        miami - Miami
        MIAMI - Miami
        mIaMi - Miami vb.
         */

        Scanner input= new Scanner(System.in);
        System.out.println("Tek kelimelik bir sehir ismi giriniz");
        String sehirIsmi = input.next();
        String ilkHarf= sehirIsmi.substring(0,1).toUpperCase();
        String devami = sehirIsmi.substring(1).toLowerCase();
        System.out.println(ilkHarf+devami);

        /*
        SORU:2
        Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
        karakter sayısının toplamını yazdırınız.
        Örnek: İsimler Ali Can, Merve Star, Mark Tom ise konsolda 22 görmelisiniz.
         */
        String birinci ="Merve Star";
        String ikinci = "Ali Can";
        String ucuncu ="Mark Tom";

        int x = birinci.replace(" ","").length();
        int y =ikinci.replace(" ","").length();
        int z =ucuncu.replace(" ","").length();
        System.out.println(x+y+z);

        // Soru 3:
        //Bir String değişkeni oluşturunuz, String'deki toplam alfabetik ve sayısal karakter sayısını
        //konsolda yazdırınız.
        //Örnek: String : ' Miami 33018!!! ' ise konsolda 10 yazdırmanız gerekir.

        String a = " Miami 33018!!! ";
        int yeniA = a.replaceAll("[^0-9a-zA-Z]","").length();
        System.out.println(yeniA);

        /*
        Soru 4:
        Bir String değişkeni oluşturunuz, String'deki rakam olmayan karakterlerin sayısını
        konsolda yazdırınız.
        Örnek: String: '1a3Bcf4!...' ise konsolda 8 yazdırmanız gerekir.
         */

        String b ="1a3Bcf4!...";
        int yeniB = b.replaceAll("[0-9]","").length();
        System.out.println(yeniB);

        /*
        SORU 5:
        Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son
        karakteri yazdırınız.
        Örnek: 'Ali Can' için n yazdırmalısınız.
        ‘Miami’ için i yazdırmalısınız.
         */

        String c= "Idil Bakisgan";
        char son =c.charAt(c.length()-1);
        System.out.println(son);

        /*
        SORU 6:
        Bir String değişkeni oluşturunuz ve String'in ilk ve son karakterlerinin ASCII değerlerinin
        toplamını bulunuz.
         */

        String d ="vergeben";
        char ilk = d.charAt(0);
        char sonHarf =d.charAt(d.length()-1);
        System.out.println(ilk + sonHarf);


        /*
        SORU 7:
        Bir String değişkeni oluşturunuz ve ilk karakteri dışındaki tüm karakterleri konsolda
        yazdırınız.
        Örnek: String 'Java' ise konsola 'ava' yazdırmalısınız.
        */
         String e ="Nihal";
         String yeniE =e.substring(1);
        System.out.println(yeniE);


        /*
        SORU 8:
        Bir String değişkeni oluşturunuz ve son karakteri dışındaki tüm karakterlerini konsolda
        büyük harfle yazdırınız.
        Örnek: String 'Java' ise konsola 'JAV' yazdırmalısınız.
         */

        String f ="hadi baslayalim";

        String yeniF= f.toUpperCase().substring(0,f.length()-1);
        System.out.println("yeniF = " + yeniF);


        /*
        SORU 9:
        Bir String değişkeni oluşturunuz ve konsolda ilk karakter ve son karakter dışındaki tüm
        karakterleri büyük harflerle yazdırınız.
        Örnek: String 'Java' ise konsolda 'AV' yazdırmalısınız.
         */
        String g= "bugün";
        String yeniG = g.substring(1,g.length()-1).toUpperCase();
        System.out.println(yeniG);

        /*
        SORU 10:
        Bir String in ortadaki herhangi bir konumda yalnızca tek bir boşluk karakteri olup
        olmadığını kontrol etmek için kod yazınız.
        Örnek: ‘Ali Can’ için konsolda false yazmalıdır.
        ‘ Ali Can ’ için konsolda false yazmalıdır.
        ‘ Ali Can ’ için konsolda false yazmalıdır.
        ‘Ali Can’ için konsolda true yazmalıdır.
         */

        String h="   Ali Can   ";
        boolean bosluk = h.trim().contains(" ");
        System.out.println(bosluk);

    }
}
