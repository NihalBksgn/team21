package replit.collections;

import java.util.*;

public class Collection08 {
    /*
    Bir TreeSet yapalım ve elemanlarını önce normal yazdıralım ve ardından  descendingIterator()  fonksiyonunu kullanarak ters sıradan yazdıralım.
    TreeSet elemanları:  yesil,sari,mavi,turuncu,kirmizi

    Beklenen Çıktı:

    Orjinal Tree sonucu: [kirmizi,mavi,sari,turuncu,yesil]
    Tersten Siralanisi:
    yesil
    turuncu
    sari
    mavi
    kirmizi

     */
    public static void main(String[] args) {
        TreeSet<String> renkler =new TreeSet<>(Set.of("yesil","mavi","pembe","sari","kirmizi"));
        System.out.println(renkler);

    }
}
