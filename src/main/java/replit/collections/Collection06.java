package replit.collections;

import java.util.Set;
import java.util.TreeSet;

public class Collection06 {
    //Bir TreeSet oluşturalım ve Tree Listesini ve listedeki eleman sayısını yazdıran java kodunu yazdıralım.
    //TreeSet elemanları: yesil,sari,mavi,kirmizi,pembe

    //Beklenen Çıktı:
    //Orjinal TreeSet: [kirmizi,mavi,pembe,sari,yesil]
    //Tree eleman sayısı: 5

    public static void main(String[] args) {
        TreeSet<String> renkler =new TreeSet<>(Set.of("yesil","mavi","pembe","sari","kirmizi"));
        System.out.println(renkler);
        System.out.println(renkler.size());
    }
}
