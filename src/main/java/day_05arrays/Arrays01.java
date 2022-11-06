package day_05arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays01 {
    public static void main(String[] args) {

        //SORU 1: Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz.
        //Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
        //(12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10

        int[] arr = {12, 5, 8, 13};
        Arrays.sort(arr);//[5,8,12]

        if (arr.length % 2 != 0) {
            int ortadakiEleman = arr[arr.length / 2];
            System.out.println(ortadakiEleman);
        } else {
            int ortadakiEleman = arr[(arr.length - 1) / 2] + arr[arr.length / 2];
            System.out.println(ortadakiEleman / 2);

        }

        //SORU 2:String’ lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
        //Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli

        String brr[] = {"Kemal", "Jonathan", "Mark", "Angie", "Veli", "Alim"};

        int min = brr[0].length();

        for (String w : brr) {

            min = Math.min(min, w.length());//4
        }

        for (String w : brr) {
            if (min == w.length()) {
                System.out.print(w + " ");
            }
        }
        System.out.println();
        //2.yol
        Arrays.sort(brr, Comparator.comparing(String::length));
        System.out.println(Arrays.toString(brr));


        //SORU 3:Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı
        //bulunuz.
        //Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2

        int arr3[] = {-12, 18, -5, 23, -2, 0};

        Arrays.sort(arr3);//[-12, -5, -2, 18, 23]

        int minPozitif = arr3[arr3.length - 1];
        int maxNegatif = arr3[0];

        for (int w : arr3) {

            if (w > 0) {
                minPozitif = Math.min(minPozitif, w);
            } else if (w < 0) {
                maxNegatif = Math.max(maxNegatif, w);
            }
        }
        System.out.println(minPozitif);
        System.out.println(maxNegatif);

        //SORU 4.String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini
        //alınız.
        //Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Çıktı JJM


        String arr4[] = {"Kemal", "Jonathan", "Mark", "Jackson", "Ali"};

        for (String w : arr4) {

            char ch = w.charAt(w.length() - 1);
            if (ch=='k' || ch=='n') {
                System.out.print(w.charAt(0));
            }

        }


    }
}
