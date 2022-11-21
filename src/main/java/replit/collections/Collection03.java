package replit.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection03 {
   // Bir ArrayList oluşturalım ve birinci ve üçüncü elemanlarını yazdıralım.

    //ArrayList elemanları:  beyaz,siyah,sari,kirmizi,turuncu
    public static void main(String[] args) {
        List<String> renkler = new ArrayList<>(Arrays.asList("beyaz","siyah","sari","kirmizi","turuncu"));
        System.out.println(renkler.get(0));
        System.out.println(renkler.get(2));
    }
}
