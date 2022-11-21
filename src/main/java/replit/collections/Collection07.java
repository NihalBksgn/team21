package replit.collections;

import java.util.Set;
import java.util.TreeSet;

public class Collection07 {
    public static void main(String[] args) {


    //Bir TreeSet oluşturalım ve ilk ve son elemanlarını yazdıralım.
    //TreeSet elemanları: sari,mavi,yesil,kirmizi,turuncu,pembe
    //Beklenen Çıktı:
    //Orjinal Tree: [kirmizi,mavi,pembe,sari,turuncu,yesil]
    //ilk elemen: kirmizi
    //son eleman: yesil
    TreeSet<String> renkler = new TreeSet<>(Set.of("sari","mavi","yesil","kirmizi","turuncu","pembe"));
        System.out.println(renkler);
        System.out.println("ilk eleman: " + renkler.first());
        System.out.println("son eleman: " + renkler.last());
}
}