package day_05arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_02 {
    public static void main(String[] args) {

        //SORU 9:Verilen bir String arraydeki belirli bir öğenin var olup olmadığını bulmak için kod yazınız.

        String[] arr4 = new String[]{"Apex", "is", "an", "object", "is", "is", "oriented", "programming", "language"};

        String oge = "is";
        int counter = 0;

        for (String w : arr4) {
            if (w.contains(oge)) {
                counter++;
            }
        }
        if (counter > 0) {
            System.out.println(oge + "arrayde" + counter + "kere mevcuttur");
        } else {
            System.out.println("mevcut degildir");
        }

        //SORU 10: Verilen bir String arraydeki öğelerin karakterlerinin toplamını bulmak için kod yazınız.
        String[] arr = {"alabama", "pick", "sos", "sets", "pex"};

        int sum = 0;
        for (String w : arr) {
            sum = sum + w.length();
        }
        System.out.println(sum);

        //SORU 11:Tamsayılardan oluşan arrayde bulunan sıfırları, array sonuna yerleştiren kod yazınız.
        //Örnek: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)

        int[] orjinal = {0, 5, 0, 2, 0, 3, 2, 1, 0, 8};
        int[] yeni = new int[orjinal.length];
        int idx = 0;
        for (int w : orjinal) {
            if (w != 0) {
                yeni[idx] = w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(yeni));

        //SORU 12:Kullanıcıdan aldığınız tamsayılar ile bir array oluşturunuz ve bu arraydeki en küçük ve en
        //büyük öğeler arasındaki farkı konsolda yazdırınız.

        Scanner input = new Scanner(System.in);
//        System.out.println("Arrayinizin eleman sayisini giriniz");
//
//        int elemanSayisi = input.nextInt();
//
//        int[] arr2 = new int[elemanSayisi];
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.println("Lutfen Arrayin " + (i + 1) + ". elemanini giriniz");
//
//            arr2[i] = input.nextInt();
//        }
//        System.out.println(Arrays.toString(arr2));
//        Arrays.sort(arr2);
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(arr2[arr2.length-1] - arr2[0]);

        //SORU 13:Kullanıcıdan 2 String girmesini isteyiniz. Stringlerin karakterleri ve karakter sayıları aynıysa
        //        konsola "Anagramdır" yazdırın. Aksi takdirde, konsolda "Anagram Değil" yazdırınız.
        //        Örneğin; "Mary" ve "army" ve "RAMY" Anagramlardır.


        System.out.println("Lutfen iki String ifade giriniz");
        String str1 =input.nextLine().toLowerCase();
        String str2 = input.nextLine().toLowerCase();

        String [] brr1 =str1.split(""); //[m,a,r,y ]
        Arrays.sort(brr1);
        System.out.println(Arrays.toString(brr1));
        String [] brr2 = str2.split("");//[y,m,r,a]
        Arrays.sort(brr2);
        System.out.println(Arrays.toString(brr2));

        if(brr1.length!= brr2.length){
            System.out.println("Anagram degildir");
        }else if(Arrays.equals(brr1,brr2)){
            System.out.println("Anagramdir");
        }else{
            System.out.println("Anagram degildir");
        }





    }
}
