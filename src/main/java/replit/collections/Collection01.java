package replit.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection01 {
    //Bir ArrayList oluşturun ve array elemanlarını tek tek yazdırın.
    //
    //Array elemanları:  siyah,sari,mavi,turuncu
    public static void main(String[] args) {
        List<String> renkler =new ArrayList<>(Arrays.asList("siyah","sari","mavi","turuncu")) ;
        System.out.println(renkler);
        for (String w:renkler) {
            System.out.println(w);
        }
    }
}
